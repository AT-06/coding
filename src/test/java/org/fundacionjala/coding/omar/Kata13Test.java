package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata13Test {

    private Kata13 kata13;

    /**
     * kata13.
     */
    @Before
    public void initialize() {
        kata13 = new Kata13();
    }

    /**
     * kata13 test1.
     */
    @Test
    public void testValidateValidNumber() {
        assertTrue(kata13.validate("4003301018398"));
    }

    /**
     * kata13 test2.
     */
    @Test
    public void testValidateInvalidNumber() {
        assertFalse(kata13.validate("4003301018392"));
    }

    /**
     * kata13 test3.
     */
    @Test
    public void testValidateNumber() {
        assertTrue(kata13.validate("9783827317100"));
    }
}
