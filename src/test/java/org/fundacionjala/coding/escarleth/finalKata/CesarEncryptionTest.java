package org.fundacionjala.coding.escarleth.finalKata;

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
        assertEquals("RHAH", cesarEncryption.encode("KATA", KEY_7));
        assertEquals("KROD", cesarEncryption.encode("HOLA", KEY_3));
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
        assertEquals("[RO?", cesarEncryption.encode("[OL?", KEY_3));
        assertEquals("E{ WT", cesarEncryption.encode("Z{ RO", KEY_5));
    }

    /**
     * This method is for testing the encoding of a word with valid characters.
     */
    @Test
    public void testToDecodeValidWord() {
        assertEquals("KATA", cesarEncryption.decode("RHAH", -KEY_7));
        assertEquals("HOLA", cesarEncryption.decode("KROD", -KEY_3));
        assertEquals("ZORRO", cesarEncryption.decode("ETWWT", -KEY_5));
    }

    /**
     * This method is for testing the decoding of a word with special characters.
     */
    @Test
    public void testToDecodeWithSpecialCharacters() {
        assertEquals("[OL?", cesarEncryption.decode("[RO?", -KEY_3));
        assertEquals("Z{ RO", cesarEncryption.decode("E{ WT", -KEY_5));
    }

    /**
     * This method is for testing the decoding of a word with empty or null word.
     */
    @Test
    public void testToDecodeEmptyWord() {
        assertEquals("", cesarEncryption.decode(null, KEY_7));
        assertEquals("", cesarEncryption.decode("", KEY_7));
    }
}





