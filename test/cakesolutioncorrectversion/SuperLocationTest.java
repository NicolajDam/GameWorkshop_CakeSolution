/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
import java.util.List;
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
     * Test of getExits method, of class SuperLocation.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Direction direction = null;
        SuperLocation instance = new SuperLocationImpl();
        List expResult = null;
        List result = instance.getExits(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class SuperLocation.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SuperLocation instance = new SuperLocationImpl();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEastNeighbor method, of class SuperLocation.
     */
    @Test
    public void testSetEastNeighbor() {
        System.out.println("setEastNeighbor");
        Location l = null;
        SuperLocation instance = new SuperLocationImpl();
        instance.setEastNeighbor(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEastNeighbor method, of class SuperLocation.
     */
    @Test
    public void testGetEastNeighbor() {
        System.out.println("getEastNeighbor");
        SuperLocation instance = new SuperLocationImpl();
        Location expResult = null;
        Location result = instance.getEastNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SuperLocationImpl extends SuperLocation {
    }
}
