/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location.Direction;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class Controller {

    Cakistan world;
    Sugarman player1; 
    View theView;
    
    public void startGame(){
    
    
            // Creates worlds 
            world = new Cakistan();
        
            // Creates player
            player1 = new Sugarman();
            
            theView = new View();
            
            
            //get starting location from world
            List<Location> locations = world.getLocations();
            Location start = locations.get(0);
            
            player1.setLocation(start);
            
    
    }
    public void runGame(){
        theView.playerStatus(player1);
        Question q = player1.getLocation().getQuestionList().get(0);
        theView.printOutQuestion(q);
        System.out.println("Please enter the number of your answer: ");
        int answer = userInput();
    if(q.choices.get(answer-1).isCorrectChoice){
        System.out.println("Hurray you get a cake!");
        player1.eatCake(q.cake);
    }
    else{
        System.out.println("Sucker, you don't get a cake! HA!");
        player1.dontEatCake(q.cake);

    }
    
    System.out.println(player1.getSugarlevel());
    
    }
    /**
     * @param args the command line arguments
     */
     
    public int userInput(){
    
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    
    
    }
    
    
    public static void main(String[] args) {
        
        
        
        Controller game = new Controller();
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
