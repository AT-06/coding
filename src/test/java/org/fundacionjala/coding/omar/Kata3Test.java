package org.fundacionjala.coding.omar;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * This class contains UnitTests for Kata3.java.
 */
public class Kata3Test {

    /**
     * This method is for testing if is correct
     * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 // and 4 has only one digit.
     * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126 // 1*2*6 = 12, and finally 1*2 = 2
     * persistence(4) == 0 // because 4 is already a one-digit number.
     */
    @Test
    public void testPersistence() {
        final int number1 = 39;
        final int number2 = 4;
        final int number3 = 25;
        final int number4 = 999;
        final int number5 = 444;
        final int expected1 = 3;
        final int expected2 = 0;
        final int expected3 = 2;
        final int expected4 = 4;
        final int expected5 = 3;

        Kata3 persist = new Kata3();
        assertEquals(expected1, persist.persistence(number1));
        assertEquals(expected2, persist.persistence(number2));
        assertEquals(expected3, persist.persistence(number3));
        assertEquals(expected4, persist.persistence(number4));
        assertEquals(expected5, persist.persistence(number5));
    }

}
