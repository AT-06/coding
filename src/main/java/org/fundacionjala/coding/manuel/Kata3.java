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

        int count = 0;
        while (number > MAX_DIGITS) {
            int multipliedNumber = 1;
            while (number > MAX_DIGITS) {
                multipliedNumber *= number % MOD_NUMBER;
                number /= MOD_NUMBER;
            }
            multipliedNumber *= number;
            number = multipliedNumber;
            count++;
        }
        return count;
    }

}
