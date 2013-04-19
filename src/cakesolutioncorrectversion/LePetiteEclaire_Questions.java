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
public class LePetiteEclaire_Questions implements Questions {
   
    
    ArrayList<String> LPEQuestion = new ArrayList<String>();
    ArrayList<LePetiteEclaire_Choice> LPEChoices = new ArrayList<LePetiteEclaire_Choice>();
    
    
    public void initializeLPEQ(){
        
        String LPEQ1 = "What is the name of the current French republic?";
        
        LePetiteEclaire_Choice LPEQ1C1 = new LePetiteEclaire_Choice();
        LPEQ1C1.LPEchoice = "The Third Republic";
        LPEQ1C1.LPEisCorrectChoice = false;
         
        LePetiteEclaire_Choice LPEQ1C2 = new LePetiteEclaire_Choice();
        LPEQ1C2.LPEchoice = "The Fourth Republic";
        LPEQ1C2.LPEisCorrectChoice = false;
         
        LePetiteEclaire_Choice LPEQ1C3 = new LePetiteEclaire_Choice();
        LPEQ1C3.LPEchoice = "The Fifth Republic";
        LPEQ1C3.LPEisCorrectChoice = true;
         
        LePetiteEclaire_Choice LPEQ1C4 = new LePetiteEclaire_Choice();
        LPEQ1C4.LPEchoice = "The Sixth Republic";
        LPEQ1C4.LPEisCorrectChoice = false;
        
        
        String LPEQ2 = "What is the Bastille Day?";
        
        LePetiteEclaire_Choice LPEQ2C1 = new LePetiteEclaire_Choice();
        LPEQ2C1.LPEchoice = "The National Day";
        LPEQ2C1.LPEisCorrectChoice = true;
         
        LePetiteEclaire_Choice LPEQ2C2 = new LePetiteEclaire_Choice();
        LPEQ2C2.LPEchoice = "An extended shopping day";
        LPEQ2C2.LPEisCorrectChoice = false;
         
        LePetiteEclaire_Choice LPEQ2C3 = new LePetiteEclaire_Choice();
        LPEQ2C3.LPEchoice = "The liberation of France in WW2";
        LPEQ2C3.LPEisCorrectChoice = false;
         
        LePetiteEclaire_Choice LPEQ2C4 = new LePetiteEclaire_Choice();
        LPEQ2C4.LPEchoice = "The occupation of France in WW2";
        LPEQ2C4.LPEisCorrectChoice = false;
        
        
        String LPEQ3 = "How many regional languages is there in France?";
        
        LePetiteEclaire_Choice LPEQ3C1 = new LePetiteEclaire_Choice();
        LPEQ3C1.LPEchoice = "2";
        LPEQ3C1.LPEisCorrectChoice = false;
         
        LePetiteEclaire_Choice LPEQ3C2 = new LePetiteEclaire_Choice();
        LPEQ3C2.LPEchoice = "5";
        LPEQ3C2.LPEisCorrectChoice = false;
         
        LePetiteEclaire_Choice LPEQ3C3 = new LePetiteEclaire_Choice();
        LPEQ3C3.LPEchoice = "7";
        LPEQ3C3.LPEisCorrectChoice = true;
         
        LePetiteEclaire_Choice LPEQ3C4 = new LePetiteEclaire_Choice();
        LPEQ2C4.LPEchoice = "9";
        LPEQ2C4.LPEisCorrectChoice = false;
        
        
        LPEQuestion.add(LPEQ1);
        LPEChoices.add(LPEQ1C1);
        LPEChoices.add(LPEQ1C2);
        LPEChoices.add(LPEQ1C3);
        LPEChoices.add(LPEQ1C4);
        
        LPEQuestion.add(LPEQ2);
        LPEChoices.add(LPEQ2C1);
        LPEChoices.add(LPEQ2C2);
        LPEChoices.add(LPEQ2C3);
        LPEChoices.add(LPEQ2C4);
        
        LPEQuestion.add(LPEQ3);
        LPEChoices.add(LPEQ3C1);
        LPEChoices.add(LPEQ3C2);
        LPEChoices.add(LPEQ3C3);
        LPEChoices.add(LPEQ3C4);
    }
    
    
    
    
    public void askQuestion(){
        
        
    }
}
