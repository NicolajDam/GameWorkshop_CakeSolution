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
public interface World {
   
    /** The list references the locations from Cakistan 
     * (Cakistan implements World) */
    
    List<Location> getLocations();
    
}

 // We can write overall rules or parameters (like enemies) for the game here in World