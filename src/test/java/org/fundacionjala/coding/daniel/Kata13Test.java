package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata 13.
 */
public class Kata13Test {

    private Kata13 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void setUp() {
        kata = new Kata13();
    }

    /**
     * unit testing of 'validate' method.
     */
    @Test
    public void testValidate() {
        assertTrue(kata.validate("9783815820865"));
        assertFalse(kata.validate("9783815820864"));
        assertTrue(kata.validate("9783827317100"));
    }
}
