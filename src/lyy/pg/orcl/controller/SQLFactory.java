/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lyy.pg.orcl.model.DBSource;
import lyy.pg.orcl.model.ObjInfo;
import lyy.pg.orcl.util.DBEnum;
import lyy.pg.orcl.util.DBEnum.DBObject;
import lyy.pg.orcl.util.DBEnum.TabObject;
import lyy.pg.orcl.util.JdbcUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Liu Yuanyuan
 *
 * property to make sql statement: schema:schema table:schema,table,column list
 * for table create sql and table select sql; index:schema,table,index name, is
 * unique,using method(likes btree...),column list for index create sql;
 * sequences:schema,sequence,increment,minimum value,maximum value,start,cache
 * for sequences create sql; view:schema,view,query for view create sql; Script
 * object(procedure,function,trigger,package):type,schema,name,text for object
 * defination sql; Script object(DBLink,Synonym): parameters for object
 * defination sql; Script object(MView):ddl function to get object defination
 * sql.
 */
public class SQLFactory
{

    private static final Logger logger = LogManager.getLogger(SQLFactory.class);

    public static List<ObjInfo> getTypedObjects(DBSource dbsource, DBObject objType) throws Exception
    {
        logger.debug("Enter:db=" + dbsource + ",objType=" + objType);
        List<ObjInfo> objList = new ArrayList<>();
        if (dbsource == null || objType == null)
        {
            logger.warn("Entered dbsource or objType is null, do nothing and return empty list.");
            return objList;
        }

        Connection conn = null;
        Statement stmt = null;
        ResultSet rtset = null;
        try
        {
            conn = JdbcUtil.getConnection(dbsource);
            stmt = conn.createStatement();
            String sql = SQLFactory.getShowObjSQL(dbsource.getType(), objType);
            logger.debug("sql=" + sql);
            rtset = stmt.executeQuery(sql);
            while (rtset.next())
            {
                ObjInfo objInfo = new ObjInfo();
                objInfo.setType(objType);
                objInfo.setSchema(rtset.getString(1));
                objInfo.setName(rtset.getString(2));
                objInfo.setSelected(false);
                objList.add(objInfo);
            }
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw ex;
        } finally
        {
            JdbcUtil.close(rtset);
            JdbcUtil.close(stmt);
            JdbcUtil.close(conn);
        }

        logger.debug("Return: size=" + objList.size());
        return objList;
    }

    public static String getDDL(ObjInfo obj, DBSource sourceDB) throws Exception //, DBSource targetPGDB
    {
        if (obj == null || sourceDB == null)
        {
            logger.warn("Entered object or sourceDB is null, do nothing and return null.");
            return null;
        }
        
        logger.debug("Type=" + obj.getType() + ",schema=" + obj.getSchema() + ",objName=" + obj.getName());
        String oraSql = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(sourceDB);
            String sql = getSelectSQL(sourceDB.getType(), obj.getType());
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, obj.getSchema());
            pstmt.setString(2, obj.getName());
            rs = pstmt.executeQuery();
            StringBuilder oracleCreateSql = new StringBuilder("CREATE OR REPLACE ");
            while (rs.next())
            {
                oracleCreateSql.append(rs.getString(1));
            }
            pstmt.clearParameters();
            pstmt.clearBatch();

