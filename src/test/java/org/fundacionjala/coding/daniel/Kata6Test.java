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
    private static final Integer[] EXPECTED_1 = {1, 2, 7, 4, 5, 6, 3, 8, 9};
    private static final Integer[] ARRAY_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final Integer[] EXPECTED_2 = {12, 14, 13};
    private static final Integer[] ARRAY_2 = {12, 13, 14};
    private static final Integer[] EXPECTED_3 = {2, 7, 4, 3, 9};
    private static final Integer[] ARRAY_3 = {9, 2, 4, 7, 3};
    private static final Integer[] ARRAY = {9, 2, 4, 7, 3};
    private static final Integer[] ARRAY_COPY = {9, 2, 4, 7, 3};
    private static final Integer[] EXPECTED = {2, 7, 4, 3, 9};

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
        assertEquals(Arrays.toString(EXPECTED_1), Arrays.toString(kata.sortTwisted37(ARRAY_1)));
        assertEquals(Arrays.toString(EXPECTED_2), Arrays.toString(kata.sortTwisted37(ARRAY_2)));
        assertEquals(Arrays.toString(EXPECTED_3), Arrays.toString(kata.sortTwisted37(ARRAY_3)));
    }

    /**
     * Tests an array with no changes.
     */
    @Test
    public void testUnchangedArray() {
        assertEquals(Arrays.toString(EXPECTED), Arrays.toString(kata.sortTwisted37(ARRAY)));
        assertEquals(Arrays.toString(ARRAY_COPY), Arrays.toString(ARRAY));
    }
}
