package org.fundacionjala.coding.manuel.encryptionalgorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test Vigenere class.
 */
public class VigenereTest {

    /**
     * Object of the class Vigenere.
     */
    private Crypto vigenereCrypto;

    private static final String VIGENERE_KEY = "LIMON";
    private static final String TEST_WORD = "ZORRO";

    /**
     * Method to init object.
     */
    @Before
    public void init() {
        vigenereCrypto = new Vigenere();
    }

    /**
     * Test Vigenere encodeCesar method.
     */
    @Test
    public void testVigenereEncode() {
        assertEquals("TXYP", vigenereCrypto.encode("HOLA", VIGENERE_KEY));
        assertEquals("LXEGC", vigenereCrypto.encode(TEST_WORD, VIGENERE_KEY));
        assertEquals("TXYP XMUNHCRC", vigenereCrypto.encode("HOLA JALASOFT", VIGENERE_KEY));
    }

    /**
     * Test Vigenere encodeCesar method for null and empty texts.
     */
    @Test
    public void testVigenereEncodeNullAndEmpty() {
        assertEquals("", vigenereCrypto.encode(null, VIGENERE_KEY));
        assertEquals("", vigenereCrypto.encode("", VIGENERE_KEY));
    }

    /**
     * Test Vigenere decodeCesar method.
     */
    @Test
    public void testVigenereDecode() {
        assertEquals("HOLA", vigenereCrypto.decode("TXYP", VIGENERE_KEY));
        assertEquals(TEST_WORD, vigenereCrypto.decode("LXEGC", VIGENERE_KEY));
        assertEquals("HOLA JALASOFT", vigenereCrypto.decode("TXYP XMUNHCRC", VIGENERE_KEY));
    }

    /**
     * Test Vigenere encodeCesar method for null and empty texts.
     */
    @Test
    public void testVigenereDecodeNullAndEmpty() {
        assertEquals("", vigenereCrypto.decode(null, VIGENERE_KEY));
        assertEquals("", vigenereCrypto.decode("", VIGENERE_KEY));
    }
}
