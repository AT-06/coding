package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata10.java.
 */
public class Kata10Test {


    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6") // return "542 -214".
     */
    @Test
    public void testHighestAndLowestSomeTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("542 -214", highestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 -1") // return "1 -1.
     */
    @Test
    public void testHighestAndLowestPlusMinusTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("1 -1", highestAndLowest.highAndLow("1 -1"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 1") // return "1 1".
     */
    @Test
    public void testHighestAndLowestPlusPlusTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("1 1", highestAndLowest.highAndLow("1 1"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("-1 -1") // return "-1 -1".
     */
    @Test
    public void testHighestAndLowestMinusMinusTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("-1 -1", highestAndLowest.highAndLow("-1 -1"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 -1 0") // return "1 -1".
     */
    @Test
    public void testHighestAndLowestPlusMinusZeroTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("1 -1", highestAndLowest.highAndLow("1 -1 0"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 1 0") // return "1 0".
     */
    @Test
    public void testHighestAndLowestPlusPlusZeroTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("1 0", highestAndLowest.highAndLow("1 1 0"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("-1 -1 0") // return "0 -1".
     */
    @Test
    public void testHighestAndLowestMinusMinusZeroTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("0 -1", highestAndLowest.highAndLow("-1 -1 0"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("42") // return "42 42".
     */
    @Test
    public void testHighestAndLowestSingleTest() {
        Kata10 highestAndLowest = new Kata10();
        assertEquals("42 42", highestAndLowest.highAndLow("42"));

    }


}
