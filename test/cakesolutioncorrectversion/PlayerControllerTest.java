/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
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
public class PlayerControllerTest {
    
    public PlayerControllerTest() {
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
     * Test of move method, of class PlayerController.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Direction direction = null;
        PlayerController instance = new PlayerControllerImpl();
        boolean expResult = false;
        boolean result = instance.move(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eatCake method, of class PlayerController.
     */
    @Test
    public void testEatCake() {
        System.out.println("eatCake");
        Cake cake = null;
        PlayerController instance = new PlayerControllerImpl();
        instance.eatCake(cake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dontEatCake method, of class PlayerController.
     */
    @Test
    public void testDontEatCake() {
        System.out.println("dontEatCake");
        Cake cake = null;
        PlayerController instance = new PlayerControllerImpl();
        instance.dontEatCake(cake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugarlevel method, of class PlayerController.
     */
    @Test
    public void testGetSugarlevel() {
        System.out.println("getSugarlevel");
        PlayerController instance = new PlayerControllerImpl();
        int expResult = 0;
        int result = instance.getSugarlevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeSugarLevel method, of class PlayerController.
     */
    @Test
    public void testChangeSugarLevel() {
        System.out.println("changeSugarLevel");
        int difference = 0;
        PlayerController instance = new PlayerControllerImpl();
        instance.changeSugarLevel(difference);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerControllerImpl implements PlayerController {

        public boolean move(Direction direction) {
            return false;
        }

        public void eatCake(Cake cake) {
        }

        public void dontEatCake(Cake cake) {
        }

        public int getSugarlevel() {
            return 0;
        }

        public void changeSugarLevel(int difference) {
        }
    }
}
