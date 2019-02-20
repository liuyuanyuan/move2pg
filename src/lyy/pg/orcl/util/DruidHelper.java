package lyy.pg.orcl.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import lyy.pg.orcl.model.DBSource;
/*
 * only for migrator
 */

public class DruidHelper
{

    public static void main(String[] args)
    {
        DBSource oraconnInfo = new DBSource();
        oraconnInfo.setDBType(DBEnum.Oracle);
        oraconnInfo.setHost("192.168.100.106");
        oraconnInfo.setPort(1521);
        oraconnInfo.setArg("orcl");
        oraconnInfo.setUser("lyy");
        oraconnInfo.setPwd("lyy");

        DBSource hgconnInfo = new DBSource();
        hgconnInfo.setDBType(DBEnum.PostgreSQL);
        hgconnInfo.setHost("127.0.0.1");
        hgconnInfo.setPort(5867);
        hgconnInfo.setArg("lyy1");
        hgconnInfo.setUser("lyy");
        hgconnInfo.setPwd("lyy");

        final DruidHelper helper = new DruidHelper();//(hgconnInfo, oraconnInfo);	
        DruidPooledConnection conn = null;

        Statement stmt = null;
        ResultSet rs = null;
        try
        {
            conn = helper.getSourceConnection();
            System.out.println("connected=" + conn);
            //conn.setAutoCommit(false);
            stmt = conn.createStatement();
			//String sql1 = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM (SELECT * FROM LYY order by id asc) A WHERE ROWNUM <= "
            //		+ (App.BATCH * 0 + App.BATCH) + ") WHERE RN>" + App.BATCH * 0;
            String sql1 = "SELECT 123 from dual ";
            rs = stmt.executeQuery(sql1);
            //conn.commit();
            while (rs.next())
            {
                logger.debug("id=" + rs.getInt(1));
                break;
            }
            //conn.setAutoCommit(true);
        } catch (SQLException e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally
        {
            DruidHelper.close(rs);
            DruidHelper.close(stmt);
            DruidHelper.close(conn);
            logger.debug("close");
        }
    }

    
    private static final Logger logger = LoggerFactory.getLogger(DruidHelper.class);

    private static DruidDataSource source;
    private static DruidDataSource highgo;

    public static DruidHelper getInstance()
    {
        return InstanceHolder.instance;
    }
    private static class InstanceHolder
    {
        private static DruidHelper instance = new DruidHelper();
    }

    public DruidHelper()
    {
        try
        {
            initPgDataSource();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            initSourceDataSource();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        logger.debug("Inited___" + source.getUrl() + " | " + highgo.getUrl());
    }

    private void initPgDataSource() throws Exception
    {
        DBSource connInfo = HistoryPropUtil.readHistory(DBEnum.PostgreSQL);
        if (connInfo == null)
        {
            return;
        }
        highgo = new DruidDataSource();
        //Druid cannot support PGInterval of "com.highgo.jdbc.Driver"
        highgo.setDriverClassName("org.postgresql.Driver");
        //charset for migrate string length
        highgo.setUrl("jdbc:postgresql://" + connInfo.getHost() + ":" + connInfo.getPort() + "/" + connInfo.getArg() + "?charSet=UTF8&amp;allowEncodingChanges=true");
        highgo.setUsername(connInfo.getUser());
        highgo.setPassword(connInfo.getPwd());
        highgo.setInitialSize(0);//1, default 0
        highgo.setMinIdle(1);//default 8
        highgo.setMaxActive(32);//default 8
        highgo.setPoolPreparedStatements(false);
        highgo.setValidationQuery("select 123");
        highgo.setConnectionErrorRetryAttempts(1);
		//highgo.setRemoveAbandoned(true);//can only use for debug
        //highgo.setRemoveAbandonedTimeout(60);//second, 180 
        //highgo.setLogAbandoned(true);	
    }

    private void initSourceDataSource() throws Exception
    {
        DBSource connInfo = HistoryPropUtil.readHistory(DBEnum.Oracle);
        if (connInfo == null)
        {
            return;
        }
        source = new DruidDataSource();
        source.setDriverClassName("oracle.jdbc.driver.OracleDriver"); //better use "oracle.jdbc.OracleDriver" after v9
        source.setUrl("jdbc:oracle:thin:@" + connInfo.getHost() + ":" + connInfo.getPort() 
                + (connInfo.getArgType() == DBEnum.ArgType.Service ? "/" : ":")
                + connInfo.getArg() + ""); // db is service name here
        source.setConnectionProperties("useUnicode=true&characterEncoding=UTF8"); // ?useUnicode=true&characterEncoding=utf8
        source.setUsername(connInfo.getUser());
        source.setPassword(connInfo.getPwd());
        source.setInitialSize(0);//1, default 0
        source.setMinIdle(1);//default 8
        source.setMaxActive(32);//default 8
        source.setPoolPreparedStatements(true);
        source.setValidationQuery("select 123 from dual");
        source.setConnectionErrorRetryAttempts(1);
        //source.setRemoveAbandoned(true);//can only use for debug
        //source.setRemoveAbandonedTimeout(60);//second, 180
        //source.setLogAbandoned(true);
    }

    public synchronized DruidPooledConnection getHGConnection() throws SQLException
    {
        return highgo.getConnection();//shared highgo
    }

    public synchronized DruidPooledConnection getReadOnlySourceConnection() throws SQLException
    {
        DruidPooledConnection conn = source.getConnection();
        conn.setReadOnly(true);
        return conn;//shared source
    }

    public synchronized DruidPooledConnection getSourceConnection() throws SQLException
    {
        return source.getConnection();//shared source
    }

    public static void close(DruidPooledConnection conn)
    {
        try
        {
            if (conn != null)
            {
                conn.close();
            }
        } catch (SQLException e)
        {
            conn = null;
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
                stmt = null;
            }
        } catch (SQLException e)
        {
            stmt = null;
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
                rs = null;
            }
        } catch (SQLException e)
        {
            rs = null;
            e.printStackTrace(System.out);
        }
    }

    /*
     * must close finally then cannot be used any more
     */
    public static void closeDataSource()
    {
        if (highgo != null)
        {
            try
            {
                highgo.close();
            } catch (Exception e)
            {
                e.printStackTrace(System.out);
            } finally
            {
                highgo = null;
            }
        }
        if (source != null)
        {
            try
            {
                source.close();
            } catch (Exception e)
            {
                e.printStackTrace(System.out);
            } finally
            {
                source = null;
            }
        }

        if (InstanceHolder.instance != null)
        {
            InstanceHolder.instance = null;
        }
    }

    public static void cleanDataSource()
    {
        //logger.debug("oldDataSource|" + source.getUrl() + " | " + highgo.getUrl());
        closeDataSource();
        InstanceHolder.instance = new DruidHelper();
        //logger.debug("newDataSource|" + source.getUrl() + " | " + highgo.getUrl());
    }

}
