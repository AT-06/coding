package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class Kata15Test {
    private Kata15 kata15;

    /**
     * Method to initialize.
     */
    @Before
    public void initialize() {
        kata15 = new Kata15();
    }

    /**
     * First test.
     */
    @Test
    public void basicTests() {
        final String msg = "Should work with example test cases";
        final int[] param1 = new int[] {3, -1, -1};
        final int[] param2 = new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int expectedResult = 5;
        assertEquals(msg, 2, kata15.mostFrequentItemCount(param1));
        assertEquals(msg, expectedResult, kata15.mostFrequentItemCount(param2));
    }

    /**
     * Second test.
     */
    @Test
    public void edgeTests() {
        final String msg = "Should work with multiple most frequent items, e.g. nine 7's and nine 1's";
        final int[] param1 = new int[0];
        final int[] param2 = new int[] {9};
        final int[] param3 = new int[] {7, 1, 7, 1, 7, 1};
        final int expectedResult = 3;
        assertEquals("Should work for empty arrays", 0, kata15.mostFrequentItemCount(param1));
        assertEquals("Should work for 1-element arrays", 1, kata15.mostFrequentItemCount(param2));
        assertEquals(msg, expectedResult, kata15.mostFrequentItemCount(param3));
    }
}
