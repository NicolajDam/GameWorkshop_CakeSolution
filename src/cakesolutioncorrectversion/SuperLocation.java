/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

//import apple.laf.JRSUIConstants;
import cakesolutioncorrectversion.Location.Direction;
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
    
     List<Location> myLocations = new ArrayList<Location>();
    
     
     public Location neighborEast;
     public Location neighborWest; 
     
    
/**
 * @param direction
 * @returns the exists from the current location, the locations are of type 
 * Location class 
 */
    @Override
    public List<Location> getExits(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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
     * @return null
     */
    @Override
    public void setEastNeighbor(Location l) {
        this.neighborEast = l;
    }
    /**
     * @param null
     * @return null
     */ 
    
    @Override
    public Location getEastNeighbor(){
        return null;
        
    }

    
     
   
}


