package cakesolutioncorrectversion;

import cakesolutioncorrectversion.Location;
import java.util.ArrayList;
import java.util.List;

/**
 * This class generates an arrayList called myLocations which adds all existing
 * locations in the game. i.e : Baklavaci The class also implements the
 * interface World.
 *
 * @author CakeSolutionGroup
 * @since (01 may 2013)
 */
public class Cakistan implements World {

    List<Location> myLocations = new ArrayList<Location>();

    /**
     * This creates a list of all the locations and connects to World
     *
     */
    public Cakistan() {
        Location baklavaci = new Baklavaci();
        Location lagkagehuset = new Lagkagehuset();
        Location lePetiteEclaire = new LePetiteEclaire();
        myLocations.add(baklavaci);
        myLocations.add(lagkagehuset);
        myLocations.add(lePetiteEclaire);

        baklavaci.setNeighbor(lagkagehuset);
        lagkagehuset.setNeighbor(lePetiteEclaire);
        lePetiteEclaire.setNeighbor(baklavaci);

    }

    /**
     *
     * @return
     */
    public boolean isOutOfQuestions() {

        for (int i = 0; i < myLocations.size(); i++) {

            boolean isEmpty = myLocations.get(i).getQuestionList().isEmpty();
            if (!isEmpty) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method getLocations that returns arrayList myLocations.
     *
     * @return myLocations of type arrayList
     */
    @Override
    public List<Location> getLocations() {
        return myLocations;
    }
}
