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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of startGame method, of class Controller.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Controller instance = new Controller();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runGame method, of class Controller.
     */
    @Test
    public void testRunGame() {
        System.out.println("runGame");
        Controller instance = new Controller();
        instance.runGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userInput method, of class Controller.
     */
    @Test
    public void testUserInput() {
        System.out.println("userInput");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.userInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Controller.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Controller.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
