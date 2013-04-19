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
    ArrayList<Lagkagehuset_Choice> LKHChoices = new ArrayList<Lagkagehuset_Choice>();
    
    
    public void initializeLPEQ(){
        
         String lkhQ1 = "What is the name of the current Queen of Denmark?";
         
         Lagkagehuset_Choice lkhQ1C1 = new Lagkagehuset_Choice();
         lkhQ1C1.LKHchoice = "Margrethe";
         lkhQ1C1.LKHisCorrectChoice = true;
         
         Lagkagehuset_Choice lkhQ1C2 = new Lagkagehuset_Choice();
         lkhQ1C2.LKHchoice = "Ingrid";
         lkhQ1C2.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ1C3 = new Lagkagehuset_Choice();
         lkhQ1C3.LKHchoice = "Beatrice";
         lkhQ1C3.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ1C4 = new Lagkagehuset_Choice();
         lkhQ1C4.LKHchoice = "Mary";
         lkhQ1C4.LKHisCorrectChoice = false;
         
         
         String lkhQ2 = "What is the national dish of Denmark?";
         
         Lagkagehuset_Choice lkhQ2C1 = new Lagkagehuset_Choice();
         lkhQ2C1.LKHchoice = "A Danish";
         lkhQ2C1.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ2C2 = new Lagkagehuset_Choice();
         lkhQ2C2.LKHchoice = "Shooting Star";
         lkhQ2C2.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ2C3 = new Lagkagehuset_Choice();
         lkhQ2C3.LKHchoice = "Meatballs";
         lkhQ2C3.LKHisCorrectChoice = true;
         
         Lagkagehuset_Choice lkhQ2C4 = new Lagkagehuset_Choice();
         lkhQ2C4.LKHchoice = "Open-faced sandwiches";
         lkhQ2C4.LKHisCorrectChoice = false;
         
         
         String lkhQ3 = "Which island is the biggest in Denmark?";
         
         Lagkagehuset_Choice lkhQ3C1 = new Lagkagehuset_Choice();
         lkhQ3C1.LKHchoice = "Greenland";
         lkhQ3C1.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ3C2 = new Lagkagehuset_Choice();
         lkhQ3C2.LKHchoice = "Zealand";
         lkhQ3C2.LKHisCorrectChoice = true;
         
         Lagkagehuset_Choice lkhQ3C3 = new Lagkagehuset_Choice();
         lkhQ3C3.LKHchoice = "Funen";
         lkhQ3C3.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ3C4 = new Lagkagehuset_Choice();
         lkhQ3C4.LKHchoice = "Vendsyssel-Thy";
         lkhQ3C4.LKHisCorrectChoice = false;
         
         
         String lkhQ4 = "Which bird is the Danish national bird?";
         
         Lagkagehuset_Choice lkhQ4C1 = new Lagkagehuset_Choice();
         lkhQ4C1.LKHchoice = "The alaudidae lark";
         lkhQ4C1.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ4C2 = new Lagkagehuset_Choice();
         lkhQ4C2.LKHchoice = "the mute swan";
         lkhQ4C2.LKHisCorrectChoice = true;
         
         Lagkagehuset_Choice lkhQ4C3 = new Lagkagehuset_Choice();
         lkhQ4C3.LKHchoice = "the shiny blackbird";
         lkhQ4C3.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ4C4 = new Lagkagehuset_Choice();
         lkhQ4C4.LKHchoice = "the red swallow";
         lkhQ4C4.LKHisCorrectChoice = false;
         
         
         String lkhQ5 = "When was Denmark liberated after WW2?";
         
         Lagkagehuset_Choice lkhQ5C1 = new Lagkagehuset_Choice();
         lkhQ5C1.LKHchoice = "may 4th 1945";
         lkhQ5C1.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ5C2 = new Lagkagehuset_Choice();
         lkhQ5C2.LKHchoice = "july 18th 1945";
         lkhQ5C2.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ5C3 = new Lagkagehuset_Choice();
         lkhQ5C3.LKHchoice = "june 7th 1945";
         lkhQ5C3.LKHisCorrectChoice = false;
         
         Lagkagehuset_Choice lkhQ5C4 = new Lagkagehuset_Choice();
         lkhQ5C4.LKHchoice = "may 5th 1945";
         lkhQ5C4.LKHisCorrectChoice = true;
         
         
         
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
