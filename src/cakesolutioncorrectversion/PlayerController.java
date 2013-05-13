/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location;

/**
 *
 * @author CakeSolutionGroup
 * @version 1.0
 * @since (01 may 2013)
 */
public interface PlayerController extends Localizable {

    /**
     * Changes the Sugar level of the player as specified by the difference
     *
     * @param difference change in Sugar level.
     */
    void changeSugarLevel(int difference);

    /**
     * Player can not eat the cake
     *
     * @param object of type Cake
     * @return true if the question is answered correctly, false otherwise
     */
    public void dontEatCake(Cake cake);

    /**
     * Player can eat the cake
     *
     * @param object of type Cake
     * @return true if the question is answered correctly, false otherwise
     */
    public void eatCake(Cake cake);

    /**
     * Returns the sugar level of the player
     *
     * @return
     */
    int getSugarlevel();

    /**
     * Moves the player around to a new location.
     *
     * @param direction direction to be moved to
     * @Return true if new location can be sat as requested, false otherwise
     */
    public void move(Location location);
}
