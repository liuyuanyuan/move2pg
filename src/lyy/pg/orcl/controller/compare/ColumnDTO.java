package lyy.pg.orcl.controller.compare;

import java.util.regex.Pattern;
import lyy.pg.orcl.controller.KeywordFactory;
import lyy.pg.orcl.util.DBEnum;

public class ColumnDTO
{

    private DBEnum db;
    private String name;
    private boolean primaryKey;

    private String datatype;
    private int scale; // oracle/HG timestamp, Oracle number
    private int precision; // Oracle number

    private String quoteName;

    public ColumnDTO(DBEnum db, String name, String datatype, int scale, int precision)
    {
        this.db = db;
        this.name = name;

        this.datatype = datatype;
        this.scale = scale;
        this.precision = precision;

        switch (db)
        {
            case PostgreSQL:
                quoteName = KeywordFactory.getInstance().quotedName4Pg(name);
                break;
            case Oracle:
                quoteName = KeywordFactory.getInstance().quotedName4Oracle(name);
                break;
            default:
                quoteName = name;
                break;
        }
    }

    public String getName()
    {
        return name;
    }

    public String getQuoteName()
    {
        return quoteName;
    }

    public String getCastName()//new
    {
        if (DBEnum.Oracle == db)
        {
            String castName = KeywordFactory.getInstance().quotedName2Pg(name, db);
            if (castName.startsWith("\"") && castName.endsWith("\""))
            {
                return name;
            } else
            {
                return castName.toLowerCase();
            }
        } else
        {
            return name;
        }
    }

    public String getDatatype()
    {
        return datatype;
    }

    public int getPrecision()
    {
        return precision;
    }

    public int getScale()
    {
        return scale;
    }

    public void setPrimaryKey(boolean primaryKey)
    {
        this.primaryKey = primaryKey;
    }

    public boolean isPrimaryKey()
    {
        return primaryKey;
    }

    public boolean isNumber()
    {
        switch (db)
        {
            case Oracle:
                return "NUMBER".equals(datatype) || "FLOAT".equals(datatype) || "BINARY_FLOAT".equals(datatype)
                        || "BINARY_DOUBLE".equals(datatype);
            case PostgreSQL:
                return "numeric".equals(datatype) || "int8".equals(datatype) || "int4".equals(datatype)
                        || "int2".equals(datatype) || "float8".equals(datatype) || "float4".equals(datatype);
            default:
                return false;
        }
    }

    public boolean isUnFloatNumber()
    {
        switch (db)
        {
            case Oracle:
                return "NUMBER".equals(datatype);
            case PostgreSQL:
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
    public boolean isDate()
    {
        //System.out.println(db + "|" + name + "|" + datatype);
        switch (db)
        {
            case Oracle:
                return "DATE".equals(datatype);
            case PostgreSQL:
                return "timestamp".equals(datatype) && scale == 0;
            default:
                return false;
        }
    }

    public boolean isTimestamp()
    {
        //System.out.println(db + "|" + name + "|" + datatype);
        switch (db)
        {
            case Oracle:
                return (Pattern.compile("TIMESTAMP\\([0-6]\\)", Pattern.CASE_INSENSITIVE).matcher(datatype).matches());
            case PostgreSQL:
                return "timestamp".equals(datatype) && scale != 0;
            default:
                return false;
        }
    }

    //only for oracle
    public boolean cannotCompare()
    {
        switch (db)
        {
            case Oracle:
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
