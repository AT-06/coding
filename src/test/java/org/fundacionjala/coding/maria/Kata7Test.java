package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test for kara 7.
 */
public class Kata7Test {
    private Kata7 kata7;
    /**
     * initialize kata7.
     */
    @Before
    public void initialize() {
        kata7 = new Kata7();
    }

    /**
     * testFizzBuzzThree using 3.
     */
    @Test
    public void testFizzBuzzThree() {
        final int caso = 3;
        assertEquals("Fizz", kata7.fizzBuzz(caso));
    }

    /**
     * testFizzBuzzFive using 5,.
     */
    @Test
    public void testFizzBuzzFive() {
        final int caso = 5;
        assertEquals("Buzz", kata7.fizzBuzz(caso));
    }

    /**
     * testFizzBuzzFiveThree using 15.
     */
    @Test
    public void testFizzBuzzFiveThree() {
        final int caso = 15;
        assertEquals("FizzBuzz", kata7.fizzBuzz(caso));
    }

    /**
     * testFizzBuzzContainsThree using 23.
     */
    @Test
    public void testFizzBuzzContainsTrece() {
        final int caso = 13;
        assertEquals("Fizz", kata7.fizzBuzz(caso));
    }

    /**
     * testFizzBuzzContainsFive using 52.
     */
    @Test
    public void testFizzBuzzContainsFive() {
        final int caso = 52;
        assertEquals("Buzz", kata7.fizzBuzz(caso));
    }
    /**
     * testFizzBuzzContainsThree using 23.
     */
    @Test
    public void testFizzBuzzContainsAnything() {
        final int caso = 8;
        assertEquals("8", kata7.fizzBuzz(caso));
    }
}
