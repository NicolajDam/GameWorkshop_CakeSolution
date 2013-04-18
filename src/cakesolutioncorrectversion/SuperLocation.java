/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import apple.laf.JRSUIConstants;
import cakesolutioncorrectversion.Location.Direction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eskandarpahlavaafshari
 */
abstract class SuperLocation implements Location{
    
     List<Location> myLocations = new ArrayList<Location>();
    
     
     
     public Location neighborEast;
     public Location neighborWest; 
     
    

    @Override
    public List<Location> getExits(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setEastNeighbor(Location l) {
        this.neighborEast = l;
    }
     @Override
    public Location getEastNeighbor(){
        return null;
        
    }

    
     
   
}


