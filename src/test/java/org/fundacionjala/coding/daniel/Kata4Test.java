package org.fundacionjala.coding.daniel;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata4 class.
 */
public class Kata4Test {
    private Kata4 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata4();
    }

    /**
     * unit testing of digitalRoot method.
     */
    @Test
    public void tests() {
        final int expected1 = 7;
        final int number1 = 16;
        final int expected2 = 6;
        final int number2 = 942;
        final int expected3 = 6;
        final int number3 = 132189;
        final int expected4 = 2;
        final int number4 = 493193;
        final int expected5 = 0;
        final int number5 = 0;
        final int expected6 = 9;
        final int number6 = 9;

        assertEquals(expected1, kata.digitalRoot(number1));
        assertEquals(expected2, kata.digitalRoot(number2));
        assertEquals(expected3, kata.digitalRoot(number3));
        assertEquals(expected4, kata.digitalRoot(number4));
        assertEquals(expected5, kata.digitalRoot(number5));
        assertEquals(expected6, kata.digitalRoot(number6));
    }
}
