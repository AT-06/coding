package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unittests.
 */
public class Kata10Test {
    /**
     * Chechk the someTest..
     */
    @Test
    public void someTest() {
        Kata10 katita = new Kata10();
        assertEquals("542 -214", katita.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * Check the plusMinusTest.
     */
    @Test
    public void plusMinusTest() {
        Kata10 katita = new Kata10();
        assertEquals("1 -1", katita.highAndLow("1 -1"));
    }

    /**
     * Check the plusPlusTest.
     */
    @Test
    public void plusPlusTest() {
        Kata10 katita = new Kata10();
        assertEquals("1 1", katita.highAndLow("1 1"));
    }

    /**
     * Check the minusMinutTest.
     */
    @Test
    public void minusMinusTest() {
        Kata10 katita = new Kata10();
        assertEquals("-1 -1", katita.highAndLow("-1 -1"));
    }

    /**
     * Check the plusMinusZeroTest.
     */
    @Test
    public void plusMinusZeroTest() {
        Kata10 katita = new Kata10();
        assertEquals("1 -1", katita.highAndLow("1 -1 0"));
    }


    /**
     * Check the plusPlusZeroTest.
     */
    @Test
    public void plusPlusZeroTest() {
        Kata10 katita = new Kata10();
        assertEquals("1 0", katita.highAndLow("1 1 0"));
    }

    /**
     * Check the minusMinusZeroTest.
     */
    @Test
    public void minusMinusZeroTest() {
        Kata10 katita = new Kata10();
        assertEquals("0 -1", katita.highAndLow("-1 -1 0"));
    }


    /**
     * Check the singleTest.
     */
    @Test
    public void singleTest() {
        Kata10 katita = new Kata10();
        assertEquals("42 42", katita.highAndLow("42"));
    }

}
