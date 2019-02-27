/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import lyy.pg.model.DBSource;
import lyy.pg.util.DBEnum.ArgType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Liu Yuanyuan
 */
public class JdbcUtil
{

    public static void main(String[] args)
    {
        /*
         // Determining the default file location
         String pathsep = System.getProperty("file.separator");
         String defaultdir;
         boolean defaultfile = false;
         if (System.getProperty("os.name").toLowerCase().contains("windows"))
         { // It is Windows
         System.out.println("APPDATA=" + System.getenv("APPDATA"));
         defaultdir = System.getenv("APPDATA") + pathsep + "postgresql" + pathsep;
         } else
         {
         defaultdir = System.getProperty("user.home") + pathsep + ".postgresql" + pathsep;
         }
         System.out.println("defaultdir=" + defaultdir);
         */
        DBSource db = new DBSource();
        db.setDBType(DBEnum.Oracle);
        db.setHost("192.168.136.128");
        db.setPort(1521);
        db.setArgType(ArgType.Service);
        db.setArg("orcl");
        db.setUser("lyy");
        db.setPwd("lyy");
        try
        {
            JdbcUtil.getConnection(db);
            logger.debug("Connected");
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private static final Logger logger = LogManager.getLogger(JdbcUtil.class);
     
    public static Connection getConnection(DBSource db)
            throws ClassNotFoundException, SQLException, Exception
    {
        String driver;
        String url;
        switch (db.getDBType())
        {
            case PostgreSQL:
                driver = "org.postgresql.Driver";
                url = "jdbc:postgresql://" + db.getHost() + ":" + db.getPort() + "/" + db.getArg();
                break;
            case Oracle:
                driver = "oracle.jdbc.driver.OracleDriver";
                url = "jdbc:oracle:thin:@" + db.getHost() + ":" + db.getPort() 
                        + (db.getArgType() == ArgType.Service ? "/" : ":")
                        + db.getArg();
                break;
            default:
                throw new Exception("Not support db type:" + db.getDBType());
        }
        logger.debug(driver);
        logger.debug(url);

        Class.forName(driver);
        Properties props = new Properties();
        props.setProperty("user", db.getUser());
        props.setProperty("password", db.getPwd());
        Connection conn = DriverManager.getConnection(url, props);
        return conn;
    }

    public static void close(Connection conn)
    {
        try
        {
            if (conn != null)
            {
                conn.close();
            }
        } catch (SQLException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Statement stmt)
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
        } catch (SQLException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void close(ResultSet rs)
    {
        try
        {
            if (rs != null)
            {
                rs.close();
            }
        } catch (SQLException e)
        {
            e.printStackTrace(System.out);
        }
    }

}
