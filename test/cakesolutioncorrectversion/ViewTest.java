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
public class ViewTest {
    
    public ViewTest() {
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
     * Test of playerStatus method, of class View.
     */
    @Test
    public void testPlayerStatus() {
        System.out.println("playerStatus");
        Sugarman sugarman = null;
        View instance = new View();
        instance.playerStatus(sugarman);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printOutQuestion method, of class View.
     */
    @Test
    public void testPrintOutQuestion() {
        System.out.println("printOutQuestion");
        Question q = null;
        View instance = new View();
        instance.printOutQuestion(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSugarmanWon method, of class View.
     */
    @Test
    public void testPrintSugarmanWon() {
        System.out.println("printSugarmanWon");
        View instance = new View();
        instance.printSugarmanWon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSugarmanLost method, of class View.
     */
    @Test
    public void testPrintSugarmanLost() {
        System.out.println("printSugarmanLost");
        View instance = new View();
        instance.printSugarmanLost();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRanOutOfQuestions method, of class View.
     */
    @Test
    public void testPrintRanOutOfQuestions() {
        System.out.println("printRanOutOfQuestions");
        View instance = new View();
        instance.printRanOutOfQuestions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
