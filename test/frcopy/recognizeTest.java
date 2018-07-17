/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frcopy;

import java.awt.image.BufferedImage;
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
public class recognizeTest {
    
    public recognizeTest() {
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
     * Test of matrixretrieval method, of class recognize.
     */
    @Test
    public void testMatrixretrieval() throws Exception {
        System.out.println("matrixretrieval");
        recognize.matrixretrieval();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imageacquire method, of class recognize.
     */
    @Test
    public void testImageacquire() {
        System.out.println("imageacquire");
        recognize instance = new recognize();
        double[][] expResult = null;
        double[][] result = instance.imageacquire();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeGray method, of class recognize.
     */
    @Test
    public void testMakeGray() {
        System.out.println("makeGray");
        BufferedImage img = null;
        double[][] expResult = null;
        double[][] result = recognize.makeGray(img);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dothis method, of class recognize.
     */
    @Test
    public void testDothis() throws Exception {
        System.out.println("dothis");
        recognize instance = new recognize();
        instance.dothis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class recognize.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        recognize.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
