/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicolajdamfrederiksen
 */
public interface Location {
    
    
    /** The Enum method denominates the directions to be used in the locations */
    
    public enum Direction  {EAST, NORTH, WEST, SOUTH, UP, DOWN };
     
     List<Location> getExits(Direction direction);
     String getDescription();
     
     public void setEastNeighbor(Location l);
     public Location getEastNeighbor();
     
     public ArrayList<Question> getQuestionList();
    
}
