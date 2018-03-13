package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unittests..
 */
public class Kata13Test {
    private Kata13 eanvalidator;

    /**
     * It init the common object.
     */
    @Before
    public void init() {
        eanvalidator = new Kata13();
    }

    /**
     * This test cases check a validate serie.
     */
    @Test
    public void testEanValidate() {
        assertTrue(eanvalidator.validate("4003301018398"));
    }

    /**
     * This test cases chek an invalidate serie.
     */
    @Test
    public void testEanInvalidate() {
        assertFalse(eanvalidator.validate("4003301018392"));
    }

    /**
     * This test cases check a validate serie.
     */
    @Test
    public void testEanValidate2() {
        assertTrue(eanvalidator.validate("1111111111000"));
    }
}
