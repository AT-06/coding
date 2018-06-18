package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test CesarVigenereCrypto.
 */
public class CesarVigenereCryptoTest {

    /**
     * Object of the class to test.
     */
    private CesarVigenereCrypto cesarVigenereCrypto;
    private static final String VIGENERE_KEY = "LIMON";
    private static final String TEST_WORD = "ZORRO";

    /**
     * Method to init object.
     */
    @Before
    public void init() {
        cesarVigenereCrypto = new CesarVigenereCrypto();
    }

    /**
     * Test encodeCesar method.
     */
    @Test
    public void testEncode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("KROD", cesarVigenereCrypto.encodeCesar("HOLA", firstKey));
        assertEquals("ETWWT", cesarVigenereCrypto.encodeCesar(TEST_WORD, secondKey));
    }


    /**
     * Test encodeCesar methods for null and empty values.
     */
    @Test
    public void testEncodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarVigenereCrypto.encodeCesar(null, key));
        assertEquals("", cesarVigenereCrypto.encodeCesar("", key));
    }

    /**
     * Test encodeCesar method for special characters.
     */
    @Test
    public void testEncodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("KR_OD", cesarVigenereCrypto.encodeCesar("HO_LA", key));
        assertEquals("ETW;WT", cesarVigenereCrypto.encodeCesar("ZOR;RO", secondKey));
    }

    /**
     * Test decodeCesar method.
     */
    @Test
    public void testDecode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("HOLA", cesarVigenereCrypto.decodeCesar("KROD", firstKey));
        assertEquals(TEST_WORD, cesarVigenereCrypto.decodeCesar("ETWWT", secondKey));
    }

    /**
     * Test decodeCesar methods for null and empty values.
     */
    @Test
    public void testDecodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarVigenereCrypto.decodeCesar(null, key));
        assertEquals("", cesarVigenereCrypto.decodeCesar("", key));
    }

    /**
     * Test decodeCesar method for special characters.
     */
    @Test
    public void testDecodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("HO_LA", cesarVigenereCrypto.decodeCesar("KR_OD", key));
        assertEquals("ZOR;RO", cesarVigenereCrypto.decodeCesar("ETW;WT", secondKey));
    }

    /**
     * Test Vigenere encodeCesar method.
     */
    @Test
    public void testVigenereEncode() {
        assertEquals("TXYP", cesarVigenereCrypto.encodeVigenere("HOLA", VIGENERE_KEY));
        assertEquals("LXEGC", cesarVigenereCrypto.encodeVigenere(TEST_WORD, VIGENERE_KEY));
        assertEquals("TXYP XMUNHCRC", cesarVigenereCrypto.encodeVigenere("HOLA JALASOFT", VIGENERE_KEY));
    }

    /**
     * Test Vigenere encodeCesar method for null and empty texts.
     */
    @Test
    public void testVigenereEncodeNullAndEmpty() {
        assertEquals("", cesarVigenereCrypto.encodeVigenere(null, VIGENERE_KEY));
        assertEquals("", cesarVigenereCrypto.encodeVigenere("", VIGENERE_KEY));
    }

    /**
     * Test Vigenere decodeCesar method.
     */
    @Test
    public void testVigenereDecode() {
        assertEquals("HOLA", cesarVigenereCrypto.decodeVigenere("TXYP", VIGENERE_KEY));
        assertEquals(TEST_WORD, cesarVigenereCrypto.decodeVigenere("LXEGC", VIGENERE_KEY));
        assertEquals("HOLA JALASOFT", cesarVigenereCrypto.decodeVigenere("TXYP XMUNHCRC", VIGENERE_KEY));
    }

    /**
     * Test Vigenere encodeCesar method for null and empty texts.
     */
    @Test
    public void testVigenereDecodeNullAndEmpty() {
        assertEquals("", cesarVigenereCrypto.decodeVigenere(null, VIGENERE_KEY));
        assertEquals("", cesarVigenereCrypto.decodeVigenere("", VIGENERE_KEY));
    }
}
