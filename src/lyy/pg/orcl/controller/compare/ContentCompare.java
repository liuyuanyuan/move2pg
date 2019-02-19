package lyy.pg.orcl.controller.compare;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lyy.pg.orcl.controller.KeywordFactory;
import lyy.pg.orcl.model.DBSource;
import lyy.pg.orcl.util.JdbcUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/*
 * Table count, sum, md5 check sum
 */
public class ContentCompare extends BaseCompare
{

    public static void main(String[] args)
    {

        BigDecimal bd = new BigDecimal(0);
        bd = bd.add(new BigDecimal(12.12));
        bd = bd.add(new BigDecimal(10.1111));
        //System.out.println("****" + bd.equals(22.23));
        System.out.println(new BigDecimal(10.1111));

        DBSource hgDB = new DBSource();
        hgDB.setDBType(DB.HIGHGO);
        hgDB.setHost("localhost");
        hgDB.setPort("5867");
        hgDB.setDb("lyy");
        hgDB.setUser("lyy");
        hgDB.setPwd("lyy");
        SchemaDTO hgSchema = new SchemaDTO(16404, "lyy");

        DBSource sourceDB = new DBSource();
        sourceDB.setDBType(DB.ORACLE);
        sourceDB.setHost("192.168.100.106");
        sourceDB.setPort("1521");
        sourceDB.setDb("orcl");
        sourceDB.setUser("lyy");
        sourceDB.setPwd("lyy");
        SchemaDTO sourceSchema = new SchemaDTO(0l, "LYY");

        List<ObjectDTO> list = new ArrayList<>();
        ObjectDTO obj = new ObjectDTO(DB.ORACLE, "LYY");
        obj.setSameHgObject(new ObjectDTO(DB.HIGHGO, "lyy"));
        list.add(obj);

        try
        {
            ContentCompare tc = new ContentCompare();
            tc.compareTableContent(sourceDB, hgDB, sourceSchema, hgSchema, list, true, true, true);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private final Logger logger = LogManager.getLogger(getClass());

    private final String ORACLE_MD5_NAME = "MD5_HIGHGO";
    private final String OracleColumnSql = "SELECT DISTINCT col.column_name \r\n"
            + ", col.data_type AS fulltypename, col.data_scale \r\n"
            + ", col.data_precision \r\n"
            + ", lower(col.column_name) AS lowername \r\n"
            + " FROM dba_tab_columns col \r\n"
            + " WHERE col.owner=? AND col.table_name=? \r\n"
            + " ORDER BY lowername ASC";
    private final String HgColumnSql = "SELECT DISTINCT pg_attribute.attname AS name \r\n"
            + " , pg_type.typname AS typename, pg_attribute.atttypmod AS scale \r\n"
            + " , format_type(pg_type.oid,pg_attribute.atttypmod) AS fulltypename \r\n"
            + " , lower(pg_attribute.attname) lowername \r\n"
            + " FROM pg_attribute \r\n"
            + " INNER JOIN pg_class ON (pg_class.oid = pg_attribute.attrelid AND pg_class.relkind = 'r') \r\n"
            + " INNER JOIN pg_type ON (pg_type.oid = pg_attribute.atttypid) \r\n"
            + " WHERE pg_attribute.attisdropped = false AND pg_attribute.attnum > 0 AND pg_attribute.attname NOT IN('tableoid') \r\n"
            + " AND pg_class.relnamespace=? AND pg_class.relname=? \r\n"
            + " ORDER BY lowername ASC";

    private final String OraclePKSql = "SELECT DISTINCT cols.column_name from dba_cons_columns cols \r\n"
            + " LEFT JOIN dba_constraints cons ON(cons.constraint_name = cols.constraint_name)  \r\n"
            + " WHERE cons.constraint_TYPE='P' AND cols.owner=? AND cols.table_name=?";
    /*private final String HgPKSql = "SELECT DISTINCT pg_attribute.attname AS name \r\n" + 
     " FROM pg_attribute \r\n" + 
     " INNER JOIN pg_class ON (pg_class.oid = pg_attribute.attrelid AND pg_class.relkind = 'r') \r\n" + 
     " LEFT JOIN pg_constraint ON (pg_constraint.conrelid = pg_attribute.attrelid \r\n" + 
     "  AND ( pg_constraint.conkey[1] = pg_attribute.attnum \r\n" + 
     "  OR pg_constraint.conkey[2] = pg_attribute.attnum \r\n" + 
     "  OR pg_constraint.conkey[3] = pg_attribute.attnum \r\n" + 
     "  OR pg_constraint.conkey[4] = pg_attribute.attnum \r\n" + 
     "  OR pg_constraint.conkey[5] = pg_attribute.attnum \r\n" + 
     "  OR pg_constraint.conkey[6] = pg_attribute.attnum) \r\n" + 
     "  OR pg_constraint.conkey[7] = pg_attribute.attnum \r\n" + 
     "  OR pg_constraint.conkey[8] = pg_attribute.attnum) \r\n" + 
     " WHERE pg_attribute.attisdropped = false AND pg_attribute.attnum > 0 AND pg_attribute.attname NOT IN('tableoid') \r\n" + 
     " AND pg_constraint.contype = 'p'\r\n" + 
     " AND pg_class.relnamespace=? AND pg_class.relname=? \r\n" + 
     " ORDER BY pg_attribute.attname ASC";*/
    private final String HgPKSql = "SELECT pg_attribute.attname as pkcolname \r\n"
            + " FROM pg_constraint \r\n"
            + " INNER JOIN pg_class ON (pg_constraint.conrelid = pg_class.oid) \r\n"
            + " INNER JOIN pg_attribute ON (pg_attribute.attrelid = pg_class.oid \r\n"
            + " AND pg_attribute.attnum = pg_constraint.conkey[1]) \r\n"
            + " WHERE pg_attribute.attisdropped=false AND pg_attribute.attnum>0 AND pg_attribute.attname NOT IN('tableoid') \r\n"
            + " AND pg_constraint.contype='p' \r\n"
            + " AND pg_class.relnamespace=? AND pg_class.relname=? ";

    private final int InitMd5Value = -1;
    private final long InitRowCount = -1;
    private final BigDecimal InitSumValue = null;

    private ThreadPoolExecutor threadPoolExecutor;

    public ContentCompare()
    {
        logger.debug("====init===" + stop.get());
    }

    //prepare for content compare
    public boolean hasMD5_HIGHGO(DBSource sourceDB, SchemaDTO sourceSchema) throws Exception
    {
        int flag = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDB);
            String sql = "SELECT 1 FROM ALL_OBJECTS WHERE OBJECT_TYPE='FUNCTION' AND OWNER=? AND OBJECT_NAME=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sourceSchema.getName());
            pstmt.setString(2, ORACLE_MD5_NAME);
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                flag = rs.getInt(1);
            }
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception(ex);
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        return (1 == flag);
    }

