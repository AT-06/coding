package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata15 class.
 */
public class Kata15Test {

    private Kata15 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void setUp() {
        kata = new Kata15();
    }

    /**
     * Unit testing of mostFrequentItemCount method.
     */
    @Test
    public void testMostFrequentItemCount() {
        String msg = "Should work with example test cases";
        final int[] actual1 = {3, -1, -1};
        final int expected1 = 2;
        assertEquals(msg, expected1, kata.mostFrequentItemCount(actual1));
        final int[] actual2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int expected2 = 5;
        assertEquals(msg, expected2, kata.mostFrequentItemCount(actual2));
        final int[] actual3 = {};
        final int expected3 = 0;
        assertEquals("Should work for empty arrays", expected3, kata.mostFrequentItemCount(actual3));
        final int[] actual4 = {9};
        final int expected4 = 1;
        assertEquals("Should work for 1-element arrays", expected4, kata.mostFrequentItemCount(actual4));
        final int[] actual5 = {7, 1, 7, 1, 7, 1};
        final int expected5 = 3;
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's",
            expected5, kata.mostFrequentItemCount(actual5));
    }
}
