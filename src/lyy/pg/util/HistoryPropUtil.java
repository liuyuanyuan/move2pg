package lyy.pg.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import lyy.pg.model.DBSource;
import lyy.pg.util.DBEnum.ArgType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Liu Yuanyuan
 *
 */
public class HistoryPropUtil
{

    public static void main(String[] args)
    {
        DBSource oraconnInfo = new DBSource();
        oraconnInfo.setDBType(DBEnum.Oracle);
        oraconnInfo.setHost("192.168.100.106");
        oraconnInfo.setPort(1521);
        oraconnInfo.setArgType(DBEnum.ArgType.Service);
        oraconnInfo.setArg("orcl");
        oraconnInfo.setUser("lyy");
        oraconnInfo.setPwd("lyy");
        try
        {
            HistoryPropUtil.saveHistory(oraconnInfo, true);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static final Logger logger = LogManager.getLogger(HistoryPropUtil.class);

    private static final SimpleDateFormat Time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final static String HistoryRoot = new File("").getAbsoluteFile() + File.separator + "conf" + File.separator;
    private static final String DatasourceHistory;

    static
    {
        File historyRootFolder = new File(HistoryRoot);
        if (!historyRootFolder.exists())
        {
            logger.warn("History Root Folder doesn't exist then create: " + HistoryRoot);
            logger.debug("mkdirs=" + historyRootFolder.mkdirs());
        }
        DatasourceHistory = HistoryRoot + File.separator + "DatasourceHistory.properties";
        logger.debug(DatasourceHistory);
    }

    public static boolean saveHistory(DBSource dbsource, boolean savePwd) throws Exception
    {
        logger.debug("Enter:dbsource=" + dbsource + ", savePwd=" + savePwd);
        if (dbsource == null)
        {
            logger.warn("Entered dbsource is null, do nothing and return false.");
            return false;
        }

        boolean success = false;
        FileInputStream in = null;
        FileOutputStream fos = null;
        try
        {
            File file = new File(DatasourceHistory);
            if (!file.exists())
            {
                boolean createNewFile = file.createNewFile();
                logger.debug(file.getAbsolutePath() + " not exist and create it:" + createNewFile);
                if (!createNewFile)
                {
                    logger.warn(file.getAbsolutePath() + " created failed.");
                    return false;
                }
            }

            Properties props = new Properties();
            in = new FileInputStream(file);
            props.load(in);// load old config info (from previous page)
            String header = dbsource.getDBType().toString() + ".";
            props.put(header + "host", dbsource.getHost());
            props.put(header + "port", String.valueOf(dbsource.getPort()));
            props.put(header + "argType", dbsource.getArgType().toString());
            props.put(header + "arg", dbsource.getArg());
            props.put(header + "user", dbsource.getUser());
            props.put(header + "password", savePwd ? AES.Encrypt(dbsource.getPwd()) : "");

            fos = new FileOutputStream(file);
            props.store(fos, "Last update: " + Time.format(new Date()));
            success = true;
        } catch (Exception ex)
        {
            success = false;
            throw ex;
        } finally
        {
            StreamUtil.close(fos);
        }

        return success;
    }

    public static DBSource readHistory(DBEnum dbType) throws Exception
    {
        logger.debug("dbType=" + dbType);
        if (dbType == null)
        {
            logger.debug("Entered dbType is null, do nothing and return.");
            return null;
        }

        DBSource dbsource = null;
        FileReader in = null;
        try
        {
            File file = new File(DatasourceHistory);
            if (!file.exists())
            {
                logger.warn("Datasource History file:" + file.getAbsolutePath() + " not exit, then return null.");
                return null;
            }

            Properties props = new Properties();
            in = new FileReader(file);
            props.load(in);
            if (props.isEmpty())
            {
                logger.warn("Datasource History file:" + file.getAbsolutePath() + " is empty, then return null.");
                return null;
            }

            final String Header = dbType.toString() + ".";
            if (props.getProperty(Header + "host") == null
                    && props.getProperty(Header + "port") == null
                    && props.getProperty(Header + "argType") == null
                    && props.getProperty(Header + "arg") == null
                    && props.getProperty(Header + "user") == null)
            {
                logger.warn(dbType + " Datasource History are all null, then return null.");
                return null;
            }
            dbsource = new DBSource();
            dbsource.setDBType(dbType);
            dbsource.setHost(props.getProperty(Header + "host"));
            if (props.getProperty(Header + "port") != null)
            {
                dbsource.setPort(Integer.valueOf(props.getProperty(Header + "port")));
            }
            if (props.getProperty(Header + "argType") != null)
            {
                switch (props.getProperty(Header + "argType"))
                {
                    case "DB":
                        dbsource.setArgType(ArgType.DB);
                        break;
                    case "Service":
                        dbsource.setArgType(ArgType.Service);
                        break;
                    case "SID":
                        dbsource.setArgType(ArgType.SID);
                        break;
                    default:
                        dbsource.setArgType(null);
                        break;
                }
            }
            dbsource.setArg(props.getProperty(Header + "arg"));
            dbsource.setUser(props.getProperty(Header + "user"));
            dbsource.setPwd(AES.Decrypt(props.getProperty(Header + "password")));
        } catch (Exception ex)
        {
            throw ex;
        } finally
        {
            StreamUtil.close(in);
        }

        logger.debug("Return");
        return dbsource;
    }

}
