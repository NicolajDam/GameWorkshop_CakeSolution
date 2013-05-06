
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *This class generates an arrayList called myLocations
 * which adds all 3 different worlds in the game. i.e : Baklavaci
 * The class also implements the interface World.
 * 
 * @author CakeSolutionGroup
 * @since (01 may 2013)
 */
public class Cakistan implements World {

    List<Location> myLocations = new ArrayList<Location>();

    /**
     * This creates a list of all the locations and connects to World
     * 
     */
    public Cakistan() {
        Location baklavaci = new Baklavaci();
        Location lagkagehuset = new Lagkagehuset();
        Location lePetiteEclaire = new LePetiteEclaire();
        myLocations.add(baklavaci);
        myLocations.add(lagkagehuset);
        myLocations.add(lePetiteEclaire);
        
        baklavaci.setNeighbor(lagkagehuset);
        lagkagehuset.setNeighbor(lePetiteEclaire);
        lePetiteEclaire.setNeighbor(baklavaci);
        

    }

    
    
    /**
     * Method getLocations that returns arrayList myLocations.
     * 
     * @return myLocations of type arrayList
     */
    @Override
    public List<Location> getLocations() {
        return myLocations;
    }
}
