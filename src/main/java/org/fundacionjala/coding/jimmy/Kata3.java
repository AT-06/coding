package org.fundacionjala.coding.jimmy;

/**
 * Class created for developing the persistence bugger method.
 */
public class Kata3 {

    private static final int THRESHOLD = 10;

    /**
     * This method is going to return the number of the persistence bugger.
     *
     * @param number is an integer value to be calculated.
     * @return the total of the persistence bugger.
     */
    public int persistence(int number) {
        int base = 1;
        if (number < THRESHOLD) {
            return 0;
        }
        for (int i = number; i != 0; i /= THRESHOLD) {
            base *= i % THRESHOLD;
        }
        return persistence(base) + 1;
    }
}
