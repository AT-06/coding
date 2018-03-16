package org.fundacionjala.coding.escarleth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata11.
 */
public class Kata11Test {
    private Kata11 kata11;

    /**
     * initialize kata11.
     */
    @Before
    public void initialize() {
        kata11 = new Kata11();
    }

    /**
     * This method is for testing 22 days until evapor will be usefull.
     */

    @Test

    public void test1EvaporatorKata11() {
        final int expected1 = 22;
        final double param1 = 10;
        assertEquals(expected1, kata11.evaporator(param1, param1, param1));
    }

    /**
     * This method is for testing 29 days until evapor will be usefull.
     */
    @Test

    public void test2EvaporatorKata11() {
        final int expected1 = 29;
        final double param1 = 10;
        final double param3 = 5;
        assertEquals(expected1, kata11.evaporator(param1, param1, param3));
    }

    /**
     * This method is for testing a 59 days until evapor will be usefull .
     */
    @Test

    public void test3EvaporatorKata11() {
        final int expected1 = 59;
        final double param1 = 100;
        final double param2 = 5;
        assertEquals(expected1, kata11.evaporator(param1, param2, param2));
    }

    /**
     * This method is for testing 37 days until evapor will be usefull.
     */
    @Test

    public void test4EvaporatorKata11() {
        final int expected1 = 37;
        final double param1 = 50;
        final double param2 = 12;
        final double param3 = 1;
        assertEquals(expected1, kata11.evaporator(param1, param2, param3));
    }


    /**
     * This method is for testing 31 days until evapor will be usefull.
     */
    @Test

    public void test5EvaporatorKata11() {
        final int expected1 = 31;
        final double param1 = 47.5;
        final double param2 = 8;
        assertEquals(expected1, kata11.evaporator(param1, param2, param2));
    }

    /**
     * This method is for 459 days until evapor will be usefull.
     */
    @Test

    public void test6EvaporatorKata11() {
        final int expected1 = 459;
        final double param1 = 100;
        final double param2 = 1;
        assertEquals(expected1, kata11.evaporator(param1, param2, param2));
    }

    /**
     * This method is for testing 459 days until evapor will be usefull.
     */
    @Test

    public void test7EvaporatorKata11() {
        final int expected1 = 459;
        final double param1 = 10;
        final double param2 = 1;
        assertEquals(expected1, kata11.evaporator(param1, param2, param2));
    }

    /**
     * This method is for testing 299 days until evapor will be usefull.
     */
    @Test

    public void test8EvaporatorKata11() {
        final int expected1 = 299;
        final double param1 = 100;
        final double param2 = 1;
        final double param3 = 5;
        assertEquals(expected1, kata11.evaporator(param1, param2, param3));
    }
}
