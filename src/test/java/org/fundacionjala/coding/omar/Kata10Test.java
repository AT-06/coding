package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata10.java.
 */
public class Kata10Test {

    private Kata10 highestAndLowest;

    @Before
    public void Kata10Test() {

        highestAndLowest = new Kata10();
    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6") // return "542 -214".
     */
    @Test
    public void testHighestAndLowestSomeTest() {

        assertEquals("542 -214", highestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 -1") // return "1 -1.
     */
    @Test
    public void testHighestAndLowestPlusMinusTest() {

        assertEquals("1 -1", highestAndLowest.highAndLow("1 -1"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 1") // return "1 1".
     */
    @Test
    public void testHighestAndLowestPlusPlusTest() {

        assertEquals("1 1", highestAndLowest.highAndLow("1 1"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("-1 -1") // return "-1 -1".
     */
    @Test
    public void testHighestAndLowestMinusMinusTest() {

        assertEquals("-1 -1", highestAndLowest.highAndLow("-1 -1"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 -1 0") // return "1 -1".
     */
    @Test
    public void testHighestAndLowestPlusMinusZeroTest() {

        assertEquals("1 -1", highestAndLowest.highAndLow("1 -1 0"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("1 1 0") // return "1 0".
     */
    @Test
    public void testHighestAndLowestPlusPlusZeroTest() {

        assertEquals("1 0", highestAndLowest.highAndLow("1 1 0"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("-1 -1 0") // return "0 -1".
     */
    @Test
    public void testHighestAndLowestMinusMinusZeroTest() {

        assertEquals("0 -1", highestAndLowest.highAndLow("-1 -1 0"));

    }

    /**
     * UnitTest for test method highestAndLowest(number).
     * HighAndLow("42") // return "42 42".
     */
    @Test
    public void testHighestAndLowestSingleTest() {

        assertEquals("42 42", highestAndLowest.highAndLow("42"));

    }


}
