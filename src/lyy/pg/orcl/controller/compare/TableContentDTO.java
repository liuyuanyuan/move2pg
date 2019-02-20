package lyy.pg.orcl.controller.compare;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.highgo.admin.migrator.comparator.controller.OracleNumberFormat;
import lyy.pg.orcl.util.DBEnum;


/*
 for display Table Content Compare
 */
public class TableContentDTO {	
	
	private DBEnum db;
	private String name;//table
	//Step1 for compare table content
	private List<ColumnDTO> columns;//column name, data type, isPK
	//Step2 for compare table content
	private long count;
	private BigDecimal sum;
	private int md5;
	
	private TableContentDTO hgTableContent;

	public TableContentDTO(DBEnum db, String name) {
		this.db = db;
		this.name = name;
		this.columns = new ArrayList<ColumnDTO>();
	}
	
	public String getName() {
		return name;
	}
	
	//step1	
	public void addColumn(ColumnDTO c)
	{
		columns.add(c);
	}
	//must before getColumns, case-insensitive-sort here cause oracle-hgdb sort rule differ 
	public void sortColumns() 
	{
		Collections.sort(columns, new Comparator<ColumnDTO>() {
			public int compare(ColumnDTO c1, ColumnDTO c2) {
				return c1.getName().toUpperCase().compareTo(c2.getName().toUpperCase());
			}
		});
		//System.out.println(columns.toArray());
	}
	public List<ColumnDTO> getColumns()
	{
		return columns;
	}
	public String getColumnJoint()
	{
		if(columns==null || columns.isEmpty())
		{
			return  null;
		}
		StringBuilder joint = new StringBuilder();
		if(DBEnum.PostgreSQL == db)
		{
			for(ColumnDTO col : columns)//to_char(systimestamp,'YYYY-MM-DD HH24:MI:SS.US') 
			{
				if (col.isDate()) {
					joint.append("coalesce(")
					     .append("to_char(").append(col.getQuoteName()).append(",'YYYY-MM-DD HH24:MI:SS')")
					     .append(",'')").append("||");
				} else if (col.isTimestamp()) {
					joint.append("coalesce(")
						.append("to_char(").append(col.getQuoteName()).append(",'YYYY-MM-DD HH24:MI:SS.US')")
						.append(",'')").append("||");
				} else {  //if (!col.isFloat()) // md5 not include float column
					joint.append("coalesce(").append(col.getQuoteName()).append("::varchar").append(",'')").append("||");
				}
			}
		} else 
		{
			for (ColumnDTO col : columns)// to_char(systimestamp,'YYYY-MM-DD HH24:MI:SS.FF6')
			{
				if (col.isDate()) {
					joint.append("to_char(").append(col.getQuoteName()).append(",'YYYY-MM-DD HH24:MI:SS')").append("||");
				} else if (col.isTimestamp()) {
					joint.append("to_char(").append(col.getQuoteName()).append(",'YYYY-MM-DD HH24:MI:SS.FF6')").append("||");
				} else { //if (!col.isFloat()) 	// md5 not include float column
					if ("NUMBER".equals(col.getDatatype()) && col.getScale() > 0) 
					{
						joint.append("to_char(").append(col.getQuoteName()).append(",\'")
						.append(OracleNumberFormat.get(col.getPrecision(), col.getScale())).append("\')").append("||");
					} else {
						joint.append(col.getQuoteName()).append("||");
					}
				}
				/* else if("CHAR".equals(col.getDatatype()) || "NCHAR".equals(col.getDatatype()))
				{
					joint.append("trim(").append(col.getQuoteName()).append(")||");//Lei said just compare without deal
				} */				
			}
		}
		if (joint.length() > 0) {
			joint = new StringBuilder(joint.substring(0, joint.length() - 2));
		}
		return joint.toString();
	}	
	public List<String> getNumberColumnList()
	{
		if(columns==null || columns.isEmpty())
		{
			return  null;
		}		
		List<String> list = new ArrayList<String>();
		for (ColumnDTO col : columns) {
			if (col.isNumber()) {
				list.add(col.getQuoteName());
			}
		}
		return list;
	}

	//step2 (columns from oracle witch cannot compare md5 and records)
	public boolean hasComplexType()
	{
		if (columns == null || columns.isEmpty()) {
			return false;
		} else {
			for (ColumnDTO col : columns) {
				if (col.cannotCompare()) {
					// System.out.println(name + " has unsupport type: " + col.getDatatype());
					return true;
				} else {
					continue;
				}
			}
			return false;
		}
	}
	
	//step3
	public void setCompareContent(long count, BigDecimal sum, int md5)
	{
		this.count = count;
		this.sum = sum;
		this.md5 = md5;
	}
	public long getCount() {
		return count;
	}
	public BigDecimal getSum() {
		return sum;
	}
	public int getMd5() {
		return md5;
	}

	public String getShowCount(boolean isCount) {
		if (isCount) {
			return -1 == count ? DBEnum.NotApplicable : String.valueOf(count);
		} else {
			return DBEnum.NotCompare;
		}
	}
	public String getShowSum(boolean isSum) {
		if (isSum) {
			return sum == null ? DBEnum.NotApplicable : String.valueOf(sum);
		} else {
			return DBEnum.NotCompare;
		}
	}
	public String getShowMd5(boolean isMd5) {
		if (isMd5) {
			return -1 == md5 ? DBEnum.NotApplicable : String.valueOf(md5);
		} else {
			return DBEnum.NotCompare;
		}
	}
	
	// step4 (when columns same then use isDiff)
	public boolean isDiff(boolean isCount, boolean isSum, boolean isMd5) {
		
		boolean diff;
		if (isCount && count == 0 && getHgTableContent().getCount() == 0) {
			diff = false;//no data means same data
		} else {
			diff = (isCount	&& (count == -1 || getHgTableContent().getCount() == -1 || count != getHgTableContent().getCount()))
				|| (isSum && ((sum == null && getHgTableContent().getSum() != null)
						   || (sum != null && getHgTableContent().getSum() == null)
						   || (sum != null && getHgTableContent().getSum() != null && sum.compareTo(getHgTableContent().getSum()) != 0)))
				|| (isMd5 && (md5 == -1 || getHgTableContent().getMd5() == -1 || md5 != getHgTableContent().getMd5()));
		}
		//System.out.println(diff + " " + name + " " + count + "," + sum + "," + md5 
		//		+ " | " + getHgTableContent().getCount() + "," + getHgTableContent().getSum() + "," + getHgTableContent().getMd5());
		return diff;
	}
	
	//for table record compare
	public List<ColumnDTO> getPKColumns()
	{
		List<ColumnDTO> list = new ArrayList<ColumnDTO>();
		if(columns == null || columns.isEmpty())
		{
			return list;
		}
		
		for(ColumnDTO col : columns)
		{
			if(col.isPrimaryKey())
			{
				list.add(col);
			}
		}
		return list;
	}
	
	
	public TableContentDTO getHgTableContent() {
		return hgTableContent;
	}
	
	public void setHgTableContent(TableContentDTO hgTableContent) {
		this.hgTableContent = hgTableContent;
	}
	
	
	
	
}
