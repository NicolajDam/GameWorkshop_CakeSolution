/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;
import cakesolutioncorrectversion.Location.Direction;
/**
 *
 * @author Signe
 */
public interface PlayerController extends Localizable {
    
    /** 
     * Moves the player around to a new location.
     * @param direction direction to be moved to
     * @Return true if new location can be sat as requested, false otherwise
     */
    boolean move(Direction direction);
    
    /**
     * Player can eat the cake
     * 
     *@param object - the cake to eat
     *@return true if the question is answered correctly, false otherwise
     */
    public void eatCake(Cake cake);
    public void dontEatCake(Cake cake);
  
    /**
     * Returns the sugar level of the player
     * @return
     */
    int getSugarlevel();
    
    /**
     *Changes the Sugar level of the player as specified by the difference
     * @param difference change in Sugar level.
     */
    void changeSugarLevel(int difference);
    
    
}
