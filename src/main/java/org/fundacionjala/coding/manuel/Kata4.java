package org.fundacionjala.coding.manuel;

/**
 * Created by Administrator on 3/1/2018.
 */
public class Kata4 {
    /**
     * A digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n. If that value has two digits,
     * continue reducing in this way until a single-digit number is produced.
     * This is only applicable to the natural numbers.
     */

    private static final int MAX_DIGIT = 9;
    private static final int MOD_DIV_NUMBER = 10;

    /**
     * Default constructor.
     */
    public Kata4() {
    }

    /**
     * Method to calculate digital_root.
     * @param number .
     * @return num.
     */
    public int digitalRoot(int number) {
        int num = number;
        while (num > MAX_DIGIT) {
            num = sumDigits(num);
        }
        return num;
    }

    /**
     * Method to calculate sum a number digits.
     * @param number .
     * @return recursivity.
     */
    public static int sumDigits(int number) {
        if (number < MOD_DIV_NUMBER) {
            return number % MOD_DIV_NUMBER;
        }
        return sumDigits(number / MOD_DIV_NUMBER) + (number % MOD_DIV_NUMBER);
    }
}
