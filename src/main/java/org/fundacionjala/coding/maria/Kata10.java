package org.fundacionjala.coding.maria;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * kata 10.
 */
public class Kata10 {
    private static final String BLANK_SPACE = " ";

    /**
     * @param numbers numbers
     * @return hig and low number
     */
    public String highAndLow(String numbers) {

        int[] array = Arrays.stream(numbers.split(BLANK_SPACE)).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        String.format("%s %s", String.valueOf(array[array.length - 1]), String.valueOf(array[0]));
    }
}
