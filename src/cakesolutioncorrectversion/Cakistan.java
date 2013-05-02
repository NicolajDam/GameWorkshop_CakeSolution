/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CakeSolutionGroup
 */
public class Cakistan implements World {

    List<Location> myLocations = new ArrayList<Location>();

    /**
     * This creates a list of all the locations and connects to World
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

    
    
    
    @Override
    public List<Location> getLocations() {
        return myLocations;
    }
}
