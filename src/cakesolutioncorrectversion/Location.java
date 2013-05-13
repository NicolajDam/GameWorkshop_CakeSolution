/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Location interface sets contracts for SuperLocation which eventually sets contracts for each 3 locations.  
 * @author Cakesolutiongroup
 * @version 1.0
 * @since ( 01 may 2013)
 */
public interface Location {

    String getDescription();
     
    public Location getNeighbor();

    public ArrayList<Question> getQuestionList();
    
    public Question getRandomQuestion();
    
    public void setNeighbor(Location l);

   

    
}
