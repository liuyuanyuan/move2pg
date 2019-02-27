/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lyy.pg.orcl.util;

import lyy.pg.util.JdbcUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import lyy.pg.model.DBSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author highgoer
 */
public class JdbcUtilTest
{
    
    public JdbcUtilTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of main method, of class JdbcUtil.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        JdbcUtil.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class JdbcUtil.
     */
    @Test
    public void testGetConnection() throws Exception
    {
        System.out.println("getConnection");
        DBSource db = null;
        Connection expResult = null;
        Connection result = JdbcUtil.getConnection(db);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class JdbcUtil.
     */
    @Test
    public void testClose_Connection()
    {
        System.out.println("close");
        Connection conn = null;
        JdbcUtil.close(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class JdbcUtil.
     */
    @Test
    public void testClose_Statement()
    {
        System.out.println("close");
        Statement stmt = null;
        JdbcUtil.close(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class JdbcUtil.
     */
    @Test
    public void testClose_ResultSet()
    {
        System.out.println("close");
        ResultSet rs = null;
        JdbcUtil.close(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
