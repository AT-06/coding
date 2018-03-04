package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.function.Function;

/**
 * A class which contains 'sortTwisted37' method.
 */
public class Kata6 {
    /**
     * @param array An array of integers.
     * @return An array which values of the digits 3 and 7 are twisted.
     */
    public Integer[] sortTwisted37(Integer[] array) {
        final Function<Integer, Integer> mapper = i ->
            Integer.valueOf(i.toString().replace('3', 'a').replace('7', '3').replace('a', '7'));
        return Arrays.stream(array)
            .map(mapper)
            .sorted()
            .map(mapper)
            .toArray(Integer[]::new);
    }
}
