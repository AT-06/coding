package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class in which there are unit test in order to complete
 * the coverage of the method.
 */
public class Kata10Test {

    private Kata10 kata10;

    /**
     * Method that initializes kata10.
     */
    @Before
    public void initialize() {
        kata10 = new Kata10();
    }

    /**
     * Method is to verify the return of the method in a string
     * of random values.
     */
    @Test
    public void testHighAndLowRandomNumbers() {
        assertEquals("542 -214", kata10.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * Method with plus and minus values.
     */
    @Test
    public void testHighAndLowPlusMinusTest() {
        assertEquals("1 -1", kata10.highAndLow("1 -1"));
    }

    /**
     * Method with plus and plus values.
     */
    @Test
    public void testHighAndLowPlusPlusTest() {
        assertEquals("1 1", kata10.highAndLow("1 1"));
    }

    /**
     * Method with minus and minus values.
     */
    @Test
    public void testHighAndLowMinusMinusTest() {
        assertEquals("-1 -1", kata10.highAndLow("-1 -1"));
    }

    /**
     * Method with plus, minus and zero values.
     */
    @Test
    public void testHighAndLowPlusMinusZeroTest() {
        assertEquals("1 -1", kata10.highAndLow("1 -1 0"));
    }

    /**
     * Method with two plus and zero values.
     */
    @Test
    public void testHighAndLowPlusPlusZeroTest() {
        assertEquals("1 0", kata10.highAndLow("1 1 0"));
    }

    /**
     * Method with two minus and zero values.
     */
    @Test
    public void testHighAndLowMinusMinusZeroTest() {
        assertEquals("0 -1", kata10.highAndLow("-1 -1 0"));
    }

    /**
     * Method with a single value.
     */
    @Test
    public void testHighAndLowSingleTest() {
        assertEquals("42 42", kata10.highAndLow("42"));
    }
}
