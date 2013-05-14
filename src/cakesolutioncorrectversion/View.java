/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

/**
 * The Class 'View' is the view in the MVC model. The class prints information
 * about the status of the game, and the tasks at hand during gameplay.
 *
 * @author CakeSolutionGroup
 * @version 1.0 (1 May 2013)
 *
 */
public class View {

    /**
     * The method'playerStatus' prints the current status of the player.
     *
     * @return null
     * @param sugarman
     */
    public void playerStatus(Sugarman sugarman) {
        System.out.println("This is your current sugar level: " + sugarman.getSugarlevel());
        System.out.println("This is your current location: " + sugarman.getLocation().getDescription());
    }

    /**
     * The method 'printOutQuestion' prints the question and the adhering
     * choices.
     *
     * @return null
     * @param q
     */
    public void printOutQuestion(Question q) {


        System.out.println(q.question);

        for (int i = 0; i < q.choices.size(); i++) {

            Choice c = q.choices.get(i);
            System.out.println((i + 1) + ") " + c.choice);

        }
    }

    /**
     * the method prints out to ask if the user wants to stay in the location or
     * moving on to the next location.
     *
     * @param currentLocation
     * @param neighborLocation
     */
    public void printToMoveOrToStay(String currentLocation, String neighborLocation) {
        System.out.println("Do you wanna stay here in " + currentLocation
                + " and answer questions or move on to " + neighborLocation
                + "Type in 1 to stay or 2 to move on or 3 to exit game");

    }

    /**
     * the method prints that there are no questions left in the location and
     * that the player should move to next location by pressing "2".
     */
    public void printNoQuestionsLeft() {

        System.out.println("There are no questions left in this location! Move to the next location by choosing 2 : ");
    }

    /**
     * prints to the user to enter answer
     */
    public void printEnterAnswer() {

        System.out.println("Please enter the number of your answer: ");

    }

    /**
     * print out you got a cake, after the user's answer was correct.
     */
    public void printYouGotACake() {

        System.out.println("Hurray you get a cake!");

    }

    /**
     * prints no cake for you, if the user's answer wasn't right.
     */
    public void printNoCake() {

        System.out.println("Sucker, you don't get a cake! HA!");
    }

    /**
     * if the users input was anything else than between 1 to max, it prints out
     * please enter an input from 1 to max.
     *
     * @param max
     */
    public void printRetypeInput(int max) {

        System.out.println("Please, type an input from 1 to " + max);

    }

    /**
     * when the user wins, print out this message.
     */
    public void printSugarmanWon() {

        System.out.println("SPLASH! Hurray Sugarman won! He exploded and is now a happy part of all the cakes - JAY!");
    }

    /**
     * when the user loses, it prints out this message.
     */
    public void printSugarmanLost() {

        System.out.println("Sorry Sugarman got too thin and got the SugarCold...and then he died...sorry.");
    }

    /**
     * when there are not question left in all locations, it prnts out this
     * message.
     */
    public void printRanOutOfQuestions() {

        System.out.println("Sorry you ran out of questions. Sugarman will run around crying until you Start over.");
    }
    
    public void printExitGame() {
    
        System.out.println("You have exited the game. Bye bye!");
    }
}
