package org.fundacionjala.coding.ariel;

import java.util.TreeMap;

/**
 * Kata6.
 * by Ariel Gonzales Vargas.
 */
public class Kata6 {

    /**
     * @param numbers An integer array.
     * @return An changed sortTwisted37 array.
     */
    public Integer[] sortTwisted37(Integer[] numbers) {
        TreeMap<Integer, Integer> series = new TreeMap<>();
        for (Integer number : numbers) {
            String condition = String.valueOf(number);
            int key = number;
            if (condition.contains("3") || condition.contains("7")) {
                 key = Integer.parseInt(condition.replace('3', '0')
                         .replace('7', '3')
                         .replace('0', '7'));
            }
            series.put(key, number);
        }
        return series.values().toArray(new Integer[series.size()]);
    }
}

