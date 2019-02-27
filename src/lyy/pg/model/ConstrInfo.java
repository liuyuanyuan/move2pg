/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.model;

/**
 *
 * @author Liu Yuanyuan
 */
public class ConstrInfo
{
    private String constrType;
    private String schema;
    private String tabName;
    private String constrName;
    private String colsSQL;// like (col1,col2,..)

    //for foreign key constraint
    private String rConstrName;
    private String rTabColsSQL;// like schema.table(col1,col2...)
    //for check constraint
    private String searchCondition;

    //constr add sql statement
    //private String constrSQL;

    public String getColsSQL()
    {
        return colsSQL;
    }

    public void setColsSQL(String colsSQL)
    {
        this.colsSQL = colsSQL;
    }

    public String getrTabColsSQL()
    {
        return rTabColsSQL;
    }

    public void setRTabColsSQL(String rTabColSQL)
    {
        this.rTabColsSQL = rTabColSQL;
    }

    public String getConstrType()
    {
        return constrType;
    }

    public void setConstrType(String constrType)
    {
        this.constrType = constrType;
    }

    public String getSchema()
    {
        return schema;
    }

    public void setSchema(String schema)
    {
        this.schema = schema;
    }

    public String getTabName()
    {
        return tabName;
    }

    public void setTabName(String tabName)
    {
        this.tabName = tabName;
    }


    public String getConstrName()
    {
        return constrName;
    }

    public void setConstrName(String constrName)
    {
        this.constrName = constrName;
    }

    public String getRConstrName()
    {
        return rConstrName;
    }

    public void setRConstrName(String rConstrName)
    {
        this.rConstrName = rConstrName;
    }

    public String getSearchCondition()
    {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition)
    {
        this.searchCondition = searchCondition;
    }

//    public String getConstrSQL()
//    {
//        return constrSQL;
//    }
//
//    public void setConstrSQL(String constrSQL)
//    {
//        this.constrSQL = constrSQL;
//    }
}
