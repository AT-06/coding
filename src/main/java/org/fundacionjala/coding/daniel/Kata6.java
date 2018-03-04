package org.fundacionjala.coding.daniel;

import java.util.Arrays;

/**
 * A class which contains 'sortTwisted37' method.
 */
public class Kata6 {
    /**
     * @param array An array of integers.
     * @return An array which the values of the digits 3 and 7 are twisted.
     */
    public Integer[] sortTwisted37(Integer[] array) {
        return Arrays.stream(array)
            .map(i -> Integer.valueOf(i.toString().replace('3', 'a').replace('7', '3').replace('a', '7')))
            .sorted()
            .map(i -> Integer.valueOf(i.toString().replace('3', 'a').replace('7', '3').replace('a', '7')))
            .toArray(Integer[]::new);
    }
}
