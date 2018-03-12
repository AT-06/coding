package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for Kata10 testing.
 */
public class Kata10Test {
    private Kata10 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void setUp() {
        kata = new Kata10();
    }

    /**
     * Test with different numbers.
     */
    @Test
    public void testHighAndLow() {
        assertEquals("542 -214", kata.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * Test with one positive number and one negative.
     */
    @Test
    public void testPlusMinusNumbers() {
        assertEquals("1 -1", kata.highAndLow("1 -1"));
    }

    /**
     * Test with two positive numbers.
     */
    @Test
    public void testPlusPlusNumbers() {
        assertEquals("1 1", kata.highAndLow("1 1"));
    }

    /**
     * Test with two negative numbers.
     */
    @Test
    public void testMinusMinusNumbers() {
        assertEquals("-1 -1", kata.highAndLow("-1 -1"));
    }

    /**
     * Test with one positive, one negative, and zero.
     */
    @Test
    public void testPlusMinusZeroNumbers() {
        assertEquals("1 -1", kata.highAndLow("1 -1 0"));
    }

    /**
     * Test with two positive numbers and zero.
     */
    @Test
    public void testPlusPlusZero() {
        assertEquals("1 0", kata.highAndLow("1 1 0"));
    }

    /**
     * Test with two negative numbers and zero.
     */
    @Test
    public void testMinusMinusZero() {
        assertEquals("0 -1", kata.highAndLow("-1 -1 0"));
    }

    /**
     * Test with one number.
     */
    @Test
    public void testOneNumber() {
        assertEquals("42 42", kata.highAndLow("42"));
    }
}
