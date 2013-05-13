
package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Class Baklavaci extends a superclass SuperLocation which that class
 * implements the interface Location. This class represents one of the locations
 * of the game. it initializes questionList of its own, and it has a description
 * of which world the player is at.
 *
 * @author Cakesolutiongroup
 * @version 1.0
 * @since ( 01 may 2013)
 */
public class Baklavaci extends SuperLocation {

    /**
     * getDescription method that returns the name of the world the player is
     * at.
     *
     * @return String "Baklavaci" - the name of the world where the player is
     * at.
     */
    @Override
    public String getDescription() {
        return "Baklavaci";
    }

    /**
     * Method initializeBQ that generates questions and choices for the world,
     * Baklavaci.
     *
     */
    public void initializeQuestionList() {

        Question q1 = new Question("On which continent does Turkey lie?");

        Choice bQ1C1 = new Choice();
        bQ1C1.choice = "Asia";
        bQ1C1.isCorrectChoice = false;

        Choice bQ1C2 = new Choice();
        bQ1C2.choice = "Europe";
        bQ1C2.isCorrectChoice = false;

        Choice bQ1C3 = new Choice();
        bQ1C3.choice = "Europe and Asia";
        bQ1C3.isCorrectChoice = true;

        Choice bQ1C4 = new Choice();
        bQ1C4.choice = "Middle East";
        bQ1C4.isCorrectChoice = false;

        questionList.add(q1);
        q1.choices.add(bQ1C1);
        q1.choices.add(bQ1C2);
        q1.choices.add(bQ1C3);
        q1.choices.add(bQ1C4);

        Question q2 = new Question("What is the name of the Turkish capital?");

        Choice bQ2C1 = new Choice();
        bQ2C1.choice = "Istanbul";
        bQ2C1.isCorrectChoice = false;

        Choice bQ2C2 = new Choice();
        bQ2C2.choice = "Ankara";
        bQ2C2.isCorrectChoice = true;

        Choice bQ2C3 = new Choice();
        bQ2C3.choice = "Marmaris";
        bQ2C3.isCorrectChoice = false;

        Choice bQ2C4 = new Choice();
        bQ2C4.choice = "Izmir";
        bQ2C4.isCorrectChoice = false;

        questionList.add(q2);
        q2.choices.add(bQ2C1);
        q2.choices.add(bQ2C2);
        q2.choices.add(bQ2C3);
        q2.choices.add(bQ2C4);

        Question q3 = new Question("What is Hamam?");

        Choice bQ3C1 = new Choice();
        bQ3C1.choice = "Turkish bath";
        bQ3C1.isCorrectChoice = true;

        Choice bQ3C2 = new Choice();
        bQ3C2.choice = "A dessert";
        bQ3C2.isCorrectChoice = false;

        Choice bQ3C3 = new Choice();
        bQ3C3.choice = "A sport discipline";
        bQ3C3.isCorrectChoice = false;

        Choice bQ3C4 = new Choice();
        bQ3C4.choice = "A casserole dish";
        bQ3C4.isCorrectChoice = false;

        questionList.add(q3);
        q3.choices.add(bQ3C1);
        q3.choices.add(bQ3C2);
        q3.choices.add(bQ3C3);
        q3.choices.add(bQ3C4);
        
        Question q4 = new Question("What is baklava?");
        
        Choice bQ4C1 = new Choice();
        bQ4C1.choice = "A sweet dessert";
        bQ4C1.isCorrectChoice = true;
        
        Choice bQ4C2 = new Choice();
        bQ4C2.choice = "A strong and bitter coffee";
        bQ4C2.isCorrectChoice = false;
        
        Choice bQ4C3 = new Choice();
        bQ4C3.choice = "A spicy alcoholic drink";
        bQ4C3.isCorrectChoice = false;
        
        Choice bQ4C4 = new Choice();
        bQ4C4.choice = "A tangy breakfast treat";
        bQ4C4.isCorrectChoice = false;
        
        questionList.add(q4);
        q4.choices.add(bQ4C1);
        q4.choices.add(bQ4C2);
        q4.choices.add(bQ4C3);
        q4.choices.add(bQ4C4);
        
        Question q5 = new Question("What is the national sport of Turkey?");
        
        Choice bQ5C1 = new Choice();
        bQ5C1.choice = "Football";
        bQ5C1.isCorrectChoice = false;
        
        Choice bQ5C2 = new Choice();
        bQ5C2.choice = "Oil wrestling";
        bQ5C2.isCorrectChoice = true;
        
        Choice bQ5C3 = new Choice();
        bQ5C3.choice = "Weightlifting";
        bQ5C3.isCorrectChoice = false;
        
        Choice bQ5C4 = new Choice();
        bQ5C4.choice = "Football";
        bQ5C4.isCorrectChoice = false;
        
        questionList.add(q5);
        q5.choices.add(bQ5C1);
        q5.choices.add(bQ5C2);
        q5.choices.add(bQ5C3);
        q5.choices.add(bQ5C4);
        
        Question q6 = new Question("When was the Republic of Turkey founded?");
        
        Choice bQ6C1 = new Choice();
        bQ6C1.choice = "1823";
        bQ6C1.isCorrectChoice = false;
        
        Choice bQ6C2 = new Choice();
        bQ6C2.choice = "1868";
        bQ6C2.isCorrectChoice = false;
        
        Choice bQ6C3 = new Choice();
        bQ6C3.choice = "1923";
        bQ6C3.isCorrectChoice = true;
        
        Choice bQ6C4 = new Choice();
        bQ6C4.choice = "1945";
        bQ6C4.isCorrectChoice = false;
        
        questionList.add(q6);
        q6.choices.add(bQ6C1);
        q6.choices.add(bQ6C2);
        q6.choices.add(bQ6C3);
        q6.choices.add(bQ6C4);

    }
}
