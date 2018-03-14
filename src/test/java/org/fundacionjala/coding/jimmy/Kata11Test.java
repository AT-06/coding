package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to verify the unit tests.
 */
public class Kata11Test {

    private Kata11 kata11;

    /**
     * Initializes kata11.
     */
    @Before
    public void initialize() {
        kata11 = new Kata11();
    }

    /**
     * First evaporator test.
     */
    @Test
    public void testEvaporatorOne() {
        final int expected = 22;
        final int contentMl = 10;
        final int evaporeDay = 10;
        final int threshold = 10;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Second evaporator test.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expected = 29;
        final int contentMl = 10;
        final int evaporeDay = 10;
        final int threshold = 5;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Third evaporator test.
     */
    @Test
    public void testEvaporatorThree() {
        final int expected = 59;
        final int contentMl = 100;
        final int evaporeDay = 5;
        final int threshold = 5;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Fourth evaporator test.
     */
    @Test
    public void testEvaporatorFour() {
        final int expected = 37;
        final int contentMl = 50;
        final int evaporeDay = 12;
        final int threshold = 1;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Fifth evaporator test.
     */
    @Test
    public void testEvaporatorFive() {
        final int expected = 31;
        final double contentMl = 47.5;
        final int evaporeDay = 8;
        final int threshold = 8;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Sixth evaporator test.
     */
    @Test
    public void testEvaporatorSix() {
        final int expected = 459;
        final int contentMl = 100;
        final int evaporeDay = 1;
        final int threshold = 1;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Seventh evaporator test.
     */
    @Test
    public void testEvaporatorSeven() {
        final int expected = 459;
        final int contentMl = 10;
        final int evaporeDay = 1;
        final int threshold = 1;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }

    /**
     * Eighth evaporator test.
     */
    @Test
    public void testEvaporatorEight() {
        final int expected = 299;
        final int contentMl = 100;
        final int evaporeDay = 1;
        final int threshold = 5;
        assertEquals(expected, kata11.evaporator(contentMl, evaporeDay, threshold));
    }
}
