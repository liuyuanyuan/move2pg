/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.controller.orcl.migrate;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.alibaba.druid.pool.DruidPooledResultSet;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.BatchUpdateException;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lyy.pg.controller.orcl.DatatypeFactory;
import lyy.pg.controller.orcl.KeywordFactory;
import lyy.pg.controller.orcl.SQLFactory;
import lyy.pg.model.ConstrInfo;
import lyy.pg.model.DBSource;
import lyy.pg.model.FKConstrInfo;
import lyy.pg.model.MigrateMode;
import lyy.pg.model.ObjInfo;
import lyy.pg.model.ProgressDTO;
import lyy.pg.util.CommonUtils;
import lyy.pg.util.DBEnum;
import lyy.pg.util.DBEnum.DBObject;
import lyy.pg.util.DBEnum.MigrateStatus;
import lyy.pg.util.DBEnum.TabObject;
import lyy.pg.util.DBEnum.TableMode;
import lyy.pg.util.DruidHelper;
import lyy.pg.util.JdbcUtil;
import lyy.pg.util.StreamUtil;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BFILE;
import oracle.xdb.XMLType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.postgresql.jdbc.PgConnection;
import org.postgresql.largeobject.LargeObject;
import org.postgresql.largeobject.LargeObjectManager;
import org.postgresql.util.PGInterval;

/**
 *
 * @author Liu Yuanyuan
 */
public class MigrateController
{

    private final Logger logger = LogManager.getLogger(getClass());
    
    private final SimpleDateFormat Time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final String Migrating = "Migrating", Successed = "Successed", Failed = "Failed", Terminated = "Terminated";    
    private final SimpleDateFormat Time4FileName = new SimpleDateFormat("yyyyMMddHHmmss");
    private final String OID_DATA_FILENAME = new File("").getAbsolutePath()  + File.separator + "temp" + File.separator;
    //private final String HGSQLState_RelNotExist = "42P01";
    private final int CoreThread = Runtime.getRuntime().availableProcessors() * 3 / 4;            
       
    private ProgressDTO progress;

    public MigrateController() {
    	logger.debug("--------init--------");
    	progress = new ProgressDTO();
    }    
    public ProgressDTO getProgress()
    {
        return progress;
    }
    public void updateStatus(MigrateStatus status)
    {
        logger.debug("Enter: " + status);
        if (null != status)
        switch (status) {
            case Stop:
                progress.setState(-1);
                break;
            case Suspend:
                progress.setState(0);
                break;
            case Start:
            case Continue:
                progress.setState(1);
                break;
            default:
                break;
        }
        logger.debug("state=" + progress.getState());
    }
    private boolean monitorStatus()
    {
        while (progress.getState() == 0)
        {
            // logger.debug("suspend");
        }
        return progress.getState() == -1;
    }
    
        
    public void startMigrateThread(String logRoot, DBSource sourceDBInfo, DBSource hgDBInfo,
            List<ObjInfo> choosedObjects, HashMap<String, String> datatypeMaps, MigrateMode migrateMode)
    {
        MigrateRunnable mRunnable = new MigrateRunnable(logRoot, 
        		sourceDBInfo, hgDBInfo, choosedObjects, datatypeMaps, migrateMode);
        Thread thread = new Thread(mRunnable);
        thread.start();
    }
    private class MigrateRunnable implements Runnable
    {
    	//private List<String[]> migrateLog;
        private String logRoot;
        private DBSource sourceDBInfo;
        private DBSource hgDBInfo;
        private List<ObjInfo> choosedObjects;
        private HashMap<String, String> datatypeMaps;
        private MigrateMode migrateMode;

        public MigrateRunnable(String logRoot, DBSource sourceDBInfo, DBSource hgDBInfo,
        		List<ObjInfo> choosedObjects, HashMap<String, String> datatypeMaps, MigrateMode migrateMode)
        {
            //this.migrateLog = migrateLog;
            this.logRoot = logRoot;
            this.sourceDBInfo = sourceDBInfo;
            this.hgDBInfo = hgDBInfo;
            this.choosedObjects = choosedObjects;
            this.datatypeMaps = datatypeMaps;
            this.migrateMode = migrateMode;
        }

