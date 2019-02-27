/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.model;

import lyy.pg.orcl.util.DBEnum.DBObject;


/**
 *
 * @author Liu Yuanyuan
 */
public class ObjInfo //implements Comparable
{
    private DBObject type;
    private long pgOid;
    private String schema;
    private String name;
    
    private int tableRow;
    private boolean selected;
    private String migrateStatus;
    
    public ObjInfo()
    {
        selected = false;
        migrateStatus = "";
    }
    
    @Override
    public String toString()
    {
        return schema + "." + name;
    }
    
    public DBObject getType()
    {
        return type;
    }

    public void setType(DBObject type)
    {
        this.type = type;
    }

    public long getPgOid()
    {
        return pgOid;
    }

    public void setPgOid(long pgOid)
    {
        this.pgOid = pgOid;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }    

    public String getSchema()
    {
        return schema;
    }

    public void setSchema(String schema)
    {
        this.schema = schema;
    }

    public int getTableRow()
    {
        return tableRow;
    }

    public void setTableRow(int tableRow)
    {
        this.tableRow = tableRow;
    }      
    
    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }
    
    public String getMigrateStatus()
    {
        return migrateStatus;
    }

    public void setMigrateStatus(String migrateStatus)
    {
        this.migrateStatus = migrateStatus;
    }
    
//    @Override
//    public int compareTo(Object o)
//    {
//        ObjInfoDTO obj = (ObjInfoDTO) o;
//        DBObj otherType = obj.getType();
//        //enum-type's comparation depend on types' list order of enum method
//        //so this compare follow ObjEnum.objType order
//        return this.type.compareTo(otherType);
//    }

}