            String quotedSchemaAndName = KeywordFactory.getInstance().quotedName2PG(obj.getSchema(), sourceDB.getType())
                    + "." + KeywordFactory.getInstance().quotedName2PG(obj.getName(), sourceDB.getType());
            oraSql = oracleCreateSql.toString().replaceFirst("(?i)" + obj.getName(), quotedSchemaAndName);
            logger.debug("oraSql=" + oraSql);
            //Main converterMain = new Main();
            //String hgCreateSQL =  converterMain.convert(newOraSql);
            // + " \r\n $$ LANGUAGE plpgsql;";
            //logger.debug("hgSQL=" + hgCreateSQL);
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace(System.out);
            throw ex;
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        logger.debug("Return");
        return oraSql;
    }

    private static String getShowObjSQL(DBEnum db, DBObject obj)
    {
        logger.info("Enter:dbType = " + db + ",objType = " + obj.toString());
        StringBuilder sql = new StringBuilder();
        switch (db)
        {
            case Oracle:
                switch (obj)
                {
                    case Schema:
                        sql.append("SELECT DISTINCT user,user FROM user_objects");
                        break;
                    case Table:
                        // user_tab_column include tables and views
                        sql.append("SELECT DISTINCT user, table_name FROM user_tables")
                                .append(" MINUS ")
                                .append(" SELECT DISTINCT user,mview_name FROM user_mviews ")
                                .append(" ORDER BY table_name");
                        break;
                    case MView:
                        sql.append("SELECT DISTINCT user,mview_name FROM user_mviews");
                        break;
                    case Sequence:
                        sql.append("SELECT DISTINCT user,sequence_name FROM user_sequences");
                        break;
                    case Index:
                        sql.append("SELECT DISTINCT user,ind.index_name FROM user_indexes ind ");
                        sql.append(" WHERE ind.index_name NOT IN(SELECT constraint_name FROM user_constraints)");
                        sql.append(" AND ind.index_type  IN ('NORMAL')");
                        break;
                    case View:
                        sql.append("SELECT DISTINCT user,view_name FROM user_views");
                        break;
                    case Procedure:
                    case Function:
                    case Trigger:
                    case Package:
                        sql.append("SELECT DISTINCT user,name FROM user_source WHERE type = '")
                                .append(obj.toString().toUpperCase()).append("'");
                        break;
                    case DBLink://dba_db_links need dba privilege
                        sql.append("SELECT DISTINCT user,db_link FROM user_db_links");
                        break;
                    case Synonym:
                        sql.append("SELECT DISTINCT user,synonym_name FROM user_synonyms");
                        break;
                    default:
                        logger.debug(obj + " is not supported now.");
                        break;
                }
                break;
            default:
                logger.debug(db + " is not supported now.");
                break;
        }
        //logger.info("Return :sql = " + sql.toString());
        return sql.toString();
    }

    public static String getSelectSQL(DBEnum db, DBObject obj)
    {
        logger.info("Enter:dbType = " + db + ",objType = " + obj.toString());
        StringBuilder sql = new StringBuilder();
        switch (db)
        {
            case Oracle:
                switch (obj)
                {
                    case Sequence:
                        sql.append("SELECT user, sequence_name, last_number, min_value, max_value, increment_by,");
                        sql.append("cache_size, cycle_flag FROM user_sequences");
                        sql.append(" WHERE user = ? AND  sequence_name = ?");
                        break;
                    case Index:
                        sql.append("SELECT DISTINCT ind.uniqueness,user,ind.index_name,ind.index_type,ind.table_name,");
                        sql.append("inc.COLUMN_NAME,inc.DESCEND,inc.COLUMN_POSITION");
                        sql.append(" FROM user_indexes ind,user_ind_columns inc");
                        sql.append(" WHERE ind.index_name = inc.INDEX_NAME");
                        sql.append(" AND ind.index_name NOT IN(SELECT constraint_name FROM user_constraints)");
                        sql.append(" AND ind.index_type  IN ('NORMAL')");
                        sql.append(" AND user = ? ");
                        sql.append(" AND ind.index_name = ? ");
                        sql.append(" ORDER BY ind.table_name,inc.COLUMN_POSITION");
                        break;
                    case View:
                        sql.append("SELECT user,view_name,text FROM user_views");
                        sql.append(" WHERE user = ? AND view_name = ?");
                        break;
                    case Procedure:
                    case Function:
                    //below for generate defination in oracle
                    case Trigger:
                    case Package:
                        sql.append("SELECT text from user_source");
                        sql.append(" WHERE user = ? ");
                        sql.append(" AND name = ? ");
                        sql.append(" AND type = '").append(obj.toString().toUpperCase()).append("'");
                        sql.append(" ORDER BY line");// only generate script
                        break;
                    case MView:
                        //SELECT dbms_metadata.get_ddl('MATERIALIZED_VIEW', u.MVIEW_NAME) FROM USER_MVIEWS u;
                        sql.append("SELECT dbms_metadata.get_ddl('MATERIALIZED_VIEW', ?) FROM DUAL");
                        break;
                    case DBLink:
                        /* 
                         https://docs.oracle.com/cd/B19306_01/server.102/b14200/statements_5005.htm
                         user_db_links for owner only current user, dba__db_links for owner is user and 'PUBLIC'
                         define: CREATE [PUBLIC] DATABASE LINK db_link
                         CONNECT TO username IDENTIFIED BY password(null always) USING 'host';
                         */
                        sql.append("SELECT db_link,username,host FROM user_db_links WHERE user = ? AND db_link = ?");
                        break;
                    case Synonym:
                        //doc:https://docs.oracle.com/cd/B19306_01/server.102/b14200/statements_7001.htm
                        //user_synonyms for owner only current user, dba_synonyms for owner is user and 'PUBLIC'
                        //define: CREATE OR REPLACE [PUBLIC] synonym_name FOR table_owner.table_name[@db_link];
                        sql.append("SELECT synonym_name, table_owner, table_name, db_link FROM user_synonyms WHERE user = ? AND synonym_name = ?");
                        break;
                    default:
                        logger.warn(obj + " is not supported.");
                        break;
                }
                break;
            default:
                logger.warn(db + " is not supported.");
                break;
        }
        logger.info("Return: sql = " + sql.toString());
        return sql.toString();
    }

    public static String getSelectSQL(DBEnum db, TabObject obj)
    {
        logger.info("Enter:dbType = " + db + ",objType = " + obj.toString());
        StringBuilder sql = new StringBuilder();
        switch (db)
        {
            case Oracle:
                switch (obj)
                {
                    case COLUMN:
                        sql.append("SELECT user AS schema, user_tables.table_name, user_tab_columns.column_name,");
                        sql.append("user_tab_columns.data_type, user_tab_columns.data_default,");
                        sql.append("user_tab_columns.data_precision, user_tab_columns.data_scale, ");
                        sql.append("user_tab_columns.char_length, user_tab_columns.nullable");
                        sql.append(" FROM user_tab_columns, user_tables ");
                        sql.append(" WHERE user_tab_columns.table_name = user_tables.table_name  ");
                        sql.append(" AND user = ?");
                        sql.append(" AND user_tables.table_name = ?");
                        sql.append(" ORDER BY user_tables.table_name ASC , user_tab_columns.column_id ASC");
                        break;
                    case CONSTRAINT_MAIN:
                        sql.append("SELECT DISTINCT user_constraints.constraint_type,user, user_cons_columns.table_name,");
                        sql.append("user_constraints.constraint_name,user_constraints.r_constraint_name");
                        sql.append(" FROM user_constraints,user_cons_columns");
                        sql.append(" WHERE user_constraints.constraint_name = user_cons_columns.constraint_name");
                        // sql.append(" AND user_constraints.constraint_type = ?");//type
                        sql.append(" AND user = ? AND user_cons_columns.table_name = ?");
                        sql.append(" ORDER BY user_constraints.constraint_type, user_constraints.constraint_name");
                        break;
                    case CONSTRAINT_COLUMN:
                        sql.append("SELECT user_cons_columns.column_name, user_constraints.constraint_type,");
                        sql.append(" user, user_cons_columns.table_name, user_constraints.constraint_name, user_cons_columns.position ");
                        sql.append(" FROM user_constraints,user_cons_columns ");
                        sql.append(" WHERE user_constraints.constraint_name = user_cons_columns.constraint_name ");
                        sql.append(" AND user_constraints.constraint_type = ? ");
                        sql.append(" AND user = ? ");
                        sql.append(" AND user_cons_columns.table_name = ? ");
                        sql.append(" AND user_constraints.constraint_name = ? ");
                        sql.append(" ORDER BY user_constraints.constraint_type, user_constraints.constraint_name");
                        sql.append(" , user_cons_columns.position");//must order column position to keep multi-column FK right
                        break;
                    case CONSTRAINT_CHECKCONDITION:
                        sql.append("SELECT user_constraints.search_condition, user_constraints.constraint_type,");
                        sql.append("user, user_cons_columns.table_name, user_constraints.constraint_name");
                        sql.append(" FROM user_constraints,user_cons_columns ");
                        sql.append(" WHERE user_constraints.constraint_name = user_cons_columns.constraint_name ");
                        sql.append(" AND user_constraints.constraint_type = 'C' ");
                        sql.append(" AND user = ? ");
                        sql.append(" AND user_cons_columns.table_name = ? ");
                        sql.append(" AND user_constraints.constraint_name = ? ");
                        sql.append(" ORDER BY user_constraints.constraint_type, user_constraints.constraint_name");
                        break;
                    case CONSTRAINT_RCOLUMN:
                        sql.append("SELECT DISTINCT user, user_cons_columns.table_name, user_cons_columns.column_name, ");
                        sql.append("user_constraints.constraint_name, user_constraints.constraint_type, user_cons_columns.position");
                        sql.append(" FROM user_constraints,user_cons_columns");
                        sql.append(" WHERE user_constraints.constraint_name = user_cons_columns.constraint_name");
                        sql.append(" AND user = ? ");
                        sql.append(" AND user_constraints.constraint_name = ?");// reference constraint name
                        sql.append(" ORDER BY user_constraints.constraint_type, user_constraints.constraint_name");
                        sql.append(" , user_cons_columns.position");//must order column position to keep multi-column FK right
                        break;
                    case TABLE_COMMENT://table and view
                        sql.append("SELECT DISTINCT USER, TABLE_NAME, TABLE_TYPE, COMMENTS ")
                                .append(" FROM USER_TAB_COMMENTS")
                                .append(" WHERE TABLE_TYPE = ? AND USER = ? AND TABLE_NAME = ?");
                        break;
                    case COLUMN_COMMENT://table and view
                        sql.append("SELECT DISTINCT USER, TABLE_NAME, COLUMN_NAME, COMMENTS ")
                                .append(" FROM USER_COL_COMMENTS")
                                .append(" WHERE USER = ? AND TABLE_NAME = ?");
                        break;
                    default:
                        logger.warn(obj + " is not supported.");
                        break;
                }
                break;
            default:
                logger.warn(db + " is not supported.");
                break;
        }
        logger.info("Return: " + obj + "=" + sql.toString());
        return sql.toString();
    }

}
