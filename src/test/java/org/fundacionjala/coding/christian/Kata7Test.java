package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Christian.
 */
public class Kata7Test {
    private Kata7 kataSeven;

    /**
     *
     */
    @Before
    public void setup(){
        kataSeven= new Kata7();
    }
    /**
     * Tests.
     */
    @Test
    public void testFizzBuzzNumber() {

        assertEquals("FizzBuzz", kataSeven.fizzBuzz("15"));
        assertEquals("Buzz", kataSeven.fizzBuzz("5"));
        assertEquals("Fizz", kataSeven.fizzBuzz("3"));
        assertEquals("28", kataSeven.fizzBuzz("28"));
        assertEquals("Fizz", kataSeven.fizzBuzz("13"));
        assertEquals("Buzz", kataSeven.fizzBuzz("151"));


    }

}