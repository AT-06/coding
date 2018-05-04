
package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Kata17Test.java class for unit tests.
 */
public class Kata17Test {
    private Kata17 kata17;

    /**
     * Method to initialize object.
     */
    @Before
    public void init() {
        kata17 = new Kata17();
    }

    /**
     * Test sortArray method, filled with numbers.
     */
    @Test
    public void testSortArrayOrderWithNumbers() {
        final int[] expected = new int[]{1, 3, 2, 8, 5, 4};
        final int[] actual = new int[]{5, 3, 2, 8, 1, 4};
        assertArrayEquals(expected, kata17.sortArray(actual));
    }

    /**
     * Test sortArray method, filled with numbers and ceros.
     */
    @Test
    public void testSortArrayOrderWithNumbersAndZeros() {
        final int[] expected = new int[]{1, 3, 5, 8, 0};
        final int[] actual = new int[]{5, 3, 1, 8, 0};
        assertArrayEquals(expected, kata17.sortArray(actual));
    }

    /**
     * Test sortArray method, empty array..
     */
    @Test
    public void testSortArrayOrderEmptyArray() {
        assertArrayEquals(new int[]{}, kata17.sortArray(new int[]{}));
    }
}
