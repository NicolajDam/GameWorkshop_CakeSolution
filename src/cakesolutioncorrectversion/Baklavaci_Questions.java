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
    ArrayList<Baklavaci_Choice> BChoices = new ArrayList<Baklavaci_Choice>();
    
    public void initializeBQ(){
        
         String BQ1 = "On which continent does Tyrkey lie?";
         
         Baklavaci_Choice BQ1C1 = new Baklavaci_Choice();
         BQ1C1.Bchoice = "Asia";
         BQ1C1.BisCorrectChoice = false;
         
         Baklavaci_Choice BQ1C2 = new Baklavaci_Choice();
         BQ1C2.Bchoice = "Europe";
         BQ1C2.BisCorrectChoice = false;
         
         Baklavaci_Choice BQ1C3 = new Baklavaci_Choice();
         BQ1C3.Bchoice = "Europe and Asia";
         BQ1C3.BisCorrectChoice = true;
         
         Baklavaci_Choice BQ1C4 = new Baklavaci_Choice();
         BQ1C4.Bchoice = "Middle East";
         BQ1C4.BisCorrectChoice = false;
         
         
         String BQ2 = "What is the name of the Turkish capital?";
         
         Baklavaci_Choice BQ2C1 = new Baklavaci_Choice();
         BQ2C1.Bchoice = "Istanbul";
         BQ2C1.BisCorrectChoice = false;
         
         Baklavaci_Choice BQ2C2 = new Baklavaci_Choice();
         BQ2C2.Bchoice = "Ankara";
         BQ2C2.BisCorrectChoice = true;
         
         Baklavaci_Choice BQ2C3 = new Baklavaci_Choice();
         BQ2C3.Bchoice = "Marmaris";
         BQ2C3.BisCorrectChoice = false;
         
         Baklavaci_Choice BQ2C4 = new Baklavaci_Choice();
         BQ2C4.Bchoice = "Izmir";
         BQ2C4.BisCorrectChoice = false;
         
           
         String BQ3 = "What is Harman?";
         
         Baklavaci_Choice BQ3C1 = new Baklavaci_Choice();
         BQ3C1.Bchoice = "Turkish bath";
         BQ3C1.BisCorrectChoice = true;
         
         Baklavaci_Choice BQ3C2 = new Baklavaci_Choice();
         BQ3C2.Bchoice = "A dessert";
         BQ3C2.BisCorrectChoice = false;
         
         Baklavaci_Choice BQ3C3 = new Baklavaci_Choice();
         BQ3C3.Bchoice = "A sport discipline";
         BQ3C3.BisCorrectChoice = false;
         
         Baklavaci_Choice BQ3C4 = new Baklavaci_Choice();
         BQ3C4.Bchoice = "A casserole dish";
         BQ3C4.BisCorrectChoice = false;
         
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
