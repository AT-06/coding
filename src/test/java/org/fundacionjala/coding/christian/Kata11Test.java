package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class Kata11Test {
    private Kata11 kata;
    /**
     *
     */
    @Before
    public void setUp() {
        kata = new Kata11();
    }

    /**
     *
     */
    @Test
    public void test1EvaporatorKata11() {
        final int expectedValue = 22;
        final double param1 = 10;
        assertEquals(expectedValue, kata.evaporator(param1, param1, param1));
    }

    /**
     *
     */
    @Test
    public void test2EvaporatorKata11() {
        final int expectedValue = 29;
        final double param1 = 10;
        final double param3 = 5;
        assertEquals(expectedValue, kata.evaporator(param1, param1, param3));
    }

    /**
     *
     */
    @Test
    public void test3EvaporatorKata11() {
        final int expectedValue = 59;
        final double param1 = 100;
        final double param2 = 5;
        assertEquals(expectedValue, kata.evaporator(param1, param2, param2));
    }

    /**
     *
     */
    @Test
    public void test4EvaporatorKata11() {
        final int expectedValue = 37;
        final double param1 = 50;
        final double param2 = 12;
        final double param3 = 1;
        assertEquals(expectedValue, kata.evaporator(param1, param2, param3));
    }

    /**
     *
     */
    @Test
    public void test5EvaporatorKata11() {
        final int expectedValue = 31;
        final double param1 = 47.5;
        final double param2 = 8;
        assertEquals(expectedValue, kata.evaporator(param1, param2, param2));
    }

    /**
     *
     */
    @Test
    public void test6EvaporatorKata11() {
        final int expectedValue = 459;
        final double param1 = 100;
        final double param2 = 1;
        assertEquals(expectedValue, kata.evaporator(param1, param2, param2));
    }

    /**
     *
     */
    @Test
    public void test7EvaporatorKata11() {
        final int expectedValue = 459;
        final double param1 = 10;
        final double param2 = 1;
        assertEquals(expectedValue, kata.evaporator(param1, param2, param2));
    }

    /**
     *
     */
    @Test
    public void test8EvaporatorKata11() {
        final int expectedValue = 299;
        final double param1 = 100;
        final double param2 = 1;
        final double param3 = 5;
        assertEquals(expectedValue, kata.evaporator(param1, param2, param3));
    }

}
