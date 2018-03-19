package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kata 15 unit tests.
 */
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
        final int[] case1 = {3, -1, -1};
        final int exp1 = 2;
        final int[] case2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int exp2 = 5;
        String msg = "Should work with example test cases";
        assertEquals(msg, exp1, kata15.mostFrequentItemCount(case1));
        assertEquals(msg, exp2, kata15.mostFrequentItemCount(case2));
    }

    /**
     * test edgeTests.
     */
    @Test
    public void edgeTests() {
        final int exp1 = 0;
        final int[] case2 = {9};
        final int exp2 = 1;
        final int[] case3 = {7, 1, 7, 1, 7, 1};
        final int exp3 = 3;
        String msj = "Should work with multiple most frequent items, e.g. nine 7's and nine 1's";
        assertEquals("Should work for empty arrays", exp1, kata15.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", exp2, kata15.mostFrequentItemCount(case2));
        assertEquals(msj, exp3, kata15.mostFrequentItemCount(case3));
    }

}
