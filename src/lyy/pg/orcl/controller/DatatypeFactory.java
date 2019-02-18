/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.controller;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lyy.pg.orcl.model.DatatypeMapping;
import lyy.pg.orcl.util.DBEnum;

/**
 * @author Liu Yuanyuan 
 * 
 * ps: oracle2pg function mapping: systimestamp -> systimestamp() sysdate -> sysdate
 * 
 */
public class DatatypeFactory
{

    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("TIMESTAMP\\([0-9]\\) WITH.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("TIMESTAMP WITH LOCAL TIME ZONE");
        if (matcher.matches())
        {
            System.out.println("yes");
        } else
        {
            System.out.println("no");
        }
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static DatatypeFactory getInstance()
    {
        return InstanceHolder.instance;
    }
    private static class InstanceHolder
    {
        private static DatatypeFactory instance = new DatatypeFactory();
    }

    
    //(maybe use pgType better)
    public boolean hasBinaryType(ResultSetMetaData metaData, int colCount, HashMap<String, String> datatypeMaps) throws SQLException
    {
        for (int i = 1; i <= colCount; i++)
        {
            String type = metaData.getColumnTypeName(i);
            switch (type)
            {
                case "BLOB":
                case "LONG RAW":
                case "RAW":
                    logger.warn("Table has datatype: " + type + " , directly use insert.");
                    return true;
                case "LONG":
                case "CLOB":
                case "NCLOB":
                case "BFILE":
                    String hgType = DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, type, datatypeMaps);
                    switch (hgType)
                    {
                        case "BYTEA":
                        case "OID":
                            logger.warn("Table has datatype cast " + type + " -> " + hgType + ", directly use insert.");
                            return true;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        return false;
    }

    
    //get pg datatype
    public String getPgTypeWithArgs(DBEnum sourceDB, HashMap<String, String> datatypeMap,
            String schema, String table, String column,
            String sourceDataType, String dataPrecision, String dataScale, int charLength)
    {
        //logger.info("sourceDataType=" + sourceDataType);

        String hgType = getPgTypeWithoutArgs(sourceDB, sourceDataType, datatypeMap);
        //logger.info("HgTypeWithoutParameter=" + hgType);
        hgType = castDataType(sourceDB, schema, table, column,
                hgType, dataPrecision, dataScale, charLength);

        //logger.info("FinalHgType=" + hgType);
        return hgType;
    }

    public String getPgTypeWithoutArgs(DBEnum sourceDB, String sourceDatatype,
            HashMap<String, String> datatypeMap)
    {
        //logger.debug("sourceDatatype=" + sourceDatatype);
        String hgType = null;

        Iterator<Entry<String, String>> iter = datatypeMap.entrySet().iterator();
        while (iter.hasNext())
        {
            Entry<String, String> entery = iter.next();
            Pattern pattern = Pattern.compile(entery.getKey(), Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(sourceDatatype);
            if (matcher.matches())
            {
                hgType = entery.getValue();
                break;
            }
        }

        if (hgType == null)
        {
            hgType = "TEXT";
            logger.warn("Warn:Found no cast for source datatype = " + sourceDatatype
                    + ",and set it's HG datatype to text");
        }

        //logger.debug("hgType=" + hgType.toUpperCase());
        return hgType.toUpperCase();
    }

    
    private String castDataType(DBEnum sourceDBType,
            String schema, String table, String column,
            String pgDataType, String dataPrecision, String dataScale, int charLength)
    {
        String pgType = null;
        //never need to switch db type, because this is only for oracle
        switch (pgDataType)
        {
            case "INTERVAL":
            case "TIMESTAMP":
            case "TIMESTAMPTZ":
                pgType = pgDataType + "(" + dataScale + ")";
                break;
            case "CHAR":
            case "VARCHAR":
                pgType = pgDataType + "(" + charLength + ")";
                break;
            case "NUMERIC":
                //the following two special situations arise from
                //oracle number datatype and highgo numric datatype 's parameter having
                //different defination method and  different range of value
                //1. number(*) or number--dataprecision=null,datascale=null,this has all scale and all precision
                if (dataPrecision == null && dataScale == null)
                {
                    pgType = pgDataType;
                } //2.number(*,s) ---dataPrecision=null,dataScale=s(0,1,2...),this has specified scale and all precision
                else if (dataPrecision == null && dataScale != null)
                {
                    if (Integer.parseInt(dataScale) < 0)
                    {
                        logger.warn("Warn:There's an oracle number data scale < 0,"
                                + "its schema=" + schema
                                + " ,table=" + table
                                + " ,column=" + column
                                + " ,datatype=" + pgDataType
                                + " ,dataPrecision=" + dataPrecision
                                + " ,dataScale=" + dataPrecision
                                + ";here we convert this scale to 0 in HighGo DB.");
                        dataScale = "0";
                    }
                    pgType = pgDataType + "(126," + dataScale + ")";
                } //3.number(p,s) (include number(38) stands for number(38,0))
                else if (dataPrecision != null && dataScale != null)
                {
                    //PG never suppert a negivate scale;
                    if (Integer.parseInt(dataScale) < 0)
                    {
                        logger.warn("There's an oracle number data scale < 0,"
                                + "its schema=" + schema
                                + " ,table=" + table
                                + " ,column=" + column
                                + " ,datatype=" + pgDataType
                                + " ,dataPrecision=" + dataPrecision
                                + " ,dataScale=" + dataPrecision
                                + ";here we convert this scale to 0 in HGDB.");
                        dataPrecision = String.valueOf((Integer.parseInt(dataPrecision) - Integer.parseInt(dataScale)));
                        dataScale = "0";
                    } //this because oracle support type like number(3,6)(can insert values <0.001,like 0.0009,0.000888 etc)
                    //but PG always support precision >= scale.
                    //in order to support oracle number values ,then use 
                    else if (Integer.parseInt(dataPrecision) < Integer.parseInt(dataScale))
                    {
                        dataPrecision = dataScale;
                    }

                    pgType = pgDataType + "(" + dataPrecision + "," + dataScale + ")";
                } //4. oracle float p=126,s=null; binary_double/binary_float p=null,s=null.
                else//else if(dataPrecision != null && dataScale == null)
                {
                    pgType = pgDataType;
                    //logger.debug("dataPrecision=" + dataPrecision + ", dataScale=" + dataScale);
                }
                break;
            default://others data type needn't parameter                
                pgType = pgDataType;
                break;
        }
        return pgType;
    }

    
    //get data type mapping for custom
    public List<DatatypeMapping> getDefaultDatatypeCasts(DBEnum sourceDB)
    {
        logger.debug("Enter: sourceDB=" + sourceDB);
        if (sourceDB == null)
        {
            logger.error("SourceDB is null, do nothing and return empty list.");
            return new ArrayList<>();
        }

        switch (sourceDB)
        {
            case Oracle:
                return getCastsPG2Oracle();
            default:
                logger.warn(sourceDB + " cannot be supported, do nothing and return empty list.");
                return new ArrayList<>();
        }
    }    
    private List<DatatypeMapping> getCastsPG2Oracle()
    {
        List<DatatypeMapping> castList = new ArrayList<>();
        DatatypeMapping cast;

        // all have parameter - scale
        cast = new DatatypeMapping("INTERVAL DAY\\(\\d{1,9}\\) TO SECOND\\([0-9]\\)");
        cast.setPgDatatype("INTERVAL");//INTERVAL(scale)
        cast.addOptionalPgDatatype("INTERVAL");
        castList.add(cast);

        cast = new DatatypeMapping("INTERVAL YEAR\\(\\d{1,9}\\) TO MONTH");
        cast.setPgDatatype("INTERVAL");//INTERVAL(scale),scale=0
        cast.addOptionalPgDatatype("INTERVAL");
        castList.add(cast);

        // all have parameter - scale
        cast = new DatatypeMapping("TIMESTAMP\\([0-9]\\) WITH.*");//TIMESTAMP(scale) WITH TIME ZONE / WITH LOCAL TIME ZONE
        cast.setPgDatatype("TIMESTAMPTZ");//TIMESTAMP(scale) WITH TIME ZONE / WITH LOCAL TIME ZONE
        cast.addOptionalPgDatatype("TIMESTAMPTZ");
        castList.add(cast);

        cast = new DatatypeMapping("TIMESTAMP\\([0-9]\\)");//has no time zone
        cast.setPgDatatype("TIMESTAMP");//TIMESTAMP(scale)
        cast.addOptionalPgDatatype("TIMESTAMP");
        castList.add(cast);

        cast = new DatatypeMapping("DATE");//second has no fractional seconds and time zone
        cast.setPgDatatype("TIMESTAMP(0)");
        cast.addOptionalPgDatatype("TIMESTAMP(0)");
        castList.add(cast);

        // all have the parameter -- length
        cast = new DatatypeMapping("CHAR");//autoFill length
        cast.setPgDatatype("CHAR");//autoFill length
        cast.addOptionalPgDatatype("CHAR");
        castList.add(cast);

        cast = new DatatypeMapping("NCHAR");//autoFill length
        cast.setPgDatatype("CHAR");//autoFill length
        cast.addOptionalPgDatatype("CHAR");
        castList.add(cast);

	//Oracle VARCHAR always convert to VARCHAR2
        //HGDB VARCHAR2 Cannot be used(cause ERROR: 42P22: could not determine which collation to use for string comparison)
        cast = new DatatypeMapping("VARCHAR2");
        cast.setPgDatatype("VARCHAR");
        cast.addOptionalPgDatatype("VARCHAR");
        cast.addOptionalPgDatatype("TEXT");
        cast.addOptionalPgDatatype("BOOLEAN");//0-false, 1-true
        castList.add(cast);

        cast = new DatatypeMapping("NVARCHAR2");
        cast.setPgDatatype("VARCHAR");
        cast.addOptionalPgDatatype("VARCHAR");
        cast.addOptionalPgDatatype("TEXT");
        cast.addOptionalPgDatatype("BOOLEAN");//0-false, 1-true
        castList.add(cast);

		// no parameter
        // LONG can convert to CLOB in Oracle, both of them are TEXT in PG
        cast = new DatatypeMapping("LONG");
        cast.setPgDatatype("TEXT");
        cast.addOptionalPgDatatype("TEXT");
        cast.addOptionalPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

        cast = new DatatypeMapping("CLOB");
        cast.setPgDatatype("TEXT");
        cast.addOptionalPgDatatype("TEXT");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

        cast = new DatatypeMapping("NCLOB");
        cast.setPgDatatype("TEXT");
        cast.addOptionalPgDatatype("TEXT");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

        cast = new DatatypeMapping("BFILE");
        cast.setPgDatatype("TEXT");
        cast.addOptionalPgDatatype("TEXT");
        cast.addOptionalPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

        //no parameter(bytea)
        cast = new DatatypeMapping("BLOB");
        cast.setPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

        cast = new DatatypeMapping("LONG RAW");
        cast.setPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

        cast = new DatatypeMapping("RAW");// <=2000 byte ,omit its parameter(<=2000) and directly convert to bytea
        cast.setPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("BYTEA");
        cast.addOptionalPgDatatype("OID");
        castList.add(cast);

         // no parameter(new)
         cast = new DatatypeMapping("XMLTYPE");
         cast.setPgDatatype("XML");
         cast.addOptionalPgDatatype("XML");
         castList.add(cast);
                
	// all has two parameter- precision and scale
        // ambiguous -- oracle type and PG type has different parameter data range
        // Therefore, the priority type is NUMERIC(set as default), add other type in the cast list	
        // Oracle NUMERIC,DEC,DECIMAL always convert to NUMBER[P,S] or NUMBER
        cast = new DatatypeMapping("NUMBER");
        cast.setPgDatatype("NUMERIC");
        cast.addOptionalPgDatatype("NUMERIC");
        castList.add(cast);

	// maybe no parameter
        // ambiguous -- in PG float8 equals double precision;float4 equals real;
        // but those two has different float point
        cast = new DatatypeMapping("BINARY_DOUBLE");//Valid digit number is 15
        cast.setPgDatatype("DOUBLE PRECISION");//float8 Valid digit number is 15
        cast.addOptionalPgDatatype("DOUBLE PRECISION");
        castList.add(cast);

        cast = new DatatypeMapping("BINARY_FLOAT");//Valid digit number is 6(7?) 
        cast.setPgDatatype("REAL");//float4 Valid digit number is 6
        cast.addOptionalPgDatatype("REAL");//float4 Valid digit number is 6
        cast.addOptionalPgDatatype("DOUBLE PRECISION");//float8 Valid digit number is 15
        castList.add(cast);

        cast = new DatatypeMapping("FLOAT");//Valid digit number is 32 (name is NUMBER in jdbc)
        cast.setPgDatatype("DOUBLE PRECISION");//float8 Valid digit number is 15
        cast.addOptionalPgDatatype("DOUBLE PRECISION");
        castList.add(cast);

	// need more test
        // has no size
        //castList.add(new String[] {"ROWID", "OID"});
        // has size--urowid(size)
        //castList.add(new String[] {"UROWID", "OID"});
        return castList;
    }

}
