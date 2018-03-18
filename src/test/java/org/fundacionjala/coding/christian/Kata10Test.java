package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class Kata10Test {
    private Kata10 lower;

    /**
     *
     */
    @Before
    public void setup() {
        lower = new  Kata10();
    }

    /**
     * test.
     */
    @Test
    public void test1HighAndLowSomeTestKata10() {
        assertEquals("542 -214", lower.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * test.
     */
    @Test
    public void test2HighAndLowPlusMinusTestKata10() {
        assertEquals("1 -1", lower.highAndLow("1 -1"));
    }

    /**
     * test.
     */
    @Test
    public void test3HighAndLowPlusPlusTestKata10() {
        assertEquals("1 1", lower.highAndLow("1 1"));
    }

    /**
     * test.
     */
    @Test
    public void test4HighAndLowMinusMinusTestKata10() {
        assertEquals("-1 -1", lower.highAndLow("-1 -1"));
    }

    /**
     * test.
     */
    @Test
    public void test5HighAndLowPlusMinusZeroTestKata10() {
        assertEquals("1 -1", lower.highAndLow("1 -1 0"));
    }

    /**
     *  test.
     */
    @Test
    public void test6HighAndLowPlusPlusZeroTestKata10() {
        assertEquals("1 0", lower.highAndLow("1 1 0"));
    }

    /**
     *  test.
     */
    @Test
    public void test7HighAndLowMinusMinusZeroTestKata10() {
        assertEquals("0 -1", lower.highAndLow("-1 -1 0"));
    }

    /**
     * test.
     */
    @Test
    public void test8HighAndLowSingleTestKata10() {
        assertEquals("42 42", lower.highAndLow("42"));
    }

}
