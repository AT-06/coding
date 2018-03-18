package org.fundacionjala.coding.manuel;

/**
 * Created by Administrator on 3/13/2018.
 */
public class Kata11 {
    private static final int PERCENTAJE = 100;

    /**
     * Method to determine the days until evapor will be usefull.
     * @param content .
     * @param evapPerDay .
     * @param threshold .
     * @return c days to evapor.
     */
    public int evaporator(double content, double evapPerDay, double threshold) {
        double percent = content * (threshold / PERCENTAJE);
        int c = 0;
        while (content > percent) {
            content -= content * (evapPerDay / PERCENTAJE);
            c++;
        }
        return c;
    }
}
