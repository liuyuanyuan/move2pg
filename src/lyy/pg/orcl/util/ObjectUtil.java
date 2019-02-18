/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.util;

import lyy.pg.orcl.controller.SQLFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lyy.pg.orcl.model.DBSource;
import lyy.pg.orcl.model.ObjInfo;
import lyy.pg.orcl.util.DBEnum.DBObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Liu Yuanyuan
 *
 */
public class ObjectUtil
{
    private static final Logger logger = LogManager.getLogger(ObjectUtil.class);

    public static List<ObjInfo> getTypedObjects(DBSource db, DBObject objType) throws Exception
    {
        logger.debug("Enter:db=" + db + ",objType=" + objType);

        List<ObjInfo> objList = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rtset = null;
        try
        {
            conn = JdbcUtil.getConnection(db);
            stmt = conn.createStatement();
            String sql = SQLFactory.getShowObjSQL(db.getType(), objType);
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

}
