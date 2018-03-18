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
     * testIsValidEANValidationWithInvalidNumber return FALSE.
     */
    @Test
    public void testIsValidEANValidationWithInvalidNumber() {

        assertFalse(kata13.isValidEANValidation("4003301018392"));
    }
}
