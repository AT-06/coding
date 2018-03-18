package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class Kata15Test {

    private Kata15 kata15;
    private static final int[] ACTUAL = {3, -1, -1};
    private static final int EXPECTED_1 = 2;
    private static final int[] ACTUAL_2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
    private static final int EXPECTED_2 = 5;
    private static final int[] ACTUAL_3 = {9};
    private static final int EXPECTED_3 = 1;
    private static final int[] ACTUAL_4 = {7, 1, 7, 1, 7, 1};
    private static final int EXPECTED_4 = 3;
    private static final int[] ACTUAL_5 = {};
    private static final int EXPECTED_5 = 0;


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
        String msg = "Should work with example test cases";
        assertEquals(msg, EXPECTED_1, kata15.mostFrequentItemCount(ACTUAL));
        assertEquals(msg, EXPECTED_2, kata15.mostFrequentItemCount(ACTUAL_2));
    }

    /**
     * test.
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for 1-element arrays", EXPECTED_3, kata15.mostFrequentItemCount(ACTUAL_3));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's",
                EXPECTED_4, kata15.mostFrequentItemCount(ACTUAL_4));
        assertEquals("Should work for empty arrays", EXPECTED_5, kata15.mostFrequentItemCount(ACTUAL_5));
        }
}

