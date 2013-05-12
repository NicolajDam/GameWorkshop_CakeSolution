/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author eskandarpahlavaafshari
 */
public class CakistanTest {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

  
    
    @Test
    public void Cakistan(){
      
    }

    /**
     * Test of isOutOfQuestions method, of class Cakistan.
     */
    @Test
    public void testIsOutOfQuestions() {
        System.out.println("isOutOfQuestions");
        cakesolutioncorrectversion.Cakistan instance = new cakesolutioncorrectversion.Cakistan();
        boolean expResult = false;
        boolean result = instance.isOutOfQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class Cakistan.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        cakesolutioncorrectversion.Cakistan instance = new cakesolutioncorrectversion.Cakistan();
        boolean expResult= false;
        boolean result = instance.getLocations().isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
