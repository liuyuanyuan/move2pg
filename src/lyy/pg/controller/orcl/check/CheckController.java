/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.controller.orcl.check;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lyy.pg.model.DBSource;
import lyy.pg.model.ObjInfo;
import lyy.pg.util.JdbcUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Liu Yuanyuan
 */
public class CheckController
{

    private static final Logger logger = LogManager.getLogger(CheckController.class);
    
    
    
    private static final String CheckSQL = "SELECT (pcf).functionid::regprocedure, (pcf).lineno, (pcf).statement,   \n"
            + "(pcf).sqlstate, (pcf).message, (pcf).detail, (pcf).hint, (pcf).level,    \n"
            + "(pcf).\"position\", (pcf).query, (pcf).context\n"
            + " ,funcoid::varchar, funcschema::varchar, funcname::varchar, typname::varchar\n"
            + "FROM (  \n"
            + "    SELECT public.plpgsql_check_function_tb(p.oid, COALESCE(trig.tgrelid, 0), fatal_errors:=false, others_warnings :=false, extra_warnings :=false) pcf\n"
            + "    , p.oid as funcoid ,nsp.nspname funcschema , p.proname as funcname, typ.typname\n"
            + "    FROM pg_proc p \n"
            + "    JOIN pg_namespace nsp ON(nsp.oid = p.pronamespace )\n"
            + "    JOIN pg_language lang ON(lang.oid = p.prolang )\n"
            + "    JOIN pg_type typ ON(typ.oid = p.prorettype)\n"
            + "    LEFT JOIN pg_trigger trig ON (trig.tgfoid = p.oid) \n"
            + "    WHERE lang.lanname IN('plpgsql')\n"
            + "    AND nsp.nspname NOT IN('pg_catalog')\n"
            + "    AND (typ.typname NOT IN('trigger') OR trig.tgfoid IS NOT NULL) \n"
            + "	   AND nsp.nspname=? AND p.proname=? \n"
            + "    OFFSET 0) cont\n"
            + "ORDER BY (pcf).functionid::regprocedure::text, (pcf).lineno;";

    public static boolean hasPlsqlCheckExtension(DBSource pgdb) throws Exception
    {
        boolean has = false;
                       
        final String sql = "SELECT count(1) count FROM pg_extension WHERE extname IN('plpgsql', 'plpgsql_check');";        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(pgdb);
            stmt = conn.createStatement();
            logger.debug(sql);
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                has = rs.getInt("count") == 2;
            }
        }catch(Exception ex)
        {
            logger.error(ex.getMessage());
            throw ex;
        }
        
        logger.debug("Return:" + has);
        return has;
    }
    
    public static String check(DBSource pgdb, ObjInfo obj) throws Exception
    {
        logger.info("Enter:obj = " + obj);
        StringBuilder result = new StringBuilder();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try
        {
            conn = JdbcUtil.getConnection(pgdb);
            logger.debug(CheckSQL);
            pstmt = conn.prepareStatement(CheckSQL);            
            pstmt.setString(1, obj.getSchema().toLowerCase());
            pstmt.setString(2, obj.getName().toLowerCase());
            rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next())
            {
                for (int i = 1; i <= col; i++)
                {
                    result.append(rs.getMetaData().getColumnName(i)).append(" : ")
                            .append(rs.getString(i)).append(System.lineSeparator());
                }
                result.append(System.lineSeparator());
            }
        } catch (SQLException | ClassNotFoundException ex)
        {
            logger.error(ex.getMessage());
            //ex.printStackTrace(System.out);
            throw ex;
        } finally
        {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
        logger.debug("Return: " + result.toString());
        return result.toString();
    }
}
