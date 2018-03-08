package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Ariel Gonzales V.
 * Test to check the FizzBuzzNumber method.
 */
public class Kata7Test {
    /**
     * Conditions.
     */
    @Test
    public void fizzBuzzNumber() {
        Kata7 katita = new Kata7();
        assertEquals("8", katita.fizzBuzz("8"));
        assertEquals("FizzBuzz", katita.fizzBuzz("15"));
        assertEquals("Buzz", katita.fizzBuzz("5"));
        assertEquals("Fizz", katita.fizzBuzz("3"));
        assertEquals("28", katita.fizzBuzz("28"));
        assertEquals("Fizz", katita.fizzBuzz("13"));
        assertEquals("Buzz", katita.fizzBuzz("151"));


    }

}
