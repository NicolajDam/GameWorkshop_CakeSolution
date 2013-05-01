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
 * @author nicolajdamfrederiksen
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
        ArrayList expResult = instance.getQuestionList();
        ArrayList result = instance.getQuestionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExits method, of class Baklavaci.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Direction direction = null;
        Baklavaci instance = new Baklavaci();
        List expResult = instance.getExits(direction);
        List result = instance.getExits(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Baklavaci.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Baklavaci instance = new Baklavaci();
        String expResult = "Baklavaci";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class Baklavaci.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Baklavaci instance = new Baklavaci();
        List expResult = instance.getLocations();
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEastNeighbor method, of class Baklavaci.
     */
    @Test
    public void testSetEastNeighbor() {
        System.out.println("setEastNeighbor");
        Baklavaci instance = new Baklavaci();
        instance.setEastNeighbor();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }
}
