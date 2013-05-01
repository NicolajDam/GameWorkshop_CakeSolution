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
public class LocalizableTest {
    
    public LocalizableTest() {
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
     * Test of getLocation method, of class Localizable.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Localizable instance = new LocalizableImpl();
        Location expResult = null;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Localizable.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location = null;
        Localizable instance = new LocalizableImpl();
        boolean expResult = false;
        boolean result = instance.setLocation(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LocalizableImpl implements Localizable {

        public Location getLocation() {
            return null;
        }

        public boolean setLocation(Location location) {
            return false;
        }
    }
}
