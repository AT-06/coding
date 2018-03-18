package org.fundacionjala.coding.christian;

import java.util.HashMap;
import java.util.Map;

/**
 * Developer by Christian.
 */
public class Kata15 {
    /**
     * @param collection .
     * @return int
     */
    public int mostFrequentItemCount(int[] collection) {
        Map<Integer, Integer> counter = new HashMap<>();
        int maxCount = 0;
        int count;
        for (int n: collection) {
            count = counter.getOrDefault(n, 0) + 1;
            counter.put(n, count);
            maxCount = count > maxCount ? count : maxCount;
        }
        return maxCount;
    }
}
