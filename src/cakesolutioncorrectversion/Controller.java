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

    /**
     * This method is a boolean which returns true, if either Sugarman has lost,
     * or won or all locations are out of questions[all questions are asked].
     *
     * @return true
     */
    private boolean isGameOver() {

        return player1.hasSugarmanLost() || player1.hasSugarmanWon() || world.isOutOfQuestions();

    }

    /**
     * Method runGame run games for as long as the player hasn't won or hasn't
     * lost or hasn't run out of questions in the game.
     *
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
     * Scans the user's input and checks if it's valid or not.
     *
     * @param max of type integer
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

    /**
     * This method randomizes questions for each location and if the answer to the question was
     * right award the user with a cake, which is equal to 10 points.
     * @param null
     * 
     */
    public void askRandomQuestion() {

        Question q = player1.getLocation().getRandomQuestion();
        theView.printOutQuestion(q);
        theView.printEnterAnswer();
        int answer = userInput(q.choices.size());
        boolean wasCorrectAnswer = player1.isAnswerCorrect(q, answer);

        if (wasCorrectAnswer) {
            theView.printYouGotACake();
        } else {
            theView.printNoCake();
        }

    }

    /**
     * This method just calls the view for printing messages in case of:
     * Sugarman lost, Sugarman won or locations are out of questions.
     * @param null
     * @return null
     */
    public void printGameOver() {

        if (player1.hasSugarmanLost()) {
            theView.printSugarmanLost();
        } else if (player1.hasSugarmanWon()) {
            theView.printSugarmanWon();
        } else {
            theView.printRanOutOfQuestions();
        }

    }
/**
 * a method of type boolean which returns false if user's input is less than 1 
 * or it's greater than max. otherwise returns true.
 * @param input
 * @param max
 * @return true/ false
 */
    public boolean isInputValid(int input, int max) {

        if (input < 1 || input > max) {
            return false;
        }
        return true;
    }
}
