package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata12 is a class that contains a getScore method
 */
public class Kata12 {
    private static final int MIN = 1;
    private static final int FIFTY = 50;

    /**
     * @param number This is a number.
     * @return getScore of the number
     */
    public int getScore(int number) {
        return number == MIN ? FIFTY : number * FIFTY + getScore(number - MIN);

    }
}
