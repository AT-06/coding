package org.fundacionjala.coding.omar;

import org.junit.Before;
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
    private Kata7 fizzBuzz;

    /**
     * This method initializes kata7.
     */
    @Before
    public void initialize() {
        this.fizzBuzz = new Kata7();
    }

    /**
     * Test for testing the method whether three is Fizz number.
     */
    @Test
    public void testFizzBuzzThreeIsFizz() {
        final int numberFizzBuzz = 3;

        assertEquals("Fizz", fizzBuzz.isFizzBuzzNumber(numberFizzBuzz));
    }

    /**
     * Test for testing the method whether five is Buzz number.
     */
    @Test
    public void testFizzBuzzFiveIsBuzz() {
        final int numberFizzBuzz = 5;

        assertEquals("Buzz", fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether a number 1 is number 1.
     */
    @Test
    public void testFizzBuzzNumberOneIsOne() {
        final int numberFizzBuzz = 1;

        final String expected = "1";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether number 7 is 7.
     */
    @Test
    public void testFizzBuzzNumberSevenIsSeven() {
        final int numberFizzBuzz = 7;

        final String expected = "7";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether a number multiple of 3 is Fizz.
     */
    @Test
    public void testFizzBuzzTwelveMultipleOfThreeIsFizz() {
        final int numberFizzBuzz = 12;

        final String expected = "Fizz";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether a number contains three is Fizz.
     */
    @Test
    public void testFizzBuzzThirteenIsFizz() {
        final int numberFizzBuzz = 13;

        final String expected = "Fizz";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether fifteen is FizzBuzz number.
     */
    @Test
    public void testFizzBuzzFifteenIsFizzBuzz() {
        final int numberFizzBuzz = 15;

        final String expected = "FizzBuzz";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether a number multiple of 5 is Buzz.
     */
    @Test
    public void testFizzBuzzTwentyMultipleOfBuzz() {
        final int numberFizzBuzz = 20;

        final String expected = "Buzz";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }

    /**
     * Test for testing the method whether thirty is FizzBuzz number.
     */
    @Test
    public void testFizzBuzzThirtyIsFizzBuzz() {
        final int numberFizzBuzz = 30;

        final String expected = "FizzBuzz";
        assertEquals(expected, fizzBuzz.isFizzBuzzNumber((numberFizzBuzz)));
    }


}
