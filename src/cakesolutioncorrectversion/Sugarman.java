package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Players;
import cakesolutioncorrectversion.PlayerController;
import cakesolutioncorrectversion.Location;

/**
 * Sugarman is a class that extends Players and implements PlayerController. The
 * class contains the methods needed for the player to play the game, such as
 * keeping score (the sugar level), eating or not eating the cakes and the
 * location of the player.
 *
 * @author CakeSolutionGroup
 * @version 1.0 (2 May 2013)
 */
public class Sugarman extends Players implements PlayerController {

    private Location sugarmanLocation;
    private int currentSugarLevel = 50;

    /**
     * changeSugarLevel changes the currentSugarLevel
     *
     * @param difference, which is an integer variable
     * @return Null
     */
    @Override
    public void changeSugarLevel(int difference) {

        currentSugarLevel = currentSugarLevel + difference;
    }

    /**
     * dontEatCake sets the value for the integer 'difference' in the method
     * changeSugarLevel, whenever the player answers a question incorrectly
     *
     * @param cake of class type Cake
     * @return Null
     */
    @Override
    public void dontEatCake(Cake cake) {
        changeSugarLevel(-cake.sugarLevel);

    }

    /**
     * eatCake sets the value for the integer 'difference' in the method
     * changeSugarLevel, whenever the player answers a question correctly
     *
     * @param cake of class type Cake
     * @return Null
     */
    public void eatCake(Cake cake) {
        changeSugarLevel(cake.sugarLevel);
    }

    /**
     * getLocation returns the current location of sugarman
     *
     * @param Null
     * @returns sugarmanLocation of class type Location
     */
    @Override
    public Location getLocation() {
        return sugarmanLocation;

    }

    /**
     * setLocation returns true whenever the location equals sugarmanLocation
     *
     * @param location of class type Location
     * @return boolean
     */
    @Override
    public boolean setLocation(Location location) {

        sugarmanLocation = location;
        return true;

    }

    /**
     * getSugarLevel returns the currentSugarLevel, which keeps track of the
     * player's progress
     *
     * @param null
     * @returns the currentSugarLevel of type integer
     */
    @Override
    public int getSugarlevel() {

        return currentSugarLevel;
    }

    /**
     * if the currentSugarLevel of sugarman is equal or above 100, it returns
     * hasWon.
     *
     * @return hasWon
     */
    public boolean hasSugarmanWon() {
        boolean hasWon = currentSugarLevel >= 100;
        return hasWon;

    }

    /**
     * if the currentSugarLevel of sugarman is equal or less than 0, it returns
     * hasLost.
     *
     * @return hasLost
     */
    public boolean hasSugarmanLost() {
        boolean hasLost = currentSugarLevel <= 0;
        return hasLost;
    }

    /**
     * isAnswerCorrect is a boolean method which returns true if the user's
     * answer is correct. and it returns false otherwise.
     *
     * @param q
     * @param answer
     * @return true/ false
     */
    public boolean isAnswerCorrect(Question q, int answer) {

        if (q.choices.get(answer - 1).isCorrectChoice) {
            eatCake(q.cake);
            return true;
        } else {
            dontEatCake(q.cake);
            return false;
        }
    }

    /**
     * move is a method that determines whether the player can move to the
     * desired location.
     *
     * @param direction
     * @return boolean
     */
    @Override
    public void move(Location location) {
        sugarmanLocation = location;

    }
}
