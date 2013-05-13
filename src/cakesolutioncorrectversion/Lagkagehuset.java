package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Lagkagehuset extends a superclass SuperLocation, which implements the
 * interface Location. Lagkagehuset initializes a questionList and has a
 * description of which location the player is at.
 *
 * @author CakeSolutionGroup
 * @version 1.0
 * @since (01 may 2013)
 */
public class Lagkagehuset extends SuperLocation {

    /**
     * This is the description of the location Lagkagehuset.
     *
     * @param Null
     * @return String Lagkagehuset.
     */
    @Override
    public String getDescription() {
        return "Lagkagehuset";
    }

    /**
     * Method initializeQuestions that generates questions and choices for the
     * world, Lagkagehuset.
     *
     * @return Null
     * @param Null
     *
     */
    public void initializeQuestionList() {

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
        q2.choices.add(lkhQ2C1);
        q2.choices.add(lkhQ2C2);
        q2.choices.add(lkhQ2C3);
        q2.choices.add(lkhQ2C4);

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
        q3.choices.add(lkhQ3C1);
        q3.choices.add(lkhQ3C2);
        q3.choices.add(lkhQ3C3);
        q3.choices.add(lkhQ3C4);

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
        q4.choices.add(lkhQ4C1);
        q4.choices.add(lkhQ4C2);
        q4.choices.add(lkhQ4C3);
        q4.choices.add(lkhQ4C4);

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
        q5.choices.add(lkhQ5C1);
        q5.choices.add(lkhQ5C2);
        q5.choices.add(lkhQ5C3);
        q5.choices.add(lkhQ5C4);
        
        Question q6 = new Question("When did Copenhagen become the capital of Denmark?");
        
        Choice lkhQ6C1 = new Choice();
        lkhQ6C1.choice = "Mid 14th century";
        lkhQ6C1.isCorrectChoice = false;
        
        Choice lkhQ6C2 = new Choice();
        lkhQ6C2.choice = "Mid 15th century";
        lkhQ6C2.isCorrectChoice = true;
        
        Choice lkhQ6C3 = new Choice();
        lkhQ6C3.choice = "Mid 16th century";
        lkhQ6C3.isCorrectChoice = false;
        
        Choice lkhQ6C4 = new Choice();
        lkhQ6C4.choice = "Mid 17th century";
        lkhQ6C4.isCorrectChoice = false;
        
        questionList.add(q6);
        q6.choices.add(lkhQ6C1);
        q6.choices.add(lkhQ6C2);
        q6.choices.add(lkhQ6C3);
        q6.choices.add(lkhQ6C4);
        
        Question q7 = new Question("Why did hamlet say that \"something was rotten in the State of Denmark\"? ");
        
        Choice lkhQ7C1 = new Choice();
        lkhQ7C1.choice = "He disliked the smell of fish";
        lkhQ7C1.isCorrectChoice = false;
        
        Choice lkhQ7C2 = new Choice();
        lkhQ7C2.choice = "All was not well at the top of the political hierarchy";
        lkhQ7C2.isCorrectChoice = true;
        
        Choice lkhQ7C3 = new Choice();
        lkhQ7C3.choice = "He wanted a warmer climate";
        lkhQ7C3.isCorrectChoice = false;
        
        Choice lkhQ7C4 = new Choice();
        lkhQ7C4.choice = "He was no fan of bacon";
        lkhQ7C4.isCorrectChoice = false;
        
        questionList.add(q7);
        q7.choices.add(lkhQ7C1);
        q7.choices.add(lkhQ7C2);
        q7.choices.add(lkhQ7C3);
        q7.choices.add(lkhQ7C4);
        
        Question q8 = new Question("When was H. C. Andersen born?");
        
        Choice lkhQ8C1 = new Choice();
        lkhQ8C1.choice = "1792";
        lkhQ8C1.isCorrectChoice = false;
        
        Choice lkhQ8C2 = new Choice();
        lkhQ8C2.choice = "1802";
        lkhQ8C2.isCorrectChoice = true;
        
        Choice lkhQ8C3 = new Choice();
        lkhQ8C3.choice = "1812";
        lkhQ8C3.isCorrectChoice = false;
        
        Choice lkhQ8C4 = new Choice();
        lkhQ8C4.choice = "1822";
        lkhQ8C4.isCorrectChoice = false;
        
        questionList.add(q8);
        q8.choices.add(lkhQ8C1);
        q8.choices.add(lkhQ8C2);
        q8.choices.add(lkhQ8C3);
        q8.choices.add(lkhQ8C4);
        
        Question q9 = new Question("Which programming language was invented by the Dane Bjarne Stroustrup?");
        
        Choice lkhQ9C1 = new Choice();
        lkhQ9C1.choice = "PHP";
        lkhQ9C1.isCorrectChoice = false;
        
        Choice lkhQ9C2 = new Choice();
        lkhQ9C2.choice = "C++";
        lkhQ9C2.isCorrectChoice = true;
        
        Choice lkhQ9C3 = new Choice();
        lkhQ9C3.choice = "C#";
        lkhQ9C3.isCorrectChoice = false;
        
        Choice lkhQ9C4 = new Choice();
        lkhQ9C4.choice = "Perl";
        lkhQ9C4.isCorrectChoice = false;
        
        questionList.add(q9);
        q9.choices.add(lkhQ9C1);
        q9.choices.add(lkhQ9C2);
        q9.choices.add(lkhQ9C3);
        q9.choices.add(lkhQ9C4);
        
    }
}
