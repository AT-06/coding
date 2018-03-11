package org.fundacionjala.coding.ariel;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unittests.
 */
public class Kata6Test {

    /**
     * Condition1_BasicTests.
     */
    @Test
    public void basicTests() {
        Kata6 katita = new Kata6();
        final Integer[] result1 = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(Arrays.toString(result1), Arrays.toString(katita.sortTwisted37(input1)));
        final Integer[] result2 = {12, 14, 13};
        final Integer[] input2 = {12, 13, 14};
        assertEquals(Arrays.toString(result2), Arrays.toString(katita.sortTwisted37(input2)));
        final Integer[] result3 = {2, 7, 4, 3, 9};
        final Integer[] input3 = {9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(result3), Arrays.toString(katita.sortTwisted37(input3)));
    }

    /**
     * Condition2_UnChangedArrayTest.
     */
    @Test
    public void unChangedArrayTest() {
        Kata6 katita = new Kata6();
        final Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        final Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        final Integer[] result = {2, 7, 4, 3, 9};
        assertEquals(Arrays.toString(result), Arrays.toString(katita.sortTwisted37(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }

}
