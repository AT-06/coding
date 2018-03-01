package org.fundacionjala.coding.manuel;

/**
 * Created by Administrator on 3/1/2018.
 */
public class Kata3 {
    private static final int MAX_DIGITS = 9;
    private static final int MOD_NUMBER = 10;

    /**
     * Method to know how many persistance a number has.
     * @param number s.
     * @return returns the amount of persistance.
     */
    public int persistence(int number) {
        int copiedNumber = number;
        int multipliedNumber;
        int count = 0;
        while (copiedNumber > MAX_DIGITS) {
            multipliedNumber = 1;
            while (copiedNumber > MAX_DIGITS) {
                multipliedNumber *= copiedNumber % MOD_NUMBER;
                copiedNumber /= MOD_NUMBER;
            }
            multipliedNumber *= copiedNumber;
            copiedNumber = multipliedNumber;
            count++;
        }
        return count;
    }

}
