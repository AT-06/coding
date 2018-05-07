package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Maximum Product kata.
 */

public class MaxProductTest {
    private MaxProduct m = new MaxProduct();

    /**
     * Method for running the unit tests.
     *
     * @param message  a message.
     * @param expected expected result.
     * @param actual   actual result.
     */
    private void test(String message, int expected, int actual) {
        assertEquals(message, expected, actual);
    }

    /**
     * Method for doing unit testing to adjacentElementsProduct(int[] numbers).
     */
    @Test
    public void fixedTests() {
        String message = "Positive numbers";
        final int expected = 40;
        final int[] ints = {5, 8};
        test(message, expected, m.adjacentElementsProduct(ints));
        final int expected1 = 6;
        final int[] ints1 = {1, 2, 3};
        test(message, expected1, m.adjacentElementsProduct(ints1));
        final int expected2 = 90;
        final int[] ints2 = {1, 5, 10, 9};
        test(message, expected2, m.adjacentElementsProduct(ints2));
        final int expected3 = 48;
        final int[] ints3 = {4, 12, 3, 1, 5};
        test(message, expected3, m.adjacentElementsProduct(ints3));
        final int expected4 = 6;
        final int[] ints4 = {5, 1, 2, 3, 1, 4};
        test(message, expected4, m.adjacentElementsProduct(ints4));

        message = "Both positive and negative values";
        final int expected5 = 21;
        final int[] ints5 = {3, 6, -2, -5, 7, 3};
        test(message, expected5, m.adjacentElementsProduct(ints5));
        final int expected6 = 50;
        final int[] ints6 = {9, 5, 10, 2, 24, -1, -48};
        test(message, expected6, m.adjacentElementsProduct(ints6));
        final int expected7 = 30;
        final int[] ints7 = {5, 6, -4, 2, 3, 2, -23};
        test(message, expected7, m.adjacentElementsProduct(ints7));
        final int expected8 = -14;
        final int[] ints8 = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
        test(message, expected8, m.adjacentElementsProduct(ints8));
        final int expected9 = 6;
        test(message, expected9, m.adjacentElementsProduct(ints4));

        message = "Contains zeroes";
        final int expected10 = 0;
        final int[] ints9 = {1, 0, 1, 0, 1000};
        test(message, expected10, m.adjacentElementsProduct(ints9));
        final int expected11 = 6;
        final int[] ints10 = {1, 2, 3, 0};
        test(message, expected11, m.adjacentElementsProduct(ints10));
    }
}