        @Override
        public void run()
        {
            migrate(logRoot, sourceDBInfo, hgDBInfo, choosedObjects, datatypeMaps, migrateMode);
        }
    }
    
    
    private void migrate(String logRoot, DBSource sourceDBInfo, DBSource hgDBInfo,
            List<ObjInfo> choosedObjects, HashMap<String, String> datatypeMaps, MigrateMode migrateMode)
    {
        logger.debug("Enter");
        
        File file = new File(logRoot);
        if (!file.exists())
        {
            logger.info(logRoot + " doesn't exist then create: " + file.mkdirs());
        }
        String str = Time4FileName.format(new Date());
        String pathError = logRoot + File.separator + "object_error_" + str + ".sql";
        logger.info("pathError=" + pathError);
        String pathResult = logRoot + File.separator + "migration_" + str + ".html";
        logger.info("pathResult=" + pathResult);
        BufferedWriter pwError = null;
        BufferedWriter pwResult = null;

        progress.setTotalCount(choosedObjects.size());
        int totalCount = progress.getTotalCount();
        logger.info("objSize = " + totalCount);
        if (totalCount == 0)
        {
            logger.info("No Object Need To Migrate, Do Nothing, And Return.");
            //migrateLog.add(new String[]{"Nothing to migrate.", Time.format(new Date())});
            try
            {
                pwResult = new BufferedWriter(new FileWriter(pathResult));
                writeLog(pwResult, " -- Result -- <br/><br/> Nothing to migrate.");
                openFile(pathResult);
            } catch (IOException ex)
            {
                logger.error(ex.getMessage());
                ex.printStackTrace(System.out);
            }
            return;
        }

        List<FKConstrInfo> fkSqlList = new ArrayList<>();
        try
        {
            //prepare 
            pwError = new BufferedWriter(new FileWriter(pathError));
            pwResult = new BufferedWriter(new FileWriter(pathResult));
            //writeLog(pwScript, " -- Trigger, Package, MView, DBLink, Synonym Names for " + sourceDBInfo.getUser() + " -- ");
            writeLog(pwError, " -- Errors -- ");
            writeLog(pwResult, " -- Result -- <br/>");

            //migrate
            writeLog(pwResult, "<br/>Total Objects: " + totalCount + " <br/>" + Time.format(new Date()));
            //migrateLog.add(new String[]{"Total Objects: " + totalCount, Time.format(new Date())});
                    
            progress.setValue(0);
            AtomicInteger succObjs = new AtomicInteger(0);//LongAdder            
            migrateTableAndData(succObjs, choosedObjects, sourceDBInfo, hgDBInfo,
                    datatypeMaps, fkSqlList, migrateMode, pwResult, pwError);
            /*
            //create schema before any others
            migrateDefination(succObjs, DBObject.Schema, choosedObjects.get(DBObject.Schema), sourceDBInfo, hgDBInfo, pwResult, pwError, migrateLog);
            //table,data,constraint
            migrateTableAndData(succObjs, choosedObjects.get(DBObject.Table), sourceDBInfo, hgDBInfo,
                    datatypeMaps, fkSqlList, migrateMode, pwResult, pwError, migrateLog);
            //migrate definition for sequence, view, index, function and procedure
            migrateDefination(succObjs, DBObject.Sequence, choosedObjects.get(DBObject.Sequence), sourceDBInfo, hgDBInfo, pwResult, pwError, migrateLog);
            migrateDefination(succObjs, DBObject.View, choosedObjects.get(DBObject.View), sourceDBInfo, hgDBInfo, pwResult, pwError, migrateLog);
            migrateDefination(succObjs, DBObject.Index, choosedObjects.get(DBObject.Index), sourceDBInfo, hgDBInfo, pwResult, pwError, migrateLog);
            migrateDefination(succObjs, DBObject.Function, choosedObjects.get(DBObject.Function), sourceDBInfo, hgDBInfo, pwResult, pwError, migrateLog);
            migrateDefination(succObjs, DBObject.Procedure, choosedObjects.get(DBObject.Procedure), sourceDBInfo, hgDBInfo, pwResult, pwError, migrateLog);
            */
            
            writeLog(pwResult, "<br/>Objects: Successed(" + succObjs.get() + "), Failed("
                    + (totalCount - succObjs.get()) + ")<br/>" + Time.format(new Date()) + "<br/>");
            //migrateLog.add(new String[]{"Finish Objects: Successed(" + succObjs.get() 
            //        + "), Failed(" + (totalCount - succObjs.get()) + ")", Time.format(new Date())});
        
            //FK constraint
            if (migrateMode.getTableMode() != TableMode.OnlyData)
            {
                migrateFKConstraint(fkSqlList, hgDBInfo, pwResult, pwError);
            } else
            {
                progress.setFkCount(-1);// needn't migrate fk
            }
        } catch (IOException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            //migrate finish and open result.html
            progress.setState(2);
            writeLog(pwResult, "<br/><br/>-- Completed --");
            openFile(pathResult);

            //because maybe not used any more then clean
            //DruidHelper.cleanDataSource();

            //delete all temp file
            deleteAllTempFiles();
        }

        logger.debug("Return");
    }
    private void deleteAllTempFiles()
    {
        File file = new File(OID_DATA_FILENAME);
        if (!file.exists() || !file.isDirectory())
        {
            return;
        }
        System.gc();//to release unclose resource
        String[] tempList = file.list();
        File temp;
        for (int i = 0; i < tempList.length; i++)
        {
            if (OID_DATA_FILENAME.endsWith(File.separator))
            {
                temp = new File(OID_DATA_FILENAME + tempList[i]);
            } else
            {
                temp = new File(OID_DATA_FILENAME + File.separator + tempList[i]);
            }
            if (temp.isFile())
            {
                logger.debug("delete " + temp.getAbsolutePath() + temp.delete());
            }
        }
    }
    private void migrateTableAndData(AtomicInteger succObjs, List<ObjInfo> list, DBSource sourceDBInfo, DBSource hgDBInfo,
            HashMap<String, String> datatypeMaps, List<FKConstrInfo> fkSqlList, MigrateMode migrateMode,
            BufferedWriter pwResult, BufferedWriter pwError)//, List<String[]> migrateLog
    {
        if (monitorStatus())
        {
            logger.debug("Terminated");
            return;
        }

        int size = list == null ? 0 : list.size();
        logger.debug("Enter: Table(" + size + ")");
        if (list == null || list.isEmpty())
        {
            return;
        }

        for (ObjInfo obj : list)
        {
            if (monitorStatus())
            {
                logger.debug("Terminated");
                break;
            }

            //String log = (progress.getValue() + 1) + "/" + progress.getTotalCount() + " Migrate " + obj.getType() + " : " + obj.getName();
            //String[] theLog = new String[]
            //{
            //    log, Migrating
            //};
            //migrateLog.add(theLog);

            String result = migrateTable(obj.getSchema(), obj.getName(), sourceDBInfo, hgDBInfo,
                    datatypeMaps, fkSqlList, migrateMode,
                    pwResult, pwError);

            obj.setMigrateStatus(result);
            progress.setValue(progress.getValue() + 1);            
            //theLog[1] = result;
            //logger.debug(log + " " + result);
            if (Successed.equals(result))
            {
                succObjs.incrementAndGet();
            }
        }
        logger.debug("Return");
    }
    private void migrateFKConstraint(List<FKConstrInfo> fkSqlList, DBSource hgDBInfo,
            BufferedWriter pwResult, BufferedWriter pwError)//, List<String[]> migrateLog
    {
        if (monitorStatus())
        {
            logger.debug("Terminated");
            return;
        }

        int fkCount = fkSqlList == null ? 0 : fkSqlList.size();
        logger.debug("Enter: FK(" + fkCount + ")");

        writeLog(pwResult, "<br/>Total Foreign Key Constraint: " + fkCount + "<br/>" + Time.format(new Date()));
        //migrateLog.add(new String[]{"Total Foreign Key Constraint: " 
        // + fkCount, Time.format(new Date())});

        if (fkSqlList == null || fkSqlList.isEmpty())
        {
            progress.setFkCount(-1);
            logger.warn("No Foreign Key Constraint Need To Migrate, do nothing and return.");
            return;
        }

        progress.setFkCount(fkCount);
        progress.setValue(0);
        AtomicInteger succFK = new AtomicInteger(0);

        Connection conn = null;
        try
        {
            conn = JdbcUtil.getConnection(hgDBInfo);
            for (FKConstrInfo fkConstr : fkSqlList)
            {
                if (monitorStatus())
                {
                    logger.debug("Terminated");
                    break;
                }

                //String log = (progress.getValue() + 1) + "/" + progress.getFkCount() + " Create FK Constraint : "
                //        + fkConstr.getConstraint() + "(" + fkConstr.getSchema() + "." + fkConstr.getTable() + ")";
                //String[] theLog = new String[]
                //{
                //    log, Migrating
                //};
                //migrateLog.add(theLog);

                String result = addFKConstrList(pwResult, pwError, conn, fkConstr);
                
                progress.setValue(progress.getValue() + 1);
                //theLog[1] = result;
                //logger.debug(log + " " + result);
                if (Successed.equals(result))
                {
                    succFK.incrementAndGet();
                }
            }
        } catch (Exception ex)
        {
            writeLog(pwError, Time.format(new Date()) 
                    + " Error Create Foreign Key Constraints:" + ex.getMessage());
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(conn);
        }

        writeLog(pwResult, "<br/>Foreign Key Constraint: Successed(" + succFK.get() + ") Failed("
                + (fkCount - succFK.get()) + ")<br/>" + Time.format(new Date()));
        //migrateLog.add(new String[]{
        //    "Finish Foreign Key Constraint: Successed(" + succFK.get() + "), Failed("
        //    + (fkCount - succFK.get()) + ")", Time.format(new Date())});

        logger.debug("Return");
    }
    private String addFKConstrList(BufferedWriter pwResult, BufferedWriter pwError, Connection conn, FKConstrInfo fkConstr)
    {
        if (monitorStatus())
        {
            return Terminated;
        }

        String fkSQL = fkConstr.getFkSQL();
        logger.info("fkSQL = " + fkSQL);
        if (CommonUtils.isEmpty(fkSQL))
        {
            logger.warn("FK Defination SQL is empty. do nothing and return.");
            return Failed;
        }

        String isSuccess = Successed;
        Statement pstmt = null;
        try
        {
            pstmt = conn.createStatement();
            pstmt.execute(fkSQL);
            isSuccess = Successed;
        } catch (SQLException ex)
        {
            isSuccess = Failed;
            writeLog(pwError, Time.format(new Date()) + " Error Add FKey Constraint:" + fkSQL + "\n" + ex.getMessage());
            writeLog(pwResult, "<br/> Failed add FKey to table: " + fkConstr.getSchema() + "." + fkConstr.getTable());
            logger.error(fkSQL + "\n Error:" + ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(pstmt);
        }

        logger.debug("Return:" + isSuccess);
        return isSuccess;
    }
    
    
    //table mode-Normally, onlyStru, onlyData; data mode - Copy, Insert
    private String migrateTable(String schema, String table, DBSource sourceDBInfo, DBSource hgDBInfo,
            HashMap<String, String> datatypeMaps, List<FKConstrInfo> fkSqlList, MigrateMode migrateMode,
            BufferedWriter pwResult, BufferedWriter pwError)
    {
        logger.info("Enter: table=" + schema + "." + table + ", copyBatch=" + migrateMode.getCopyBatch() + ",insertBatch=" + migrateMode.getInsertBatch());

        String isSuccess = Successed;

        StringBuilder tabSelectSQL = new StringBuilder();
        StringBuilder tabCreateSQL = new StringBuilder();
        String schema4create = KeywordFactory.getInstance().quotedName2Pg(schema, sourceDBInfo.getDBType());
        String table4create = KeywordFactory.getInstance().quotedName2Pg(table, sourceDBInfo.getDBType());

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rtset = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDBInfo);
            logger.debug("Connected");

            String tabColumnSQL = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(), TabObject.COLUMN);
            pstmt = conn.prepareStatement(tabColumnSQL);
            pstmt.setString(1, schema);
            pstmt.setString(2, table);
            rtset = pstmt.executeQuery();
            //make table create and select sql.            
            makeTabSQL(rtset, tabCreateSQL, tabSelectSQL, sourceDBInfo, datatypeMaps,
                    schema4create, table4create, schema, table);
            pstmt.clearBatch();
            pstmt.clearParameters();

