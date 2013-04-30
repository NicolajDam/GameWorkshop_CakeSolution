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
    
    
    
    
    public void printOutQuestion(Question q) {
    
    
    System.out.println(q.question);
    
    for(int i=0; i<q.choices.size(); i++){
    
        Choice c = q.choices.get(i);
        System.out.println((i+1)+") "+c.choice);
    
    }
   
    
    
    
}
    
    
    
}
