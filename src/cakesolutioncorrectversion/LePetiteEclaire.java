/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class LePetiteEclaire extends SuperLocation implements Location {
     
    ArrayList<Question> questionList = new ArrayList<Question>();
    /** This refers to the enumerated directions given in Location, 
     * and we can specify which specific directions we intend to be
     * usable in LePetiteEclaire */
     
    public LePetiteEclaire(){
    
        initializeLPEQ();
    
    }
    
    
    public ArrayList<Question> getQuestionList(){
  
         return questionList;
     }
    
    @Override
    public List<Location> getExits(Location.Direction direction) {
    return null;   
    }
    
       /** This is the description of the location LePetiteEclaire */
      @Override
    public String getDescription() {
            return "Le Petite Eclaire";
    }
      public void initializeLPEQ(){
        
        Question q1  = new Question("What is the name of the current French republic?");
        
        Choice LPEQ1C1 = new Choice();
        LPEQ1C1.choice = "The Third Republic";
        LPEQ1C1.isCorrectChoice = false;
         
        Choice LPEQ1C2 = new Choice();
        LPEQ1C2.choice = "The Fourth Republic";
        LPEQ1C2.isCorrectChoice = false;
         
        Choice LPEQ1C3 = new Choice();
        LPEQ1C3.choice = "The Fifth Republic";
        LPEQ1C3.isCorrectChoice = true;
         
        Choice LPEQ1C4 = new Choice();
        LPEQ1C4.choice = "The Sixth Republic";
        LPEQ1C4.isCorrectChoice = false;
        
        questionList.add(q1);
        q1.choices.add(LPEQ1C1);
        q1.choices.add(LPEQ1C2);
        q1.choices.add(LPEQ1C3);
        q1.choices.add(LPEQ1C4);



        Question q2 = new Question("What is the Bastille Day?");
        
        Choice LPEQ2C1 = new Choice();
        LPEQ2C1.choice = "The National Day";
        LPEQ2C1.isCorrectChoice = true;
         
        Choice LPEQ2C2 = new Choice();
        LPEQ2C2.choice = "An extended shopping day";
        LPEQ2C2.isCorrectChoice = false;
         
        Choice LPEQ2C3 = new Choice();
        LPEQ2C3.choice = "The liberation of France in WW2";
        LPEQ2C3.isCorrectChoice = false;
         
        Choice LPEQ2C4 = new Choice();
        LPEQ2C4.choice = "The occupation of France in WW2";
        LPEQ2C4.isCorrectChoice = false;
        
        questionList.add(q2);
        q1.choices.add(LPEQ2C1);
        q1.choices.add(LPEQ2C2);
        q1.choices.add(LPEQ2C3);
        q1.choices.add(LPEQ2C4);
        
        
        Question q3 = new Question("How many regional languages is there in France?");
        
        Choice LPEQ3C1 = new Choice();
        LPEQ3C1.choice = "2";
        LPEQ3C1.isCorrectChoice = false;
         
        Choice LPEQ3C2 = new Choice();
        LPEQ3C2.choice = "5";
        LPEQ3C2.isCorrectChoice = false;
         
        Choice LPEQ3C3 = new Choice();
        LPEQ3C3.choice = "7";
        LPEQ3C3.isCorrectChoice = true;
         
        Choice LPEQ3C4 = new Choice();
        LPEQ2C4.choice = "9";
        LPEQ2C4.isCorrectChoice = false;
        
        questionList.add(q3);
        q1.choices.add(LPEQ3C1);
        q1.choices.add(LPEQ3C2);
        q1.choices.add(LPEQ3C3);
        q1.choices.add(LPEQ3C4);
                
    }
    

   
}
