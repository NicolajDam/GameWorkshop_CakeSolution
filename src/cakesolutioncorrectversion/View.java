/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

/**
 *
 * @author anders
 */
public class View {
    
    public void playerStatus(Sugarman sugarman){
        System.out.println("This is your current sugar level: "+sugarman.getSugarlevel());
        System.out.println("This is your current location: "+sugarman.getLocation().getDescription());
    }
    
    
    public void printOutQuestion(Question q) {
    
    
    System.out.println(q.question);
    
    for(int i=0; i<q.choices.size(); i++){
    
        Choice c = q.choices.get(i);
        System.out.println((i+1)+") "+c.choice);
    
    }
    
    
   
    
    
    
}
    
    
    
}
