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
        Kata4 kata4 = new Kata4();

        final int numberTesting1 = 16;
        final int numberTesting2 = 942;
        final int numberTesting3 = 493193;
        final int expectedResult1 = 7;
        final int expectedResult2 = 6;
        final int expectedResult3 = 2;

        assertEquals(expectedResult1, kata4.digitalRoot(numberTesting1));
        assertEquals(expectedResult2, kata4.digitalRoot(numberTesting2));
        assertEquals(expectedResult3, kata4.digitalRoot(numberTesting3));
    }
}
