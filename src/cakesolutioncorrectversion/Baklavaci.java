

package cakesolutioncorrectversion;

import java.util.ArrayList;
import java.util.List;

/**

 
 * Class Baklavaci extends a superclass called SuperLocation which that class
 * implements the interface called Location. This class initializes questionList
 * of its own, and it has a description of which world the player is at.
 * @author Cakesolutiongroup
 * @version 1.0
 * @since ( 01 may 2013)
*/
 
public class Baklavaci extends SuperLocation {

    ArrayList<Question> questionList = new ArrayList<Question>();

  
    public Baklavaci() {

        initializeBQ();
    }

    @Override
    public ArrayList<Question> getQuestionList() {

        return questionList;
    }

    @Override
    public String getDescription() {
        return "Baklavaci";
    }


    public void initializeBQ() {

        Question q1 = new Question("On which continent does Turkey lie?");

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

        questionList.add(q1);
        q1.choices.add(BQ1C1);
        q1.choices.add(BQ1C2);
        q1.choices.add(BQ1C3);
        q1.choices.add(BQ1C4);

        Question q2 = new Question("What is the name of the Turkish capital?");

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

        questionList.add(q2);
        q2.choices.add(BQ2C1);
        q2.choices.add(BQ2C2);
        q2.choices.add(BQ2C3);
        q2.choices.add(BQ2C4);

        Question q3 = new Question("What is Harman?");

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

        questionList.add(q3);
        q3.choices.add(BQ3C1);
        q3.choices.add(BQ3C2);
        q3.choices.add(BQ3C3);
        q3.choices.add(BQ3C4);

    }
}
