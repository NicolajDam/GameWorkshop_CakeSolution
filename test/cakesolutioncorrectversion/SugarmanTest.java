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
public class SugarmanTest {
    
    public SugarmanTest() {
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
     * Test of hasSugarmanWon method, of class Sugarman.
     */
    @Test
    public void testHasSugarmanWon() {
        System.out.println("hasSugarmanWon");
        Sugarman instance = new Sugarman();
        boolean expResult = false;
        boolean result = instance.hasSugarmanWon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasSugarmanLost method, of class Sugarman.
     */
    @Test
    public void testHasSugarmanLost() {
        System.out.println("hasSugarmanLost");
        Sugarman instance = new Sugarman();
        boolean expResult = false;
        boolean result = instance.hasSugarmanLost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Sugarman.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Location location = null;
        Sugarman instance = new Sugarman();
        instance.move(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugarlevel method, of class Sugarman.
     */
    @Test
    public void testGetSugarlevel() {
        System.out.println("getSugarlevel");
        Sugarman instance = new Sugarman();
        int expResult = 0;
        int result = instance.getSugarlevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeSugarLevel method, of class Sugarman.
     */
    @Test
    public void testChangeSugarLevel() {
        System.out.println("changeSugarLevel");
        int difference = 0;
        Sugarman instance = new Sugarman();
        instance.changeSugarLevel(difference);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eatCake method, of class Sugarman.
     */
    @Test
    public void testEatCake() {
        System.out.println("eatCake");
        Cake cake = null;
        Sugarman instance = new Sugarman();
        instance.eatCake(cake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dontEatCake method, of class Sugarman.
     */
    @Test
    public void testDontEatCake() {
        System.out.println("dontEatCake");
        Cake cake = null;
        Sugarman instance = new Sugarman();
        instance.dontEatCake(cake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Sugarman.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Sugarman instance = new Sugarman();
        Location expResult = null;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Sugarman.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location = null;
        Sugarman instance = new Sugarman();
        boolean expResult = false;
        boolean result = instance.setLocation(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
