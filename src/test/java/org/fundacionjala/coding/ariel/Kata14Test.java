package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unittests.
 */
public class Kata14Test {
    private Kata14 katita;

    /**
     * Init the object on Kata14.
     */
    @Before
    public void init() {
        katita = new Kata14();
    }

    /**
     * This unittest check the basicTest.
     * An return the averages.
     */
    @Test
    public void basicTests() {
        final double[] expected1 = {2, 2, 2, 2};
        final int[] input1 = {2, 2, 2, 2, 2};
        assertEquals(Arrays.toString(expected1), Arrays.toString(katita.averages(input1)));
        final double[] expected2 = {0, 0, 0, 0};
        final int[] input2 = {2, -2, 2, -2, 2};
        assertEquals(Arrays.toString(expected2), Arrays.toString(katita.averages(input2)));
        final double[] expected3 = {2, 4, 3, -4.5};
        final int[] input3 = {1, 3, 5, 1, -10};
        assertEquals(Arrays.toString(expected3), Arrays.toString(katita.averages(input3)));
    }

    /**
     * This unittest check the input.
     * for nullEmpty inputs.
     */
    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array", 0, katita.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, katita.averages(new int[0]).length);
        final String message3 = "Array with only one value as input should return an empty array";
        assertEquals(message3, 0, katita.averages(new int[]{2}).length);
    }

}
