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
        final int number1 = 3;
        final int number2 = 5;
        final int number3 = 15;
        final int number4 = 2;
        Kata7 kata5 = new Kata7();
        assertEquals("Fizz", kata5.fizzBuzz(number1));
        assertEquals("Buzz", kata5.fizzBuzz(number2));
        assertEquals("FizzBuzz", kata5.fizzBuzz(number3));
        assertEquals(String.valueOf(2), kata5.fizzBuzz(number4));
    }
}
