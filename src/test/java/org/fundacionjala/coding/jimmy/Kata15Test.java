package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing the mostFrequentItemCount method.
 */
public class Kata15Test {

    private Kata15 kata15;

    /**
     * Initializes kata15.
     */
    @Before
    public void initialize() {
        kata15 = new Kata15();
    }

    /**
     * It will test the basic tests of the method.
     */
    @Test
    public void testMostFrequentItemCountBasicTests() {
        final int expected = 2;
        final int[] arrayNumbers = {3, -1, -1};
        assertEquals(expected, kata15.mostFrequentItemCount(arrayNumbers));
        final int expected1 = 5;
        final int[] arrayNumbers1 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        assertEquals(expected1, kata15.mostFrequentItemCount(arrayNumbers1));
    }

    /**
     * It will test the edge tests of the method.
     */
    @Test
    public void testMostFrequentItemCountEdgeTests() {
        final int expected = 0;
        final int[] arrayNumbers = new int[0];
        assertEquals(expected, kata15.mostFrequentItemCount(arrayNumbers));
        final int expected1 = 1;
        final int[] arrayNumbers1 = {9};
        assertEquals(expected1, kata15.mostFrequentItemCount(arrayNumbers1));
        final int expected2 = 3;
        final int[] arrayNumbers2 = {7, 1, 7, 1, 7, 1};
        assertEquals(expected2, kata15.mostFrequentItemCount(arrayNumbers2));
    }
}
