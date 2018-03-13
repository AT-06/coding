package org.fundacionjala.coding.omar;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * <p>
 * Sequence Kata12.
 * Have a look at the following numbers.
 * <p>
 * n | score
 * ---+-------
 * 1 |  50
 * 2 |  150
 * 3 |  300
 * 4 |  500
 * 5 |  750
 */

public class Kata12 {

    private static final int ZERO = 0;

    /**
     * This method return score of number.
     *
     * @param number .
     * @return result final score of number.
     */
    public long getScore(int number) {

        final int number50 = 50;
        final int number1 = 1;

        return number > ZERO ? number50 * number + getScore(number - number1) : ZERO;
    }
}
