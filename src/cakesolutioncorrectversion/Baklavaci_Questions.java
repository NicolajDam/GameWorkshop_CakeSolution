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
public class Baklavaci_Questions implements Questions {
    
    ArrayList<String> BQuestion = new ArrayList<String>();
    ArrayList<Choice> BChoices = new ArrayList<Choice>();
    
    public void initializeBQ(){
        
         String BQ1 = "On which continent does Tyrkey lie?";
         
         Choice BQ1C1 = new Choice();
         BQ1C1.choice = "Asia";
         BQ1C1.isCorrectChoice = false;
         
         Choice BQ1C2 = new Choice();
         BQ1C2.choice = "Europe";
         BQ1C2.isCorrectChoice = false;
         
         Choice BQ1C3 = new Choice();
         BQ1C3.choice = "Europe and Asia";
         BQ1C3.isCorrectChoice = true;
         
         Choice BQ1C4 = new Choice();
         BQ1C4.choice = "Middle East";
         BQ1C4.isCorrectChoice = false;
         
         
         String BQ2 = "What is the name of the Turkish capital?";
         
         Choice BQ2C1 = new Choice();
         BQ2C1.choice = "Istanbul";
         BQ2C1.isCorrectChoice = false;
         
         Choice BQ2C2 = new Choice();
         BQ2C2.choice = "Ankara";
         BQ2C2.isCorrectChoice = true;
         
         Choice BQ2C3 = new Choice();
         BQ2C3.choice = "Marmaris";
         BQ2C3.isCorrectChoice = false;
         
         Choice BQ2C4 = new Choice();
         BQ2C4.choice = "Izmir";
         BQ2C4.isCorrectChoice = false;
         
           
         String BQ3 = "What is Harman?";
         
         Choice BQ3C1 = new Choice();
         BQ3C1.choice = "Turkish bath";
         BQ3C1.isCorrectChoice = true;
         
         Choice BQ3C2 = new Choice();
         BQ3C2.choice = "A dessert";
         BQ3C2.isCorrectChoice = false;
         
         Choice BQ3C3 = new Choice();
         BQ3C3.choice = "A sport discipline";
         BQ3C3.isCorrectChoice = false;
         
         Choice BQ3C4 = new Choice();
         BQ3C4.choice = "A casserole dish";
         BQ3C4.isCorrectChoice = false;
         
         BQuestion.add(BQ1);
         BChoices.add(BQ1C1);
         BChoices.add(BQ1C2);
         BChoices.add(BQ1C3);
         BChoices.add(BQ1C4);
         
         BQuestion.add(BQ2);
         BChoices.add(BQ2C1);
         BChoices.add(BQ2C2);
         BChoices.add(BQ2C3);
         BChoices.add(BQ2C4);
         
         BQuestion.add(BQ3);
         BChoices.add(BQ3C1);
         BChoices.add(BQ3C2);
         BChoices.add(BQ3C3);
         BChoices.add(BQ3C4);
    }
    
    
    
    
    public void askQuestion(){
        
        
        
    }
    
}
