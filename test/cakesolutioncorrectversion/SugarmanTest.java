/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class SugarmanTest {
    
    @Test
    public void isUserChoiceCorrect(){
        
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
    
    public Question createQuestion(){
        
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
    
    
}
