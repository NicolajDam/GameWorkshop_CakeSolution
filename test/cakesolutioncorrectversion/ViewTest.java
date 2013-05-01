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
}
