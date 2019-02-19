/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.model;

/**
 *
 * @author Liu Yuanyuan
 */
public class FKConstrInfo
{
    String schema;
    String table;
    String constraint;
    String fkSQL;

    public String getSchema()
    {
        return schema;
    }

    public void setSchema(String schema)
    {
        this.schema = schema;
    }

    public String getTable()
    {
        return table;
    }

    public void setTable(String table)
    {
        this.table = table;
    }

    public String getConstraint()
    {
        return constraint;
    }

    public void setConstraint(String constraint)
    {
        this.constraint = constraint;
    }

    public String getFkSQL()
    {
        return fkSQL;
    }

    public void setFkSQL(String fkSQL)
    {
        this.fkSQL = fkSQL;
    }

}
