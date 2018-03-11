package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata7.
 */
public class Kata7Test {
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
        final int number = 25;
        final int number1 = 151;
        assertEquals("Buzz", kata.fizzBuzz(number));
        assertEquals("Buzz", kata.fizzBuzz(number1));
    }

    /**
     * Testing if a number is Fizz.
     */
    @Test
    public void testTheNumberIsFizz() {
        final int number = 3;
        final int number1 = 32;
        assertEquals("Fizz", kata.fizzBuzz(number));
        assertEquals("Fizz", kata.fizzBuzz(number1));
    }

    /**
     * Testing if a number is FizzBuzz.
     */
    @Test
    public void testTheNumberIsFizzBuzz() {
        final int number = 15;
        final int number1 = 45;
        assertEquals("FizzBuzz", kata.fizzBuzz(number));
        assertEquals("FizzBuzz", kata.fizzBuzz(number1));
    }

    /**
     * Testing if a number is not "Fizz", "Buzz" or "FizzBuzz".
     */
    @Test
    public void testTheNumberIsNotFizzBuzz() {
        final int number = 17;
        final int number1 = 91;
        assertEquals("17", kata.fizzBuzz(number));
        assertEquals("91", kata.fizzBuzz(number1));
    }
}
