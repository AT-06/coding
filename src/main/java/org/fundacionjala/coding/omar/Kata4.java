package org.fundacionjala.coding.omar;

/**
 * This class contains a method digitalRoot(numbert),
 * is the recursive sum of all the digits in a number. Given n,
 * take the sum of the digits of n. If that value has two digits,
 * continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 */
public class Kata4 {

    private static final int DIV = 10;
    private static final int ZERO = 0;

    /**
     * @param number this is numbert for digital root.
     * @return digital root.
     */
    public int digitalRoot(int number) {

        return (number / DIV == ZERO) ? number : digitalRoot(String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum());

    }
}
