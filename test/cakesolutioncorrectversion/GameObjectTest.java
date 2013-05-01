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
public class GameObjectTest {
    
    public GameObjectTest() {
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
     * Test of canBeTaken method, of class GameObject.
     */
    @Test
    public void testCanBeTaken() {
        System.out.println("canBeTaken");
        GameObject instance = new GameObjectImpl();
        boolean expResult = false;
        boolean result = instance.canBeTaken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GameObjectImpl implements GameObject {

        public boolean canBeTaken() {
            return false;
        }
    }
}
