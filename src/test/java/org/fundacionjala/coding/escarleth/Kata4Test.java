package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata4.
 */
public class Kata4Test {
    /**
     * This method is for testing a digitalRoot number.
     */
    @Test
    public void testDigitalRoot() {

        final int number1 = 16;
        final int number2 = 942;
        final int number3 = 493193;
        final int expected1 = 7;
        final int expected2 = 6;
        final int expected3 = 2;

        Kata4 kata4 = new Kata4();
        assertEquals(expected1, kata4.digitalRoot(number1));
        assertEquals(expected2, kata4.digitalRoot(number2));
        assertEquals(expected3, kata4.digitalRoot(number3));
    }
}
