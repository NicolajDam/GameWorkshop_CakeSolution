/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eskandarpahlavaafshari
 */
public class BaklavaciTest {
    
    public BaklavaciTest() {
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
     * Test of getQuestionList method, of class Baklavaci.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        Baklavaci instance = new Baklavaci();
        ArrayList expResult = null;
        ArrayList result = instance.getQuestionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Baklavaci.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Baklavaci instance = new Baklavaci();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeBQ method, of class Baklavaci.
     */
    @Test
    public void testInitializeBQ() {
        System.out.println("initializeBQ");
        Baklavaci instance = new Baklavaci();
        instance.initializeBQ();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
