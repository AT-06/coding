package org.fundacionjala.coding.manuel;

import org.fundacionjala.coding.manuel.encryptionAlgorithms.Cesar;
import org.fundacionjala.coding.manuel.encryptionAlgorithms.Crypto;
import org.fundacionjala.coding.manuel.encryptionAlgorithms.Vigenere;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test CesarVigenereCrypto.
 */
public class CesarVigenereCryptoTest {

    /**
     * Object of the class Cesar.
     */
    private Crypto cesarCrypto;

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
        cesarCrypto = new Cesar();
        vigenereCrypto = new Vigenere();
    }

    /**
     * Test encodeCesar method.
     */
    @Test
    public void testEncode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("KROD", cesarCrypto.encode("HOLA", firstKey));
        assertEquals("ETWWT", cesarCrypto.encode(TEST_WORD, secondKey));
    }


    /**
     * Test encodeCesar methods for null and empty values.
     */
    @Test
    public void testEncodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarCrypto.encode(null, key));
        assertEquals("", cesarCrypto.encode("", key));
    }

    /**
     * Test encodeCesar method for special characters.
     */
    @Test
    public void testEncodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("KR_OD", cesarCrypto.encode("HO_LA", key));
        assertEquals("ETW;WT", cesarCrypto.encode("ZOR;RO", secondKey));
    }

    /**
     * Test decodeCesar method.
     */
    @Test
    public void testDecode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("HOLA", cesarCrypto.decode("KROD", firstKey));
        assertEquals(TEST_WORD, cesarCrypto.decode("ETWWT", secondKey));
    }

    /**
     * Test decodeCesar methods for null and empty values.
     */
    @Test
    public void testDecodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarCrypto.decode(null, key));
        assertEquals("", cesarCrypto.decode("", key));
    }

    /**
     * Test decodeCesar method for special characters.
     */
    @Test
    public void testDecodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("HO_LA", cesarCrypto.decode("KR_OD", key));
        assertEquals("ZOR;RO", cesarCrypto.decode("ETW;WT", secondKey));
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
