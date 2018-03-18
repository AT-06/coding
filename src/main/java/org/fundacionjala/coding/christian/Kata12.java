package org.fundacionjala.coding.christian;

/**
 * Developer by Christian.
 */
public class Kata12 {
    private static final int NUM = 50;
    /**
     * @param value .
     * @return long
     */
    public long getScore(long value) {
        long num1 = 0;
        for (int i = 1; i <= value; i++) {
            num1 += i * NUM;
        }
        return num1;
    }
}
