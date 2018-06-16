package org.fundacionjala.coding.escarleth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for CesarEncryption.
 */
public class CesarEncryptionTest {
    private CesarEncryption cesarEncryption;
    private static final int KEY_3 = 3;
    private static final int KEY_5 = 5;
    private static final int KEY_7 = 7;

    /**
     * initialize CesarEncryption class.
     */
    @Before
    public void initialize() {
        cesarEncryption = new CesarEncryption();
    }

    /**
     * This method is for testing the encoding a word with valid characters.
     */
    @Test
    public void testToEncodeValidWord() {
        assertEquals("RHAH", cesarEncryption.encode("kata", KEY_7));
        assertEquals("KROD", cesarEncryption.encode("Hola", KEY_3));
        assertEquals("ETWWT", cesarEncryption.encode("ZORRO", KEY_5));
    }

    /**
     * This method is for testing the encoding of a word with empty or null word.
     */
    @Test
    public void testToEncodeEmptyWord() {
        assertEquals("", cesarEncryption.encode(null, KEY_7));
        assertEquals("", cesarEncryption.encode("", KEY_7));
    }

    /**
     * This method is for testing the encoding of a word with special characters.
     */
    @Test
    public void testToEncodeWithSpecialCharacters() {
        assertEquals("KRO?", cesarEncryption.encode("HOL?", KEY_3));
        assertEquals("E+ WT", cesarEncryption.encode("Z+ ro", KEY_5));
    }
}





