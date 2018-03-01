package org.fundacionjala.coding.omar;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * This class contains method for takes in a positive parameter
 * num and returns its multiplicative persistence,
 * which is the number of times you must multiply
 * the digits in num until you reach a single digit.
 */
public class Kata3 {

    private static final int DIV = 10;

    /**
     * @param number for check pessitence.
     * @return result
     */
    public int persistence(int number) {

        int count = 0;
        while (number >= DIV) {
            number = Long.toString(number).chars().reduce(1, (r, i) -> r * (i - '0'));
            count++;
        }
        return count;


    }
}
