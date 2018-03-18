package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Unittets Kata Bank.
 */
public class Kata8Test {
    private Kata8 katita;

    /**
     * Init the object Kata8.
     */
    @Before
    public void init() {
        katita = new Kata8();
    }

    /**
     * This test check the story1.
     */
    @Test
    public void testStory1Serie() {
        final String underscores = "    _  _     _  _  _  _  _ ";
        final String pipesUnderscores = "  | _| _||_||_ |_   ||_||_|";
        final String underscoresPipes = "  ||_  _|  | _||_|  ||_||_|";
        assertEquals("123456788", katita.story1(underscores, pipesUnderscores, underscoresPipes));

    }

    /**
     * This test check the story1.
     * But other serie.
     */
    @Test
    public void testStory1Serie2() {
        final String commonLine1 = " _  _  _  _  _  _  _  _  _ ";
        final String commonLine2 = "| || || || || || || || || |";
        final String commonLine3 = "|_||_||_||_||_||_||_||_||_|";
        assertEquals("000000000", katita.story1(commonLine1, commonLine2, commonLine3));
    }

    /**
     * This test check the story1.
     * With an invalid number.
     */
    @Test
    public void testStory1Serie3() {
        final String commonLine1 = "    _  _     _  _  _  _  _ ";
        final String commonLine2 = "  | _| _||_||_ |_   ||_||  ";
        final String commonLine3 = "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("12345678?", katita.story1(commonLine1, commonLine2, commonLine3));
    }


    /**
     * This test check if the serie.
     * pass the checksum condition.
     */
    @Test
    public void testValidSerie() {
        assertEquals("777777777 ERR", katita.valid("777777777"));
    }

    /**
     * This test check if the serie.
     * has a non number.
     */
    @Test
    public void testInvalidSerie() {
        assertEquals("1234?6789 ILL", katita.valid("1234?6789"));
    }

    /**
     * This test check if the serie.
     * is valid.
     */
    @Test
    public void testValidSerieWithoutSuffix() {
        assertEquals("345882865", katita.valid("345882865"));
    }

    /**
     * This test check another serie.
     * if it is valid.
     */
    @Test
    public void testValidSerieWithoutSuffix2() {
        assertEquals("123456789", katita.valid("123456789"));
    }

    /**
     * This test check if sthe serie.
     * is invalid for the checksum.
     */
    @Test
    public void testInvalitChecksum() {

        assertFalse(katita.checkSumCheck("345812865"));
    }

    /**
     * This test check if sthe serie.
     * is valid for the checksum.
     */
    @Test
    public void testValidChecksum() {
        assertTrue(katita.checkSumCheck("123456789"));
    }
}
