package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Escarleth L.
 * This class  contains a test FizzBuzz method
 */

public class Kata7Test {

    /**
     * This is a test to find a Fizz or Buzz or FizzBuzz.
     */
    @Test
    public void testFizzBuzz() {
        final int number1 = 9;
        final int number2 = 55;
        final int number3 = 30;
        final int number4 = 7;
        final int number5 = 51;
        final int number6 = 32;
        final int expected4 = 7;
        Kata7 kata7 = new Kata7();
        assertEquals("Fizz", kata7.fizzBuzz(number1));
        assertEquals("Buzz", kata7.fizzBuzz(number2));
        assertEquals("FizzBuzz", kata7.fizzBuzz(number3));
        assertEquals(String.valueOf(expected4), kata7.fizzBuzz(number4));
        assertEquals("Buzz", kata7.fizzBuzz(number5));
        assertEquals("Fizz", kata7.fizzBuzz(number6));
    }
}
