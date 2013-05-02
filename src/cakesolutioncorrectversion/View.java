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
}
