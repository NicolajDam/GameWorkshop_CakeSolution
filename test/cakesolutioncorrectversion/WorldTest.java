/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

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
public class WorldTest {
    
    public WorldTest() {
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
     * Test of getLocations method, of class World.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        World instance = new WorldImpl();
        List expResult = null;
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOutOfQuestions method, of class World.
     */
    @Test
    public void testIsOutOfQuestions() {
        System.out.println("isOutOfQuestions");
        World instance = new WorldImpl();
        boolean expResult = false;
        boolean result = instance.isOutOfQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class WorldImpl implements World {

        public List<Location> getLocations() {
            return null;
        }

        public boolean isOutOfQuestions() {
            return false;
        }
    }
}
