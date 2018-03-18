package org.fundacionjala.coding.manuel;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class Kata15 {

    /**
     * Method to determine the most frequent item.
     * @param values int array.
     * @return max value of numbers;
     */
    public int mostFrequentItemCount(int[] values) {
        if (values.length == 0) {
            return 0;
        }
        Arrays.sort(values);
        int c = 1;
        List<Integer> frequency = new ArrayList<>();
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] != values[i + 1]) {
                frequency.add(c);
                c = 0;
            }
            c++;
        }
        frequency.add(c);
        frequency.sort(Comparator.reverseOrder());
        return frequency.get(0);
    }
}

