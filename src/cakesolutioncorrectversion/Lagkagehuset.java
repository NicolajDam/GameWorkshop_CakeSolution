/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CakeSolutionGroup
 */
public class Lagkagehuset extends SuperLocation implements Location {
    
    ArrayList<Question> questionList = new ArrayList<Question>();
    /** This refers to the enumerated directions given in Location, 
     * and we can specify which specific directions we intend to be
     * usable in Lagkagehuset */
     
    public Lagkagehuset() {
        initializeQuestions();
    }
    
     public ArrayList<Question> getQuestionList(){
  
         return questionList;
     }
    
     // make a Junit test to check that we override the getDescripttion function from the SuperLocation. agata will love.
     
     /** This is the description of the location Lagkagehuset */
      @Override
    public String getDescription() {
            return "Lagkagehuset";
    }
    
    
    public void initializeQuestions(){
        
         Question q1 = new Question("What is the name of the current Queen of Denmark?");
         
         Choice lkhQ1C1 = new Choice();
         lkhQ1C1.choice = "Margrethe";
         lkhQ1C1.isCorrectChoice = true;
         
         Choice lkhQ1C2 = new Choice();
         lkhQ1C2.choice = "Ingrid";
         lkhQ1C2.isCorrectChoice = false;
         
         Choice lkhQ1C3 = new Choice();
         lkhQ1C3.choice = "Beatrice";
         lkhQ1C3.isCorrectChoice = false;
         
         Choice lkhQ1C4 = new Choice();
         lkhQ1C4.choice = "Mary";
         lkhQ1C4.isCorrectChoice = false;
         
         questionList.add(q1);
         q1.choices.add(lkhQ1C1);
         q1.choices.add(lkhQ1C2);
         q1.choices.add(lkhQ1C3);
         q1.choices.add(lkhQ1C4);
         
         
         Question q2 = new Question("What is the national dish of Denmark?");
         
         Choice lkhQ2C1 = new Choice();
         lkhQ2C1.choice = "A Danish";
         lkhQ2C1.isCorrectChoice = false;
         
         Choice lkhQ2C2 = new Choice();
         lkhQ2C2.choice = "Shooting Star";
         lkhQ2C2.isCorrectChoice = false;
         
         Choice lkhQ2C3 = new Choice();
         lkhQ2C3.choice = "Meatballs";
         lkhQ2C3.isCorrectChoice = true;
         
         Choice lkhQ2C4 = new Choice();
         lkhQ2C4.choice = "Open-faced sandwiches";
         lkhQ2C4.isCorrectChoice = false;
         
         questionList.add(q2);
         q1.choices.add(lkhQ2C1);
         q1.choices.add(lkhQ2C2);
         q1.choices.add(lkhQ2C3);
         q1.choices.add(lkhQ2C4);
         
         Question q3 = new Question("Which island is the biggest in Denmark?");
         
         Choice lkhQ3C1 = new Choice();
         lkhQ3C1.choice = "Greenland";
         lkhQ3C1.isCorrectChoice = false;
         
         Choice lkhQ3C2 = new Choice();
         lkhQ3C2.choice = "Zealand";
         lkhQ3C2.isCorrectChoice = true;
         
         Choice lkhQ3C3 = new Choice();
         lkhQ3C3.choice = "Funen";
         lkhQ3C3.isCorrectChoice = false;
         
         Choice lkhQ3C4 = new Choice();
         lkhQ3C4.choice = "Vendsyssel-Thy";
         lkhQ3C4.isCorrectChoice = false;
         
         questionList.add(q3);
         q1.choices.add(lkhQ3C1);
         q1.choices.add(lkhQ3C2);
         q1.choices.add(lkhQ3C3);
         q1.choices.add(lkhQ3C4);
         
         Question q4 = new Question("Which bird is the Danish national bird?");
         
         Choice lkhQ4C1 = new Choice();
         lkhQ4C1.choice = "The alaudidae lark";
         lkhQ4C1.isCorrectChoice = false;
         
         Choice lkhQ4C2 = new Choice();
         lkhQ4C2.choice = "the mute swan";
         lkhQ4C2.isCorrectChoice = true;
         
         Choice lkhQ4C3 = new Choice();
         lkhQ4C3.choice = "the shiny blackbird";
         lkhQ4C3.isCorrectChoice = false;
         
         Choice lkhQ4C4 = new Choice();
         lkhQ4C4.choice = "the red swallow";
         lkhQ4C4.isCorrectChoice = false;
         
         questionList.add(q4);
         q1.choices.add(lkhQ4C1);
         q1.choices.add(lkhQ4C2);
         q1.choices.add(lkhQ4C3);
         q1.choices.add(lkhQ4C4);
         
         Question q5 = new Question("When was Denmark liberated after WW2?");
         
         Choice lkhQ5C1 = new Choice();
         lkhQ5C1.choice = "may 4th 1945";
         lkhQ5C1.isCorrectChoice = false;
         
         Choice lkhQ5C2 = new Choice();
         lkhQ5C2.choice = "july 18th 1945";
         lkhQ5C2.isCorrectChoice = false;
         
         Choice lkhQ5C3 = new Choice();
         lkhQ5C3.choice = "june 7th 1945";
         lkhQ5C3.isCorrectChoice = false;
         
         Choice lkhQ5C4 = new Choice();
         lkhQ5C4.choice = "may 5th 1945";
         lkhQ5C4.isCorrectChoice = true;
         
         questionList.add(q5);
         q1.choices.add(lkhQ5C1);
         q1.choices.add(lkhQ5C2);
         q1.choices.add(lkhQ5C3);
         q1.choices.add(lkhQ5C4);
        
          
    }
    
    
}
