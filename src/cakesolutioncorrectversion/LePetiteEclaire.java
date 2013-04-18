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
public class LePetiteEclaire extends SuperLocation implements Location {
     
    
    /** This refers to the enumerated directions given in Location, 
     * and we can specify which specific directions we intend to be
     * usable in LePetiteEclaire */
     @Override
    public List<Location> getExits(Location.Direction direction) {
    return null;   
    }
    
       /** This is the description of the location LePetiteEclaire */
      @Override
    public String getDescription() {
            return "This is a totally French place";
    }

   
}
