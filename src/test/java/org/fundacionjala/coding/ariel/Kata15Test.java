package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unittests.
 */
public class Kata15Test {
    private Kata15 katita;

    /**
     * Init the object.
     */
    @Before
    public void init() {
        katita = new Kata15();
    }

    /**
     * Check the BasicTests.
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        final int[] input1 = {3, -1, -1};
        final int expected1 = 2;
        assertEquals(msg, expected1, katita.mostFrequentItemCount(input1));
        final int[] input2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int expected2 = 5;
        assertEquals(msg, expected2, katita.mostFrequentItemCount(input2));
        final int[] input3 = {9, -1, 9, -1, 2, 9, -1, 9, -1, 9, 4, 9, 3};
        final int expected3 = 6;
        assertEquals(msg, expected3, katita.mostFrequentItemCount(input3));
    }

    /**
     * Check the EdgeTests.
     */
    @Test
    public void edgeTests() {
        final int[] input4 = new int[0];
        final int expected4 = 0;
        assertEquals("Should work for empty arrays", expected4, katita.mostFrequentItemCount(input4));
        final int[] input5 = {9};
        final int expected5 = 1;
        assertEquals("Should work for 1-element arrays", expected5, katita.mostFrequentItemCount(input5));
        final int[] input6 = {7, 1, 7, 1, 7, 1};
        final int expected6 = 3;
        final String message = "Should work with multiple most frequent items, e.g. nine 7's and nine 1's";
        assertEquals(message, expected6, katita.mostFrequentItemCount(input6));
    }

}
