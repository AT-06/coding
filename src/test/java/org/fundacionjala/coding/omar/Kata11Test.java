package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata11.java.
 */
public class Kata11Test {


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
        final int number10 = 10;

        assertEquals(expected, evaporator.evaporator(number10, number10, number10));
    }

    /**
     * This method is for test evaporator(10,10,5) => 29.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expected = 29;
        final int number10 = 10;
        final int number5 = 5;
        assertEquals(expected, evaporator.evaporator(number10, number10, number5));
    }

    /**
     * This method is for test evaporator(100,5,5) => 59.
     */
    @Test
    public void testEvaporatorThree() {
        final int expected = 59;
        final int number100 = 100;
        final int number5 = 5;
        assertEquals(expected, evaporator.evaporator(number100, number5, number5));
    }

    /**
     * This method is for test evaporator(50,12,1) => 37.
     */
    @Test
    public void testEvaporatorFour() {
        final int expected = 37;
        final double number50 = 50;
        final double number12 = 12;
        final int number1 = 1;

        assertEquals(expected, evaporator.evaporator(number50, number12, number1));
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
        final int number100 = 100;
        final int number1 = 1;


        assertEquals(expected, evaporator.evaporator(number100, number1, number1));
    }

    /**
     * This method is for test evaporator(10,1,1) => 459.
     */
    @Test
    public void testEvaporatorSeven() {
        final int expected = 459;
        final int number10 = 10;
        final int number1 = 1;

        assertEquals(expected, evaporator.evaporator(number10, number1, number1));
    }

    /**
     * This method is for test evaporator(100,1,5) => 299.
     */
    @Test
    public void testEvaporatorEight() {
        final int expected = 299;
        final int number100 = 100;
        final int number1 = 1;
        final int number5 = 5;
        assertEquals(expected, evaporator.evaporator(number100, number1, number5));
    }

}
