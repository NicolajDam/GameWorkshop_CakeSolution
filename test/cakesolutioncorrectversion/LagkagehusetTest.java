/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
import java.util.ArrayList;
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
public class LagkagehusetTest {
    
    public LagkagehusetTest() {
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
     * Test of getQuestionList method, of class Lagkagehuset.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        Lagkagehuset instance = new Lagkagehuset();
        ArrayList expResult = null;
        ArrayList result = instance.getQuestionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExits method, of class Lagkagehuset.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Direction direction = null;
        Lagkagehuset instance = new Lagkagehuset();
        List expResult = null;
        List result = instance.getExits(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Lagkagehuset.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Lagkagehuset instance = new Lagkagehuset();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class Lagkagehuset.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Lagkagehuset instance = new Lagkagehuset();
        List expResult = null;
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEastNeighbor method, of class Lagkagehuset.
     */
    @Test
    public void testSetEastNeighbor() {
        System.out.println("setEastNeighbor");
        Lagkagehuset instance = new Lagkagehuset();
        instance.setEastNeighbor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeQuestions method, of class Lagkagehuset.
     */
    @Test
    public void testInitializeQuestions() {
        System.out.println("initializeQuestions");
        Lagkagehuset instance = new Lagkagehuset();
        instance.initializeQuestions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
