package org.fundacionjala.coding.ariel;

import java.util.Arrays;


/**
 * Kata 10.
 * By Ariel Gonzales Vargas..
 */
public class Kata10 {
    /**
     * @param serie An string of numbers.
     * @return An string that contains the High and low numbers.
     */
    public String highAndLow(String serie) {
        String[] numbers = serie.split(" ");
        int[] order = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            order[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(order);
        return String.format("%s %s", String.valueOf(order[order.length - 1]), String.valueOf(order[0]));

    }

}
