package com.highgo.admin.migrator.comparator.controller;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.jkiss.utils.CommonUtils;

import com.highgo.admin.migrator.MigratorMessages;
import com.highgo.admin.migrator.comparator.model.ColumnDTO;
import com.highgo.admin.migrator.comparator.model.SchemaDTO;
import com.highgo.admin.migrator.comparator.model.TableContentDTO;
import com.highgo.admin.migrator.controller.KeyWordFactory;
import com.highgo.admin.migrator.model.ConnInfoDTO;
import com.highgo.admin.migrator.util.JdbcHelper;
import com.highgo.admin.migrator.util.MigratorEnum.DB;

/*
table row-by-row record compare(must use order by)
only for table has only one primary key column and is numeric(not float) data type.

SELECT * FROM 
    ( SELECT ROWNUM rn, tab.* FROM 
            (SELECT * FROM tab50 WHERE id<1000 ORDER By id asc) 
            tab WHERE ROWNUM<=100)  
WHERE rn>0;  
 */
public class RecordCompare extends BaseCompare{
	
	public static void main(String[] args) {		
		ConnInfoDTO hgDB = new ConnInfoDTO();
		hgDB.setDBType(DB.HIGHGO);
		hgDB.setHost("localhost");
		hgDB.setPort("5867");
		hgDB.setDb("lyy");
		hgDB.setUser("lyy");
		hgDB.setPwd("lyy");
		//SchemaDTO hgSchema = new SchemaDTO(16404, "lyy");
		
		ConnInfoDTO sourceDB = new ConnInfoDTO();
		sourceDB.setDBType(DB.ORACLE);
		sourceDB.setHost("192.168.100.106");
		sourceDB.setPort("1521");
		sourceDB.setDb("orcl");
		sourceDB.setUser("lyy");
		sourceDB.setPwd("lyy");
		//SchemaDTO sourceSchema = new SchemaDTO(0l, "LYY");
	}
			
	private final int DiffLimit = 100;//fix by requirement
	private final BigDecimal FloatAccurancy = BigDecimal.valueOf(0.000001d);
	private final int BatchSize = 100;
	
	public RecordCompare() {
		logger.debug("====init===" + stop.get());
	}
	
