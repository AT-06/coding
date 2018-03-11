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
        Integer[] result = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            String condition = String.valueOf(numbers[i]);
            if (condition.contains("3") || condition.contains("7")) {
                int key = Integer.parseInt(condition.replace('3', '0').replace('7', '3').replace('0', '7'));
                series.put(key, numbers[i]);
            } else {
                series.put(numbers[i], numbers[i]);
            }
        }

        Integer[] claves = series.keySet().toArray(new Integer[0]);
        int i = 0;
        for (Integer key : claves) {
            result[i] = series.get(key);
            i++;
        }

        return result;
    }
}

