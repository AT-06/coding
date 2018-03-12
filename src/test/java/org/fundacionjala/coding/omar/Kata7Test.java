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

    /**
     * This method is for test fizzBuzz method.
     * isFizzBuzzNumer( 3 ) => returns "Fizz".
     * isFizzBuzzNumer( 5 ) => returns "Buzz".
     * isFizzBuzzNumer( 15 )=> returns "FizzBuzz".
     * isFizzBuzzNumer( 16 )=> returns "16".
     */
    @Test
    public void basicTestFizzBuzz() {
        Kata7 fizzBuzz = new Kata7();
        assertEquals("Fizz", fizzBuzz.isFizzBuzzNumer(NUMBER_3));
        assertEquals("Buzz", fizzBuzz.isFizzBuzzNumer(NUMBER_5));
        assertEquals("FizzBuzz", fizzBuzz.isFizzBuzzNumer(NUMBER_15));
        assertEquals("16", fizzBuzz.isFizzBuzzNumer(NUMBER_16));

    }

}
