package org.fundacionjala.coding.escarleth.encryption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for VigenereEncryption.
 */
public class VigenereEncryptionTest {
    private VigenereEncryption vigenereEncryption;
    private static final String VIGENERE_KEY = "LIMON";

    /**
     * initialize VigenereEncryptionTest class.
     */
    @Before
    public void initialize() {
        vigenereEncryption = new VigenereEncryption();
    }

    /**
     * This method is for testing the encoding a word with valid characters.
     */
    @Test
    public void testToEncodeValidWord() {
        assertEquals("TXYP XMUNHCRC", vigenereEncryption.encode("HOLA JALASOFT", VIGENERE_KEY));
    }

    /**
     * This method is for testing the encoding of a word with empty or null word.
     */
    @Test
    public void testToEncodeEmptyWord() {
        assertEquals("", vigenereEncryption.encode(null, VIGENERE_KEY));
        assertEquals("", vigenereEncryption.encode("", VIGENERE_KEY));
    }

    /**
     * This method is for testing the encoding of a word with special characters.
     */
    @Test
    public void testToEncodeWithSpecialCharacters() {
        assertEquals("[AUN YOXJFDT?", vigenereEncryption.encode("[OLA JALASOF?", VIGENERE_KEY));
        assertEquals("VJYPGAO{", vigenereEncryption.encode("JALASOF{", VIGENERE_KEY));
    }

    /**
     * This method is for testing the encoding of a word with valid characters.
     */
    @Test
    public void testToDecodeValidWord() {
        assertEquals("HOLA JALASOFT", vigenereEncryption.decode("TXYP XMUNHCRC", VIGENERE_KEY));
    }

    /**
     * This method is for testing the decoding of a word with empty or null word.
     */
    @Test
    public void testToDecodeEmptyWord() {
        assertEquals("", vigenereEncryption.decode(null, VIGENERE_KEY));
        assertEquals("", vigenereEncryption.decode("", VIGENERE_KEY));
    }
}
