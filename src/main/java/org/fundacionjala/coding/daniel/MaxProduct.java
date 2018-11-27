package org.fundacionjala.coding.daniel;

/**
 * Class that solves Maximum Product kata.
 *
 * Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
 *
 * Notes
 * Array/list size is at least 2 .
 * Array/list numbers could be a mixture of positives , negatives also zeros .
 * adjacentElementsProduct(new int[] {1, 2, 3}); ==> return 6
 *
 * Explanation:
 * The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array.
 * adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}); ==> return 50
 *
 * Explanation:
 * Max product obtained from multiplying 5 * 10 = 50 .
 * adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}) ==> return -14
 *
 * Explanation:
 * The maximum product obtained from multiplying -2 * 7 = -14, and they're adjacent numbers in the array.
 */

public class MaxProduct {
    /**
     * Finds the maximum product obtained from multiplying 2 adjacent numbers in the array.
     *
     * @param ints an array of ints.
     * @return the maximum product obtained from multiplying 2 adjacent numbers in the array
     */
    public int adjacentElementsProduct(int[] ints) {
        int[] aux = new int[ints.length - 1];
        for (int i = 0; i < ints.length; i++) {
            if (i != ints.length - 1) {
                aux[i] = ints[i] * ints[i + 1];
            }
        }
        return max(aux);
    }

    /**
     * Returns the maximum number in an array of int.
     *
     * @param numbers an array of ints.
     * @return a number.
     */
    public int max(int[] numbers) {
        int major = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= major) {
                major = numbers[i];
            }
        }
        return major;
    }
}
