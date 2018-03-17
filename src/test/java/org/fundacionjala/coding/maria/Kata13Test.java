package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * test for kata 13.
 */
public class Kata13Test {
    private Kata13 eanValidator;
    /**
     * initialize kata7.
     */
    @Before
    public void initialize() {
        eanValidator = new Kata13();
    }

    /**
     * test cases for eanValidator.
     */
    @Test
    public void eanValidatorTest() {

        assertTrue(eanValidator.validate("4003301018398"));
        assertFalse(eanValidator.validate("4003301018392"));

    }
}
