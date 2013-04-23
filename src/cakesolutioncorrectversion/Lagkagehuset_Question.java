/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.ArrayList;
/**
 *
 * @author nicolajdamfrederiksen
 */
public class Lagkagehuset_Question implements Questions{
    
    ArrayList<String> LKHQuestion = new ArrayList<String>();
    ArrayList<Choice> LKHChoices = new ArrayList<Choice>();
    
    
    public void initializeLPEQ(){
        
         String lkhQ1 = "What is the name of the current Queen of Denmark?";
         
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
         
         
         String lkhQ2 = "What is the national dish of Denmark?";
         
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
         
         
         String lkhQ3 = "Which island is the biggest in Denmark?";
         
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
         
         
         String lkhQ4 = "Which bird is the Danish national bird?";
         
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
         
         
         String lkhQ5 = "When was Denmark liberated after WW2?";
         
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
         
         
         
         LKHQuestion.add(lkhQ1);
         LKHChoices.add(lkhQ1C1);
         LKHChoices.add(lkhQ1C2);
         LKHChoices.add(lkhQ1C3);
         LKHChoices.add(lkhQ1C4);
        
         LKHQuestion.add(lkhQ2);
         LKHChoices.add(lkhQ2C1);
         LKHChoices.add(lkhQ2C2);
         LKHChoices.add(lkhQ2C3);
         LKHChoices.add(lkhQ2C4);
         
         LKHQuestion.add(lkhQ3);
         LKHChoices.add(lkhQ3C1);
         LKHChoices.add(lkhQ3C2);
         LKHChoices.add(lkhQ3C3);
         LKHChoices.add(lkhQ3C4);
         
         LKHQuestion.add(lkhQ4);
         LKHChoices.add(lkhQ4C1);
         LKHChoices.add(lkhQ4C2);
         LKHChoices.add(lkhQ4C3);
         LKHChoices.add(lkhQ4C4);
         
         LKHQuestion.add(lkhQ5);
         LKHChoices.add(lkhQ5C1);
         LKHChoices.add(lkhQ5C2);
         LKHChoices.add(lkhQ5C3);
         LKHChoices.add(lkhQ5C4);
         
    }
    
    
    
   
    
    
    public void askQuestion(){
        
    }
   
}
