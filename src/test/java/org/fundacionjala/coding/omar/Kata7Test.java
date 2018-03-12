package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata1.java.
 */
public class Kata7Test {

    private static final int NUMBER_3 = 3;
    private static final int NUMBER_5 = 5;
    private static final int NUMBER_15 = 15;
    private static final int NUMBER_16 = 16;
    private static final int NUMBER_151 = 151;
    private static final int NUMBER_13 = 13;

    /**
     * This method is for test fizzBuzz method.
     * isFizzBuzzNumber( 3 ) => returns "Fizz".
     * isFizzBuzzNumber( 5 ) => returns "Buzz".
     * isFizzBuzzNumber( 15 )=> returns "FizzBuzz".
     * isFizzBuzzNumber( 16 )=> returns "16".
     */
    @Test
    public void basicTestFizzBuzz() {
        Kata7 fizzBuzz = new Kata7();
        assertEquals("Fizz", fizzBuzz.isFizzBuzzNumber(NUMBER_3));
        assertEquals("Buzz", fizzBuzz.isFizzBuzzNumber(NUMBER_5));
        assertEquals("FizzBuzz", fizzBuzz.isFizzBuzzNumber(NUMBER_15));
        assertEquals("16", fizzBuzz.isFizzBuzzNumber(NUMBER_16));
        assertEquals("Buzz", fizzBuzz.isFizzBuzzNumber(NUMBER_151));
        assertEquals("Fizz", fizzBuzz.isFizzBuzzNumber(NUMBER_13));


    }

}
