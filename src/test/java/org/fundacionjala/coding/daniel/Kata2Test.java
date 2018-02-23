package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A class for testing Kata2 class.
 */
public class Kata2Test {

    private final Kata2 kata2 = new Kata2();

    /**
     * example tests for Kata 2 class.
     */
    @Test
    public void tests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
            kata2.sortInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", kata2.sortInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", kata2.sortInnerContent("this kata is easy"));
    }
}
