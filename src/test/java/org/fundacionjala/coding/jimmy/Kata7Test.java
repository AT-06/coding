package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class is for testing the giveFizzBuzzNumbers method.
 */
public class Kata7Test {

    private Kata7 kata7;

    /**
     * This method initializes kata7.
     */
    @Before
    public void initialize() {
        kata7 = new Kata7();
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz1() {
        final int numberFizzBuzz = 3;

        assertEquals("Fizz", kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz2() {
        final int numberFizzBuzz = 5;

        assertEquals("Buzz", kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz3() {
        final int numberFizzBuzz = 1;

        final String expected = "1";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz4() {
        final int numberFizzBuzz = 7;

        final String expected = "7";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz5() {
        final  int numberFizzBuzz = 12;

        final String expected = "Fizz";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz6() {
        final int numberFizzBuzz = 13;

        final String expected = "Fizz";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz7() {
        final  int numberFizzBuzz = 15;

        final String expected = "FizzBuzz";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz8() {
        final int numberFizzBuzz = 20;

        final String expected = "Buzz";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz9() {
        final int numberFizzBuzz = 30;

        final String expected = "FizzBuzz";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }

    /**
     * Test for testing the method's expected and actual results.
     */
    @Test
    public void testFizzBuzz10() {
        final int numberFizzBuzz = 54;

        final String expected = "Buzz";
        assertEquals(expected, kata7.giveFizzBuzzNumbers(numberFizzBuzz));
    }
}
