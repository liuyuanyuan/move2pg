package com.highgo.admin.migrator.comparator.model;

import com.highgo.admin.migrator.controller.KeyWordFactory;
import com.highgo.admin.migrator.util.MigratorEnum.DB;

/*
 * now only for Table Name Compare
 */
public class ObjectDTO extends Object {

	private DB db;
	//private DBObject type;
	private String name;//name came from Oracle/HGDB system table(originally never quoted)
	private ObjectDTO sameHgObject;
	
	public ObjectDTO(DB db, String name)
	{
		this.db = db;
		this.name = name;
	}

	//for test
	public void setSameHgObject(ObjectDTO sameHgObject)
	{
		this.sameHgObject = sameHgObject;
	}
	
	public ObjectDTO getSameHgObject()
	{
		return sameHgObject;
	}
	
	public String getName()
	{
		return name;
	}
	
	public DB getDb() {
		return db;
	}

	//for print
	public String toString()
	{
		return "[" + db + "," + name + "]";		
	}

	//for diff
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof ObjectDTO)
		{			
			ObjectDTO tab = (ObjectDTO) obj;
			boolean flag = (this.hashCode()==tab.hashCode());
			//for same table
			if(DB.ORACLE==db && DB.HIGHGO==tab.getDb() && flag)
			{
				sameHgObject = tab;
			}
			
			return flag;
		}else
		{
			return false;
		}		
	}
	
	@Override
	public int hashCode() {
		if(DB.HIGHGO == db)
		{
			return name.hashCode();
		} else if(DB.ORACLE == db)
		{
			String quotedName = KeyWordFactory.getInstance().quotedName2Hg(name, db);
			if (quotedName.startsWith("\"") && quotedName.endsWith("\"")) 
			{
				return name.hashCode();
			} else 
			{
				return name.toLowerCase().hashCode(); //upper case in oracle becomes lower case in hgdb
			}
		}else
		{
			return 0;//exception
		}
	}	
     
	//for display in UI
	public String getSourceName() 
	{
		return DB.HIGHGO != db ? name : "";// null
	}
	public String getSourceType() 
	{
		return getSourceName() != null && !getSourceName().isEmpty() ? "TABLE" : "";// null
	}

	public String getHgdbName() 
	{
		return DB.HIGHGO == db ? name : "";// null
	}
	public String getHgdbType() 
	{
		return getHgdbName() != null && !getHgdbName().isEmpty() ? "TABLE" : "";// null
	}
	
}
