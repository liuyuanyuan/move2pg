package com.highgo.admin.migrator.comparator.model;

import java.util.regex.Pattern;

import com.highgo.admin.migrator.controller.KeyWordFactory;
import com.highgo.admin.migrator.util.MigratorEnum.DB;

public class ColumnDTO {
	private DB db;
	private String name;
	private boolean primaryKey;

	private String datatype;
	private int scale; // oracle/HG timestamp, Oracle number
	private int precision; // Oracle number

	private String quoteName;

	public ColumnDTO(DB db, String name, String datatype, int scale, int precision) {
		this.db = db;
		this.name = name;

		this.datatype = datatype;
		this.scale = scale;
		this.precision = precision;

		switch (db) {
		case HIGHGO:
			quoteName = KeyWordFactory.getInstance().quotedName4Hgdb(name);
			break;
		case ORACLE:
			quoteName = KeyWordFactory.getInstance().quotedName4Oracle(name);
			break;
		default:
			quoteName = name;
			break;
		}
	}

	public String getName() {
		return name;
	}

	public String getQuoteName() {
		return quoteName;
	}

	public String getCastName()//new
	{
		if (DB.ORACLE == db) 
		{
			String castName = KeyWordFactory.getInstance().quotedName2Hg(name, db);
			if (castName.startsWith("\"") && castName.endsWith("\"")) {
				return name;
			} else {
				return castName.toLowerCase();
			}
		} else 
		{
			return name;
		}
	}
	
	public String getDatatype() {
		return datatype;
	}

	public int getPrecision() {
		return precision;
	}
	
	public int getScale() {
		return scale;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	
	public boolean isNumber() {
		switch (db) {
		case ORACLE:
			return "NUMBER".equals(datatype) || "FLOAT".equals(datatype) || "BINARY_FLOAT".equals(datatype)
					|| "BINARY_DOUBLE".equals(datatype);
		case HIGHGO:
			return "numeric".equals(datatype) || "int8".equals(datatype) || "int4".equals(datatype)
					|| "int2".equals(datatype) || "float8".equals(datatype) || "float4".equals(datatype);
		default:
			return false;
		}
	}
	public boolean isUnFloatNumber() {
		switch (db) {
		case ORACLE:
			return "NUMBER".equals(datatype);
		case HIGHGO:
			return "numeric".equals(datatype) || "int8".equals(datatype) || "int4".equals(datatype)
					|| "int2".equals(datatype);
		default:
			return false;
		}
	}
	
	/*public boolean isFloat() {
		switch (db) {
		case ORACLE:
			return "FLOAT".equals(datatype) || "BINARY_FLOAT".equals(datatype) || "BINARY_DOUBLE".equals(datatype);
		case HIGHGO:
			return "float8".equals(datatype) || "float4".equals(datatype);// double precision(float8), real(float4)
		default:
			return false;
		}
	}*/

	
	public boolean isDate() {
		//System.out.println(db + "|" + name + "|" + datatype);
		switch (db) {
		case ORACLE:
			return "DATE".equals(datatype);
		case HIGHGO:
			return "timestamp".equals(datatype) && scale == 0;
		default:
			return false;
		}
	}
	public boolean isTimestamp() {
		//System.out.println(db + "|" + name + "|" + datatype);
		switch (db) {
		case ORACLE:
			return (Pattern.compile("TIMESTAMP\\([0-6]\\)", Pattern.CASE_INSENSITIVE).matcher(datatype).matches());
		case HIGHGO:
			return "timestamp".equals(datatype) && scale!=0;
		default:
			return false;
		}
	}
	
	//only for oracle
	public boolean cannotCompare() {
		switch (db) {
		case ORACLE:
			return "CLOB".equals(datatype) || "NCLOB".equals(datatype) || "BFILE".equals(datatype)
					|| "LONG".equals(datatype) || "RAW".equals(datatype) || "LONG RAW".equals(datatype) || "BLOB".equals(datatype) 
					|| datatype.startsWith("INTERVAL") || datatype.endsWith("TIME ZONE")
					|| (datatype.startsWith("TIMESTAMP") && scale > 6
				    || (datatype).endsWith("XMLTYPE"));
		default:
			return false;
		}
	}

}
