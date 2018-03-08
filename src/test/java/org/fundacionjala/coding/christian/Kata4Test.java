package org.fundacionjala.coding.christian;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Kata4Test {
    /**
     * Test testDigital.
     */
    @Test
    public void testDigital() {
        final int number1 = 16;
        final int number2 = 942;
        final int number3 = 132189;
        final int number4 = 493193;
        final int expected1 = 7;
        final int expected2 = 6;
        final int expected3 = 6;
        final int expected4 = 2;
        Kata4 digital = new Kata4();
        assertEquals(expected1, digital.digitalRoot(number1));
        assertEquals(expected2, digital.digitalRoot(number2));
        assertEquals(expected3, digital.digitalRoot(number3));
        assertEquals(expected4, digital.digitalRoot(number4));

    }
}
