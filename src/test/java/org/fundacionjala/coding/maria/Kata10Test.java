package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * kata 10.
 */
public class Kata10Test {
    private Kata10 kata10;
    /**
     * initialize kata10.
     */
    @Before
    public void initialize() {
        kata10 = new Kata10();
    }

    /**
     * someTest test.
     */
    @Test

    public void someTest() {
        assertEquals("542 -214", kata10.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }
    /**
     * plusMinusTest test.
     */
    @Test
    public void plusMinusTest() {
        assertEquals("1 -1", kata10.highAndLow("1 -1"));
    }
    /**
     * plusPlusTest test.
     */
    @Test
    public void plusPlusTest() {
        assertEquals("1 1", kata10.highAndLow("1 1"));
    }
    /**
     * minusMinusTest test.
     */
    @Test
    public void minusMinusTest() {
        assertEquals("-1 -1", kata10.highAndLow("-1 -1"));
    }
    /**
     * plusMinusZeroTest test.
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals("1 -1", kata10.highAndLow("1 -1 0"));
    }
    /**
     * plusPlusZeroTest test.
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals("1 0", kata10.highAndLow("1 1 0"));
    }
    /**
     * minusMinusZeroTest test.
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals("0 -1", kata10.highAndLow("-1 -1 0"));
    }
    /**
     * singleTest test.
     */
    @Test
    public void singleTest() {
        assertEquals("42 42", kata10.highAndLow("42"));
    }
}
