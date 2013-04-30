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

    private Location sugarmanLocation;
    private int currentSugarLevel = 50;
    
    
    @Override
    public boolean move(Direction direction) {
        //TODO implement it
        return false;
    }

    

    @Override
    public int getSugarlevel() {
        
        return currentSugarLevel;   
    }

    @Override
    public void changeSugarLevel(int difference) {
        
        currentSugarLevel = currentSugarLevel + difference;
    }
     
    public void eatCake(Cake cake){
        changeSugarLevel(cake.sugarLevel);
    }
    
    @Override
    public void dontEatCake(Cake cake) {
        changeSugarLevel(-cake.sugarLevel);
        
    }
    
    

    @Override
    public Location getLocation() {
        return sugarmanLocation;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setLocation(Location location) {
        //Methode variable: Location som vi kalder sugarmanLocation.
        sugarmanLocation = location;
        return true;
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
   
    
    
    
    
}
