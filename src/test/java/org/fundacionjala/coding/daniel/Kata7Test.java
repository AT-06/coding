package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata7.
 */
public class Kata7Test {
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_32 = 32;
    private static final int NUMBER_25 = 25;
    private static final int NUMBER_05 = 05;
    private static final int NUMBER_15 = 15;
    private Kata7 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata7();
    }

    /**
     * Testing if a number is Buzz.
     */
    @Test
    public void testTheNumberIsBuzz() {
        assertEquals("Buzz", kata.fizzBuzz(NUMBER_05));
        assertEquals("Buzz", kata.fizzBuzz(NUMBER_25));
    }

    /**
     * Testing if a number is Fizz.
     */
    @Test
    public void testTheNumberIsFizz() {
        assertEquals("Fizz", kata.fizzBuzz(NUMBER_3));
        assertEquals("Fizz", kata.fizzBuzz(NUMBER_32));
    }

    /**
     * Testing if a number is FizzBuzz.
     */
    @Test
    public void testTheNumberIsFizzBuzz() {
        assertEquals("FizzBuzz", kata.fizzBuzz(NUMBER_15));
    }
}
