package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata3.
 */
public class Kata3Test {
    private Kata3 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata3();
    }

    /**
     * unit testing of persistence method.
     */
    @Test
    public void tests() {
        final int expected1 = 3;
        final int number1 = 39;
        final int expected2 = 0;
        final int number2 = 4;
        final int expected3 = 2;
        final int number3 = 25;
        final int expected4 = 4;
        final int number4 = 999;

        assertEquals(expected1, kata.persistence(number1));
        assertEquals(expected2, kata.persistence(number2));
        assertEquals(expected3, kata.persistence(number3));
        assertEquals(expected4, kata.persistence(number4));

    }
}
