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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getDescription method, of class Location.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Location instance = new LocationImpl();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNeighbor method, of class Location.
     */
    @Test
    public void testSetNeighbor() {
        System.out.println("setNeighbor");
        Location l = null;
        Location instance = new LocationImpl();
        instance.setNeighbor(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNeighbor method, of class Location.
     */
    @Test
    public void testGetNeighbor() {
        System.out.println("getNeighbor");
        Location instance = new LocationImpl();
        Location expResult = null;
        Location result = instance.getNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionList method, of class Location.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        Location instance = new LocationImpl();
        ArrayList expResult = null;
        ArrayList result = instance.getQuestionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LocationImpl implements Location {

        public String getDescription() {
            return "";
        }

        public void setNeighbor(Location l) {
        }

        public Location getNeighbor() {
            return null;
        }

        public ArrayList<Question> getQuestionList() {
            return null;
        }
    }
}
