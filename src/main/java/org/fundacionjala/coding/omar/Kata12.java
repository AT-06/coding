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

    private static final int NUMBER_50 = 50;

    /**
     * This method return score of number.
     *
     * @param number .
     * @return result final score of number.
     */
    public long getScore(long number) {

        long result = NUMBER_50;
        for (int i = 2; i <= number; ++i) {
            result += i * NUMBER_50;
        }
        return result;
    }

}
