package org.fundacionjala.coding.escarleth;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata14.
 */
public class Kata14Test {
    private Kata14 kata14;

    /**
     * initialize kata14.
     */
    @Before
    public void initialize() {
        kata14 = new Kata14();
    }

    /**
     * This method is for testAveragesBasicArray.
     */
    @Test
    public void testAveragesBasicArray() {
        final double[] expected1 = new double[]{2, 2, 2, 2};
        final double[] expected2 = new double[]{0, 0, 0, 0};
        final double[] expected3 = new double[]{2, 4, 3, -4.5};

        final int[] array1 = new int[]{2, 2, 2, 2, 2};
        final int[] array2 = new int[]{2, -2, 2, -2, 2};
        final int[] array3 = new int[]{1, 3, 5, 1, -10};

        assertEquals(Arrays.toString(expected1), Arrays.toString(kata14.averages(array1)));
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata14.averages(array2)));
        assertEquals(Arrays.toString(expected3), Arrays.toString(kata14.averages(array3)));
    }

    /**
     * This method is for testAveragesNullEmptyArray.
     */
    @Test
    public void testAveragesNullEmptyArray() {
        final int number = 2;
        final String message1 = "input 'null' should return an empty array";
        final String message2 = "Empty array as input should return an empty array";
        final String message3 = "Array with only one value as input should return an empty array";
        assertEquals(message1, 0, kata14.averages(null).length);
        assertEquals(message2, 0, kata14.averages(new int[0]).length);
        assertEquals(message3, 0, kata14.averages(new int[]{number}).length);
    }
}
