package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.*;

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
        assertEquals(22, kata.evaporator(ten, ten, ten));
        assertEquals(29, kata.evaporator(ten, ten, 5));
        assertEquals(59, kata.evaporator(content, 5, 5));
        assertEquals(37, kata.evaporator(50, 12, 1));
        assertEquals(31, kata.evaporator(47.5, 8, 8));
        assertEquals(459, kata.evaporator(content, 1, 1));
        assertEquals(459, kata.evaporator(ten, 1, 1));
        assertEquals(299, kata.evaporator(content, 1, 5));
    }
}
