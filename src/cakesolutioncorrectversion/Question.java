/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;

/** the class 'Question' contains a constructor that holds the questionText for 
 * the specific questions. The class also contains the variables needed when 
 * answering questions.
 * @author CakeSolutionGroup
 * @version 1.0 (2 May 2013)
 */
public class Question {
    
    String question;
    ArrayList<Choice> choices = new ArrayList<Choice>();
    Cake cake= new Cake();
    
    /**
     * the constructor creates a new instance of question 
     * @param questionText of type String
     * 
     */
    public Question(String questionText){
        this.question = questionText;
        
    }
}
