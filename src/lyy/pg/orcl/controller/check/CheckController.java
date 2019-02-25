/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.controller.check;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lyy.pg.orcl.model.DBSource;
import lyy.pg.orcl.model.ObjInfo;
import lyy.pg.orcl.util.JdbcUtil;
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
            + "    SELECT plpgsql_check_function_tb(p.oid, COALESCE(trig.tgrelid, 0), fatal_errors:= false) pcf\n"
            + "       , p.oid as funcoid ,nsp.nspname funcschema , p.proname as funcname, typ.typname\n"
            + "    FROM pg_proc p        \n"
            + "    JOIN pg_namespace nsp ON(nsp.oid = P.pronamespace )\n"
            + "    JOIN pg_language lang ON(lang.oid = p.prolang )\n"
            + "    JOIN pg_type typ ON(typ.oid = p.prorettype)\n"
            + "    LEFT JOIN pg_trigger trig ON (trig.tgfoid = p.oid) \n"
            + "    WHERE lang.lanname IN('plpgsql')\n"
            + "    AND nsp.nspname NOT IN('pg_catalog')\n"
            + "    AND (typ.typname NOT IN('trigger') OR trig.tgfoid IS NOT NULL) \n"
            + "	AND nsp.nspname=? AND p.proname=?\n"
            + "    OFFSET 0) cont\n"
            + "ORDER BY (pcf).functionid::regprocedure::text, (pcf).lineno;";

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
            pstmt = conn.prepareStatement(CheckSQL);
            pstmt.setString(1, obj.getSchema());
            pstmt.setString(2, obj.getName());
            rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next())
            {
                for (int i = 0; i < col; i++)
                {
                    result.append(rs.getString(i + 1));
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
        return result.toString();
    }

}