	public BlockingQueue<String[]> compareTableRecord(ConnInfoDTO sourcedb, ConnInfoDTO hgdb, SchemaDTO sourceSchema, SchemaDTO hgSchema,
			TableContentDTO tab, String whereCondition) throws Exception{
		logger.debug("Enter");		
	    BlockingQueue<String[]> diff = new LinkedBlockingQueue<>();

		String oraTabName = KeyWordFactory.getInstance().quotedName4Oracle(sourceSchema.getName()) + "."
				+ KeyWordFactory.getInstance().quotedName4Oracle(tab.getName());
		String oracPKCol = tab.getPKColumns().get(0).getQuoteName();
		final String oraSql = "SELECT * FROM " 
				+ "(SELECT ROWNUM rn, tab.* FROM " 
				+ "  (SELECT * FROM " + oraTabName + " " + whereCondition + " ORDER BY " + oracPKCol + " ASC) tab "
				+ "  WHERE ROWNUM<=?) WHERE rn>?";
		logger.debug(oraSql.toString());

		TableContentDTO hgTab = tab.getHgTableContent();
		String hgTabName = KeyWordFactory.getInstance().quotedName4Hgdb(hgSchema.getName()) + "."
				+ KeyWordFactory.getInstance().quotedName4Hgdb(hgTab.getName());
		String hgPKCol = hgTab.getPKColumns().get(0).getQuoteName();
		final String hgBaseSql = "SELECT * FROM " + hgTabName
				+ (whereCondition.isEmpty() ? " WHERE " : " " + whereCondition);
		
		boolean last = false;
		BigDecimal maxPKV = null;
		for (AtomicInteger num = new AtomicInteger(0); num.get() >= 0; num.incrementAndGet()) 
		{
			if (stop.get()) {
				logger.debug("Stop");
				return diff;
			}
			if (diff.size() == DiffLimit) {
				break;
			}
			
			try {
				LinkedHashMap<BigDecimal, List<Object>> srcRecords = getOraRecords(BatchSize, 
						sourcedb, oraSql, tab.getColumns(), num);// asc
				
				String hgSql = null;
				BigDecimal minPKV = null;
				if (srcRecords.size() < BatchSize) {
					if (num.get() == 0) {
						minPKV = null;
						maxPKV = null;
						hgSql = hgBaseSql + " ORDER BY " + hgPKCol + " ASC";//total < BatchSize
					} else {
						minPKV = maxPKV;
						maxPKV = null;
						hgSql = hgBaseSql + " AND " + hgPKCol + ">? ORDER BY " + hgPKCol + " ASC";
					}
					last = true;
				} else {
					if (num.get() == 0) {
						minPKV = null;
						maxPKV = getTailByReflection(srcRecords).getKey();
						hgSql = hgBaseSql + " AND " + hgPKCol + "<=? ORDER BY " + hgPKCol + " ASC";//first
					} else {
						minPKV = maxPKV;
						maxPKV = getTailByReflection(srcRecords).getKey();
						hgSql = hgBaseSql + " AND " + hgPKCol + ">? AND " + hgPKCol + "<=? ORDER BY " + hgPKCol + " ASC";//normal page
					}
				}			
				logger.debug("minPKV=" + minPKV + ", maxPKV=" + maxPKV + ", hgSql=" + hgSql);
				LinkedHashMap<BigDecimal, List<Object>> hgRecords = getHgRecords(hgdb, hgSql, 
						hgTab.getColumns(),	minPKV, maxPKV);
				
				//compare
				for (Entry<BigDecimal, List<Object>> sentry : srcRecords.entrySet()) 
				{
					if (stop.get()) {
						logger.debug("Stop");
						return diff;
					}
										
					if (diff.size() == DiffLimit) {
						logger.debug("Finish");
						return diff;
					}
					
					BigDecimal spk = sentry.getKey();
					// logger.debug("key=" + pkey.toString());					
					List<Object> hgvalue = hgRecords.get(spk);
					if (CommonUtils.isEmpty(hgvalue)) 
					{
						/*if (diff.size() == DiffLimit) {
							logger.debug("Finish");
							return diff;
						}*/
						diff.add(new String[] { spk.toString(), 
								MigratorMessages.comparator_compare_record_absent });
					} else 
					{
						List<Object> svalue = sentry.getValue();//cell value
						List<String> diffColumns = new ArrayList<>();
						boolean diffCol;
						for (int i = 0; i < svalue.size(); i++) 
						{
							diffCol = false;
							if (svalue.get(i) == null || hgvalue.get(i) == null) 
							{
								diffCol = (!(svalue.get(i) == null && hgvalue.get(i) == null));
							} else if (svalue.get(i) instanceof BigDecimal) 
							{
								BigDecimal sv = (BigDecimal) svalue.get(i);
								BigDecimal tv = (BigDecimal) hgvalue.get(i);
								BigDecimal stdiff = (sv.subtract(tv)).abs();
								if (stdiff.compareTo(BigDecimal.ZERO) != 0) 
								{							
									// logger.debug(stdiff + " :" + tab.getColumns().get(i).getName() + ": " + sv + "|" + tv);
									if (tab.getColumns().get(i).isUnFloatNumber()) {										
										//oracle Number omit last 0 and PG Numeric has last 0 then must use substract.
										diffCol = true;
									} else {										
										// Float is imprecise
										diffCol =  (stdiff.compareTo(FloatAccurancy) == 1);										
									}
								}
								//logger.debug(stdiff + " : " + tab.getColumns().get(i).getName() + " : " + sv + "|" + tv);
							} else if (svalue.get(i) instanceof Date) 
							{
								Date sd = (Date) svalue.get(i);
								Date td = (Date) hgvalue.get(i);
								diffCol = (sd.compareTo(td) != 0);
								//logger.debug(diffCol + " : " + tab.getColumns().get(i).getName() + " : " + sd + "|" + td);
							} else if (svalue.get(i) instanceof Timestamp) 
							{
								Timestamp st = (Timestamp) svalue.get(i);
								Timestamp tt = (Timestamp) hgvalue.get(i);
								diffCol = (st.compareTo(tt) != 0);
								//logger.debug(diffCol + " : " + tab.getColumns().get(i).getName() + " : " + st + "|" + tt);
							} else 
							{								
								diffCol = (!svalue.get(i).equals(hgvalue.get(i)));
							}

							if (diffCol) {								
								diffColumns.add(tab.getColumns().get(i).getName());
								logger.debug(diffCol + " : " + tab.getColumns().get(i).getName() + ": " + svalue.get(i) + "|" + hgvalue.get(i));
							}
						}
						
						if(!CommonUtils.isEmpty(diffColumns))
						{
							/*if (diff.size() == DiffLimit) {
								logger.debug("Finish");
								return diff;
							}*/
							diff.add(new String[] { spk.toString(),
									MigratorMessages.comparator_compare_record_diff_column + diffColumns.toString() });
						}
					}
				}
				
				for (BigDecimal tpk : hgRecords.keySet()) {
					if (stop.get()) {
						logger.debug("Stop");
						return diff;
					}
					
					if (diff.size() == DiffLimit) {
						logger.debug("Finish");
						return diff;
					}
										
					List<Object> srcvalue = srcRecords.get(tpk);
					if (CommonUtils.isEmpty(srcvalue)) {
						/*if (diff.size() == DiffLimit) {
							logger.debug("Finish");
							return diff;
						}*/
						diff.add(new String[] { tpk.toString(), MigratorMessages.comparator_compare_record_extra });
					}
				}
			} catch (Exception ex) {
				logger.error(ex.getMessage());
				ex.printStackTrace();
				throw new Exception(ex);
			} finally {
				if (last) {
					logger.debug("Source and Target table data run out, do nothing and retun.");
					break;
				}
			}
		}

		logger.debug("Return: size = " + diff.size());
		return diff;
	}
		
