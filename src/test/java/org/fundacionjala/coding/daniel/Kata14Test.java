package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata14 class.
 */
public class Kata14Test {

    private Kata14 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void setUp() {
        kata = new Kata14();
    }


    /**
     * Unit testing of averages method.
     */
    @Test
    public void testAverage() {
        final double[] expected1 = {2, 2, 2, 2};
        final int[] actual1 = {2, 2, 2, 2, 2};
        assertEquals(Arrays.toString(expected1), Arrays.toString(kata.averages(actual1)));
        final double[] expected2 = {0, 0, 0, 0};
        final int[] actual2 = {2, -2, 2, -2, 2};
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata.averages(actual2)));
        final double[] expected3 = {2, 4, 3, -4.5};
        final int[] actual3 = {1, 3, 5, 1, -10};
        assertEquals(Arrays.toString(expected3), Arrays.toString(kata.averages(actual3)));
    }

    /**
     * Testing with arrays null or empty.
     */
    @Test
    public void testNullEmptyArrays() {
        assertEquals("input 'null' should return an empty array",
            0, kata.averages(null).length);
        assertEquals("Empty array as input should return an empty array",
            0, kata.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array",
            0, kata.averages(new int[] {2}).length);
    }
}
