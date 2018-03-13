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
        StringJoiner test = new StringJoiner(BLANK_SPACE);
        int[] array = Arrays.stream(numbers.split(BLANK_SPACE)).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        test.add(Integer.toString(array[array.length - 1])).add(Integer.toString(array[0]));
        return test.toString();
    }
}
