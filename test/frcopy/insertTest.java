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
public class insertTest {
    
    public insertTest() {
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
     * Test of deleteDirectory method, of class insert.
     */
    @Test
    public void testDeleteDirectory() {
        System.out.println("deleteDirectory");
        File directory = null;
        boolean expResult = false;
        boolean result = insert.deleteDirectory(directory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putdata method, of class insert.
     */
    @Test
    public void testPutdata() {
        System.out.println("putdata");
        String name = "";
        ArrayList<File> picfiles = null;
        int num = 0;
        insert instance = null;
        instance.putdata(name, picfiles, num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
