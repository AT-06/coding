package org.fundacionjala.coding.escarleth;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class contains UnitTests for Kata8.
 */

public class Kata8Test {
    private Kata8 kata8;
    private static final String COMMON_LINE1 = "    _  _     _  _  _  _  _ ";
    private static final String COMMON_LINE2 = "  ||_  _|  | _||_|  ||_| _|";

    /**
     * initialize kata8.
     */
    @Before
    public void initialize() {
        kata8 = new Kata8();
    }

    /**
     * testConvertValidNumberOCRtoNumber return the correct number.
     */
    @Test
    public void testConvertValidNumberOCRtoNumber() {
        String secondRow = "  | _| _||_||_ |_   ||_||_|";
        assertEquals("123456789", kata8.convertNumberOCRtoNumber(COMMON_LINE1, secondRow, COMMON_LINE2));
    }

    /**
     * testConvertInvalidNumberOCRtoNumber return the incorrect String.
     */
    @Test
    public void testConvertInvalidNumberOCRtoNumber() {
        String secondRow = "  | _  _||_||_ |_   ||_||_|";
        assertEquals("1?3456789", kata8.convertNumberOCRtoNumber(COMMON_LINE1, secondRow, COMMON_LINE2));

    }

    /**
     * testEvaluatingResultToNumberWithLLL return the number added sufFix ILL.
     */
    @Test
    public void testEvaluatingResultToNumberWithILL() {
        assertEquals("12345?78? ILL", kata8.evaluatingResult("12345?78?"));
    }

    /**
     * testEvaluatingResultToNumberWithLLL return the number added sufFix ERR.
     */
    @Test
    public void testEvaluatingResultToNumberWithERR() {
        assertEquals("664371495 ERR", kata8.evaluatingResult("664371495"));
    }

    /**
     * testEvaluatingResultToNumberWithoutSuffix return the same number.
     */
    @Test
    public void testEvaluatingResultToNumberWithoutSuffix() {
        assertEquals("345882865", kata8.evaluatingResult("345882865"));
    }

    /**
     * testValidateCheckSumWithValidNumber return true.
     */
    @Test
    public void testValidateCheckSumWithValidNumber() {
        assertTrue(kata8.isValidCheckSum("123456789"));
    }

    /**
     * testValidateCheckSumWithInvalidNumber return false.
     */
    @Test
    public void testValidateCheckSumWithInvalidNumber() {

        assertFalse(kata8.isValidCheckSum("345812865"));
    }

}


