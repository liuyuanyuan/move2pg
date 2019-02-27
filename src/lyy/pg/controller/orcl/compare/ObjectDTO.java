package lyy.pg.controller.orcl.compare;

import lyy.pg.controller.orcl.KeywordFactory;
import lyy.pg.util.DBEnum;

/*
 * now only for Table Name Compare
 */
public class ObjectDTO extends Object {

	private DBEnum db;
	//private DBObject type;
	private String name;//name came from Oracle/HGDB system table(originally never quoted)
	private ObjectDTO sameHgObject;
	
	public ObjectDTO(DBEnum db, String name)
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
	
	public DBEnum getDb() {
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
			if(DBEnum.Oracle==db && DBEnum.PostgreSQL==tab.getDb() && flag)
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
		if(DBEnum.PostgreSQL == db)
		{
			return name.hashCode();
		} else if(DBEnum.Oracle == db)
		{
			String quotedName = KeywordFactory.getInstance().quotedName2Pg(name, db);
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
		return DBEnum.PostgreSQL != db ? name : "";// null
	}
	public String getSourceType() 
	{
		return getSourceName() != null && !getSourceName().isEmpty() ? "TABLE" : "";// null
	}

	public String getPgdbName() 
	{
		return DBEnum.PostgreSQL == db ? name : "";// null
	}
	public String getHgdbType() 
	{
		return getPgdbName() != null && !getPgdbName().isEmpty() ? "TABLE" : "";// null
	}
	
}
