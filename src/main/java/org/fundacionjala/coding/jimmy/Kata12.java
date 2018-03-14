package org.fundacionjala.coding.jimmy;

/**
 * This class is in order to develop the getScore method.
 */
public class Kata12 {

    private static final int CONSTANT = 50;
    private static final int MIN_NUMBER = 1;

    /**
     * This method is going to return the number of the series.
     *
     * @param number the number to calculate.
     * @return the number of the series calculated.
     */
    public int getScore(int number) {
        if (number == MIN_NUMBER) {
            return CONSTANT;
        }
        return getScore(number - 1) + CONSTANT * number;
    }
}