    public boolean createMD5_HIGHGO_4Oracle(DBSource sourceDB, SchemaDTO sourceSchema) throws Exception
    {
        boolean created = false;
        Connection conn = null;
        Statement stmt = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDB);
            stmt = conn.createStatement();
            String oracleUserName = KeywordFactory.getInstance().quotedName4Oracle(sourceSchema.getName());
            /*String MD5HIGHGO_4Oracle = "CREATE OR REPLACE FUNCTION " + oracleUserName + "." + ORACLE_MD5_NAME
             + "(str IN VARCHAR) \r\n"
             + "RETURN VARCHAR2 IS \r\n" 
             + "retval varchar2(4000); \r\n"
             + "BEGIN \r\n"
             + " retval := utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => str)); \r\n"
             + "RETURN retval; \r\n"
             + "END; \r\n";*/
            String MD5HIGHGO_4Oracle = "CREATE OR REPLACE FUNCTION "
                    + oracleUserName + "." + ORACLE_MD5_NAME + "(input_string IN VARCHAR2) \r\n"
                    + " RETURN VARCHAR2 IS \r\n"
                    + " retval VARCHAR2(4000); \r\n"
                    + " BEGIN \r\n"
                    + "  retval := convert(input_string,'ZHS16GBK'); \r\n"
                    + "  retval := convert(retval,'UTF8'); \r\n"
                    + "  retval := utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING =>retval)); \r\n"
                    + " RETURN lower(retval); \r\n"
                    + " END; ";
            logger.debug(MD5HIGHGO_4Oracle);
            stmt.execute(MD5HIGHGO_4Oracle);
            created = true;
        } catch (Exception ex)
        {
            created = false;
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception(ex);
        } finally
        {
            JdbcUtil.close(stmt);
            JdbcUtil.close(conn);
        }
        logger.debug("Return: created=" + created);
        return created;
    }
	//prepare for content compare	

    /*
     //for content compare thread
     public void StartContentCompare(DBSource sourceDB, DBSource hgDB, SchemaDTO sourceSchema, SchemaDTO hgSchema,	
     List<ObjectDTO> samelist,final boolean count,final boolean sum,final boolean md5) throws InterruptedException
     {
     //finish = false;
     Thread thread = new Thread(new Runnable() {
     @Override
     public void run() {
     try {
     compareTableContent(sourceDB, hgDB, sourceSchema, hgSchema, samelist, count, sum, md5);
     } catch (Exception e) {
     logger.error(e.getMessage());
     }
     }
     });
     thread.start();
     thread.join();
     //finish = true;
     }
     */
    public List<TableContentDTO> compareTableContent(
            DBSource sourceDB, DBSource hgDB, SchemaDTO sourceSchema, SchemaDTO hgSchema,
            List<ObjectDTO> samelist, final boolean count, final boolean sum, final boolean md5) throws Exception
    {
        logger.debug("Enter: same size=" + samelist.size());
        List<TableContentDTO> list = null;
        try
        {
            list = getTableColumns(sourceDB, hgDB,
                    sourceSchema, hgSchema, samelist);
        } catch (Exception ex)
        {
            throw new Exception(ex);
        }
        if (list == null || list.isEmpty())
        {
            logger.warn("Nothing to compare, do nothing and return empty list.");
            return list;
        }

        BlockingQueue<TableContentDTO> diff = new LinkedBlockingQueue<>();
        int allThread = list.size();
        int initThread = allThread < CoreThread ? allThread : CoreThread;
        logger.debug("allThread=" + allThread + ", initThread=" + initThread);
        threadPoolExecutor = new ThreadPoolExecutor(
                initThread, allThread, 0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
        CountDownLatch doneSignal = new CountDownLatch(allThread);
        long start = System.currentTimeMillis();
        for (TableContentDTO tc : list)
        {
            threadPoolExecutor.submit(() ->
            {
                if (stop.get())
                {
                    doneSignal.countDown();
                    logger.debug("doneSignal=" + doneSignal.getCount());
                    return;
                }

                boolean columnSame = compareTableColumn(tc);
                logger.debug(tc.getName() + " column same=" + columnSame);
                if (!columnSame)
                {
                    tc.setCompareContent(InitRowCount, InitSumValue, InitMd5Value);
                    tc.getHgTableContent().setCompareContent(InitRowCount, InitSumValue, InitMd5Value);
                    diff.add(tc);
                } else
                {
                    final boolean canMD5 = !tc.hasComplexType() && !CommonUtils.isEmpty(tc.getColumnJoint()) && md5;
                    final boolean canSum = !CommonUtils.isEmpty(tc.getNumberColumnList()) && sum;
                    TableContentDTO hgtc = tc.getHgTableContent();
                    getSourceCompareContent(sourceDB, sourceSchema, tc, count, canSum, canMD5);
                    getHGCompareContent(hgDB, hgSchema, hgtc, count, canSum, canMD5);
                    if (tc.isDiff(count, sum, md5))
                    {
                        diff.add(tc);
                    }
                }

                doneSignal.countDown();
                logger.debug(tc.getName() + "=doneSignal=" + doneSignal.getCount());
            });
        }

        try
        {
            logger.debug("getActiveCount=" + threadPoolExecutor.getActiveCount());
            doneSignal.await();
        } catch (InterruptedException e1)
        {
            logger.error(e1.getMessage());
            e1.printStackTrace();
        }
        logger.debug("Cost:" + ((System.currentTimeMillis() - start) / 1000));
        try
        {
            threadPoolExecutor.shutdownNow();
        } catch (Exception e)
        {
            logger.error("Error waiting for ExecutorService shutdown:" + e.getMessage());
            e.printStackTrace();
        }

        List<TableContentDTO> linkedlist = new ArrayList<TableContentDTO>();
        diff.drainTo(linkedlist);
        logger.debug("Return: size=" + linkedlist.size());
        return linkedlist;
    }

    private List<TableContentDTO> getTableColumns(
            DBSource sourceDB, DBSource hgDB, SchemaDTO sourceSchema, SchemaDTO hgSchema,
            List<ObjectDTO> samelist) throws Exception
    {
        logger.debug("Enter:" + sourceDB.getDBType());
        List<TableContentDTO> list = new ArrayList<>();
        if (samelist == null || samelist.isEmpty())
        {
            logger.warn("Nothing to compare, do nothing and return empty list.");
            return list;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Connection hgconn = null;
        PreparedStatement hgpstmt = null;
        ResultSet hgrs = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDB);
            //logger.debug("oracleColumnSql=" + OracleColumnSql);
            pstmt = conn.prepareStatement(OracleColumnSql);

            hgconn = JdbcUtil.getConnection(hgDB);
            //logger.debug("hgColumnSql=" + HgColumnSql);
            hgpstmt = hgconn.prepareStatement(HgColumnSql);
            for (ObjectDTO table : samelist)
            {
                if (stop.get())
                {
                    logger.debug("Stop");
                    return list;
                }

                TableContentDTO tc = new TableContentDTO(sourceDB.getDBType(), table.getName());
                pstmt.setString(1, sourceSchema.getName());
                pstmt.setString(2, table.getName());
                rs = pstmt.executeQuery();
                while (rs.next())
                {
                    // 1 or '1' getBoolean=true, 0 or '0' getBoolean=false
                    tc.addColumn(new ColumnDTO(sourceDB.getDBType(), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
                    // logger.debug("Source:" + rs.getString(1) + " " + rs.getBoolean(2) + " " + rs.getString(3) + " " +rs.getInt(4));
                }
                tc.sortColumns();
                pstmt.clearParameters();

                ObjectDTO hgTable = table.getSameHgObject();
                TableContentDTO hgtc = new TableContentDTO(DB.HIGHGO, hgTable.getName());
                hgpstmt.setLong(1, hgSchema.getId());
                hgpstmt.setString(2, hgtc.getName());
                hgrs = hgpstmt.executeQuery();
                while (hgrs.next())
                {
                    // 1 or '1' getBoolean=true, 0 or '0' getBoolean=false
                    hgtc.addColumn(new ColumnDTO(DB.HIGHGO, hgrs.getString(1), hgrs.getString(2), hgrs.getInt(3), -1));
                    // logger.debug("HG:" + hgrs.getString(1) + " " + hgrs.getBoolean(2) + " " + hgrs.getString(3) + " " + hgrs.getInt(4));
                }
                hgtc.sortColumns();
                hgpstmt.clearParameters();

                tc.setHgTableContent(hgtc);
                list.add(tc);
            }
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(hgrs);
            JdbcUtil.close(hgpstmt);
            JdbcUtil.close(hgconn);

            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }

        logger.debug("Return: size=" + list.size());
        return list;
    }

    private synchronized boolean compareTableColumn(TableContentDTO tab)
    {
        List<ColumnDTO> scols = tab.getColumns();
        List<ColumnDTO> hgcols = tab.getHgTableContent().getColumns();
        if (CommonUtils.isEmpty(scols) || CommonUtils.isEmpty(hgcols))
        {
            logger.warn("No clomun in both source and targert.");
            return false;
        }
        if (scols.size() != hgcols.size())
        {
            return false;
        }

        for (ColumnDTO sc : scols)
        {
            boolean got = false;
            for (ColumnDTO hc : hgcols)
            {
                //logger.debug(sc.getCastName() + " | " + hc.getName());
                if (sc.getCastName().equals(hc.getName()))
                {
                    got = true;
                    break;
                }
            }
            if (got)
            {
                continue;
            } else
            {
                return false;
            }
        }

        for (ColumnDTO hc : hgcols)
        {
            boolean got = false;
            for (ColumnDTO sc : scols)
            {
                //logger.debug(sc.getCastName() + " | " + hc.getName());
                if (sc.getCastName().equals(hc.getName()))
                {
                    got = true;
                    break;
                }
            }
            if (got)
            {
                continue;
            } else
            {
                return false;
            }
        }

        return true;
    }

    private void getSourceCompareContent(DBSource connInfo, SchemaDTO schema,
            TableContentDTO tc, boolean count, boolean sum, boolean md5)
    {
        if (stop.get())
        {
            logger.debug("Stop");
            return;
        }

        int md5Value = InitMd5Value;
        long rowCount = InitRowCount;
        BigDecimal sumValue = InitSumValue; //BigDecimal.valueOf(-1);//double sumValue = -1d;

        if (!count && !sum && !md5)
        {
            logger.error("No compare option defined or support for:" + tc.getName());
            tc.setCompareContent(rowCount, sumValue, md5Value);
            return;
        }

        Connection conn = null;
        Statement pstmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(connInfo);
            pstmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            if (count || sum)
            {
                if (stop.get())
                {
                    logger.debug("Stop");
                    return;
                }
                try
                {
                    String countSumSql = getCountSumSql(schema, tc, count, sum, connInfo.getDBType());
                    rs = pstmt.executeQuery(countSumSql);
                    while (rs.next())
                    {
                        if (count)
                        {
                            rowCount = rs.getLong("count");
                            if (rowCount == 0)
                            {
                                tc.setCompareContent(rowCount, sumValue, md5Value);
                                return;
                            }
                        }
                        if (sum)
                        {
                            logger.debug("BigDecimal=" + rs.getBigDecimal("sum") + ",Object=" + rs.getObject("sum") + ",BigDecimal(Object)=" + new BigDecimal(rs.getObject("sum").toString()));
							//sumValue = rs.getBigDecimal("sum");// cannot use getDouble
                            //sumValue = sumValue == null ? BigDecimal.valueOf(0) : sumValue;
                            sumValue = rs.getObject("sum") == null ? BigDecimal.valueOf(0) : new BigDecimal(rs.getObject("sum").toString());
                        }
                    }
                } catch (Exception ex)
                {
                    logger.error(ex.getMessage());
                    ex.printStackTrace(System.out);
                } finally
                {
                    JdbcUtil.close(rs);
                }
            }
            if (md5)
            {
                if (stop.get())
                {
                    logger.debug("Stop");
                    return;
                }
                String md5Sql = getMd5Sql(schema, tc, md5, connInfo.getDBType());
                try
                {
                    //logger.debug("Oracle FetchSize=" + pstmt.getFetchSize());					
                    rs = pstmt.executeQuery(md5Sql);
                    md5Value = 0;// Set<Integer> md5Set =new HashSet<Integer>();
                    while (rs.next())
                    {
                        if (stop.get())
                        {
                            logger.debug("Stop");
                            return;
                        }
                        // md5Set.add(rs.getString(1) == null ? 0 : rs.getString(1).hashCode());
                        md5Value = md5Value + (rs.getString(1) == null ? 0 : rs.getString(1).hashCode());
                    }
                    // md5Value = md5Set.hashCode();
                } catch (Exception ex)
                {
                    logger.error(md5Sql + ex.getMessage());
                    ex.printStackTrace(System.out);
                } finally
                {
                    JdbcUtil.close(rs);
                }
            }
            tc.setCompareContent(rowCount, sumValue, md5Value);
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
            //logger.debug(tc.getName() + " : " + rowCount + " " + sumValue + " " + md5Value);
        }
    }

    private void getHGCompareContent(DBSource connInfo, SchemaDTO schema,
            TableContentDTO tc, boolean count, boolean sum, boolean md5)
    {
        if (stop.get())
        {
            logger.debug("Stop");
            return;
        }

        int md5Value = InitMd5Value;
        long rowCount = InitRowCount;
        BigDecimal sumValue = InitSumValue;//BigDecimal.valueOf(-1); //double sumValue = -1d;	

        if (!count && !sum && !md5)
        {
            logger.error("No compare option defined or support for:" + tc.getName());
            tc.setCompareContent(rowCount, sumValue, md5Value);
            return;
        }

        Connection conn = null;
        Statement pstmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(connInfo);
            pstmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            if (count || sum)
            {
                try
                {
                    String countSumSql = getCountSumSql(schema, tc, count, sum, connInfo.getDBType());
                    rs = pstmt.executeQuery(countSumSql);
                    while (rs.next())
                    {
                        if (count)
                        {
                            rowCount = rs.getLong("count");
                            if (rowCount == 0)
                            {
                                tc.setCompareContent(rowCount, sumValue, md5Value);
                                return;
                            }
                        }
                        if (sum)
                        {
                            logger.debug("BigDecimal=" + rs.getBigDecimal("sum") + ",Double=" + rs.getDouble("sum") + ",Object=" + rs.getObject("sum") + ",BigDecimal(Object)=" + new BigDecimal(rs.getObject("sum").toString()));
							//sumValue = rs.getBigDecimal("sum"); // cannot use getDouble
                            //sumValue = sumValue == null ? BigDecimal.valueOf(0) : sumValue;
                            sumValue = rs.getObject("sum") == null ? BigDecimal.valueOf(0) : new BigDecimal(rs.getObject("sum").toString());
                        }
                    }
                } catch (Exception ex)
                {
                    logger.error(ex.getMessage());
                    ex.printStackTrace(System.out);
                } finally
                {
                    JdbcUtil.close(rs);
                    JdbcUtil.close(pstmt);
                }
            }
            if (md5)
            {
                String md5Sql = getMd5Sql(schema, tc, md5, connInfo.getDBType());
                try
                {
                    conn.setAutoCommit(false);
                    pstmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                    pstmt.setFetchSize(HGFetchSize);
                    rs = pstmt.executeQuery(md5Sql);
                    //logger.debug("Got data");
                    md5Value = 0;// Set<Integer> md5Set =new HashSet<Integer>();
                    while (rs.next())
                    {
                        if (stop.get())
                        {
                            logger.debug("Stop");
                            return;
                        }
                        // md5Set.add(rs.getString(1) == null ? 0 : rs.getString(1).hashCode());
                        md5Value = md5Value + (rs.getString(1) == null ? 0 : rs.getString(1).hashCode());
                        // logger.debug(rs.getString(1));
                    }
                    // md5Value = md5Set.hashCode();
                } catch (Exception ex)
                {
                    logger.error(md5Sql + ", Detail: " + ex.getMessage());
                    ex.printStackTrace(System.out);
                } finally
                {
                    try
                    {
                        conn.setAutoCommit(true);
                    } catch (Exception ex)
                    {
                        logger.error(ex.getMessage());
                    }
                    JdbcUtil.close(rs);
                    JdbcUtil.close(pstmt);
                }
            }
            tc.setCompareContent(rowCount, sumValue, md5Value);
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(conn);
            //logger.debug(tc.getName() + ": " + rowCount + " " + sumValue + " " + md5Value);
        }
    }

    private String getMd5Sql(SchemaDTO schema, TableContentDTO tc, boolean md5, DB db)
    {
        if (md5)
        {
            String columnJoint = tc.getColumnJoint();
            if (CommonUtils.isEmpty(columnJoint))
            {
                return null;
            } else
            {
                String quoetdSchema = DB.HIGHGO == db ? KeywordFactory.getInstance().quotedName4Hgdb(schema.getName())
                        : KeywordFactory.getInstance().quotedName4Oracle(schema.getName());
                String quoetdTable = DB.HIGHGO == db ? KeywordFactory.getInstance().quotedName4Hgdb(tc.getName())
                        : KeywordFactory.getInstance().quotedName4Oracle(tc.getName());

                String md5func = DB.HIGHGO == db ? "pg_catalog.md5" : quoetdSchema + "." + ORACLE_MD5_NAME;
                String md5Sql = "SELECT " + md5func + "(" + columnJoint + ") FROM "
                        + quoetdSchema + "." + quoetdTable;

                logger.debug(md5Sql);
                return md5Sql;
            }
        } else
        {
            return null;
        }
    }

    private String getCountSumSql(SchemaDTO schema, TableContentDTO tc, boolean count, boolean sum, DB db)
    {
        if (count || sum)
        {
            String quoetdSchema = DB.HIGHGO == db ? KeywordFactory.getInstance().quotedName4Hgdb(schema.getName())
                    : KeywordFactory.getInstance().quotedName4Oracle(schema.getName());
            String quoetdTable = DB.HIGHGO == db ? KeywordFactory.getInstance().quotedName4Hgdb(tc.getName())
                    : KeywordFactory.getInstance().quotedName4Oracle(tc.getName());

            String nvl_func = DB.HIGHGO == db ? "coalesce" : "NVL";//because HGDB NVL need pg_catalog

            StringBuilder countSumSql = new StringBuilder("SELECT ");
            if (count)
            {
                countSumSql.append(" COUNT(1) count,");
            }
            if (sum)
            {
                for (String quotedNumberCol : tc.getNumberColumnList())
                {
                    countSumSql.append(nvl_func).append("(SUM(").append(quotedNumberCol).append("),0)+");//nvl(,0) convert sum from null to 0 
                }

                if (countSumSql.toString().endsWith("+"))
                {
                    countSumSql = new StringBuilder(countSumSql.substring(0, countSumSql.length() - 1)).append(" sum ");
                }
            }

            if (countSumSql.toString().endsWith(","))
            {
                countSumSql = new StringBuilder(countSumSql.substring(0, countSumSql.length() - 1));
            }
            countSumSql.append(" FROM ").append(quoetdSchema).append(".").append(quoetdTable);

            logger.debug(countSumSql.toString());
            return countSumSql.toString();
        } else
        {
            return null;
        }
    }

    //prepare for record compare
    public void getPK4Table(TableContentDTO tc, DBSource sourceDB, DBSource hgDB,
            SchemaDTO sourceSchema, SchemaDTO hgSchema) throws Exception
    {
        int spksize = getSourceTabPK(tc, sourceDB, sourceSchema);
        if ((spksize == 1 && !tc.getPKColumns().get(0).isUnFloatNumber()) || spksize != 1)
        {
            logger.warn("Source table primary key column size not meet the requirement, do nothing and return.");
            return;
        }

        Connection hgconn = null;
        PreparedStatement hgpstmt = null;
        ResultSet hgrs = null;
        try
        {
            hgconn = JdbcUtil.getConnection(hgDB);
            logger.debug("HgPKSql=" + HgPKSql);
            hgpstmt = hgconn.prepareStatement(HgPKSql);
            hgpstmt.setLong(1, hgSchema.getId());
            hgpstmt.setString(2, tc.getHgTableContent().getName());
            hgrs = hgpstmt.executeQuery();
            while (hgrs.next())
            {
                String hgpkcol = hgrs.getString(1);
                for (ColumnDTO scol : tc.getHgTableContent().getColumns())
                {
                    if (scol.getName().equals(hgpkcol))
                    {
                        scol.setPrimaryKey(true);
                        logger.debug("primary key from content compare " + scol.getName());
                        break;
                    }
                }
            }
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception(ex);
        } finally
        {
            JdbcUtil.close(hgrs);
            JdbcUtil.close(hgpstmt);
            JdbcUtil.close(hgconn);
        }
    }

    private int getSourceTabPK(TableContentDTO tc,
            DBSource sourceDB, SchemaDTO sourceSchema) throws Exception
    {
        int pksize = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDB);
            logger.debug("oraclePKSql=" + OraclePKSql);
            pstmt = conn.prepareStatement(OraclePKSql);
            pstmt.setString(1, sourceSchema.getName());
            pstmt.setString(2, tc.getName());
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                pksize++;
                String spkcol = rs.getString(1);
                for (ColumnDTO scol : tc.getColumns())
                {
                    if (scol.getName().equals(spkcol))
                    {
                        scol.setPrimaryKey(true);
                        break;
                    }
                }
            }
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception(ex);
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        logger.debug("pksize=" + pksize);
        return pksize;
    }
	//prepare for record compare

    /*unused
     @Deprecated
     public BlockingQueue<TableContentDTO> getTableColumns2(
     DBSource sourceDB, DBSource hgDB, SchemaDTO sourceSchema, SchemaDTO hgSchema,
     List<ObjectDTO> samelist) throws Exception
     {
     logger.debug("Enter:" + sourceDB.getDBType());		
     BlockingQueue<TableContentDTO> list = new LinkedBlockingQueue<>();
     if(samelist == null || samelist.isEmpty())
     {
     logger.warn("Nothing to compare, do nothing and return empty list.");
     return list;
     }
	    
     //	    long start = System.currentTimeMillis();
     //	    //single thread 4342ms,
     //		int allThread = samelist.size();
     //		int initThread = allThread > CoreThread ? CoreThread : allThread;
     //		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
     //				initThread, allThread, 0L, TimeUnit.SECONDS,
     //				new LinkedBlockingQueue<Runnable>());
     //		CountDownLatch doneSignal = new CountDownLatch(allThread);
     for (ObjectDTO table : samelist) 
     {
     //threadPoolExecutor.submit(() -> {
     TableContentDTO tc = getSourceTableColumn(sourceDB, sourceSchema, table);
     ObjectDTO hgTable = table.getSameHgObject();
     tc.setHgTableContent(getHgTableColumn(hgDB, hgSchema, hgTable));
     try {
     list.put(tc);
     } catch (InterruptedException e) {
     e.printStackTrace();
     }
     //doneSignal.countDown();
     //});
     }
		
     //		doneSignal.await();
     //		logger.debug("Cost:" + ((System.currentTimeMillis() - start) / 1000));
     //		try {
     //			threadPoolExecutor.shutdownNow();
     //		} catch (Exception e) {
     //			logger.error("Error waiting for ExecutorService shutdown:" + e.getMessage());
     //			e.printStackTrace();
     //		}

     logger.debug("Return: size = " + list.size());
     return list;
     }
     private TableContentDTO getHgTableColumn(DBSource hgDB, SchemaDTO hgSchema, ObjectDTO hgTable) 
     {
     logger.debug("Enter:" + hgTable.getName());
		
     TableContentDTO tabc = new TableContentDTO(DB.HIGHGO, hgTable.getName());
     Connection hgconn = null;
     PreparedStatement hgpstmt = null;
     ResultSet hgrs = null;
     try {
     hgconn = JdbcUtil.getConnection(hgDB);
     //logger.debug(hgdbSql);
     hgpstmt = hgconn.prepareStatement(HgColumnSql);
						
     hgpstmt.setLong(1, hgSchema.getId());
     hgpstmt.setString(2, hgTable.getName());
     hgrs = hgpstmt.executeQuery();
     while (hgrs.next()) {
     // 1 or '1' getBoolean=true, 0 or '0' getBoolean=false
     tabc.addColumn(new ColumnDTO(DB.HIGHGO, hgrs.getString(1), hgrs.getString(2),  hgrs.getInt(3), hgrs.getInt(4)));//hgrs.getBoolean(2), 
     }
     tabc.sortColumns();
     hgpstmt.clearBatch();
     hgpstmt.clearParameters();
				
     } catch (Exception ex) {
     logger.error(ex.getMessage());
     ex.printStackTrace(System.out);
     } finally {
     JdbcUtil.close(hgrs);
     JdbcUtil.close(hgpstmt);
     JdbcUtil.close(hgconn);
     }

     logger.debug(""+tabc.getColumns().size());
     return tabc;
     }
     private TableContentDTO getSourceTableColumn(DBSource sourceDB, SchemaDTO sourceSchema, ObjectDTO table) 
     {
     logger.debug("Enter:" + table.getName());
		
     TableContentDTO tabc = new TableContentDTO(sourceDB.getDBType(), table.getName());
     Connection conn = null;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
     try {
     conn = JdbcUtil.getConnection(sourceDB);
     logger.debug(OracleColumnSql);
     pstmt = conn.prepareStatement(OracleColumnSql);
			
     pstmt.setString(1, sourceSchema.getName());
     pstmt.setString(2, table.getName());
     rs = pstmt.executeQuery();
     while (rs.next()) {
     // 1 or '1' getBoolean=true, 0 or '0' getBoolean=false
     tabc.addColumn(new ColumnDTO(sourceDB.getDBType(), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));//rs.getBoolean(2),
     logger.debug(rs.getString(1) + " " + rs.getBoolean(2) + " " + rs.getString(3) + " " +rs.getInt(4));
     }
     tabc.sortColumns();
     pstmt.clearParameters();
		
     } catch (Exception ex) {
     logger.error(ex.getMessage());
     ex.printStackTrace(System.out);
     } finally {
     JdbcUtil.close(rs);
     JdbcUtil.close(pstmt);
     JdbcUtil.close(conn);
     }

     return tabc;
     }
     unused*/
}
