package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for testing the methods.
 */
public class CesarCryptoTest {

    private static final int POSITIVE = 1;
    private static final int NEGATIVE = -POSITIVE;
    private CesarCrypto cesarCrypto;

    /**
     * Initializes the class.
     */
    @Before
    public void initialize() {
        cesarCrypto = new CesarCrypto();
    }

    /**
     * First test for encode method.
     */
    @Test
    public void testEncodeCesarCrypto() {
        String texto = "HOLA";
        final int clave = 3;
        assertEquals("KROD", cesarCrypto.encode(texto, clave));
    }

    /**
     * Second test for encode method.
     */
    @Test
    public void testEncodeCesarCrypto2() {
        String texto = "ZORRO";
        final int clave = 5;
        assertEquals("ETWWT", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testEncodeCesarCrypto3() {
        String texto = "";
        final int clave = 4;
        assertEquals("", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testEncodeCesarCrypto4() {
        String texto = null;
        final int clave = 4;
        assertEquals("", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for special character.
     */
    @Test
    public void testEncodeCesarCrypto5() {
        String texto = "Z?ORR|O";
        final int clave = 5;
        assertEquals("E?TWW|T", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for decode method.
     */
    @Test
    public void testDecodeCesarCrypto1() {
        String texto = "ETWWT";
        final int clave = 5;
        assertEquals("ZORRO", cesarCrypto.decode(texto, clave));
    }

    /**
     * Test for decode method.
     */
    @Test
    public void testDecodeCesarCrypto2() {
        String texto = "KROD";
        final int clave = 3;
        assertEquals("HOLA", cesarCrypto.decode(texto, clave));
    }

    /**
     * Test for vigenere encode method.
     */
    @Test
    public void testEncodeVigenereCrypto() {
        String texto = "HOLA JALASOFT";
        final String clave = "LIMON";
        assertEquals("TXYP XMUNHCRC", cesarCrypto.encodeVigenere(texto, clave, POSITIVE));
    }

    /**
     * Test for vigenere encode method.
     */
    @Test
    public void testEncodeVigenereCryptoSpecialCharacter() {
        String texto = "HOL?A JALA|SOFT";
        final String clave = "LIMON";
        assertEquals("TXY?P XMUN|HCRC", cesarCrypto.encodeVigenere(texto, clave, POSITIVE));
    }

    /**
     * Test for vigenere decode method.
     */
    @Test
    public void testDecodeVigenereCrypto() {
        String texto = "TXYP XMUNHCRC";
        final String clave = "LIMON";
        assertEquals("HOLA JALASOFT", cesarCrypto.decodeVigenere(texto, clave, NEGATIVE));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testDecodeVigenereCryptoEmptytext() {
        String texto = "";
        final String clave = "LIMON";
        assertEquals("", cesarCrypto.encodeVigenere(texto, clave, POSITIVE));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testDecodeVigenereCryptoEmptytext2() {
        String texto = "";
        final String clave = "LIMON";
        assertEquals("", cesarCrypto.decodeVigenere(texto, clave, NEGATIVE));
    }
}
