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
public class Baklavaci extends SuperLocation   {
    
  
    
    /** This refers to the enumerated directions given in Location, 
     * and we can specify which specific directions we intend to be
     * usable in Baklavaci */
    
    @Override
    public List<Location> getExits(Direction direction) {
    return null;   
    }
    
    
    /** This is the description of the location Baklavaci */
   
    public String getDescription() {
            return "This is a totally fabulouuuus place";
    }

    
    public List<Location> getLocations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public void setEastNeighbor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
