/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
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

    /**
     * Test of getLocations method, of class Cakistan.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Cakistan instance = new Cakistan();
        List expResult = null;
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectLocation method, of class Cakistan.
     */
    @Test
    public void testConnectLocation() {
        System.out.println("connectLocation");
        Location comingFromLocation = null;
        Direction d = null;
        Location goingToLocation = null;
        Cakistan instance = new Cakistan();
        instance.connectLocation(comingFromLocation, d, goingToLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
