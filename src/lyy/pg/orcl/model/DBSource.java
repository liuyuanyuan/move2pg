/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.model;

import lyy.pg.orcl.util.DB;

/**
 *
 * @author Liu Yuanyuan
 */
public class DBSource
{
    private DB type;
    private String host;
    private int port;
    private String db;
    private String user;
    private String pwd;

    /*
    public String getDriver()
    {
        switch (type)
        {
            case PostgreSQL:
                return "org.postgresql.Driver";
            case Oracle:
                return "oracle.jdbc.driver.OracleDriver";
            default:
                return null;
        }
    }
    public String getUrl()
    {
        switch (type)
        {
            case PostgreSQL:
                return "jdbc:postgresql://" + host + ":" + port + "/" + db;
            case Oracle:
                return "jdbc:oracle:thin:@" + host + ":" + port + ":" + db;
            default:
                return null;
        }
    }
    */

    @Override
    public String toString()
    {
        return user + "@" + host + ":" + port + "/" + db;
    }

    public DB getType()
    {
        return type;
    }

    public void setType(DB type)
    {
        this.type = type;
    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public String getDb()
    {
        return db;
    }

    public void setDb(String db)
    {
        this.db = db;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }

}
