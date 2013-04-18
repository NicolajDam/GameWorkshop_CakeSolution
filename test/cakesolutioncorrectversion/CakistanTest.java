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

/**
 *
 * @author eskandarpahlavaafshari
 */
public class CakistanTest {
    
    public CakistanTest() {
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
     * Test of getLocations method, of class Cakistan.
     */
    @Test
    public void testThatGetLocationsReturnsThreeLocations() {
        Cakistan testCakistan= new Cakistan();
        assertEquals(3, testCakistan.getLocations().size());
    }
    
    @Test
    public void testThatConnectLocationsFromLocationAToLocationBGivesAnExitWithTheRightDirection(){
        
    }
}
