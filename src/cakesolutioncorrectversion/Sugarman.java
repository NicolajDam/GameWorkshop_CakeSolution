/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;
import cakesolutioncorrectversion.Players;
import cakesolutioncorrectversion.PlayerController;
import cakesolutioncorrectversion.Location.Direction;
/**
 *
 * @author anders
 */
public class Sugarman extends Players implements PlayerController {

    @Override
    public boolean move(Direction direction) {
        //TODO implement it
        return false;
    }

    @Override
    public boolean eat(GameObject object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean dont_eat(GameObject object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getSugarlevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void changeSugarLevel(int difference) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setLocation(Location location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
   
    
    
    
    
}