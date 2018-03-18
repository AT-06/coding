package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class Kata15Test {

    private Kata15 kata15;

    /**
     *
     */
    @Before
    public void init() {

        kata15 = new Kata15();
    }

    /**
     * test.
     */
    @Test
    public void basicTests() {
        final int[] actual = {3, -1, -1};
        final int expected1 = 2;
        final int[] actual2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int expected2 = 5;
        String msg = "Should work with example test cases";
        assertEquals(msg, expected1, kata15.mostFrequentItemCount(actual));
        assertEquals(msg, expected2, kata15.mostFrequentItemCount(actual2));
    }

    /**
     * test.
     */
    @Test
    public void edgeTests() {

        final int[] actual3 = {9};
        final int expected3 = 1;
        final int[] actual4 = {7, 1, 7, 1, 7, 1};
        final int expected4 = 3;
        final int[] actual5 = {};
        final int expected5 = 0;
        assertEquals("Should work for 1-element arrays", expected3, kata15.mostFrequentItemCount(actual3));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's",
                expected4, kata15.mostFrequentItemCount(actual4));
        assertEquals("Should work for empty arrays", expected5, kata15.mostFrequentItemCount(actual5));
        }
}