            //create table
            if (monitorStatus())
            {
                return Terminated;
            } else
            {
                // create table
                try
                {
                    logger.info("TabCreateSQL=" + tabCreateSQL.toString());
                    executeUpdate(hgDBInfo, tabCreateSQL.toString(), pwError);
                } catch (Exception ex)
                {
                    writeLog(pwError, Time.format(new Date()) + " Error Create Table:" + tabCreateSQL.toString()
                            + "\n" + ex.getMessage());
                    throw new Exception(ex);
                }

                // add comment
                commentTabAndColumn(pwError, DBObject.Table, sourceDBInfo, hgDBInfo, schema, table, conn, pstmt, rtset);
                if (monitorStatus())
                {
                    return Terminated;
                }
            }
            isSuccess = Successed;
        } catch (Exception ex)
        {
            isSuccess = Failed;
            writeLog(pwError, Time.format(new Date()) + " Error Migrate Defination for Table:" + schema + "." + table + "\n" + ex.getMessage());
            writeLog(pwResult, "<br/> Failed create table: " + schema + "." + table);
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rtset);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }

        //migrate data
        if (monitorStatus())
        {
            return Terminated;
        } else
        {
            // batch insert -> single insert
            if (!insertDataToPG(pwError, sourceDBInfo, hgDBInfo, tabSelectSQL.toString(), schema, table,
                    datatypeMaps, migrateMode))
            {
                isSuccess = Failed;
                writeLog(pwResult, "<br/> Table data migration failed(check object_error.sql for detail) for table: " + schema + "." + table);
            }
        }

        //add constraint except FK Constraint, and get fk constraint sql
        if (monitorStatus())
        {
            return Terminated;
        }
        try
        {
            addTabConstraint(pwError, pwResult, sourceDBInfo, hgDBInfo, fkSqlList, schema, table);
        } catch (Exception ex)
        {
            isSuccess = Failed;
            writeLog(pwResult, "<br/> Failed add Constraints(except FK) for table: " + schema + "." + table);
        }

        return isSuccess;
    }
    //make table create(PGDB) and select(sourcedb) sql.
    private void makeTabSQL(ResultSet rtset, StringBuilder tabCreateSQL, StringBuilder tabSelectSQL,
            DBSource sourceDBInfo, HashMap<String, String> datatypeMap,
            String schema4create, String table4create, String schema, String table) throws Exception
    {
        tabCreateSQL.append("CREATE TABLE ").append(schema4create).append(".")
                .append(table4create).append("(");
        tabSelectSQL.append("SELECT ");

        boolean isFirst = true;
        while (rtset.next())
        {
            //String schemaName = rtset.getString(1);
            //String tabName = rtset.getString(2);
            String colName = rtset.getString(3);
            String dataType = rtset.getString(4);
            String dataDefault = rtset.getString(5);
            String dataPrecision = rtset.getString(6);
            String dataScale = rtset.getString(7);
            int charLength = rtset.getInt(8);
            var nullable = !"N".equals(rtset.getString(9));

            if (isFirst)
            {
                isFirst = false;
            } else
            {
                tabCreateSQL.append(",");
                tabSelectSQL.append(",");
            }
            //for tabCreateSQL
            String colName4Create = KeywordFactory.getInstance().quotedName2Pg(colName, sourceDBInfo.getDBType());
            //logger.debug("cource dataType=" + dataType);
            dataType = DatatypeFactory.getInstance().getPgTypeWithArgs(sourceDBInfo.getDBType(), datatypeMap,
                    schema, table, colName, dataType, dataPrecision, dataScale, charLength);
            //logger.debug("hgdb dataType=" + dataType);
            tabCreateSQL.append(colName4Create).append(" ").append(dataType);
            if (dataDefault != null && !dataDefault.isEmpty())
            {
                logger.debug("dataDefault=" + dataDefault);
                dataDefault = dataDefault.trim();
                if (dataDefault.toUpperCase().startsWith("SYSTIMESTAMP")
                        || dataDefault.equalsIgnoreCase("sysdate"))
                {
                    dataDefault = "current_timestamp"; 
                }
                tabCreateSQL.append(" DEFAULT ").append(dataDefault); 
            }
            if (!nullable)
            {
                tabCreateSQL.append(" NOT NULL");
            }

            //for tabSelectSQL
            String colName4Select = KeywordFactory.getInstance().quotedName4Oracle(colName);
            tabSelectSQL.append(colName4Select);
        }
        //for tabCreateSQL
        tabCreateSQL.append(");");
        logger.debug("tabCreateSQL=" + tabCreateSQL.toString());

        //for tabSelectSQL
        String schema4select = KeywordFactory.getInstance().quotedName4Oracle(schema);
        String table4select = KeywordFactory.getInstance().quotedName4Oracle(table);
        tabSelectSQL.append(" FROM ").append(schema4select).append(".").append(table4select);
        //oracle select statement couldn't have ';' 
        // + " ORDER BY ROWID"; //oracle select default order by rowid,add adding ORDER BY ROWID will lower select speed  
    }
    private void commentTabAndColumn(BufferedWriter pwError, DBObject Type, DBSource sourceDBInfo, DBSource hgDBInfo, String schema, String table, Connection sconn, PreparedStatement pstmt, ResultSet rtset) throws Exception
    {
        // Table/View Column comment
        String tabColCommentSQL = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(),
                TabObject.COLUMN_COMMENT);
        pstmt = sconn.prepareStatement(tabColCommentSQL);
        pstmt.setString(1, schema);
        pstmt.setString(2, table);
        rtset = pstmt.executeQuery();
        String quotedSchema = KeywordFactory.getInstance().quotedName2Pg(schema, sourceDBInfo.getDBType());
        String quotedTable = KeywordFactory.getInstance().quotedName2Pg(table, sourceDBInfo.getDBType());
        while (rtset.next())
        {
            if (monitorStatus())
            {
                logger.debug("Terminated");
                return;
            }
            if (rtset.getString("COMMENTS") != null)
            {
                String colComment = "COMMENT ON COLUMN " + quotedSchema + "." + quotedTable + "."
                        + KeywordFactory.getInstance().quotedName2Pg(rtset.getString("COLUMN_NAME"), sourceDBInfo.getDBType())
                        + " IS '" + rtset.getString("COMMENTS").replaceAll("'", "''") + "';";
                //logger.debug("colComment=" + colComment);
                try
                {
                    executeUpdate(hgDBInfo, colComment, pwError);
                } catch (Exception ex)
                {
                    throw new Exception(" Error column Comment: " + colComment + "\n" + ex.getMessage());
                }
            }
        }
        pstmt.clearBatch();
        pstmt.clearParameters();

        // Table/View comment
        String tabCommentSQL = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(),
                TabObject.TABLE_COMMENT);
        pstmt = sconn.prepareStatement(tabCommentSQL);
        pstmt.setString(1, Type.toString().toUpperCase());
        pstmt.setString(2, schema);
        pstmt.setString(3, table);
        rtset = pstmt.executeQuery();
        while (rtset.next())
        {
            if (monitorStatus())
            {
                logger.debug("Terminated");
                return;
            }
            if (rtset.getString("COMMENTS") != null)
            {
                String tabComment = "COMMENT ON " + Type.toString().toUpperCase()
                        + " " + quotedSchema + "." + quotedTable + " IS '" + rtset.getString("COMMENTS") + "';";
                logger.debug("tabComment=" + tabComment);
                try
                {
                    executeUpdate(hgDBInfo, tabComment, pwError);
                } catch (Exception ex)
                {
                    throw new Exception(" Error table Comment: " + tabComment + "\n" + ex.getMessage());
                }
            }
        }
        pstmt.clearBatch();
        pstmt.clearParameters();
    }

    
    //one table has more than one constraint of the same type
    private List<FKConstrInfo> addTabConstraint(BufferedWriter pwError, BufferedWriter pwResult,
            DBSource sourceDBInfo, DBSource hgDBInfo,
            List<FKConstrInfo> fkSQLList, String schema, String table) throws Exception
    {
        logger.debug("Enter");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String constrSQL = null;
        try
        {
            String mainSql = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(), TabObject.CONSTRAINT_MAIN);
            conn = JdbcUtil.getConnection(sourceDBInfo);
            logger.debug("Connected");
            pstmt = conn.prepareStatement(mainSql);
            pstmt.setString(1, schema);
            pstmt.setString(2, table);
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                ConstrInfo tabConstrInfo = new ConstrInfo();
                String constrType = rs.getString(1);
                tabConstrInfo.setConstrType(constrType);
                tabConstrInfo.setSchema(rs.getString(2));
                tabConstrInfo.setTabName(rs.getString(3));
                tabConstrInfo.setConstrName(rs.getString(4));
                tabConstrInfo.setRConstrName(rs.getString(5));
                if (!constrType.equals("C"))
                {
                    String colSQL = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(), TabObject.CONSTRAINT_COLUMN);
                    tabConstrInfo.setColsSQL(getConstrColSQL(tabConstrInfo, sourceDBInfo, colSQL));
                }
                if (constrType.equals("C"))
                {
                    String checkSQL = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(), TabObject.CONSTRAINT_CHECKCONDITION);
                    tabConstrInfo.setSearchCondition(getConstrCheckCondition(tabConstrInfo, sourceDBInfo, checkSQL));
                }
                if (constrType.equals("R"))
                {
                    String rColumnSQL = SQLFactory.getSelectSQL(sourceDBInfo.getDBType(), TabObject.CONSTRAINT_RCOLUMN);
                    tabConstrInfo.setRTabColsSQL(getConstrRTabColSQL(tabConstrInfo, sourceDBInfo, rColumnSQL));
                }
                constrSQL = getConstrAddSQL(sourceDBInfo.getDBType(), tabConstrInfo);

                if (constrType.equals("R"))
                {
                    FKConstrInfo fkConstr = new FKConstrInfo();
                    fkConstr.setSchema(schema);
                    fkConstr.setTable(table);
                    fkConstr.setConstraint(tabConstrInfo.getConstrName());
                    fkConstr.setFkSQL(constrSQL);
                    fkSQLList.add(fkConstr);//execute FK at last
                } else
                {
                    logger.info("constrSQL=" + constrSQL);
                    executeUpdate(hgDBInfo, constrSQL, pwError);
                }
            }
            pstmt.clearBatch();
            pstmt.clearParameters();
        } catch (Exception ex)
        {
            writeLog(pwError, Time.format(new Date()) + " Error add Constraits(except FK): "
                    + constrSQL + "\n" + ex.getMessage());
            //writeLog(pwResult, "<br/> Failed add Constraints(except FK): " + schema + "." + table);
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception(ex);
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        logger.debug("Return");
        return fkSQLList;
    }
    //get constrain columns for PK,FK,UK;like (col1,col2...).
    private String getConstrColSQL(ConstrInfo constrInfo,
            DBSource sourceDBInfo, String colSQL) throws Exception
    {
        StringBuilder constrColSQL = new StringBuilder();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rtset = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDBInfo);
            //logger.debug("Connected");
            pstmt = conn.prepareStatement(colSQL);
            pstmt.setString(1, constrInfo.getConstrType());
            pstmt.setString(2, constrInfo.getSchema());
            pstmt.setString(3, constrInfo.getTabName());
            pstmt.setString(4, constrInfo.getConstrName());
            rtset = pstmt.executeQuery();
            boolean isFirst = true;
            constrColSQL.append("(");
            while (rtset.next())
            {
                String colname = rtset.getString(1);
                colname = KeywordFactory.getInstance().quotedName2Pg(colname, sourceDBInfo.getDBType());
                if (isFirst)
                {
                    isFirst = false;
                    constrColSQL.append(colname);
                } else
                {
                    constrColSQL.append(",").append(colname);
                }
            }
            constrColSQL.append(")");

            pstmt.clearBatch();
            pstmt.clearParameters();
        } catch (Exception ex)
        {
            logger.error( ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rtset);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }

        return constrColSQL.toString();
    }
    //get check condition for check constraint.
    private String getConstrCheckCondition(ConstrInfo constrInfoDTO, DBSource sourceDBInfo, String checkSQL)
    {
        String sbSCondition = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rtset = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDBInfo);
            //logger.debug("Connected");
            pstmt = conn.prepareStatement(checkSQL);
            pstmt.setString(1, constrInfoDTO.getSchema());
            pstmt.setString(2, constrInfoDTO.getTabName());
            pstmt.setString(3, constrInfoDTO.getConstrName());
            rtset = pstmt.executeQuery();
            boolean isFirst = true;
            while (rtset.next())//only one line
            {
                if (isFirst)
                {
                    sbSCondition = rtset.getString(1);
                }
            }
            //logger.info("sbSCondition = " + sbSCondition);
            pstmt.clearBatch();
            pstmt.clearParameters();
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rtset);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }

        return sbSCondition;
    }
    //get references table and columns for FK, likes schema.table(col1,col2...).
    private String getConstrRTabColSQL(ConstrInfo constrInfo, DBSource sourceDBInfo, String rColumnSQL)
    {
        logger.debug("Enter");
        String rColSQL = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rtset = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDBInfo);
            pstmt = conn.prepareStatement(rColumnSQL);
            pstmt.setString(1, constrInfo.getSchema());
            pstmt.setString(2, constrInfo.getRConstrName());
            rtset = pstmt.executeQuery();
            boolean isFirst = true;
            while (rtset.next())
            {
                if (isFirst)
                {
                    String user = rtset.getString(1);
                    user = KeywordFactory.getInstance().quotedName2Pg(user, sourceDBInfo.getDBType());
                    String table = rtset.getString(2);
                    table = KeywordFactory.getInstance().quotedName2Pg(table, sourceDBInfo.getDBType());
                    String colname = rtset.getString(3);
                    colname = KeywordFactory.getInstance().quotedName2Pg(colname, sourceDBInfo.getDBType());

                    rColSQL = " " + user + "." + table + "(" + colname;
                    isFirst = false;
                } else
                {
                    String colname = rtset.getString(3);
                    colname = KeywordFactory.getInstance().quotedName2Pg(colname, sourceDBInfo.getDBType());
                    rColSQL = rColSQL + "," + colname;
                }
            }
            rColSQL = rColSQL + ")";

            pstmt.clearParameters();
            pstmt.clearBatch();
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rtset);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        logger.debug("Return:rColSQL=" + rColSQL);
        return rColSQL;
    }
    //for all kind of constraint
    private String getConstrAddSQL(DBEnum sourceDB, ConstrInfo constrInfo)
    {
        logger.debug("Enter");
        StringBuilder constrSQL = new StringBuilder();
        constrSQL.append("ALTER TABLE ")
                .append(KeywordFactory.getInstance().quotedName2Pg(constrInfo.getSchema(), sourceDB)).append(".")
                .append(KeywordFactory.getInstance().quotedName2Pg(constrInfo.getTabName(), sourceDB))
                .append(" ADD CONSTRAINT ").append(constrInfo.getConstrName());
        if (constrInfo.getConstrType().equals("R"))
        {
            constrSQL.append(" FOREIGN KEY").append(constrInfo.getColsSQL())
                    .append(" REFERENCES ").append(constrInfo.getrTabColsSQL()).append(";");
        }
        if (constrInfo.getConstrType().equals("P"))
        {
            constrSQL.append(" PRIMARY KEY").append(constrInfo.getColsSQL()).append(";");
        }
        if (constrInfo.getConstrType().equals("U"))
        {
            constrSQL.append(" UNIQUE").append(constrInfo.getColsSQL()).append(";");
        }
        if (constrInfo.getConstrType().equals("C"))
        {
            constrSQL.append(" CHECK(").append(constrInfo.getSearchCondition().toLowerCase()).append(");");
        }
        //logger.debug("Return:constrSQL=" + constrSQL.toString());
        return constrSQL.toString();
    }

        
    //migrate data by Insert(for insert mode and table has binary(even copy mode))
    private boolean insertDataToPG(BufferedWriter pwError, DBSource sourceDBInfo, DBSource hgDBInfo,
            String tabSelectSQL, String schema, String table, HashMap<String, String> datatypeMaps, MigrateMode migrateMode)
    {
        logger.debug("Enter:" + schema + "." + table);
        long start = System.currentTimeMillis();

        AtomicInteger errorFlag = new AtomicInteger(0);
		//final DruidHelper helper = DruidHelper.getInstance();//hgDBInfo, sourceDBInfo

        String quotedSchema = KeywordFactory.getInstance().quotedName2Pg(schema, sourceDBInfo.getDBType());
        String quotedTable = KeywordFactory.getInstance().quotedName2Pg(table, sourceDBInfo.getDBType());
        int rowCount = getRowCount(errorFlag, quotedSchema + "." + quotedTable);// helper, 
        logger.debug("rowCount = " + rowCount);
        if (errorFlag.get() > 0)
        {
            writeLog(pwError, Time.format(new Date()) + "Error preparing data insert.");
            logger.error("Error preparing data insert, return false.");
            return false;
        } else if (errorFlag.get() == 0 && rowCount == 0)
        {
            logger.warn("No data to migrate, return true.");
            return true;
        }

        final String tabInsertSQL = getTableInsertSQL(errorFlag, tabSelectSQL, sourceDBInfo.getDBType(), quotedSchema, quotedTable);//helper, 
        logger.debug(tabInsertSQL);
        if (errorFlag.get() > 0)
        {
            writeLog(pwError, Time.format(new Date()) + "Filed making table insert SQL, return failed.");
            logger.error("Failed making table insert SQL, return false.");
            return false;
        } else if (errorFlag.get() == 0 && tabInsertSQL == null)
        {
            logger.error("No column to make table insert SQL, return true.");
            return true;
        }

		//final int THREAD_BATCH = migrateMode!=null && migrateMode.getInsertBatch()!=0? migrateMode.getThreadBatch() : 100000;	
        //int allThread = rowCount % THREAD_BATCH == 0 ? rowCount / THREAD_BATCH : rowCount / THREAD_BATCH + 1;
        //int initThread = allThread <= CoreThread? allThread : CoreThread;
        int virtual = rowCount / (migrateMode.getInsertBatch() * 2);
        virtual = rowCount % (migrateMode.getInsertBatch() * 2) == 0 ? virtual : virtual + 1;
        int initThread = virtual < CoreThread ? virtual : CoreThread;
        initThread = initThread == 0 ? 1 : initThread;//to avoid / by zero error caused by OS processors
        final int THREAD_BATCH = rowCount / initThread;
        int allThread = rowCount % initThread == 0 ? initThread : initThread + 1;

        logger.debug("initThread=" + initThread + ", allThread=" + allThread
                + ", THREAD_BATCH=" + THREAD_BATCH + ", InsertBatch=" + migrateMode.getInsertBatch());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                //initThread, allThread + initThread, 61L,TimeUnit.SECONDS, 
                allThread, allThread, 0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
        CountDownLatch doneSignal = new CountDownLatch(allThread);
        BlockingQueue<Integer> orderQueue = new LinkedBlockingQueue<>();
        for (int i = 1; i <= allThread; i++)
        {
            orderQueue.offer(i);
        }

        for (int i = 1; i <= allThread; i++)
        {
            threadPoolExecutor.submit(() ->
            {
                batchInsertThread(orderQueue, doneSignal, errorFlag, pwError,
                        THREAD_BATCH, migrateMode, datatypeMaps, schema, table, tabSelectSQL, tabInsertSQL);// helper, 
            });
        }

        try
        {
            doneSignal.await();
            logger.debug("Threads Done: " + ((System.currentTimeMillis() - start)));
        } catch (InterruptedException ie)
        {
            logger.error("Error awaiting all thread finish:" + ie.getMessage());
        }
        try
        {
            threadPoolExecutor.shutdownNow();
            logger.debug("Totally Done: " + ((System.currentTimeMillis() - start)));
        } catch (Exception e)
        {
            logger.error("Error waiting threadPoolExecutor shutdown:" + e.getMessage());
        }

        logger.debug("Return");
        return errorFlag.get() == 0;
    }
    private int getRowCount(AtomicInteger errorFlag, String tableWithSchmea)//DruidHelper helper,
    {
        int rowCount = 0;
        DruidPooledConnection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
            conn = DruidHelper.getInstance().getReadOnlySourceConnection();
            stmt = conn.createStatement();
            String sql = "select count(1) from " + tableWithSchmea;
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                rowCount = rs.getInt(1);
                break;
            }
        } catch (SQLException ex)
        {
            errorFlag.incrementAndGet();
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(stmt);
            JdbcUtil.close(conn);
        }
        //logger.debug("Return:" + rowCount);
        return rowCount;
    }
    private String getTableInsertSQL(AtomicInteger errorFlag, String tabSelectSQL, DBEnum sourceDB, String quotedSchema, String quotedTable)//DruidHelper helper, 
    {
        String insertSQL = null;

        DruidPooledConnection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
            conn = DruidHelper.getInstance().getReadOnlySourceConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM (" + tabSelectSQL
                    + ") A WHERE ROWNUM <= " + 1 + ") WHERE RN>" + 0;
            logger.debug(sql);
            rs = stmt.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount() - 1;//ROWNUM at last
            logger.debug("colCount=" + colCount);
            insertSQL = makeHGTabInsertSQL(sourceDB, rs, colCount, quotedSchema, quotedTable);
        } catch (SQLException ex)
        {
            errorFlag.incrementAndGet();
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(stmt);
            JdbcUtil.close(conn);
        }
        //logger.debug("Return:" + insertSQL);
        return insertSQL;
    }
    private String makeHGTabInsertSQL(DBEnum sourceDbType, ResultSet rtset, int colCount, String quotedSchema, String quotedTable) throws SQLException
    {
        if (colCount < 1)
        {
            logger.warn("No column in table to make Insert SQL, do nothing and return null.");
            return null;
        }

        StringBuilder insertSQL = new StringBuilder();
        insertSQL.append("INSERT INTO ")
                .append(quotedSchema)//KeywordFactory.getInstance().quotedName2Pg(schema, sourceDbType)
                .append(".")
                .append(quotedTable)//KeywordFactory.getInstance().quotedName2Pg(table, sourceDbType)
                .append("(").append(KeywordFactory.getInstance()
                        .quotedName2Pg(rtset.getMetaData().getColumnName(1), sourceDbType));
        for (int k = 2; k <= colCount; k++)
        {
            insertSQL.append(",").append(KeywordFactory.getInstance()
                    .quotedName2Pg(rtset.getMetaData().getColumnName(k), sourceDbType));
        }
        insertSQL.append(") values(?");
        for (int k = 2; k <= colCount; k++)
        {
            insertSQL.append(",?");
        }
        insertSQL.append(");");

        //logger.info("insertSQL = " + insertSQL.toString());
        return insertSQL.toString();
    }
    private void batchInsertThread(BlockingQueue<Integer> orderQueue, CountDownLatch doneSignal, AtomicInteger errorFlag, BufferedWriter pwError,
            final int THREAD_BATCH, MigrateMode migrateMode, HashMap<String, String> datatypeMaps, String schema, String table, String tabSelectSQL, String tabInsertSQL)//, DruidHelper helper
    {
        if (monitorStatus())
        {
            logger.warn("Terminated");
            writeLog(pwError, Time.format(new Date()) + " Batch Insert Data To Table("
                    + schema + "." + table + ") is Terminated.");
            doneSignal.countDown();
            logger.debug("doneSignal=" + doneSignal.getCount());
            return;
        }

        Integer BatchNum = null;
        try
        {
            BatchNum = orderQueue.poll(10, TimeUnit.MICROSECONDS);
        } catch (InterruptedException e)
        {
            BatchNum = null;
            logger.error("Return because error getting BatchNum, detail: " + e.getMessage());
        }
        //logger.debug("BatchNum=" + BatchNum + ", THREAD_BATCH=" + THREAD_BATCH);
        if (BatchNum == null)
        {
            logger.warn("Cannot get BatchNum, do nothing and return.");
            doneSignal.countDown();
            logger.debug("doneSignal=" + doneSignal.getCount());
            return;
        }
	//logger.debug("BatchNum=" + BatchNum);

        DruidPooledConnection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        DruidPooledConnection hgconn = null;
        PreparedStatement hgpstmt = null;
        try
        {
            conn = DruidHelper.getInstance().getReadOnlySourceConnection();
            //logger.debug(BatchNum + "Connect source");
            stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            final int Start = THREAD_BATCH * (BatchNum - 1);
            final int End = THREAD_BATCH * BatchNum;
            String sql = null;
	    //if(num==AllThread){
            //	sql = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM (" + tabSelectSQL +") A " + ") WHERE RN>" + Start;
            //}else{
            sql = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM (" + tabSelectSQL
                    + ") A WHERE ROWNUM <= " + End + ") WHERE RN>" + Start;
	    //}
            //logger.debug("Select Sql=" + sql);
            rs = stmt.executeQuery(sql);
            //logger.debug(BatchNum + "Get data");

            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount() - 1;//extra ROWNUM at last
            //String insertSQL = makeTabInsertSQL(sourceDBType, rs, colCount, schema, table);)

            hgconn = DruidHelper.getInstance().getHGConnection();
            //logger.debug(BatchNum + "Connect hg");
            hgconn.setAutoCommit(false);
            hgpstmt = hgconn.prepareStatement(tabInsertSQL);
            final int InsertBatch = migrateMode.getInsertBatch();
            int row = 0;
            while (rs.next())
            {
                if (monitorStatus())
                {
                    logger.warn("Terminated");
                    writeLog(pwError, Time.format(new Date()) + " Batch Insert Data To Table("
                            + schema + "." + table + ") is Terminated.");
                    return;
                }
                for (int k = 1; k <= colCount; k++)
                {
                    setParameter4Insert(k, rs, hgpstmt, metaData, hgconn, datatypeMaps);
                }
                hgpstmt.addBatch();
                row++;
                if (row % InsertBatch == 0)
                {
                    boolean batchExecute = batchExecute(pwError, hgpstmt, hgconn);//batch insert error not final util per row insert
                    if (!batchExecute)
                    {
                        // (start+row-InsertBatch, start+row]
                        int BatchStart = (Start + row - InsertBatch);
                        int BatchEnd = (Start + row);
                        String batchSql = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM (" + tabSelectSQL + ") A WHERE ROWNUM <= "
                                + BatchEnd + ") WHERE RN>" + BatchStart;
                        boolean perRowInsert = batch2PerRowInsert(pwError, conn, batchSql, hgconn, hgpstmt, BatchStart, metaData, colCount, datatypeMaps);
                        if (!perRowInsert)
                        {
                            errorFlag.incrementAndGet();
                        }
                        conn.setAutoCommit(false);
                    }
                }
            }

            if (row % InsertBatch != 0)
            {
                logger.debug("thread" + BatchNum + " -- " + row);
                boolean finalBatchExecute = batchExecute(pwError, hgpstmt, hgconn);
                if (!finalBatchExecute)
                {
                    if (monitorStatus())
                    {
                        logger.warn("Terminated");
                        writeLog(pwError, Time.format(new Date()) + " Batch Insert Data To Table("
                                + schema + "." + table + ") is Terminated.");
                        return;
                    }
                    // (end-row%InsertBatch, end]
                    int FinalBatchStart = (Start + row - row % InsertBatch);
                    int FinalBatchEnd = (Start + row);
                    String finalBatchSql = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM (" + tabSelectSQL + ") A WHERE ROWNUM <= "
                            + FinalBatchEnd + ") WHERE RN>" + FinalBatchStart;
                    boolean finalPerRowInsert = batch2PerRowInsert(pwError, conn, finalBatchSql, hgconn, hgpstmt, FinalBatchStart, metaData, colCount, datatypeMaps);
                    if (!finalPerRowInsert)
                    {
                        errorFlag.incrementAndGet();
                    }
                    conn.setAutoCommit(false);
                }
            }
        } catch (Exception ex)
        {
            errorFlag.incrementAndGet();
            writeLog(pwError, Time.format(new Date()) + " Error Batch Insert Data To Table:" + schema + "." + table);
            // must in this order(because BatchUpdateException is subclass of SQLException)
            if (ex instanceof BatchUpdateException)
            {
                BatchUpdateException bex = (BatchUpdateException) ex;
                writeLog(pwError, "BatchUpdateException: " + bex.getSQLState() + " " + bex.getMessage());
                logger.error("BatchUpdateException: " + bex.getSQLState() + " " + bex.getMessage());
                //bex.printStackTrace(System.out);	
                isFatalException(bex.getSQLState());

                SQLException nex = bex.getNextException();
                if (nex != null)
                {
                    writeLog(pwError, "NextException: " + nex.getSQLState() + " " + nex.getMessage());
                    logger.error(nex.getMessage());
                    //nex.printStackTrace(System.out);
                    isFatalException(nex.getSQLState());
                }
            } else if (ex instanceof SQLException)
            {
                SQLException sqlex = (SQLException) ex;
                writeLog(pwError, "SQLException: " + sqlex.getSQLState() + " " + sqlex.getMessage());
                logger.error("SQLException: " + sqlex.getSQLState() + " " + sqlex.getMessage());
                //sqlex.printStackTrace(System.out);
                isFatalException(sqlex.getSQLState());
            } else
            {
                writeLog(pwError, "Exception: " + ex.getMessage());
                logger.error("Exception: " + ex.getMessage());
                //ex.printStackTrace(System.out);
            }
        } finally
        {
            try
            {
                if(hgconn != null)
                    hgconn.setAutoCommit(true);
            } catch (SQLException e)
            {
                //logger.error(e.getSQLState() + " " + e.getMessage());
            }

            JdbcUtil.close(rs);
            JdbcUtil.close(stmt);
            JdbcUtil.close(conn);

            JdbcUtil.close(hgpstmt);
            JdbcUtil.close(hgconn);

            doneSignal.countDown();
            logger.debug("doneSignal=" + doneSignal.getCount());
        }
    }
    private boolean batchExecute(BufferedWriter pwError, PreparedStatement hgpstmt, Connection hgconn) throws SQLException
    {
        boolean isSuccess = false;
        try
        {
            hgpstmt.executeBatch();
            hgconn.commit();//commit
            isSuccess = true;
        } catch (SQLException ex)
        {
            isSuccess = false;
            try
            {
                hgconn.rollback();//must roll back here to avoid Error 25P02
            } catch (SQLException se)
            {
                //se.printStackTrace(System.out);
            }
            writeLog(pwError, Time.format(new Date()) + " Couldn't Batch Insert Data, then insert row by row.");
            //following must in this order
            if (ex instanceof BatchUpdateException)
            {
                BatchUpdateException bex = (BatchUpdateException) ex;
                writeLog(pwError, "BatchUpdateException: " + bex.getSQLState() + " " + bex.getMessage());
                logger.warn("BatchUpdateException: " + bex.getSQLState() + " " + bex.getMessage());
                isFatalException(bex.getSQLState());

                SQLException nex = bex.getNextException();
                if (nex != null)
                {
                    writeLog(pwError, "NextException: " + nex.getSQLState() + " " + nex.getMessage());
                    logger.warn("NextException: " + nex.getSQLState() + " " + nex.getMessage());
                    isFatalException(nex.getSQLState());
                }
            } else if (ex instanceof SQLException)
            {
                SQLException sqlex = (SQLException) ex;
                writeLog(pwError, "SQLException: " + sqlex.getSQLState() + " " + sqlex.getMessage());
                logger.warn("SQLException: " + sqlex.getSQLState() + " " + sqlex.getMessage());
                //sqlex.printStackTrace(System.out);						
                isFatalException(sqlex.getSQLState());
            } else
            {
                writeLog(pwError, "Exception: " + ex.getMessage());
                logger.warn("BatchInsert Exception: " + ex.getMessage());
                //ex.printStackTrace(System.out);
            }
        } finally
        {
            hgpstmt.clearBatch();
        }
        //logger.debug("Return:" + isSuccess);
        return isSuccess;
    }
    private synchronized boolean batch2PerRowInsert(BufferedWriter pwError, Connection oraconn, String tabBatchSql, Connection hgconn, PreparedStatement hgpstmt, int start, ResultSetMetaData metaData, int colCount, HashMap<String, String> datatypeMaps)
    {
        logger.debug("Enter: " + tabBatchSql);
        if (monitorStatus())
        {
            logger.warn("Terminated");
            return false;
        }

        int errorFlag = 0;
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
            stmt = oraconn.createStatement();
            rs = stmt.executeQuery(tabBatchSql);
            while (rs.next())
            {
                if (monitorStatus())
                {
                    logger.warn("Terminated");
                    return false;
                }
                try
                {
                    for (int k = 1; k <= colCount; k++)
                    {
                        setParameter4Insert(k, rs, hgpstmt, metaData, hgconn, datatypeMaps);
                    }
                    hgpstmt.executeUpdate();
                    hgconn.commit();//commit
                } catch (Exception ex)
                {
                    errorFlag++;
                    try
                    {
                        hgconn.rollback();// must roll back here to avoid void 25P02
                    } catch (SQLException se)
                    {
                        se.printStackTrace(System.out);
                    }

                    StringBuilder rowData = new StringBuilder();
                    appandDataStrb(rowData, colCount, rs, metaData, ",", "\"");// int errorRow = start + rs.getRow();

                    writeLog(pwError, Time.format(new Date()) + "Error Insert One Row: " + rowData.toString());// + errorRow 
                    logger.error("Error Insert One Row: " + rowData.toString()); // + errorRow		
                    if (ex instanceof BatchUpdateException)
                    {
                        BatchUpdateException bex = (BatchUpdateException) ex;
                        writeLog(pwError, "This maybe caused by NUL Terminator from Source DB."
                                + System.lineSeparator() + "BatchUpdateException: " + bex.getSQLState() + " " + bex.getMessage());
                        logger.error("This maybe caused by NUL Terminator from Source DB."
                                + System.lineSeparator() + "BatchUpdateException:" + bex.getSQLState() + " " + bex.getMessage());
                        isFatalException(bex.getSQLState());

                        SQLException nex = bex.getNextException();
                        if (nex != null)
                        {
                            writeLog(pwError, "NextException: " + nex.getSQLState() + " " + nex.getMessage());
                            logger.error("NextException: " + nex.getSQLState() + " " + nex.getMessage());
                            //nex.printStackTrace(System.out);							
                            isFatalException(nex.getSQLState());
                        }
                    } else if (ex instanceof SQLException)
                    {
                        SQLException sqlex = (SQLException) ex;
                        writeLog(pwError, "SQLException: " + sqlex.getSQLState() + " " + sqlex.getMessage());
                        logger.error("SQLException: " + sqlex.getSQLState() + " " + sqlex.getMessage());
                        //sqlex.printStackTrace(System.out);						
                        isFatalException(sqlex.getSQLState());
                    } else
                    {
                        writeLog(pwError, "Exception: " + ex.getMessage());
                        logger.error("Exception: " + ex.getMessage());
                        //ex.printStackTrace(System.out);
                    }
                } finally
                {
                    hgpstmt.clearParameters();
                }
            }
        } catch (Exception ex)
        {
            errorFlag++;
            writeLog(pwError, Time.format(new Date()) + " Error batch2PerRowInsert:"
                    + "\n Exception: " + ex.getMessage());
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(rs);
        }
        logger.debug("errorFlag = " + errorFlag);
        return errorFlag == 0;
    }
    private boolean appandDataStrb(StringBuilder strb, int colCount, ResultSet rtset,ResultSetMetaData metaData
       , String delimiter, String quoteChar) throws Exception
    {
        boolean hasWarn = false;
        for (int k = 1; k <= colCount; k++)
        {
            String type = metaData.getColumnTypeName(k);
            logger.debug("type = " + type);
            switch(type)
            {
                case "CLOB":
                    Clob clob = rtset.getClob(k);
                    if (clob == null)
                    {
                        strb.append("");
                    } 
                    else if (clob.length() < 1024)
                    {                        
                        strb.append(quoteChar).append(clob.getSubString(1L, (int) clob.length())).append(quoteChar);
                    } else
                    {
                        //logger.warn("colName=" + metaData.getColumnName(k) + ",colType=" + type + ",valueLength=" + clob.length());
                        strb.append(quoteChar).append(clob.getSubString(1L, (int) clob.length())).append(quoteChar);
                        hasWarn = true;
                    }                   
                    break;
                case "NCLOB":
                    NClob nClob = rtset.getNClob(k);
                    if (nClob == null)
                    {
                        strb.append("");
                    }
                    else if (nClob.length() < 1024)
                    {
                        strb.append(quoteChar).append(nClob.getSubString(1L, (int) nClob.length())).append(quoteChar);
                    } else
                    {         
                       //logger.warn("colName="+metaData.getColumnName(k)+",colType="+type+",valueLength="+nClob.length());
                       strb.append(quoteChar).append(nClob.getSubString(1L, (int) nClob.length())).append(quoteChar);
                       hasWarn = true;
                    }                    
                    break;
                 case "LONG":
                    String strl = rtset.getString(k);
                    if (strl == null)
                    {
                        strb.append("");
                    } else if (strl.length() < 1024)
                    {
                        strb.append(quoteChar).append(strl).append(quoteChar);
                    } else
                    {
                        //logger.warn("colName="+metaData.getColumnName(k)+",colType="+type+",valueLength="+nClob.length());
                        strb.append(quoteChar).append(strl).append(quoteChar);
                        hasWarn = true;
                    }
                    break;
                case "BLOB":
                    strb.append(rtset.getBytes(k) == null ? "" : "<BLOB_VALUE>");
                    break;
                case "LONG RAW":
                    strb.append(rtset.getBytes(k) == null ? "" : "<LONGRAW_VALUE>");
                    break;
                case "RAW":
                    strb.append(rtset.getBytes(k) == null ? "" : "<RAW_VALUE>");
                    break;
                default://other type could get correct values by getString()
                    String str = rtset.getString(k);
                    if (str == null)
                    {
                        strb.append("");
                    } 
                    else
                    {
                        switch(type)
                        {
                            case "INTERVALYM":
                                str = checkIntervalYM(DBEnum.Oracle, str);
                                break;
                            case "INTERVALDS":
                                str = checkIntervalDS(DBEnum.Oracle, str);
                                break;
                            case "TIMESTAMP":
                                if(str.startsWith("-"))
                                {
                                    str = str.substring(1) + " BC";
                                }  
                                break;      
                            default:
                                break;
                        }
                        strb.append(quoteChar).append(str).append(quoteChar);
                    }
                    break;                    
            }
            if (k < colCount)
            {
                strb.append(delimiter);
            }
        }
        strb.append("\r\n");
        
        return hasWarn;
    } 
    
    private void setParameter4Insert(int index, ResultSet rtset, PreparedStatement ppstmt, ResultSetMetaData metaData,
            Connection hgconn, HashMap<String, String> datatypeMaps) throws Exception
    {
        String colType = metaData.getColumnTypeName(index).toUpperCase();
		//hint: this colType is different from datatype store in directory table(especially timestamp and interval).
        //logger.debug(index + "||" + colType + "||" + rtset.getDouble(index) +"||" + rtset.getBigDecimal(index)+ "||" + rtset.getObject(index));
        //logger.debug("colType=" + colType);
        switch (colType)
        {
            case "BFILE":
                BFILE bfile = (BFILE) rtset.getObject(index);
                switch (DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, colType, datatypeMaps))
                {
                    case "BFILE":// text
                    case "TEXT":
                        if (bfile == null)
                        {
                            ppstmt.setString(index, null);
                        } else
                        {
                            ppstmt.setString(index, bfile.getName());//bf.getDirAlias()=directory,bf.getName()=file
                        }
                        break;
                    case "BYTEA":
                        if (bfile == null)
                        {
                            ppstmt.setNull(index, Types.BINARY);
                        } else
                        {
                            File file = getFile(bfile, index);
                            //ppstmt.setBinaryStream(index, new FileInputStream(file), file.length());// file cannot share
                            ppstmt.setBytes(index, getBytes(file));
                        }
                        break;
                    case "OID": // test 4G and pass.
                        if (bfile == null)
                        {
                            ppstmt.setNull(index, Types.BIGINT);
                        } else
                        {
                            File file = getFile(bfile, index);
                            logger.info("BFile Length = " + file.length());
                            hgconn.setAutoCommit(false);
                            Long oid = getOid(hgconn, file);
                            ppstmt.setLong(index, oid);
                        }
                        break;
                }
                break;
            case "BLOB":
            case "LONG RAW":
            case "RAW":
                switch (DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, colType, datatypeMaps))
                {
                    case "BYTEA":
                    case "BLOB"://bytea
                    case "LONG RAW"://bytea
                    case "RAW"://bytea
                        ppstmt.setBytes(index, rtset.getBytes(index));
                        break;
                    case "OID":
                        InputStream ips = rtset.getBinaryStream(index);
                        if (ips == null)
                        {
                            ppstmt.setNull(index, Types.BIGINT);
                        } else
                        {
                            File file = this.getFile(ips, index);
                            // conn2.setAutoCommit(false);
                            Long oid = getOid(hgconn, file);
                            ppstmt.setLong(index, oid);
                        }
                        break;
                }
                break;
            case "CLOB":
            case "NCLOB":
                switch (DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, colType, datatypeMaps))
                {
                    case "TEXT":
                    case "CLOB"://text
                    case "NCLOB"://text
                        ppstmt.setString(index, rtset.getString(index));
                        break;
			//case "BYTEA":
                    //	ppstmt.setBytes(index, rtset.getBytes(index));
                    //	break;
                    case "OID":
                        Reader reader = rtset.getCharacterStream(index);
                        if (reader == null)
                        {
                            ppstmt.setNull(index, Types.BIGINT);
                        } else
                        {
                            File file = this.getFile(reader, index);
                            // conn2.setAutoCommit(false);
                            Long oid = getOid(hgconn, file);
                            ppstmt.setLong(index, oid);
                        }
                        break;
                }
                break;
            case "LONG":
                switch (DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, colType, datatypeMaps))
                {
                    case "TEXT":
                    case "LONG"://text
                        ppstmt.setString(index, rtset.getString(index));
                        break;
                    case "BYTEA":
                        ppstmt.setBytes(index, rtset.getBytes(index));// hgdb not support setAsciiStream()
                        break;
                    case "OID":
                        Reader reader = rtset.getCharacterStream(index);
                        if (reader == null)
                        {
                            ppstmt.setNull(index, Types.BIGINT);
                        } else
                        {
                            File file = this.getFile(reader, index);
                            // conn2.setAutoCommit(false);
                            Long oid = getOid(hgconn, file);
                            ppstmt.setLong(index, oid);
                        }
                        break;
                }
                break;
            case "INTERVALDS":
                String intervalds = checkIntervalDS(DBEnum.Oracle, rtset.getObject(index).toString());
                ppstmt.setObject(index, new PGInterval(intervalds));
                break;
            case "INTERVALYM":
                String intervalym = checkIntervalYM(DBEnum.Oracle, rtset.getObject(index).toString());
                ppstmt.setObject(index, new PGInterval(intervalym));
                break;
            case "DATE":
                ppstmt.setTimestamp(index, rtset.getTimestamp(index));// PRO
                break;
            case "TIMESTAMP":
            case "TIMESTAMP WITH TIME ZONE":
            case "TIMESTAMP WITH LOCAL TIME ZONE":
                ppstmt.setTimestamp(index, rtset.getTimestamp(index));
                break;
            case "CHAR":
            case "NCHAR":
            case "VARCHAR2":
            case "NVARCHAR2":
                switch (DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, colType, datatypeMaps))
                {
                    case "BOOLEAN":
                        String str = rtset.getString(index);
                        if (str.equals("1") || str.equalsIgnoreCase("true")
                                || str.equalsIgnoreCase("Y") || str.equalsIgnoreCase("YES"))
                        {
                            ppstmt.setBoolean(index, true);
                        } else if (str.equals("0") || str.equalsIgnoreCase("false")
                                || str.equalsIgnoreCase("N") || str.equalsIgnoreCase("NO"))
                        {
                            ppstmt.setBoolean(index, false);
                        } else
                        {
                            throw new Exception(metaData.getColumnName(index) + "=" + str + " cannot be convert to BOOLEAN");
                        }
                        break;
                    default:
                        ppstmt.setString(index, rtset.getString(index));
                        break;
                }
                break;
            case "NUMBER":
                //case "FLOAT"://Oracle Float's metaData.getColumnTypeName is NUMBER, it's valid digital 38 same to NUMBER.
                ppstmt.setBigDecimal(index, rtset.getBigDecimal(index));
                break;
            case "BINARY_FLOAT":
            case "BINARY_DOUBLE":
                //ppstmt.setDouble(index, rtset.getDouble(index));//getDouble will loss accuracy
                ppstmt.setBigDecimal(index, rtset.getBigDecimal(index));
                break;
            case "SYS.XMLTYPE":
            case "PUBLIC.XMLTYPE":
            case "XMLTYPE":
                DruidPooledResultSet drs = (DruidPooledResultSet) rtset;
                ResultSet rawrs = drs.getRawResultSet();
                OracleResultSet ors = (OracleResultSet) rawrs;
                XMLType xmltype = (XMLType) ors.getObject(index);
                switch (DatatypeFactory.getInstance().getPgTypeWithoutArgs(DBEnum.Oracle, "XMLTYPE", datatypeMaps))
                {
                    case "XML":
                        Connection baseConn = ((DruidPooledConnection) hgconn).getConnection();
                        SQLXML xml = baseConn.createSQLXML();
                        xml.setString(xmltype.getString());
                        // ppstmt.setSQLXML(index, rawrs.getSQLXML(index));//oracle unsupport getSQLXML()
                        ppstmt.setSQLXML(index, xml);
                        break;
                    default:
                        ppstmt.setString(index, xmltype.getString());
                        break;
                }
                break;
		//case "ROWID":
            //	ppstmt.setLong(index, rtset.getLong(index));
            //	break;
            default:
                logger.warn("undefined oracle datatype convertion for: oracleType=" + colType);
                ppstmt.setObject(index, rtset.getObject(index));
                break;
        }
    }
    //for oracle BFILE
    private synchronized File getFile(BFILE bfile, int column) throws Exception
    {
        OutputStream ops = null;
        BufferedInputStream bips = null;
        File file = null;
        try
        {
            File f = new File(OID_DATA_FILENAME);
            if (!f.exists())
            {
                f.mkdirs();
                logger.info("Folder " + OID_DATA_FILENAME + " doesn't exists, make this directory.");
            }
            long tid = Thread.currentThread().getId();
            file = new File(OID_DATA_FILENAME + File.separator + tid + "_" + column);
            //logger.info("BFile Path = " + file.getAbsolutePath());
            bfile.openFile();
            bips = new BufferedInputStream(bfile.getBinaryStream());
            ops = new FileOutputStream(file);
            byte[] buffer = new byte[1024];//bfile.getBytes().length
            for (int i; (i = bips.read(buffer)) > 0;)
            {
                ops.write(buffer, 0, i);
                ops.flush();
            }
            bfile.closeFile();
        } catch (IOException | SQLException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception("Error get file for BFile: " + ex.getMessage());
        } finally
        {
            StreamUtil.close(bips);
            StreamUtil.close(ops);
        }
        return file;
    }
    //for oracle blob
    private synchronized File getFile(InputStream ips, int column) throws Exception
    {
        OutputStream ops = null;
        BufferedInputStream bips = null;
        File file = null;
        try
        {
            File f = new File(OID_DATA_FILENAME);
            if (!f.exists())
            {
                f.mkdirs();
                logger.info("Folder " + OID_DATA_FILENAME + " doesn't exists,make this directory.");
            }
            long tid = Thread.currentThread().getId();
            file = new File(OID_DATA_FILENAME + File.separator + tid + "_" + column);
            //logger.info("Blob File Path = " + file.getAbsolutePath());
            ops = new FileOutputStream(file);
            bips = new BufferedInputStream(ips);
            byte[] buffer = new byte[1024];//bfile.getBytes().length
            for (int i; (i = bips.read(buffer)) > 0;)
            {
                ops.write(buffer, 0, i);
                ops.flush();
            }
        } catch (IOException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception("Error get file for BLOB: " + ex.getMessage());
        } finally
        {
            StreamUtil.close(ips);
            StreamUtil.close(bips);
            StreamUtil.close(ops);
        }
        return file;
    }
    //for oracle clob
    private synchronized File getFile(Reader reader, int column) throws Exception
    {
        BufferedWriter outstream = null;
        BufferedReader instream = null;
        File file = null;
        try
        {
            File f = new File(OID_DATA_FILENAME);
            if (!f.exists())
            {
                f.mkdirs();
                logger.info("Folder " + OID_DATA_FILENAME + " doesn't exists,make this directory.");
            }
            long tid = Thread.currentThread().getId();
            file = new File(OID_DATA_FILENAME + File.separator + tid + "_" + column);
            //logger.info("Clob File Path = " + file.getAbsolutePath());
            outstream = new BufferedWriter(new FileWriter(file));
            instream = new BufferedReader(reader);

            char[] data = new char[1024];
            for (int i; (i = instream.read(data)) > 0;)
            {
                outstream.write(data, 0, i);
                outstream.flush();
            }
        } catch (IOException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception("Error get file for binary table data: " + ex.getMessage());
        } finally
        {
            StreamUtil.close(instream);
            StreamUtil.close(outstream);
        }
        return file;
    }
    //for oracle binary type(convert to HGDB OID)
    private synchronized Long getOid(Connection conn, File file) throws Exception
    {
        long oid = 0;
        FileInputStream fis = null;
        try
        {
            // Get the Large Object Manager to perform operations with
            Connection baseConn = ((DruidPooledConnection) conn).getConnection();//can't directly close
            LargeObjectManager lobj = ((PgConnection) baseConn).getLargeObjectAPI();
            // Create a new large object
            oid = lobj.createLO(LargeObjectManager.READ);
            // Open the large object for writing
            LargeObject obj = lobj.open(oid, LargeObjectManager.WRITE);
            // Now open the file
            fis = new FileInputStream(file);
            // Copy the data from the file to the large object
            byte buf[] = new byte[2048];
            int s = 0; // , tl = 0;
            while ((s = fis.read(buf, 0, 2048)) > 0)
            {
                obj.write(buf, 0, s);
                //tl += s;
            }
            obj.close();
        } catch (IOException | SQLException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw new Exception("Error get long value for OID" + ex.getMessage());
        } finally
        {
            StreamUtil.close(fis);
        }
        return oid;
    }
    //for oracle binary type(convert to byte array)
    private synchronized byte[] getBytes(File file) throws Exception
    {
        if (file == null)
        {
            return null;
        }
        byte[] buffer = null;
        FileInputStream fis = null;
        ByteArrayOutputStream bos = null;
        try
        {
            long fileSize = file.length();
            logger.debug("BFile Length = " + file.length());
            if (fileSize > Integer.MAX_VALUE)
            {
                logger.error(file.getAbsolutePath() + " file too big, and return null.");
                return null;
            }
            fis = new FileInputStream(file);
            buffer = new byte[(int) fileSize];
            int offset = 0;
            int numRead = 0;
            while (offset < buffer.length
                    && (numRead = fis.read(buffer, offset, buffer.length - offset)) >= 0)
            {
                offset += numRead;
            }
            if (offset != buffer.length)
            {
                throw new IOException("Could not completely read file " + file.getAbsolutePath());
            }
        } catch (IOException ex)
        {
            throw ex;
        } finally
        {
            StreamUtil.close(bos);
            StreamUtil.close(fis);
        }
        return buffer;
    }
    //INTERVAL YEAR TO MONTH
    public String checkIntervalYM(DBEnum sourceDBType, String initalValue)
    {
        logger.info("Enter: initalValue=" + initalValue);
        String correctValue = initalValue;
        switch (sourceDBType)
        {
            case Oracle:
                if (initalValue.startsWith("-"))
                {
                    String[] s = initalValue.split("[-]", 3);
                    correctValue = "-" + s[1] + " year -" + s[2] + " month";
                } else // for those with + or without any symbol
                {
                    String[] s = initalValue.split("[-]", 2);
                    correctValue = s[0] + " year +" + s[1] + " month";
                }
                break;
            default:
                break;
        }
        logger.info("Return:" + correctValue);
        return correctValue;
    }
    //INTERVAL DAY TO SECOND
    public String checkIntervalDS(DBEnum sourceDBType, String initalValue)
    {
        logger.info("Enter:initalValue=" + initalValue);
        String correctValue = initalValue;
        switch (sourceDBType)
        {
            case Oracle:
                String symbol;
                if (initalValue.startsWith("-"))
                {
                    symbol = "-";
                } else // for those with + or without any symbol
                {
                    symbol = "+";
                }
                String[] s = initalValue.split("\\s", 2);
                String[] ss = s[1].split(":", 3);
                correctValue = s[0] + " days " + symbol + ss[0] + " hours " + symbol + ss[1] + " mins " + symbol + ss[2]
                        + " seconds ";
                break;
            default:
                break;
        }
        logger.info("Return:" + correctValue);
        return correctValue;
    }

    
    //util for reuse
    private Boolean executeUpdate(DBSource hgDBInfo, String updateSQL, BufferedWriter pwError) throws Exception
    {
        //logger.info("Enter:SQL = " + updateSQL);
        boolean success = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try
        {
            conn = JdbcUtil.getConnection(hgDBInfo);
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.executeUpdate();
            success = true;
        } catch (Exception ex)
        {
            success = false;
            // writeLog(pwError, new Date() + " Error: " + updateSQL + "\n\r" + ex.getMessage());
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw ex;
        } finally
        {
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        return success;
    }
    private synchronized void writeLog(BufferedWriter pw, String content)
    {
        try
        {
            pw.write(content);
            pw.newLine();// pw.println();
            pw.flush();
        } catch (IOException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
       	}
    }
    private void openFile(String pathResult)
    {
        try
        {
            Desktop.getDesktop().open(new File(pathResult));
        } catch (IOException ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
        }
    }
    
    private boolean isFatalException(String sqlState)
    {
        switch (sqlState)
        {
            //Class 53 — Insufficient Resources
            case "53000":
            case "53100":
            case "53200":
            case "53300":
            case "53400":
            //Connection break
            case "57P01"://insert: service stop
            case "08006"://copy: network break,service stop;   insert: network break
                if (progress.getState() != -1)
                {
                    updateStatus(MigrateStatus.Stop);
                }
                return true;
            default:
                return false;
		}
    }

    
}
