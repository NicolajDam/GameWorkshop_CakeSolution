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


/**
 *
 * @author nicolajdamfrederiksen
 */
public class BaklavaciTest {

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
    public void hasQuestions(){
        
        Baklavaci newBaklavaci = new Baklavaci();
        
        
        boolean expected = true;
        
        
        boolean actual = !newBaklavaci.getQuestionList().isEmpty();
        
        Assert.assertEquals(expected, actual); 
    }

    
}
