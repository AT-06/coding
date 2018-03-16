package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unittests.
 */
public class EANTest {
    /**
     * This test verify if the plus number..
     * is validate for its checksum.
     */
    @Test
    public void testEanValidate() {
        EAN eanvalidator = new EAN();
        assertTrue(eanvalidator.validate("4003301018398"));
        assertFalse(eanvalidator.validate("4003301018392"));
    }
}
