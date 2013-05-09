package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * This class is the Controller part of MVC (Model View Controller). It controls
 * the actions in the game. Class Controller declares "world" of type Cakistan,
 * "player1" of type Sugarman, "the view" of type View and "r" of type Random.
 *
 * @author CakeSolutionGroup
 * @version 1.0
 * @since (01 may 2013)
 */
public class Controller {

    World world;
    Sugarman player1;
    View theView;

    /**
     * Method main instantiate game of type Controller. declares method
     * startGame and runGame from game.
     *
     * @param args
     */
    public static void main(String[] args) {

        Controller game = new Controller();
        game.startGame();
        game.runGame();

    }

    /**
     * Method startGame instantiate world, player1 and the view. It gets the
     * location from class Cakistan, and set the starting point from the first
     * element in Location arrayList, which is Baklavaci.
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

    private boolean isGameOver() {

        return player1.hasSugarmanLost() || player1.hasSugarmanWon() || world.isOutOfQuestions();

    }

    /**
     * Method runGame run games for as long as the player hasn't won or hasn't
     * lost or hasn't run out of questions in the game.
     *
     */
    public void runGame() {
        while (!isGameOver()) {
            theView.playerStatus(player1);
            theView.printToMoveOrToStay(player1.getLocation().getDescription(),
                    player1.getLocation().getNeighbor().getDescription());
            int decision = userInput(2);
            if (decision == 1) { //user chose to stay and answer questions

                ArrayList<Question> currentQuestionList = player1.getLocation().getQuestionList();
                if (currentQuestionList.isEmpty()) {
                    theView.printNoQuestionsLeft();
                    continue;
                }

                askRandomQuestion();

            } else if (decision == 2) { //user chose to move to next location
                player1.move(player1.getLocation().getNeighbor());
            }
        } //end of while loop
        printGameOver();
    }

    /**
     * @param args the command line arguments
     * @return user's input of type integer
     */
    public int userInput(int max) {


        while (true) {

            int input = 0;
            Scanner userInput = new Scanner(System.in);
        
            try {

                input = userInput.nextInt();
            } catch (InputMismatchException ex) {
                theView.printRetypeInput(max);
                continue;
            }

            if (isInputValid(input, max)) {

                return input;

            } else {
                theView.printRetypeInput(max);
            }
        }


    }

    public void askRandomQuestion() {

        Question q = player1.getLocation().getRandomQuestion();
        theView.printOutQuestion(q);
        theView.printEnterAnswer();
        int answer = userInput(q.choices.size());
        if (q.choices.get(answer - 1).isCorrectChoice) {
            theView.printYouGotACake();
            player1.eatCake(q.cake);
        } else {
            theView.printNoCake();
            player1.dontEatCake(q.cake);

        }
    }

    public void printGameOver() {

        if (player1.hasSugarmanLost()) {
            theView.printSugarmanLost();
        } else if (player1.hasSugarmanWon()) {
            theView.printSugarmanWon();
        } else {
            theView.printRanOutOfQuestions();
        }

    }

    private boolean isInputValid(int input, int max) {

        if (input < 1 || input > max) {
            return false;
        }
        return true;
    }
}
