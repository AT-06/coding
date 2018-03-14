package org.fundacionjala.coding.jimmy;

import java.util.Arrays;
import java.util.function.Function;

/**
 * This class implements the sortTwisted37 method.
 */
public class Kata6 {

    /**
     * This method will perform the change of 3 and 7 number and will perform the sort.
     *
     * @param integers The array of integers.
     * @return An array sorted with the changes of 3 instead of 7 and upside down.
     */
    public Integer[] sortTwisted37(Integer[] integers) {
        final Function<Integer, Integer> functionMapper = integer ->
                Integer.valueOf(integer.toString()
                        .replace("3", "x")
                        .replace("7", "3")
                        .replace("x", "7"));
        return Arrays.stream(integers)
                .map(functionMapper)
                .sorted()
                .map(functionMapper)
                .toArray(Integer[]::new);
    }
}
