package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Kata15Test {
    private Kata15 kata15;
    /**
     * initialize kata15.
     */
    @Before
    public void initialize() {
        kata15 = new Kata15();
    }

    /**
     * test basicTests.
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2, kata15.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(msg, 5, kata15.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     * test edgeTests.
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0, kata15.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1, kata15.mostFrequentItemCount(new int[] {9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3, kata15.mostFrequentItemCount(new int[] {7, 1, 7, 1, 7, 1}));
    }

}