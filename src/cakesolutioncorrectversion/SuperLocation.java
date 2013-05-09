/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesolutioncorrectversion;

//import apple.laf.JRSUIConstants;
import cakesolutioncorrectversion.Location;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The class 'SuperLocation' is a super class, which implements Location. It's
 * purpose is to create the methods for placing the locations in relation to
 * each other. It also contains methods that hold information about the
 * different locations.
 *
 * @author CakeSolutionGroup
 * @version 1.0 (1 May 2013)
 */
abstract class SuperLocation implements Location {

    private Location neighbor;
    Random r = new Random();
    ArrayList<Question> questionList = new ArrayList<Question>();

    /**
     * Class constructor that initializes the questions for the location.
     */
    public SuperLocation() {

        initializeQuestionList();

    }

    abstract void initializeQuestionList();

    /**
     * getQuestionList method that returns question list for the location.
     *
     * @return questionList
     */
    @Override
    public ArrayList<Question> getQuestionList() {

        return questionList;
    }

    public Question getRandomQuestion() {

        int randomNumber = r.nextInt(questionList.size());
        Question q = questionList.get(randomNumber);
        questionList.remove(randomNumber);

        return q;
    }

    /**
     *
     * @param l
     * @return neighbor of type location
     */
    @Override
    public void setNeighbor(Location l) {
        neighbor = l;
    }

    /**
     * @param null
     * @return null
     */
    @Override
    public Location getNeighbor() {
        return neighbor;

    }
}
