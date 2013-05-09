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
public class BaklavaciTest {
    
    @Test
    public void hasQuestions(){
        
        Baklavaci newBaklavaci = new Baklavaci();
        
        
        boolean expected = true;
        
        
        boolean actual = !newBaklavaci.getQuestionList().isEmpty();
        
        Assert.assertEquals(expected, actual); 
    }
    
    
    
    
}
