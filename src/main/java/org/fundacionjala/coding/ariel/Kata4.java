package org.fundacionjala.coding.ariel;

/**
 * Kata4.
 * Ariel Gonzales Vargas.
 * Digital root function..
 */
public class Kata4 {
    private static final int CONDITION = 9;
    private static final int DIGIT = 10;
    private static final int CHANGE_NUMBER = 10;

    /**
     * @param num Any number type INT.
     * @return One digit.
     */
    public int digitalRoot(int num) {
        if (num > CONDITION) {
            int sum = 0;
            while (num != 0) {
                sum += num % DIGIT;
                num /= CHANGE_NUMBER;
            }
            return digitalRoot(sum);
        }
        return num;
    }
}
