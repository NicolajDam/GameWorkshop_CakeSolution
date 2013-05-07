package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is the Controller part of MVC (Model View Controller). It controls the actions
 * in the game. Class Controller declares "world" of type Cakistan, "player1" of
 * type Sugarman, "the view" of type View and "r" of type Random.
 *
 * @author CakeSolutionGroup
 * @version 1.0
 * @since (01 may 2013)
 */
public class Controller {

    World world;
    Sugarman player1;
    View theView;
    Random r= new Random();
    

    /**
     * Method startGame instantiate world, player1 and the view.
     * It gets the location from class Cakistan, and set the starting point from the
     * first element in Location arrayList, which is Baklavaci.
     */
    public void startGame() {


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

    /**
     * Method runGame run games for as long as the player hasn't won or hasn't
     * lost or hasn't run out of questions in the game.
     *
     */
    public void runGame() {
        while (!player1.hasSugarmanLost() && !player1.hasSugarmanWon()&& !world.isOutOfQuestions()) {
            theView.playerStatus(player1);
            System.out.println("Do you wanna stay here in " + player1.getLocation().getDescription()
                    + " and answer questions or move on to " + player1.getLocation().getNeighbor().getDescription()
                    + "Type in 1 to stay or 2 to move on");
            int decision = userInput();
            if (decision == 1 ) {
 
                ArrayList<Question> currentQuestionList =  player1.getLocation().getQuestionList();
               if(currentQuestionList.isEmpty()){
                   System.out.println("There are no questions left in this location! Move to the next location by choosing 2 : ");
                   continue;
               }
                int randomNumber= r.nextInt(currentQuestionList.size());
                Question q = currentQuestionList.get(randomNumber);
                currentQuestionList.remove(randomNumber);
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
            } else if (decision == 2) {
                player1.move(player1.getLocation().getNeighbor());
            } else {
                System.out.println("...you were told to type in 1 or 2!! Retry.");
            }
        }
        if (player1.hasSugarmanLost()) {
            theView.printSugarmanLost();
        } else if (player1.hasSugarmanWon()) {
            theView.printSugarmanWon();
        } else {
            theView.printRanOutOfQuestions();
        }
    }

    /**
     * @param args the command line arguments
     * @return user's input of type integer
     */
    public int userInput() {

        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();


    }

    /**
     *Method main instantiate game of type Controller.
     * declares method startGame and runGame from game.
     * @param args
     */
    public static void main(String[] args) {



        Controller game = new Controller();
        game.startGame();
        game.runGame();


    }
}
