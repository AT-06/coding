package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata15Test {


    private Kata15 kata;

    /**
     * init Kata.
     */
    @Before
    public void init() {

        kata = new Kata15();
    }

    /**
     * basic test.
     */
    @Test
    public void basicTests() {

        final int[] array1 = {3, -1, -1};
        final int[] array2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        final int number2 = 2;
        final int number5 = 5;
        String msg = "Should work with example test cases";
        assertEquals(msg, number2, kata.mostFrequentItemCount(array1));
        assertEquals(msg, number5, kata.mostFrequentItemCount(array2));
    }

    /**
     * edgesTests.
     */
    @Test
    public void edgeTests() {
        final int[] array1 = {7, 1, 7, 1, 7, 1};
        final int[] array2 = new int[0];
        final int[] array3 = {9};
        final int number0 = 0;
        final int number1 = 1;
        final int number3 = 3;

        assertEquals("Should work for empty arrays", number0, kata.mostFrequentItemCount(array2));
        assertEquals("Should work for 1-element arrays", number1, kata.mostFrequentItemCount(array3));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's",
                number3, kata.mostFrequentItemCount(array1));
    }

}
