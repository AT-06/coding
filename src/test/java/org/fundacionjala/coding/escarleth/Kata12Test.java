package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata12.
 */
public class Kata12Test {
    /**
     * This method is for testing a getScore.
     */
    @Test
    public void testSequenceToFindGetScore() {
        Kata12 number = new Kata12();
        final int expected1 = 50;
        final int number1 = 1;
        assertEquals("getScore(1) returns a wrong result", expected1, number.getScore(number1));
        final int expected2 = 150;
        final int number2 = 2;
        assertEquals("getScore(2) returns a wrong result", expected2, number.getScore(number2));
        final int expected3 = 300;
        final int number3 = 3;
        assertEquals("getScore(3) returns a wrong result", expected3, number.getScore(number3));
        final int expected4 = 500;
        final int number4 = 4;
        assertEquals("getScore(4) returns a wrong result", expected4, number.getScore(number4));
        final int expected5 = 750;
        final int number5 = 5;
        assertEquals("getScore(5) returns a wrong result", expected5, number.getScore(number5));
        final int expected6 = 1050;
        final int number6 = 6;
        assertEquals("getScore(6) returns a wrong result", expected6, number.getScore(number6));
        final int expected7 = 2750;
        final int number7 = 10;
        assertEquals("getScore(10) returns a wrong result", expected7, number.getScore(number7));
        final int expected8 = 10500;
        final int number8 = 20;
        assertEquals("getScore(20) returns a wrong result", expected8, number.getScore(number8));
        final int expected9 = 252500;
        final int number9 = 100;
        assertEquals("getScore(100) returns a wrong result", expected9, number.getScore(number9));
        final int expected10 = 381300;
        final int number10 = 123;
        assertEquals("getScore(123) returns a wrong result", expected10, number.getScore(number10));
        final int expected11 = 25025000;
        final int number11 = 1000;
        assertEquals("getScore(1000) returns a wrong result", expected11, number.getScore(number11));
        final int expected12 = 38099750;
        final int number12 = 1234;
        assertEquals("getScore(1234) returns a wrong result", expected12, number.getScore(number12));
    }

}

