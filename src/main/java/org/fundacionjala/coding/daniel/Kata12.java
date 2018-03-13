package org.fundacionjala.coding.daniel;

/**
 * A class which contains getScore method.
 */
public class Kata12 {
    /**
     * @param n an integer number.
     * @return the score for any positive number n.
     * getScore(1); // == 50
     * getScore(2); // == 150
     * getScore(3); // == 300
     * // ...
     */
    public long getScore(long n) {
        final int i = 25;
        return n * (n + 1) * i;
    }
}
