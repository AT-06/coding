package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata2.java.
 */

public class Kata2Test {


    /**
     * This method is for testing if is correct:
     * "wait for me" -> "wiat for me".
     * "this kata is easy" -> "tihs ktaa is esay".
     * "I am" -> "I am".
     */
    @Test
    public void innerContentOfEveryWordCanBeSortInDescendingOrder() {
        Kata2 sort = new Kata2();
        assertEquals("wiat for me", sort.sortInDescendingOrder("wait for me"));
        assertEquals("tihs ktaa is esay", sort.sortInDescendingOrder("this kata is easy"));
        assertEquals("I am", sort.sortInDescendingOrder("I am"));

    }


}
