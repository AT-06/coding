package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for Kata 11 testing.
 */
public class Kata11Test {
    private Kata11 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void setUp() {
        kata = new Kata11();
    }

    /**
     * Some tests for evaporator method.
     */
    @Test
    public void testEvaporator() {
        final int content = 100;
        final int ten = 10;
        final int expected1 = 22;
        final int expected2 = 29;
        final int five = 5;
        final int expected3 = 59;
        final int one = 1;
        final int eight = 8;
        final int expected4 = 37;
        final int content1 = 50;
        final int evapPerDay = 12;
        final int expected5 = 31;
        final double content2 = 47.5;
        final int expected6 = 459;
        final int expected7 = 299;

        assertEquals(expected1, kata.evaporator(ten, ten, ten));
        assertEquals(expected2, kata.evaporator(ten, ten, five));
        assertEquals(expected3, kata.evaporator(content, five, five));
        assertEquals(expected4, kata.evaporator(content1, evapPerDay, one));
        assertEquals(expected5, kata.evaporator(content2, eight, eight));
        assertEquals(expected6, kata.evaporator(content, one, one));
        assertEquals(expected6, kata.evaporator(ten, one, one));
        assertEquals(expected7, kata.evaporator(content, one, five));
    }
}
