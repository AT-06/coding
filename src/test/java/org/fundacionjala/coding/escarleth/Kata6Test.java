package org.fundacionjala.coding.escarleth;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * This class contains UnitTests for Kata6.
 */
public class Kata6Test {
    private Kata6 kata6;

    /**
     * initialize kata6.
     */
    @Before
    public void initialize() {
        kata6 = new Kata6();
    }

    /**
     * This method is for testing a Sorting on planet Twisted-3-7.
     */
    @Test
    public void testSortingOnPlanetTwisted() {
        final Integer[] expected1 = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] parameter1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(Arrays.toString(expected1), Arrays.toString(kata6.sortTwisted(parameter1)));

        final Integer[] expected2 = new Integer[]{2, 7, 4, 3, 9};
        final Integer[] parameter2 = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata6.sortTwisted(parameter2)));

    }

    /**
     * This method is a test for unChangedArray.
     */
    @Test
    public void testUnChangedArray() {
        final Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        final Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        final Integer[] expected = new Integer[]{2, 7, 4, 3, 9};

        assertEquals(Arrays.toString(expected), Arrays.toString(kata6.sortTwisted(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }

}
