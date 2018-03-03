package org.fundacionjala.coding.omar;

import java.util.Arrays;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * This class contains method for takes in a positive parameter
 * num and returns its multiplicative persistence,
 * which is the number of times you must multiply
 * the digits in num until you reach a single digit.
 */
public class Kata3 {

    private static final int DIV = 10;
    private static final int CONSTANT = 1;
    private static final String EMPTY_STRING = "";
    private static final int ZERO = 0;

    /**
     * @param number for check pessitence.
     * @return result
     */
    public int persistence(int number) {

        final int newN = Arrays.stream(String.valueOf(number).split(EMPTY_STRING))
                                    .mapToInt(Integer::valueOf)
                                    .reduce(CONSTANT, (x, y) -> x * y);

        return (number < DIV)  ? ZERO : persistence(newN) + CONSTANT;
    }



}
