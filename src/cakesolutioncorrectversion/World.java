/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.List;

/**
 * The interface 'World' creates a contract that the classes implementing 'World'
 * will contain a method 'getLocations'. 
 * @author CakeSolutionGroup
 * @version 1.0 (1 May 2013)
 */
public interface World {
   
    /** This method  will create a list of the Locations using the 
     *  Class type 'Location'
     */
    
    List<Location> getLocations();
    
    public boolean isOutOfQuestions();
    
}

