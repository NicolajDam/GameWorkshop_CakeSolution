/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

//import apple.laf.JRSUIConstants;
import cakesolutioncorrectversion.Location;
import java.util.ArrayList;
import java.util.List;

/** The class 'SuperLocation' is a super class, which implements Location.
 * It's purpose is to create the methods for placing the locations in relation
 * to each other. It also contains methods that hold information about the 
 * different locations.
 * @author CakeSolutionGroup
 * @version 1.0 (1 May 2013)
 */
abstract class SuperLocation implements Location{
    
     
     private Location neighbor;
     
    

    /**
     * 
     * @returns a string, which describes the name of the location
     */
    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * 
     * @param l 
     * @return neighbor of type location
     */
    @Override
    public void setNeighbor(Location l) {
        neighbor = l;
    }
    /**
     * @param null
     * @return null
     */ 
    
    @Override
    public Location getNeighbor(){
        return neighbor;
        
    }

    
     
   
}


