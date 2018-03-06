package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Kata 6 test.
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
    * basicTests to kata 6.
    */
    @Test
    public void basicTests() {
        final Integer[] expect1 = new Integer[] {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] param1 = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(Arrays.toString(expect1), Arrays.toString(kata6.sortTwisted(param1)));

        final Integer[] expect2 = new Integer[] {2, 7, 4, 3, 9};
        final Integer[] param2 = new Integer[] {9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(expect2), Arrays.toString(kata6.sortTwisted(param2)));

    }

    /**
    * test unChangedArrayTest.
    */
    @Test
    public void unChangedArrayTest() {
        final Integer[] array = new Integer[] {9, 2, 4, 7, 3};
        final Integer[] arrayCpy = new Integer[] {9, 2, 4, 7, 3};
        final Integer[] expected = new Integer[] {2, 7, 4, 3, 9};

        assertEquals(Arrays.toString(expected), Arrays.toString(kata6.sortTwisted(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }

}
