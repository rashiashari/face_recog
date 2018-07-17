/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frcopy;

import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ShenalJerome
 */
public class connectionTest {
    
    public connectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of putdata method, of class connection.
     */
    @Test
    public void testPutdata() {
        System.out.println("putdata");
        String name = "";
        ArrayList<File> picfiles = null;
        int num = 0;
        connection instance = new connection();
        instance.putdata(name, picfiles, num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putaverage method, of class connection.
     */
    @Test
    public void testPutaverage() throws Exception {
        System.out.println("putaverage");
        double[][] average = null;
        connection instance = new connection();
        instance.putaverage(average);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putweight method, of class connection.
     */
    @Test
    public void testPutweight() throws Exception {
        System.out.println("putweight");
        double[][] weightvector = null;
        String[] name = null;
        int[] faceid = null;
        connection instance = new connection();
        instance.putweight(weightvector, name, faceid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of puteigen method, of class connection.
     */
    @Test
    public void testPuteigen() {
        System.out.println("puteigen");
        double[][] eigTnormal = null;
        connection instance = new connection();
        instance.puteigen(eigTnormal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of geteigenmatrix method, of class connection.
     */
    @Test
    public void testGeteigenmatrix() {
        System.out.println("geteigenmatrix");
        connection instance = new connection();
        double[][] expResult = null;
        double[][] result = instance.geteigenmatrix();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getweightmatrix method, of class connection.
     */
    @Test
    public void testGetweightmatrix() {
        System.out.println("getweightmatrix");
        connection instance = new connection();
        double[][] expResult = null;
        double[][] result = instance.getweightmatrix();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getaveragematrix method, of class connection.
     */
    @Test
    public void testGetaveragematrix() {
        System.out.println("getaveragematrix");
        connection instance = new connection();
        double[][] expResult = null;
        double[][] result = instance.getaveragematrix();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class connection.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        connection instance = new connection();
        String[] expResult = null;
        String[] result = instance.getname();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDirectory method, of class connection.
     */
    @Test
    public void testDeleteDirectory() {
        System.out.println("deleteDirectory");
        File directory = null;
        boolean expResult = false;
        boolean result = connection.deleteDirectory(directory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdiffarrange method, of class connection.
     */
    @Test
    public void testGetdiffarrange() throws Exception {
        System.out.println("getdiffarrange");
        double[][] average = null;
        connection instance = new connection();
        double[][] expResult = null;
        double[][] result = instance.getdiffarrange(average);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
