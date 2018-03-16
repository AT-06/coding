package org.fundacionjala.coding.maria;

/**
 * kata 12.
 */
public class Kata12 {
    private static final int INI = 50;

    /**
     * @param num int
     * @return score
     */
    public long getScore(int num) {
        long t = 0;
        for (int i = 1; i <= num; i++) {
            t += i * INI;
        }
        return t;
    }
}
