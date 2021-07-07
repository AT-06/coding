/**
 * Kata -> Write Number in Expanded Form
 * You will be given a number and you will need to return it as a string in Expanded Form. For example:
 *  Kata.expandedForm(12); # Should return "10 + 2"
 *  Kata.expandedForm(42); # Should return "40 + 2"
 *  Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 * NOTE: All numbers will be whole numbers greater than 0.
 */
package org.fundacionjala.coding.manuel;

/**
 * Kata16.java
 * Class for kata 16.
 */
public class Kata16 {
    public static final int DELIMITER = 10;

    /**
     * Method to expand a number into its digits and units.
     * @param num is the number to expand.
     * @return is the string with number expanded.
     */
    public String expandedForm(int num) {
        if (num <= DELIMITER) {
            return Integer.toString(num);
        }
        int divisor = DELIMITER;
        String result = "";
        while (divisor < num) {
            if ((num % divisor) > 0) {
                result = " + ".concat(Integer.toString(num % divisor)).concat(result);
            }
            num -= num % divisor;
            divisor *= DELIMITER;
        }
        return Integer.toString(num % divisor).concat(result);
    }
}
