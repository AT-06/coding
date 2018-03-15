package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Kata15Test {

    Kata15 kata = new Kata15();

    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2, kata.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(msg, 5, kata.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0, kata.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1, kata.mostFrequentItemCount(new int[] {9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3, kata.mostFrequentItemCount(new int[] {7, 1, 7, 1, 7, 1}));
    }

}