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
 * @author eskandarpahlavaafshari
 */
public class LagkagehusetTest {
    
    public LagkagehusetTest() {
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

     @Test
    public void hasQuestions(){
        
        Lagkagehuset newLagkagehuset = new Lagkagehuset();
        
        
        boolean expected = true;
        
        
        boolean actual = !newLagkagehuset.getQuestionList().isEmpty();
        
        Assert.assertEquals(expected, actual); 
    }
    
    
}
