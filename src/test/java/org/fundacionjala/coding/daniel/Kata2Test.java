package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A class for testing Kata2 class.
 */
public class Kata2Test {
    private Kata2 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata2();
    }

    /**
     * example tests for Kata 2 class.
     */
    @Test
    public void tests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
            kata.sortInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", kata.sortInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", kata.sortInnerContent("this kata is easy"));
    }
}
