/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import lyy.pg.orcl.model.DBSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
/**
 *
 * @author Liu Yuanyuan
 */
public class JdbcUtil
{
    private static Logger logger = LogManager.getLogger(JdbcUtil.class);

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

//        String url = "jdbc:postgresql://127.0.0.1:5433/postgres";
//        String user = "postgres";
//        String pwd = "postgres";
//        try
//        {
//            JdbcUtil.getConnection(url, user, pwd);
//            logger.debug("Connected");
//        } catch (Exception ex)
//        {
//            ex.printStackTrace();
//        }
    }

    public static Connection getConnection(DBSource db)
            throws ClassNotFoundException, SQLException, Exception
    {
        String driver;
        String url;
        switch(db.getType())
        {
            case PostgreSQL:
                driver = "org.postgresql.Driver";
                url = "jdbc:postgresql://" + db.getHost() + ":" + db.getPort() + "/" + db.getDb();
                break;
            case Oracle:
                driver = "oracle.jdbc.driver.OracleDriver";
                url= "jdbc:oracle:thin:@" +  db.getHost() + ":" + db.getPort() + ":" + db.getDb();
                break;
            default:
                throw new Exception("Not support db type:" + db.getType());
        }
        
        Class.forName(driver);        
        Properties props = new Properties();
        props.setProperty("user", db.getUser());
        props.setProperty("password", db.getPwd());
        Connection conn = DriverManager.getConnection(url, props);
        return conn;
    }

}
