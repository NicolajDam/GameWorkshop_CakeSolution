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
    
     String getDescription();
     
     public void setNeighbor(Location l);
     public Location getNeighbor();
     
     public ArrayList<Question> getQuestionList();
    
     public Question getRandomQuestion();
}
