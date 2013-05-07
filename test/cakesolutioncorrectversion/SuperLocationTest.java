/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

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
public class SuperLocationTest {
    
    public SuperLocationTest() {
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
     * Test of setNeighbor method, of class SuperLocation.
     */
    @Test
    public void testSetNeighbor() {
        System.out.println("setNeighbor");
        Location l = null;
        SuperLocation instance = new SuperLocationImpl();
        instance.setNeighbor(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNeighbor method, of class SuperLocation.
     */
    @Test
    public void testGetNeighbor() {
        System.out.println("getNeighbor");
        SuperLocation instance = new SuperLocationImpl();
        Location expResult = null;
        Location result = instance.getNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SuperLocationImpl extends SuperLocation {
    }
}
