/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.model;

import lyy.pg.orcl.util.Enum.DBObject;


/**
 *
 * @author Liu Yuanyuan
 */
public class ObjInfo //implements Comparable
{
    private DBObject type;
    private String schema;
    private String name;
    private boolean selected;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public DBObject getType()
    {
        return type;
    }

    public void setType(DBObject type)
    {
        this.type = type;
    }

    public String getSchema()
    {
        return schema;
    }

    public void setSchema(String schema)
    {
        this.schema = schema;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
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