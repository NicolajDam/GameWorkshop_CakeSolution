/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CakeSolutionGroup
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
        while(!player1.hasSugarmanLost() && !player1.hasSugarmanWon()){
        theView.playerStatus(player1);
        System.out.println("Do you wanna stay here in " + player1.getLocation().getDescription() +
                " and answer questions or move on to " + player1.getLocation().getNeighbor().getDescription()
                + "Type in 1 to stay or 2 to move on");
        int decision = userInput();
        if (decision == 1) {

            Question q = player1.getLocation().getQuestionList().get(0);
            theView.printOutQuestion(q);
            System.out.println("Please enter the number of your answer: ");
            int answer = userInput();
            if (q.choices.get(answer - 1).isCorrectChoice) {
                System.out.println("Hurray you get a cake!");
                player1.eatCake(q.cake);
            } else {
                System.out.println("Sucker, you don't get a cake! HA!");
                player1.dontEatCake(q.cake);

            }
    System.out.println(player1.getSugarlevel()); 
        }
        else if (decision==2){
            player1.move(player1.getLocation().getNeighbor());
        }
        else{
        System.out.println("...you were told to type in 1 or 2!! Retry.");
        }
        }
    if(player1.hasSugarmanLost()){
        theView.printSugarmanLost();
    }
    else if(player1.hasSugarmanWon()){
        theView.printSugarmanWon();
    }
    else{
        theView.printRanOutOfQuestions();
    }
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
