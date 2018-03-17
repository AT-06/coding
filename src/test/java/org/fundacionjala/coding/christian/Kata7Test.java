package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Powered by Christian.
 */

public class Kata7Test {
    private Kata7 kataSeven;
    static final int NUMBER = 25;
    static final int NUMBER_1 = 151;
    static final int NUMBER_2 = 3;
    static final int NUMBER_3 = 32;
    static final int NUMBER_4 = 15;
    static final int NUMBER_5 = 26;

    /**
     *
     */
    @Before
    public void setup() {
        kataSeven = new Kata7();
    }
    /**
     * Tests.
     */
    @Test
    public void testFizzBuzzNumber() {
        assertEquals("Buzz", kataSeven.fizzBuzz(NUMBER));
        assertEquals("Buzz", kataSeven.fizzBuzz(NUMBER_1));
        assertEquals("FizzBuzz", kataSeven.fizzBuzz(NUMBER_4));
        assertEquals("Fizz", kataSeven.fizzBuzz(NUMBER_2));
        assertEquals("Fizz", kataSeven.fizzBuzz(NUMBER_3));
        assertEquals("26", kataSeven.fizzBuzz(NUMBER_5));

    }

}
