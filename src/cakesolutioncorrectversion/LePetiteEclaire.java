package cakesolutioncorrectversion;

import java.util.List;
import java.util.ArrayList;

/**
 * Class LePetiteEclaire extends a superclass SuperLocation which that class
 * implements the interface Location. This class initializes questionList of its
 * own, and it has a description of which world the player is at.
 *
 * @author CakeSolutionGroup
 * @version 1.0
 * @since (01 may 2013)
 */
public class LePetiteEclaire extends SuperLocation {

    /**
     * This is the description of the location LePetiteEclaire
     *
     * @return String Le petite Eclaire.
     */
    @Override
    public String getDescription() {
        return "Le Petite Eclaire";
    }

    /**
     * Method initializeLPEQ that generates questions and choices for the world,
     * LePetiteEclaire.
     *@return Null
     * @param Null
     */
    public void initializeQuestionList() {

        Question q1 = new Question("What is the name of the current French republic?");

        Choice lpeQ1C1 = new Choice();
        lpeQ1C1.choice = "The Third Republic";
        lpeQ1C1.isCorrectChoice = false;

        Choice lpeQ1C2 = new Choice();
        lpeQ1C2.choice = "The Fourth Republic";
        lpeQ1C2.isCorrectChoice = false;

        Choice lpeQ1C3 = new Choice();
        lpeQ1C3.choice = "The Fifth Republic";
        lpeQ1C3.isCorrectChoice = true;

        Choice lpeQ1C4 = new Choice();
        lpeQ1C4.choice = "The Sixth Republic";
        lpeQ1C4.isCorrectChoice = false;

        questionList.add(q1);
        q1.choices.add(lpeQ1C1);
        q1.choices.add(lpeQ1C2);
        q1.choices.add(lpeQ1C3);
        q1.choices.add(lpeQ1C4);


        Question q2 = new Question("What is the Bastille Day?");

        Choice lpeQ2C1 = new Choice();
        lpeQ2C1.choice = "The National Day";
        lpeQ2C1.isCorrectChoice = true;

        Choice lpeQ2C2 = new Choice();
        lpeQ2C2.choice = "An extended shopping day";
        lpeQ2C2.isCorrectChoice = false;

        Choice lpeQ2C3 = new Choice();
        lpeQ2C3.choice = "The liberation of France in WW2";
        lpeQ2C3.isCorrectChoice = false;

        Choice lpeQ2C4 = new Choice();
        lpeQ2C4.choice = "The occupation of France in WW2";
        lpeQ2C4.isCorrectChoice = false;

        questionList.add(q2);
        q2.choices.add(lpeQ2C1);
        q2.choices.add(lpeQ2C2);
        q2.choices.add(lpeQ2C3);
        q2.choices.add(lpeQ2C4);


        Question q3 = new Question("How many regional languages is there in France?");

        Choice lpeQ3C1 = new Choice();
        lpeQ3C1.choice = "2";
        lpeQ3C1.isCorrectChoice = false;

        Choice lpeQ3C2 = new Choice();
        lpeQ3C2.choice = "5";
        lpeQ3C2.isCorrectChoice = false;

        Choice lpeQ3C3 = new Choice();
        lpeQ3C3.choice = "7";
        lpeQ3C3.isCorrectChoice = true;

        Choice lpeQ3C4 = new Choice();
        lpeQ3C4.choice = "9";
        lpeQ3C4.isCorrectChoice = false;

        questionList.add(q3);
        q3.choices.add(lpeQ3C1);
        q3.choices.add(lpeQ3C2);
        q3.choices.add(lpeQ3C3);
        q3.choices.add(lpeQ3C4);

        Question q4 = new Question("The population of France is roughly: ");

        Choice lpeQ4C1 = new Choice();
        lpeQ4C1.choice = "52 million";
        lpeQ4C1.isCorrectChoice = false;

        Choice lpeQ4C2 = new Choice();
        lpeQ4C2.choice = "65 million";
        lpeQ4C2.isCorrectChoice = true;

        Choice lpeQ4C3 = new Choice();
        lpeQ4C3.choice = "78 million";
        lpeQ4C3.isCorrectChoice = false;

        Choice lpeQ4C4 = new Choice();
        lpeQ4C4.choice = "100 million";
        lpeQ4C4.isCorrectChoice = false;

        questionList.add(q4);
        q4.choices.add(lpeQ4C1);
        q4.choices.add(lpeQ4C2);
        q4.choices.add(lpeQ4C3);
        q4.choices.add(lpeQ4C4);

        Question q5 = new Question("France is: ");

        Choice lpeQ5C1 = new Choice();
        lpeQ5C1.choice = "The largest country in the EU";
        lpeQ5C1.isCorrectChoice = true;

        Choice lpeQ5C2 = new Choice();
        lpeQ5C2.choice = "Larger than Italy but smaller than Spain";
        lpeQ5C2.isCorrectChoice = false;

        Choice lpeQ5C3 = new Choice();
        lpeQ5C3.choice = "Twice as large as Germany";
        lpeQ5C3.isCorrectChoice = false;

        Choice lpeQ5C4 = new Choice();
        lpeQ5C4.choice = "As large as the state of Nevada";
        lpeQ5C4.isCorrectChoice = false;

        questionList.add(q5);
        q5.choices.add(lpeQ5C1);
        q5.choices.add(lpeQ5C2);
        q5.choices.add(lpeQ5C3);
        q5.choices.add(lpeQ5C4);

        Question q6 = new Question("Which three are the largest French cities?");

        Choice lpeQ6C1 = new Choice();
        lpeQ6C1.choice = "Paris, Nice, Lyon";
        lpeQ6C1.isCorrectChoice = false;

        Choice lpeQ6C2 = new Choice();
        lpeQ6C2.choice = "Paris, Marseille, Lille";
        lpeQ6C2.isCorrectChoice = false;

        Choice lpeQ6C3 = new Choice();
        lpeQ6C3.choice = "Paris, Lyon, Marseille";
        lpeQ6C3.isCorrectChoice = true;

        Choice lpeQ6C4 = new Choice();
        lpeQ6C4.choice = "Paris, Toulouse, Lille";
        lpeQ6C4.isCorrectChoice = false;

        questionList.add(q6);
        q6.choices.add(lpeQ6C1);
        q6.choices.add(lpeQ6C2);
        q6.choices.add(lpeQ6C3);
        q6.choices.add(lpeQ6C4);



    }
}
