/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
import java.util.List;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class CakeSolutionCorrectVersion {

    Cakistan world;
    Sugarman player1; 
    
    public void startGame(){
    
    
            // Creates worlds 
            world = new Cakistan();
        
            // Creates player
            player1 = new Sugarman();
            
            
            //get starting location from world
            List<Location> locations = world.getLocations();
            Location start = locations.get(0);
            
            player1.setLocation(start);
            
    
    }
    public void runGame(){
    
        Question q = player1.getLocation().getQuestionList().get(0);
        //tell the view to ask question
        System.out.print(q.question);
        
    }
    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        
        
        
        CakeSolutionCorrectVersion game = new CakeSolutionCorrectVersion();
        game.startGame();
        game.runGame();
        /*Cakistan newWorld = new Cakistan();
                List<Location> myLocations = newWorld.getLocations();
                
                /**This for loop gets the locations and prints out 
                 * the description of these */
                
//                for (Location L : myLocations) { 
//                        System.out.println("Fancy for loop: " 
//                                +L.getDescription());
//                }
//                
//                /**This for loop gets the directions and prints out them out */
//                
//                for (Direction theNextDirection : Direction.values()) {
//                        System.out.println(theNextDirection);
//                    
//                }
//        
        
    }
}
