package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata4 is a class that contains a digitalRoot method
 */
public class Kata4 {
    private static final int DIVDIGIT = 10;
    private static final int LIMIT = 0;

    /**
     * @param numberToSum is a number that will find a digitalRoot
     *                    (recursive method that sum every digit until the numberToSum is less to 10)
     * @return result
     */
    public int digitalRoot(int numberToSum) {
        if (numberToSum < DIVDIGIT) {
            return numberToSum;
        }
        int digitsSum = 0;
        while (numberToSum != LIMIT) {
            digitsSum += numberToSum % DIVDIGIT;
            numberToSum /= DIVDIGIT;
        }
        return digitalRoot(digitsSum);
    }
}
