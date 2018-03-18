package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class is in order to test the unit tests.
 */
public class Kata12Test {

    private Kata12 kata12;

    /**
     * This method initializes kata12.
     */
    @Before
    public void initialize() {
        kata12 = new Kata12();
    }

    /**
     * These are the basic tests in order to compare results of getScore method.
     */
    @Test
    public void basicTests() {
        final int expected = 50;
        final int number = 1;
        assertEquals(expected, kata12.getScore(number));
        final int expected1 = 150;
        final int number1 = 2;
        assertEquals(expected1, kata12.getScore(number1));
        final int expected2 = 300;
        final int number2 = 3;
        assertEquals(expected2, kata12.getScore(number2));
        final int expected3 = 500;
        final int number3 = 4;
        assertEquals(expected3, kata12.getScore(number3));
        final int expected4 = 750;
        final int number4 = 5;
        assertEquals(expected4, kata12.getScore(number4));
        final int expected5 = 1050;
        final int number5 = 6;
        assertEquals(expected5, kata12.getScore(number5));
        final int expected6 = 1400;
        final int number6 = 7;
        assertEquals(expected6, kata12.getScore(number6));
        final int expected7 = 1800;
        final int number7 = 8;
        assertEquals(expected7, kata12.getScore(number7));
        final int expected8 = 2250;
        final int number8 = 9;
        assertEquals(expected8, kata12.getScore(number8));
        final int expected9 = 2750;
        final int number9 = 10;
        assertEquals(expected9, kata12.getScore(number9));
        final int expected10 = 10500;
        final int number10 = 20;
        assertEquals(expected10, kata12.getScore(number10));
        final int expected11 = 23250;
        final int number11 = 30;
        assertEquals(expected11, kata12.getScore(number11));
        final int expected12 = 252500;
        final int number12 = 100;
        assertEquals(expected12, kata12.getScore(number12));
        final int expected13 = 381300;
        final int number13 = 123;
        assertEquals(expected13, kata12.getScore(number13));
        final int expected14 = 25025000;
        final int number14 = 1000;
        assertEquals(expected14, kata12.getScore(number14));
        final int expected15 = 38099750;
        final int number15 = 1234;
        assertEquals(expected15, kata12.getScore(number15));
    }
}
