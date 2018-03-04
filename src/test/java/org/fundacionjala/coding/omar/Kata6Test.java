package org.fundacionjala.coding.omar;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata6.java.
 */

public class Kata6Test {

    private static final Integer[] ARRAY_1 = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
    private static final Integer[] ARRAY_2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final Integer[] ARRAY_3 = new Integer[]{12, 14, 13};
    private static final Integer[] ARRAY_4 = new Integer[]{12, 13, 14};
    private static final Integer[] ARRAY_5 = new Integer[]{2, 7, 4, 3, 9};
    private static final Integer[] ARRAY_6 = new Integer[]{9, 2, 4, 7, 3};
    private static final Integer[] ARRAY_7 = new Integer[]{9, 2, 4, 7, 3};
    private static final Integer[] ARRAY_8 = new Integer[]{9, 2, 4, 7, 3};
    private static final Integer[] ARRAY_9 = new Integer[]{2, 7, 4, 3, 9};


    /**
     * This method is for test sortTwisted37(Array):
     * Examples from a friend from Twisted-3-7.
     * [1,2,3,4,5,6,7,8,9] -> [1,2,7,4,5,6,3,8,9]
     * [12,13,14] -> [12,14,13]
     * [9,2,4,7,3] -> [2,7,4,3,9]
     */
    @Test
    public void testSortTwisted37BasicTests() {

        Kata6 sort = new Kata6();

        assertEquals(Arrays.toString(ARRAY_1),
                Arrays.toString(sort.sortTwisted37(ARRAY_2)));

        assertEquals(Arrays.toString(ARRAY_3),
                Arrays.toString(sort.sortTwisted37(ARRAY_4)));

        assertEquals(Arrays.toString(ARRAY_5),
                Arrays.toString(sort.sortTwisted37(ARRAY_6)));
    }

    /**
     * This method is for test sortTwisted37(Array).
     */
    @Test
    public void testSortTwisted37UnChangedArrayTest() {

        Kata6 sort = new Kata6();


        assertEquals(Arrays.toString(ARRAY_9),
                Arrays.toString(sort.sortTwisted37(ARRAY_7)));

        assertEquals("You should not modify the input array!", Arrays.toString(ARRAY_8), Arrays.toString(ARRAY_7));
    }
}
