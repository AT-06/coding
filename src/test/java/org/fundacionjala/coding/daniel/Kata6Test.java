package org.fundacionjala.coding.daniel;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata6 class.
 */
public class Kata6Test {
    private Kata6 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata6();
    }

    /**
     * A method for Unit Testing of 'sortTwisted37' method.
     */
    @Test
    public void testBasicTests() {
        final Integer[] expected1 = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] expected2 = {12, 14, 13};
        final Integer[] array2 = {12, 13, 14};
        final Integer[] expected3 = {2, 7, 4, 3, 9};
        final Integer[] array3 = {9, 2, 4, 7, 3};

        assertEquals(Arrays.toString(expected1), Arrays.toString(kata.sortTwisted37(array1)));
        assertEquals(Arrays.toString(expected2), Arrays.toString(kata.sortTwisted37(array2)));
        assertEquals(Arrays.toString(expected3), Arrays.toString(kata.sortTwisted37(array3)));
    }

    /**
     * Tests an array with no changes.
     */
    @Test
    public void testUnchangedArray() {
        final Integer[] array = {9, 2, 4, 7, 3};
        final Integer[] arrayCopy = {9, 2, 4, 7, 3};
        final Integer[] expected = {2, 7, 4, 3, 9};
        assertEquals(Arrays.toString(expected), Arrays.toString(kata.sortTwisted37(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCopy), Arrays.toString(array));
    }
}
