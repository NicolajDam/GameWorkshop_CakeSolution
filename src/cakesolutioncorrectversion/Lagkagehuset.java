/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.List;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class Lagkagehuset extends SuperLocation implements Location {
    
    /** This refers to the enumerated directions given in Location, 
     * and we can specify which specific directions we intend to be
     * usable in Lagkagehuset */
     @Override
    public List<Location> getExits(Direction direction) {
    return null;   
    }
    
     // make a Junit test to check that we override the getDescripttion function from the SuperLocation. agata will love.
     
     /** This is the description of the location Lagkagehuset */
      @Override
    public String getDescription() {
            return "This is a totally lagkage place";
    }

   
    public List<Location> getLocations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   // @Override
    public void setEastNeighbor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
