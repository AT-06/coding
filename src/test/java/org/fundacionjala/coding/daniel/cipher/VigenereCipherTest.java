package org.fundacionjala.coding.daniel.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Vigenere cipher methods.
 */
public class VigenereCipherTest {
    private static final String KEY = "LIMON";
    private VigenereCipher vigenereCipher;

    /**
     * Initializes variables.
     */
    @Before
    public void setUp() {
        vigenereCipher = new VigenereCipher(KEY);
    }


    /**
     * Unit tests for Vigenere encoding.
     */
    @Test
    public void vigenereEncodeTests() {
        final String text = "HOLA JALASOFT";
        final String message = "TXYP XMUNHCRC";
        final String text2 = "HOLA JALASOF[";
        final String message2 = "TXYP XMUNHCR[";
        assertEquals(message, vigenereCipher.encode(text));
        assertEquals(message2, vigenereCipher.encode(text2));
    }

    /**
     * Unit tests for Vigenere decoding.
     */
    @Test
    public void vigenereDecodeTests() {
        final String text1 = "HOLA JALASOFT";
        final String message1 = "TXYP XMUNHCRC";
        final String text2 = "HOLA JALASOF[";
        final String message2 = "TXYP XMUNHCR[";

        assertEquals(text1, vigenereCipher.decode(message1));
        assertEquals(text2, vigenereCipher.decode(message2));
    }
}
