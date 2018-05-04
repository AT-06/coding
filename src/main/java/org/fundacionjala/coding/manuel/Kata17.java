/**
 * Sort the odd
 *
 * You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 * Example
 *  sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
package org.fundacionjala.coding.manuel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Kata17.java
 * Class for kata 17.
 */
public class Kata17 {
    /**
     * Method to sort arrays only odd numbers.
     * @param array to sort.
     * @return array sorted.
     */
    public int[] sortArray(int[] array) {
        if (array == null || array.length < 1) {
            return array;
        }
        List<Integer> oddArray = new ArrayList<>();
        List<Integer> oddPosition = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray.add(array[i]);
                oddPosition.add(i);
            }
        }
        Collections.sort(oddArray);
        for (int j = 0; j < oddArray.size(); j++) {
            array[oddPosition.get(j)] = oddArray.get(j);
        }
        return array;
    }
}
