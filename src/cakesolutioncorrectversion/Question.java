/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;

/**
 *
 * @author eskandarpahlavaafshari
 */
public class Question {
    
    String question;
    ArrayList<Choice> choices = new ArrayList<Choice>();
    Cake cake= new Cake();
    
    public Question(String questionText){
        this.question = questionText;
        
    }
    
    
     
    
}
