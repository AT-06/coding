package org.fundacionjala.coding.christian;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Development by Christian.
 */
public class Kata6 {
    private static final int NUMBER_7 = 7;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_13 = 13;
    private static final int NUMBER_14 = 14;
    /**
     * @param number this is for sortTwisted37.
     * @return tag for 'number'.
     */
    public Integer[] sortTwisted37(Integer[] number) {
        Integer[] sortTwisted37 = number.clone();
        Arrays.sort(sortTwisted37);
        Map<Integer, Integer> change = new HashMap<>();
        change.put(NUMBER_3, NUMBER_7);
        change.put(NUMBER_7, NUMBER_3);
        change.put(NUMBER_13, NUMBER_14);
        change.put(NUMBER_14, NUMBER_13);

        Integer[] newNumber = number.clone();
        Arrays.sort(newNumber);
        for (int i = 0; i < newNumber.length; i++) {
            if (change.containsKey(newNumber[i])) {
                newNumber[i] = change.get(newNumber[i]);
            }
        }
        return newNumber;
    }
}

