package org.fundacionjala.coding.ariel;

import java.util.Arrays;
import java.util.StringJoiner;

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
        StringJoiner resp = new StringJoiner(" ");
        String[] numbers = serie.split(" ");
        int[] order = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            order[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(order);
        resp.add(String.valueOf(order[order.length - 1])).add(String.valueOf(order[0]));
        return resp.toString();
    }

}
