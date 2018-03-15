package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata12.java.
 */
public class Kata12Test {


    /**
     * This Unit Test it is for test .getScore() method.
     * getScore(1); // == 50
     * getScore(2); // == 150
     * getScore(3); // == 300
     * // ...
     */
    @Test
    public void testGetScoreBasicTests() {

        Kata12 score = new Kata12();
        final int expected1 = 50;
        final int number1 = 1;
        assertEquals("getScore(1) returns a wrong result", expected1, score.getScore(number1));
        final int expected2 = 150;
        final int number2 = 2;
        assertEquals("getScore(2) returns a wrong result", expected2, score.getScore(number2));
        final int expected3 = 300;
        final int number3 = 3;
        assertEquals("getScore(3) returns a wrong result", expected3, score.getScore(number3));
        final int expected4 = 500;
        final int number4 = 4;
        assertEquals("getScore(4) returns a wrong result", expected4, score.getScore(number4));
        final int expected5 = 750;
        final int number5 = 5;
        assertEquals("getScore(5) returns a wrong result", expected5, score.getScore(number5));
        final int expected6 = 1050;
        final int number6 = 6;
        assertEquals("getScore(6) returns a wrong result", expected6, score.getScore(number6));
        final int expected7 = 1400;
        final int number7 = 7;
        assertEquals("getScore(7) returns a wrong result", expected7, score.getScore(number7));
        final int number8 = 8;
        final int expected8 = 1800;
        assertEquals("getScore(8) returns a wrong result", expected8, score.getScore(number8));
        final int expected9 = 2250;
        final int number9 = 9;
        assertEquals("getScore(9) returns a wrong result", expected9, score.getScore(number9));
        final int expected10 = 2750;
        final int number10 = 10;
        assertEquals("getScore(10) returns a wrong result", expected10, score.getScore(number10));
        final int expected11 = 10500;
        final int number11 = 20;
        assertEquals("getScore(20) returns a wrong result", expected11, score.getScore(number11));
        final int expected12 = 23250;
        final int number12 = 30;
        assertEquals("getScore(30) returns a wrong result", expected12, score.getScore(number12));
        final int expected13 = 252500;
        final int number13 = 100;
        assertEquals("getScore(100) returns a wrong result", expected13, score.getScore(number13));
        final int expected14 = 381300;
        final int number14 = 123;
        assertEquals("getScore(123) returns a wrong result", expected14, score.getScore(number14));
        final int expected15 = 25025000;
        final int number15 = 1000;
        assertEquals("getScore(1000) returns a wrong result", expected15, score.getScore(number15));
        final int expected16 = 38099750;
        final int number16 = 1234;
        assertEquals("getScore(1234) returns a wrong result", expected16, score.getScore(number16));
        final long expected17 = 2500250000L;
        final int number17 = 10000;
        assertEquals("getScore(10000) returns a wrong result", expected17, score.getScore(number17));
        final long expected18 = 3810284250L;
        final int number18 = 12345;
        assertEquals("getScore(12345) returns a wrong result", expected18, score.getScore(number18));
    }

}
