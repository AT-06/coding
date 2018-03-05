package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata2.
 */
public class Kata2Test {
    /**
     * This method is for testing a word that will be sortTheInnerContentInDescendingOrder.
     */
    @Test
    public void testSortTheInnerContentInDescendingOrder() {
        Kata2 kata2 = new Kata2();
        assertEquals("wiat for me", kata2.sortInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", kata2.sortInnerContent("this kata is easy"));
        assertEquals("I am", kata2.sortInnerContent("I am"));
    }
}
