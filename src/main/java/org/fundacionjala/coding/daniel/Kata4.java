package org.fundacionjala.coding.daniel;

/**
 * A class that contains digitalRoot method.
 */
public class Kata4 {
    /**
     * @param number An integer.
     * @return A digital root is the recursive sum of all the digits in a number.
     * Given 'number', take the sum of the digits of 'number'.
     * If that value has two digits, continue reducing in this way until a single-digit number is produced.
     * This is only applicable to the natural numbers.
     */
    public int digitalRoot(int number) {
        final int i = 9;
        return number != 0 && number % i == 0 ? i : number % i;
    }
}
