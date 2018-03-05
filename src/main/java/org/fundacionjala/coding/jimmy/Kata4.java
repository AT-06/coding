package org.fundacionjala.coding.jimmy;

/**
 * Class for implementing digitalRoot method.
 */
public class Kata4 {

    private static final int THRESHOLD = 10;

    /**
     * Recursive method for getting the digital root.
     *
     * @param number integer value.
     * @return is going to return the digital root of a number.
     */
    public int digitalRoot(int number) {
        int baseAccumulator = 0;
        if (number < THRESHOLD) {
            return number;
        }
        for (int i = number; i != 0; i /= THRESHOLD) {
            baseAccumulator += i % THRESHOLD;
        }
        return digitalRoot(baseAccumulator);
    }
}
