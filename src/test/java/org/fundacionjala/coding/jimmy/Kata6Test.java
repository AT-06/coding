package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests are implemented in this class.
 */
public class Kata6Test {

    private static final Integer[] EXPECTED = {1, 2, 7, 4, 5, 6, 3, 8, 9};
    private static final Integer[] ARRAY_INTEGERS = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final Integer[] EXPECTED1 = {12, 14, 13};
    private static final Integer[] ARRAY_INTEGERS1 = {12, 13, 14};
    private static final Integer[] EXPECTED2 = {2, 7, 4, 3, 9};
    private static final Integer[] ARRAY_INTEGERS2 = {9, 2, 4, 7, 3};
    private static final Integer[] ARRAY = {9, 2, 4, 7, 3};
    private static final Integer[] EXPECTED3 = {2, 7, 4, 3, 9};
    private static final Integer[] ARRAY_CPY = {9, 2, 4, 7, 3};

    private Kata6 kata6;

    /**
     * This method initializes kata6.
     */
    @Before
    public void initialize() {
        kata6 = new Kata6();
    }

    /**
     * It will test the basic unit tests.
     */
    @Test
    public void testSortTwistedBasicTests() {
        assertEquals(Arrays.toString(EXPECTED), Arrays.toString(kata6.sortTwisted37(ARRAY_INTEGERS)));
        assertEquals(Arrays.toString(EXPECTED1), Arrays.toString(kata6.sortTwisted37(ARRAY_INTEGERS1)));
        assertEquals(Arrays.toString(EXPECTED2), Arrays.toString(kata6.sortTwisted37(ARRAY_INTEGERS2)));
    }

    /**
     * It will test the unchanged array test.
     */
    @Test
    public void testSortTwistedUnChangedArrayTest() {

        assertEquals(Arrays.toString(EXPECTED3), Arrays.toString(kata6.sortTwisted37(ARRAY)));
        assertEquals(Arrays.toString(ARRAY_CPY), Arrays.toString(ARRAY));
    }
}
