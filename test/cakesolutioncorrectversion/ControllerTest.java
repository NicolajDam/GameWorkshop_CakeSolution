/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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

//    /**
//     * Test of main method, of class Controller.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Controller.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of startGame method, of class Controller.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Controller instance = new Controller();
        instance.startGame();
        Location expResult=instance.world.getLocations().get(0);
        Location result= instance.player1.getLocation();
        assertEquals(expResult, result );
    
       
    }

    /**
     * Test of runGame method, of class Controller.
     */
    @Test
    public void testRunGame() {
       // It's not possible to make a Junit test on this method at this point!
    }

    /**
     * Test of userInput method, of class Controller.
     */
    @Test
    public void testUserInput() {
     // It's not possible to make a Junit test on this method at this point!
    }

    /**
     * Test of askRandomQuestion method, of class Controller.
     */
    @Test
    public void testAskRandomQuestion() {
      // It's not possible to make a Junit test on this method at this point!
    }

  @Test
  public void isInputValid(){
      
      Controller controller= new Controller();
      boolean result= controller.isInputValid(6, 4);
      boolean expResult= false;
      assertEquals(result, expResult);
  }
}
