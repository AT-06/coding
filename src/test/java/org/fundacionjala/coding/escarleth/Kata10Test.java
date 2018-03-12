package org.fundacionjala.coding.escarleth;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * This class contains UnitTests for Kata6.
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
     * This method is for testing highAndLow number 542 -214.
     */
    @Test

    public void someTest() {

        assertEquals("542 -214", kata10.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));

    }

    /**
     * This method is for testing highAndLow number 1 -1.
     */
    @Test

    public void plusMinusTest() {

        assertEquals("1 -1", kata10.highAndLow("1 -1"));

    }

    /**
     * This method is for testing highAndLow number 1 1.
     */

    @Test

    public void plusPlusTest() {

        assertEquals("1 1", kata10.highAndLow("1 1"));

    }

    /**
     * This method is for testing highAndLow number -1 -1.
     */

    @Test

    public void minusMinusTest() {

        assertEquals("-1 -1", kata10.highAndLow("-1 -1"));

    }

    /**
     * This method is for testing highAndLow number 1 -1.
     */
    @Test

    public void plusMinusZeroTest() {

        assertEquals("1 -1", kata10.highAndLow("1 -1 0"));

    }

    /**
     * This method is for testing highAndLow number 1 0.
     */
    @Test

    public void plusPlusZeroTest() {

        assertEquals("1 0", kata10.highAndLow("1 1 0"));

    }

    /**
     * This method is for testing highAndLow number 0 -1.
     */
    @Test

    public void minusMinusZeroTest() {

        assertEquals("0 -1", kata10.highAndLow("-1 -1 0"));

    }

    /**
     * This method is for testing highAndLow number 42 42.
     */
    @Test

    public void singleTest() {

        assertEquals("42 42", kata10.highAndLow("42"));

    }

}


