package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata12 class.
 */
public class Kata12Test {
    private Kata12 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void setUp() {
        kata = new Kata12();
    }

    /**
     * Unit testing of getScore method.
     */
    @Test
    public void testGetScore() {
        final int expected1 = 50;
        final int number1 = 1;
        assertEquals("getScore(1) returns a wrong result", expected1, kata.getScore(number1));
        final int expected2 = 150;
        final int number2 = 2;
        assertEquals("getScore(2) returns a wrong result", expected2, kata.getScore(number2));
        final int expected3 = 300;
        final int number3 = 3;
        assertEquals("getScore(3) returns a wrong result", expected3, kata.getScore(number3));
        final int expected4 = 500;
        final int number4 = 4;
        assertEquals("getScore(4) returns a wrong result", expected4, kata.getScore(number4));
        final int expected5 = 750;
        final int number5 = 5;
        assertEquals("getScore(5) returns a wrong result", expected5, kata.getScore(number5));
        final int expected6 = 1050;
        final int number6 = 6;
        assertEquals("getScore(6) returns a wrong result", expected6, kata.getScore(number6));
        final int expected7 = 1400;
        final int number7 = 7;
        assertEquals("getScore(7) returns a wrong result", expected7, kata.getScore(number7));
        final int number8 = 8;
        final int expected8 = 1800;
        assertEquals("getScore(8) returns a wrong result", expected8, kata.getScore(number8));
        final int expected9 = 2250;
        final int number9 = 9;
        assertEquals("getScore(9) returns a wrong result", expected9, kata.getScore(number9));
        final int expected10 = 2750;
        final int number10 = 10;
        assertEquals("getScore(10) returns a wrong result", expected10, kata.getScore(number10));
        final int expected11 = 10500;
        final int number11 = 20;
        assertEquals("getScore(20) returns a wrong result", expected11, kata.getScore(number11));
        final int expected12 = 23250;
        final int number12 = 30;
        assertEquals("getScore(30) returns a wrong result", expected12, kata.getScore(number12));
        final int expected13 = 252500;
        final int number13 = 100;
        assertEquals("getScore(100) returns a wrong result", expected13, kata.getScore(number13));
        final int expected14 = 381300;
        final int number14 = 123;
        assertEquals("getScore(123) returns a wrong result", expected14, kata.getScore(number14));
        final int expected15 = 25025000;
        final int number15 = 1000;
        assertEquals("getScore(1000) returns a wrong result", expected15, kata.getScore(number15));
        final int expected16 = 38099750;
        final int number16 = 1234;
        assertEquals("getScore(1234) returns a wrong result", expected16, kata.getScore(number16));
        final long expected17 = 2500250000L;
        final int number17 = 10000;
        assertEquals("getScore(10000) returns a wrong result", expected17, kata.getScore(number17));
        final long expected18 = 3810284250L;
        final int number18 = 12345;
        assertEquals("getScore(12345) returns a wrong result", expected18, kata.getScore(number18));
    }
}
