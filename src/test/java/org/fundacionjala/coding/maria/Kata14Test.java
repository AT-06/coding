package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * test for the kata14.
 */
public class Kata14Test {
    private static final int TWO = 2;

    private Kata14 kata14;
    /**
     * initialize kata7.
     */
    @Before
    public void initialize() {
        kata14 = new Kata14();
    }

    /**
     * basicTests test.
     */
    @Test
    public void basicTests() {
        final double[] expected1 = new double[] {2, 2, 2, 2};
        final double[] expected2 = new double[] {0, 0, 0, 0};
        final double[] expected3 = new double[] {2, 4, 3, -4.5};

        final int[] case1 = new int[] {2, 2, 2, 2, 2};
        final int[] case2 = new int[] {2, -2, 2, -2, 2};
        final int[] case3 = new int[] {1, 3, 5, 1, -10};

        assertEquals(Arrays.toString(expected1), Arrays.toString(kata14.averages(case1)));
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata14.averages(case2)));
        assertEquals(Arrays.toString(expected3), Arrays.toString(kata14.averages(case3)));
    }

    /**
     * nullEmptyTests teste.
     */
    @Test
    public void nullEmptyTests() {
        final String msm1 = "input 'null' should return an empty array";
        final String msm2 = "Empty array as input should return an empty array";
        final String msm3 = "Array with only one value as input should return an empty array";
        assertEquals(msm1, 0, kata14.averages(null).length);
        assertEquals(msm2, 0, kata14.averages(new int[0]).length);
        assertEquals(msm3, 0, kata14.averages(new int[] {TWO}).length);
    }
}
