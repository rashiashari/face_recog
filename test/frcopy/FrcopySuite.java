/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frcopy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ShenalJerome
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({frcopy.testTest.class, frcopy.testaTest.class, frcopy.inserttryTest.class, frcopy.registerTest.class, frcopy.connectionTest.class, frcopy.recognizeTest.class, frcopy.trainTest.class, frcopy.insertTest.class, frcopy.FRcopyTest.class})
public class FrcopySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
