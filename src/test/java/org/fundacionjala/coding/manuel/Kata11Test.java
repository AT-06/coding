package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/13/2018.
 */
public class Kata11Test {
    private Kata11 kata11;
    /**
     * Method to initialize.
     */
    @Before
    public void initialize() {
        kata11 = new Kata11();
    }

    /**
     * First test Evaporator.
     */
    @Test
    public void test1EvaporatorKata11() {
        final int expectedValue = 22;
        final double param1 = 10;
        assertEquals(expectedValue, kata11.evaporator(param1, param1, param1));
    }

    /**
     * Second test Evaporator.
     */
    @Test
    public void test2EvaporatorKata11() {
        final int expectedValue = 29;
        final double param1 = 10;
        final double param3 = 5;
        assertEquals(expectedValue, kata11.evaporator(param1, param1, param3));
    }

    /**
     * Third test Evaporator.
     */
    @Test
    public void test3EvaporatorKata11() {
        final int expectedValue = 59;
        final double param1 = 100;
        final double param2 = 5;
        assertEquals(expectedValue, kata11.evaporator(param1, param2, param2));
    }

    /**
     * Fourth test Evaporator.
     */
    @Test
    public void test4EvaporatorKata11() {
        final int expectedValue = 37;
        final double param1 = 50;
        final double param2 = 12;
        final double param3 = 1;
        assertEquals(expectedValue, kata11.evaporator(param1, param2, param3));
    }

    /**
     * Fifth test Evaporator.
     */
    @Test
    public void test5EvaporatorKata11() {
        final int expectedValue = 31;
        final double param1 = 47.5;
        final double param2 = 8;
        assertEquals(expectedValue, kata11.evaporator(param1, param2, param2));
    }

    /**
     * Sixth test Evaporator.
     */
    @Test
    public void test6EvaporatorKata11() {
        final int expectedValue = 459;
        final double param1 = 100;
        final double param2 = 1;
        assertEquals(expectedValue, kata11.evaporator(param1, param2, param2));
    }

    /**
     * Seventh test Evaporator.
     */
    @Test
    public void test7EvaporatorKata11() {
        final int expectedValue = 459;
        final double param1 = 10;
        final double param2 = 1;
        assertEquals(expectedValue, kata11.evaporator(param1, param2, param2));
    }

    /**
     * Eighth test Evaporator.
     */
    @Test
    public void test8EvaporatorKata11() {
        final int expectedValue = 299;
        final double param1 = 100;
        final double param2 = 1;
        final double param3 = 5;
        assertEquals(expectedValue, kata11.evaporator(param1, param2, param3));
    }
}
