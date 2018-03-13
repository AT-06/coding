package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/12/2018.
 */
public class Kata10Test {
    private Kata10 highestLowest;

    /**
     * Method to initialize the object.
     */
    @Before
    public void initialize() {
        highestLowest = new  Kata10();
    }

    /**
     * First test.
     */
    @Test
    public void test1HighAndLowSomeTestKata10() {
        assertEquals("542 -214", highestLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * Second test.
     */
    @Test
    public void test2HighAndLowPlusMinusTestKata10() {
        assertEquals("1 -1", highestLowest.highAndLow("1 -1"));
    }

    /**
     * Third test.
     */
    @Test
    public void test3HighAndLowPlusPlusTestKata10() {
        assertEquals("1 1", highestLowest.highAndLow("1 1"));
    }

    /**
     * Fourth test.
     */
    @Test
    public void test4HighAndLowMinusMinusTestKata10() {
        assertEquals("-1 -1", highestLowest.highAndLow("-1 -1"));
    }

    /**
     * Fifth test.
     */
    @Test
    public void test5HighAndLowPlusMinusZeroTestKata10() {
        assertEquals("1 -1", highestLowest.highAndLow("1 -1 0"));
    }

    /**
     * Sixth test.
     */
    @Test
    public void test6HighAndLowPlusPlusZeroTestKata10() {
        assertEquals("1 0", highestLowest.highAndLow("1 1 0"));
    }

    /**
     * Seventh test.
     */
    @Test
    public void test7HighAndLowMinusMinusZeroTestKata10() {
        assertEquals("0 -1", highestLowest.highAndLow("-1 -1 0"));
    }

    /**
     * Eight test.
     */
    @Test
    public void test8HighAndLowSingleTestKata10() {
        assertEquals("42 42", highestLowest.highAndLow("42"));
    }
}
