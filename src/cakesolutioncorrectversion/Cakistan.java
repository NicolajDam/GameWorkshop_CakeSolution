/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class Cakistan implements World {
    
    List<Location> myLocations = new ArrayList<Location>();
    
    /** This creates a list of all the locations and connects to World */
    
    public Cakistan() {
           
            myLocations.add(new Baklavaci());
            myLocations.add(new Lagkagehuset());
            myLocations.add(new LePetiteEclaire());
            
            connectLocation( myLocations.get(0), Direction.EAST, myLocations.get(1) );
            connectLocation( myLocations.get(1), Direction.NORTH, myLocations.get(2) );
    }

    @Override
    public List<Location> getLocations() {
        return myLocations;
    }

    public void connectLocation(Location comingFromLocation, Location.Direction d, Location goingToLocation) {
       if(d == Direction.EAST){
           comingFromLocation.setEastNeighbor(goingToLocation);
       }
     
     }
    
}
