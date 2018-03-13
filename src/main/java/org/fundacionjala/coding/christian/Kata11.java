package org.fundacionjala.coding.christian;

/**
 * Developer by Christian.
 */
public class Kata11 {
        private static final int ZER0 = 0;
        private static final int PERCENT = 100;

        /**
         * @param content  .
         * @param evapPerDay .
         * @param threshold .
         * @return int
         */
    public int evaporator(double content, double evapPerDay, double threshold) {
        double percent = content * (threshold / PERCENT);
        int c = ZER0;
        while (content > percent) {
            content -= content * (evapPerDay / PERCENT);
            c++;
        }
        return c;
    }
}
