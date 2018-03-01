package org.fundacionjala.coding.maria;

/**
 * Kata 4.
 * Sum number digits.
 */
public class Kata4 {
    private static final int DIV = 10;
    /**
     * @param num numero
     * @return total suma
     */
    public int sumDigits(int num) {
        while (num / DIV > 0) {
            String stringNum = Integer.toString(num);
            int[] digits = stringNum.chars().map(Character::getNumericValue).toArray();
            num = 0;
            for (int digit : digits) {
                num += digit;
            }
        }
        return num;
    }
}
