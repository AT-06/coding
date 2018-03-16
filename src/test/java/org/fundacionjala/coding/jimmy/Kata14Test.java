package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Class in which averages method will be tested.
 */
public class Kata14Test {

    private Kata14 kata14;

    /**
     * Initializes kata 14.
     */
    @Before
    public void initialize() {
        kata14 = new Kata14();
    }

    /**
     * Basic tests in order to get the averages of elements of an array.
     */
    @Test
    public void testAveragesBasic() {
        final double[] expected = {2, 2, 2, 2};
        final int[] array = {2, 2, 2, 2, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(kata14.averages(array)));
        final double[] expected1 = {0, 0, 0, 0};
        final int[] array1 = {2, -2, 2, -2, 2};
        assertEquals(Arrays.toString(expected1), Arrays.toString(kata14.averages(array1)));
        final double[] expected2 = {2, 4, 3, -4.5};
        final int[] array2 = {1, 3, 5, 1, -10};
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata14.averages(array2)));
    }

    /**
     * Test averages method with 0, 1, or null values in order to get an empty array.
     */
    @Test
    public void testAveragesNullEmpty() {
        final int expected = 0;
        final int[] averageNumbersNull = null;
        assertEquals(expected, kata14.averages(averageNumbersNull).length);
        final int[] averageNumbersZero = new int[0];
        assertEquals(expected, kata14.averages(averageNumbersZero).length);
        final int[] averageNumbersOneValue = {2};
        assertEquals(expected, kata14.averages(averageNumbersOneValue).length);
    }
}
