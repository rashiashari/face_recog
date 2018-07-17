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
public class registerTest {
    
    public registerTest() {
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
     * Test of dothis method, of class register.
     */
    @Test
    public void testDothis() {
        System.out.println("dothis");
        register instance = new register();
        instance.dothis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imageacquire method, of class register.
     */
    @Test
    public void testImageacquire() {
        System.out.println("imageacquire");
        register instance = new register();
        instance.imageacquire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeGray method, of class register.
     */
    @Test
    public void testMakeGray() {
        System.out.println("makeGray");
        BufferedImage img = null;
        BufferedImage expResult = null;
        BufferedImage result = register.makeGray(img);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class register.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        register.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
