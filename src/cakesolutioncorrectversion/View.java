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
    
    /** The method'playerStatus' prints the current status of the player.
     * @return null
     * @param sugarman 
     */
    
    public void playerStatus(Sugarman sugarman){
        System.out.println("This is your current sugar level: "+sugarman.getSugarlevel());
        System.out.println("This is your current location: "+sugarman.getLocation().getDescription());
    }
    
    /** The method 'printOutQuestion' prints the question and the adhering 
     * choices. 
     * @return null
     * @param q 
     */
    public void printOutQuestion(Question q) {
    
    
        System.out.println(q.question);
    
        for(int i=0; i<q.choices.size(); i++){
    
            Choice c = q.choices.get(i);
            System.out.println((i+1)+") "+c.choice);
    
        }
    }   

    public void printSugarmanWon(){
    
        System.out.println("SPLASH! Hurray Sugarman won! He exploded and is now a happy part of all the cakes - JAY!");  
    }

    public void printSugarmanLost(){
    
        System.out.println("Sorry Sugarman got too thin and got the SugarCold...and then he died...sorry.");
    }

    public void printRanOutOfQuestions(){
    
        System.out.println("Sorry you ran out of questions. Sugarman will run around crying until you Start over.");
    }




}
