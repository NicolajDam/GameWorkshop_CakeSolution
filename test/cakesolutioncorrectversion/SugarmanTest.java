/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import junit.framework.Assert;
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
public class SugarmanTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isUserChoiceCorrect() {

        Sugarman newSugarman = new Sugarman();

        Question q = createQuestion();

        //Testing if correct answer returns true

        boolean expected = true;

        boolean actual = newSugarman.isAnswerCorrect(q, 3);

        Assert.assertEquals(expected, actual);

        //Testing if wrong answer returns false

        expected = false;

        actual = newSugarman.isAnswerCorrect(q, 2);

        Assert.assertEquals(expected, actual);
    }

    public Question createQuestion() {

        Question q1 = new Question("On which continent does Turkey lie?");

        Choice BQ1C1 = new Choice();
        BQ1C1.choice = "Asia";
        BQ1C1.isCorrectChoice = false;

        Choice BQ1C2 = new Choice();
        BQ1C2.choice = "Europe";
        BQ1C2.isCorrectChoice = false;

        Choice BQ1C3 = new Choice();
        BQ1C3.choice = "Europe and Asia";
        BQ1C3.isCorrectChoice = true;

        Choice BQ1C4 = new Choice();
        BQ1C4.choice = "Middle East";
        BQ1C4.isCorrectChoice = false;

        q1.choices.add(BQ1C1);
        q1.choices.add(BQ1C2);
        q1.choices.add(BQ1C3);
        q1.choices.add(BQ1C4);

        return q1;

    }

    /**
     * Test of hasSugarmanWon method, of class Sugarman.
     */
    @Test
    public void testHasSugarmanWon() {
        System.out.println("hasSugarmanWon");
        Sugarman instance = new Sugarman();
        instance.changeSugarLevel(100);
        boolean expResult = true;
        boolean result = instance.hasSugarmanWon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hasSugarmanLost method, of class Sugarman.
     */
    @Test
    public void testHasSugarmanLost() {
        System.out.println("hasSugarmanLost");
        Sugarman instance = new Sugarman();
        instance.changeSugarLevel(-100);
        boolean expResult = true;
        boolean result = instance.hasSugarmanLost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Sugarman.
     */
    @Test
    public void testMove() {
        System.out.println("move");

        Baklavaci baklavaci = new Baklavaci();
        Sugarman instance = new Sugarman();
        instance.move(baklavaci);
        Location location = instance.getLocation();

        Location result = location;
        Location expResult = baklavaci;
        assertEquals(result, expResult);

    }

    /**
     * Test of changeSugarLevel method, of class Sugarman.
     */
    @Test
    public void testCurrentSugarLevelAndChangeSugarLevel() {
        System.out.println("changeSugarLevel");

        Sugarman instance = new Sugarman();
        instance.getSugarlevel();
        instance.changeSugarLevel(20);

        int result = instance.getSugarlevel();
        int expResult = 70;
        assertEquals(result, expResult);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
