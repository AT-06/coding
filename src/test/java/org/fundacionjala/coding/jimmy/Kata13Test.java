package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class is created in order to test the validate method.
 */
public class Kata13Test {

    private Kata13 kata13;

    /**
     * Initializes kata13.
     */
    @Before
    public void initialize() {
        kata13 = new Kata13();
    }

    /**
     * It validates a valid EAN number.
     */
    @Test
    public void testValidateValidEANNumber() {
        assertTrue(kata13.validate("4003301018398"));
    }

    /**
     * It does not validate a invalid EAN number.
     */
    @Test
    public void testValidateInvalidEANNumber() {
        assertFalse(kata13.validate("4003301018392"));
    }

    /**
     * It validates a valid EAN number.
     */
    @Test
    public void testValidateEANNumber() {
        assertTrue(kata13.validate("9783827317100"));
    }
}
