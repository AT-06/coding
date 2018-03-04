package org.fundacionjala.coding.omar;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata6.java.
 */

public class Kata6Test {

    private static final int NUMBER_9 = 9;
    private static final int NUMBER_1 = 1;
    private static final int NUMBER_2 = 2;
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_5 = 5;
    private static final int NUMBER_6 = 6;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_8 = 8;
    private static final int NUMBER_7 = 7;
    private static final int NUMBER_12 = 12;
    private static final int NUMBER_14 = 14;
    private static final int NUMBER_13 = 13;

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
        assertEquals(
                Arrays.toString(
                        new Integer[]{NUMBER_1, NUMBER_2, NUMBER_7, NUMBER_4, NUMBER_5, NUMBER_6, NUMBER_3,
                                NUMBER_8, NUMBER_9}),
                Arrays.toString(sort.sortTwisted37(
                        new Integer[]{NUMBER_1, NUMBER_2, NUMBER_3, NUMBER_4, NUMBER_5, NUMBER_6, NUMBER_7,
                                NUMBER_8, NUMBER_9})));
        assertEquals(
                Arrays.toString(
                        new Integer[]{NUMBER_12, NUMBER_14, NUMBER_13}),
                Arrays.toString(sort.sortTwisted37(
                        new Integer[]{NUMBER_12, NUMBER_13, NUMBER_14})));
        assertEquals(
                Arrays.toString(
                        new Integer[]{NUMBER_2, NUMBER_7, NUMBER_4, NUMBER_3, NUMBER_9}),
                Arrays.toString(sort.sortTwisted37(
                        new Integer[]{NUMBER_9, NUMBER_2, NUMBER_4, NUMBER_7, NUMBER_3})));
    }

    /**
     * This method is for test sortTwisted37(Array).
     */
    @Test
    public void testSortTwisted37UnChangedArrayTest() {

        Kata6 sort = new Kata6();
        Integer[] array = new Integer[]{NUMBER_9, NUMBER_2, NUMBER_4, NUMBER_7, NUMBER_3};
        Integer[] arrayCpy = new Integer[]{NUMBER_9, NUMBER_2, NUMBER_4, NUMBER_7, NUMBER_3};
        assertEquals(
                Arrays.toString(
                        new Integer[]{NUMBER_2, NUMBER_7, NUMBER_4, NUMBER_3, NUMBER_9}),
                Arrays.toString(sort.sortTwisted37(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
