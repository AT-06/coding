package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata14Test {


    private static final int ZERO = 0;

    private Kata14 average;

    /**
     * Powered by Omar Limbert Huanca Sanchez - AT06.
     */

    @Before
    public void init() {

        average = new Kata14();
    }

    /**
     * Powered by Omar Limbert Huanca Sanchez - AT06.
     */
    @Test
    public void basicTests() {

        final double[] array1 = {2, 2, 2, 2};
        final double[] array2 = {ZERO, ZERO, ZERO, ZERO};
        final double[] array3 = {2, 4, 3, -4.5};
        final int[] array4 = {2, 2, 2, 2, 2};
        final int[] array5 = {2, -2, 2, -2, 2};
        final int[] array6 = {1, 3, 5, 1, -10};

        assertEquals(Arrays.toString(array1), Arrays.toString(average.averages(array4)));
        assertEquals(Arrays.toString(array2), Arrays.toString(average.averages(array5)));
        assertEquals(Arrays.toString(array3), Arrays.toString(average.averages(array6)));
    }

    /**
     * Powered by Omar Limbert Huanca Sanchez - AT06.
     */
    @Test
    public void nullEmptyTests() {

        final String output1 = "input 'null' should return an empty array";
        final String output2 = "Empty array as input should return an empty array";
        final String output3 = "Array with only one value as input should return an empty array";

        assertEquals(output1, ZERO, average.averages(null).length);
        assertEquals(output2, ZERO, average.averages(new int[ZERO]).length);
        assertEquals(output3, ZERO, average.averages(new int[]{2}).length);
    }

}
