package org.fundacionjala.coding.manuel;

/**
 * Created by Juan Manuel on 3/13/2018.
 */
public class Kata12 {
    private static final int TEN = 10;
    private static final long MULTIPLY = 5L;

    /**
     * Method to return the value of the sequence.
     * @param n is the nth value.
     * @return ret is the nth value of the sequence.
     */
    public long getScore(int n) {
        int begin = 0;
        long ret = 0L;
        for (int i = 1; i <= n; i++) {
            begin += i * TEN;
            ret = begin * MULTIPLY;
        }
        return ret;
    }
}