	private LinkedHashMap<BigDecimal, List<Object>> getOraRecords(int BatchSize, ConnInfoDTO connInfo, String oraSql,
			List<ColumnDTO> columns, AtomicInteger batchNum) throws Exception {		
		logger.info("Enter: dbType = " + connInfo.getDBType());
		
		LinkedHashMap<BigDecimal, List<Object>> oraRecords = new LinkedHashMap<BigDecimal, List<Object>>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcHelper.getConnection(connInfo);
			pstmt = conn.prepareStatement(oraSql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			pstmt.setInt(1, (batchNum.get() + 1) * BatchSize);
			pstmt.setInt(2, batchNum.get() * BatchSize);
			logger.debug("(" + (batchNum.get()) * BatchSize + "," + (batchNum.get() + 1)  * BatchSize + "]");
			rs = pstmt.executeQuery();
			logger.debug("Got data");
			BigDecimal pkValue = null;
			List<Object> otherValues;	
			while (rs.next()) 
			{
				otherValues = new ArrayList<Object>();
				for (ColumnDTO col : columns) {
					if (col.isPrimaryKey()) {
						pkValue = rs.getBigDecimal(col.getName());
					}
					// all columns for value mapping
					if (rs.getObject(col.getName()) == null) {
						otherValues.add(null);
					} else {
						if (col.isNumber()) {
							otherValues.add(new BigDecimal(rs.getObject(col.getName()).toString()));
						} 
						//date and timestamp must use following method
						else if (col.isDate()) {
							otherValues.add(rs.getDate(col.getName()));
						} else if (col.isTimestamp()) {
							otherValues.add(rs.getTimestamp(col.getName()));
						} 
						else {
							otherValues.add(rs.getObject(col.getName()).toString());
						}
					}
				}
				oraRecords.put(pkValue, otherValues);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			ex.printStackTrace(System.out);
			throw new Exception(ex);
		} finally {
			JdbcHelper.close(rs);
			JdbcHelper.close(pstmt);
			JdbcHelper.close(conn);
		}
		logger.debug("Return: size=" + oraRecords.size());
		return oraRecords;
	}
	
	private LinkedHashMap<BigDecimal, List<Object>> getHgRecords(ConnInfoDTO connInfo, String hgSql,
			List<ColumnDTO> columns, BigDecimal minPKV, BigDecimal maxPKV) throws Exception {
		logger.info("Enter: dbType = " + connInfo.getDBType());
		
		LinkedHashMap<BigDecimal, List<Object>> hgRecords = new LinkedHashMap<BigDecimal, List<Object>>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcHelper.getConnection(connInfo);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(hgSql.toString(), ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			pstmt.setFetchSize(HGFetchSize);
			//logger.debug("HG Fetch Size=" + pstmt.getFetchSize());
			if (minPKV != null) {
				pstmt.setObject(1, minPKV);
			}
			if (maxPKV != null) {
				pstmt.setObject(minPKV == null ? 1 : 2, maxPKV);
			}
			logger.debug("(" + minPKV + "," + maxPKV + "]");
			rs = pstmt.executeQuery();
			//logger.debug("Got data");
			BigDecimal pkValue = null;
			List<Object> otherValues = null;
			while (rs.next()) 
			{
				otherValues = new ArrayList<Object>();
				for (ColumnDTO col : columns) {
					if (col.isPrimaryKey()) {
						pkValue = rs.getBigDecimal(col.getName());
					} 
					// all columns for value mapping
					if (rs.getObject(col.getName()) == null) {
						otherValues.add(null);
					} else {
						if (col.isNumber()) {
							otherValues.add(new BigDecimal(rs.getObject(col.getName()).toString()));
						} else if (col.isDate()) {
							otherValues.add(rs.getDate(col.getName()));
						} else if (col.isTimestamp()) {
							otherValues.add(rs.getTimestamp(col.getName()));
						} else {
							otherValues.add(rs.getObject(col.getName()).toString());
						}
					}
				}
				hgRecords.put(pkValue, otherValues);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			ex.printStackTrace(System.out);
			throw new Exception(ex);
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (Exception ex) {
				logger.error(ex.getMessage());
			}
			JdbcHelper.close(rs);
			JdbcHelper.close(pstmt);
			JdbcHelper.close(conn);
		}
		logger.debug("Return: size=" + hgRecords.size());
		return hgRecords;
	}

	@SuppressWarnings("unchecked")
	private <K, V> Entry<K, V> getTailByReflection(LinkedHashMap<K, V> map)
			throws NoSuchFieldException, IllegalAccessException {
		Field tail = map.getClass().getDeclaredField("tail");
		tail.setAccessible(true);
		return (Entry<K, V>) tail.get(map);
	}
	
}
