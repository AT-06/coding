package org.fundacionjala.coding.escarleth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class contains UnitTests for Kata13.
 */
public class Kata13Test {
    private Kata13 kata13;

    /**
     * initialize kata13.
     */
    @Before
    public void initialize() {
        kata13 = new Kata13();
    }

    /**
     * testIsValidEANValidationWithValidNumber return TRUE.
     */
    @Test
    public void testIsValidEANValidationWithValidNumber() {

        assertTrue(kata13.isValidEANValidation("4003301018398"));
    }

    /**
     * testIsValidEANValidationWithValidNumber return True.
     */
    @Test
    public void testIsValidEANValidationWithValidNumber2() {
        assertTrue(kata13.isValidEANValidation("0149600000000"));
    }

    /**
     * testIsValidEANValidationWithInvalidNumber return false.
     */
    @Test
    public void testIsValidEANValidationWithInvalidNumber() {

        assertFalse(kata13.isValidEANValidation("0149600000002"));
    }

    /**
     * testIsValidEANValidationWithInvalidNumber return False.
     */
    @Test
    public void testIsValidEANValidationWithInvalidNumber2() {
        assertFalse(kata13.isValidEANValidation("4003301018391"));
    }
}
