package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata4.java.
 */
public class Kata4Test {

    /**
     * This method is for test the recursive sum of all the digits in a number.
     * <p>
     * digital_root(16)
     * => 1 + 6
     * => 7
     * <p>
     * digital_root(942)
     * => 9 + 4 + 2
     * => 15 ...
     * => 1 + 5
     * => 6
     * <p>
     * digital_root(132189)
     * => 1 + 3 + 2 + 1 + 8 + 9
     * => 24 ...
     * => 2 + 4
     * => 6
     * <p>
     * digital_root(493193)
     * => 4 + 9 + 3 + 1 + 9 + 3
     * => 29 ...
     * => 2 + 9
     * => 11 ...
     * => 1 + 1
     * => 2
     */
    @Test
    public void testDigitalRootIfMoreThatOneWordIsPresent() {
        Kata4 dRoot = new Kata4();

        final int number1 = 7;
        final int number2 = 6;
        final int number3 = 6;
        final int number4 = 2;
        final int result1 = 16;
        final int result2 = 942;
        final int result3 = 132189;
        final int result4 = 493193;

        assertEquals(number1, dRoot.digitalRoot(result1));
        assertEquals(number2, dRoot.digitalRoot(result2));
        assertEquals(number3, dRoot.digitalRoot(result3));
        assertEquals(number4, dRoot.digitalRoot(result4));
    }


}
