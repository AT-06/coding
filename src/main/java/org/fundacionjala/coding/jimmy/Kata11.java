package org.fundacionjala.coding.jimmy;

/**
 * This class is in order to develop evaporator method.
 */
public class Kata11 {
    private static final int PERCENTAGE = 100;

    /**
     * Method to determine the amount of days on which the evaporator will be out of use.
     *
     * @param contentMl is the content of the evaporator.
     * @param evaporeDay is the percentage of gas lost every day.
     * @param threshold is the percentage beyond the evaporator which the evaporator is no longer useful.
     * @return the amount of days.
     */
    public int evaporator(double contentMl, double evaporeDay, double threshold) {

        double percent = contentMl * (threshold / PERCENTAGE);
        int counterDays = 0;
        while (contentMl > percent) {
            contentMl -= contentMl * evaporeDay / PERCENTAGE;
            counterDays++;
        }
        return counterDays;
    }
}
