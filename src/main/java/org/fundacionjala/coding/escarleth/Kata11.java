package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth L.
 * This class  contains a evaporator method
 */
public class Kata11 {
    private static final int PERCENTAGE = 100;

    /**
     * @param content    .
     * @param evapPerDay .
     * @param threshold  .
     * @return days to evapor(days until evapor will be usefull).
     */

    public int evaporator(double content, double evapPerDay, double threshold) {
        int days = 0;
        double percent = PERCENTAGE;
        while (percent > threshold) {
            percent -= percent * (evapPerDay / PERCENTAGE);
            days++;
        }
        return days;
    }
}
