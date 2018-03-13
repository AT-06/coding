package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata11.java.
 */
public class Kata11Test {

    private static final int NUMBER_10 = 10;
    private static final int NUMBER_100 = 100;
    private static final int NUMBER_1 = 1;
    private static final int NUMBER_5 = 5;
    private Kata11 evaporator;

    /**
     * This method initialize Kata11.
     */
    @Before
    public void init() {

        evaporator = new Kata11();
    }

    /**
     * This method is for test evaporator(10,10,10) => 22.
     */
    @Test
    public void testEvaporatorOne() {
        final int expected = 22;
        assertEquals(expected, evaporator.evaporator(NUMBER_10, NUMBER_10, NUMBER_10));
    }

    /**
     * This method is for test evaporator(10,10,5) => 29.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expected = 29;
        assertEquals(expected, evaporator.evaporator(NUMBER_10, NUMBER_10, NUMBER_5));
    }

    /**
     * This method is for test evaporator(100,5,5) => 59.
     */
    @Test
    public void testEvaporatorThree() {
        final int expected = 59;
        assertEquals(expected, evaporator.evaporator(NUMBER_100, NUMBER_5, NUMBER_5));
    }

    /**
     * This method is for test evaporator(50,12,1) => 37.
     */
    @Test
    public void testEvaporatorFour() {
        final int expected = 37;
        final double number50 = 50;
        final double number12 = 12;
        assertEquals(expected, evaporator.evaporator(number50, number12, NUMBER_1));
    }

    /**
     * This method is for test evaporator(47.5,8,8) => 31.
     */
    @Test
    public void testEvaporatorFive() {
        final int expected = 31;
        final double number47point5 = 47.5;
        final double number8 = 8;
        assertEquals(expected, evaporator.evaporator(number47point5, number8, number8));
    }

    /**
     * This method is for test evaporator(100,1,1) => 459.
     */
    @Test
    public void testEvaporatorSix() {
        final int expected = 459;
        assertEquals(expected, evaporator.evaporator(NUMBER_100, NUMBER_1, NUMBER_1));
    }

    /**
     * This method is for test evaporator(10,1,1) => 459.
     */
    @Test
    public void testEvaporatorSeven() {
        final int expected = 459;
        assertEquals(expected, evaporator.evaporator(NUMBER_10, NUMBER_1, NUMBER_1));
    }

    /**
     * This method is for test evaporator(100,1,5) => 299.
     */
    @Test
    public void testEvaporatorEight() {
        final int expected = 299;
        assertEquals(expected, evaporator.evaporator(NUMBER_100, NUMBER_1, NUMBER_5));
    }

}
