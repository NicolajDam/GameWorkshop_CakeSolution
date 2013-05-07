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
public class LePetiteEclaireTest {
    
    public LePetiteEclaireTest() {
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
     * Test of getQuestionList method, of class LePetiteEclaire.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        LePetiteEclaire instance = new LePetiteEclaire();
        ArrayList expResult = null;
        ArrayList result = instance.getQuestionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class LePetiteEclaire.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        LePetiteEclaire instance = new LePetiteEclaire();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeLPEQ method, of class LePetiteEclaire.
     */
    @Test
    public void testInitializeLPEQ() {
        System.out.println("initializeLPEQ");
        LePetiteEclaire instance = new LePetiteEclaire();
        instance.initializeLPEQ();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
