package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests are implemented in this class.
 */
public class Kata6Test {

    private Kata6 kata6;

    /**
     * This method initializes kata6.
     */
    @Before
    public void initialize() {
        kata6 = new Kata6();
    }

    /**
     * It will test the basic unit tests.
     */
    @Test
    public void testSortTwistedBasicTests() {
        final Integer[] expected = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] arrayIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] expected1 = {12, 14, 13};
        final Integer[] arrayIntegers1 = {12, 13, 14};
        final Integer[] expected2 = {2, 7, 4, 3, 9};
        final Integer[] arrayIntegers2 = {9, 2, 4, 7, 3};

        assertEquals(Arrays.toString(expected), Arrays.toString(kata6.sortTwisted37(arrayIntegers)));
        assertEquals(Arrays.toString(expected1), Arrays.toString(kata6.sortTwisted37(arrayIntegers1)));
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata6.sortTwisted37(arrayIntegers2)));
    }

    /**
     * It will test the unchanged array test.
     */
    @Test
    public void testSortTwistedUnChangedArrayTest() {
        final Integer[] array = {9, 2, 4, 7, 3};
        final Integer[] expected3 = {2, 7, 4, 3, 9};
        final Integer[] arrayCpy = {9, 2, 4, 7, 3};

        assertEquals(Arrays.toString(expected3), Arrays.toString(kata6.sortTwisted37(array)));
        assertEquals(Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
