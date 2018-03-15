package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata15Test {

    private Kata15 kata;
    /**
     * init Kata.
     */
    @Before
    public void init(){

        kata = new Kata15();
    }
    /**
     * basic test.
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2, kata.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(msg, 5, kata.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
    /**
     * edgesTests.
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0, kata.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1, kata.mostFrequentItemCount(new int[] {9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3, kata.mostFrequentItemCount(new int[] {7, 1, 7, 1, 7, 1}));
    }

}