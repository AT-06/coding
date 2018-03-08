package org.fundacionjala.coding.daniel;

import static org.junit.Assert.*;

import org.junit.Test;

public class Kata7Test {
    @Test
    public void testThenumberIsFizz(){
        assertEquals("Buzz", Kata7.fizzBuzz(3));
    }

    @Test
    public void testThenumberIsBuzz(){
        assertEquals("Fizz", Kata7.fizzBuzz(25));
    }

    @Test
    public void testThenumberIsFizzBuzz(){
        assertEquals("FizzBuzz", Kata7.fizzBuzz(15));
    }

}