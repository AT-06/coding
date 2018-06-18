package org.fundacionjala.coding.jimmy.encryptionTest;

import org.fundacionjala.coding.jimmy.encryption.CesarCrypto;
import org.fundacionjala.coding.jimmy.encryption.VigenereCrypto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for testing the methods.
 */
public class CryptoTest {

    private static final int POSITIVE = 1;
    private static final int NEGATIVE = -POSITIVE;
    private static final String LIMON = "LIMON";
    private CesarCrypto cesarCrypto;
    private VigenereCrypto vigenereCrypto;

    /**
     * Initializes the class.
     */
    @Before
    public void initialize() {
        cesarCrypto = new CesarCrypto();
        vigenereCrypto = new VigenereCrypto();
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
        assertEquals("TXYP XMUNHCRC", vigenereCrypto.encodeVigenere(texto, LIMON, POSITIVE));
    }

    /**
     * Test for vigenere encode method.
     */
    @Test
    public void testEncodeVigenereCryptoSpecialCharacter() {
        String texto = "HOL?A JALA|SOFT";
        assertEquals("TXY?P XMUN|HCRC", vigenereCrypto.encodeVigenere(texto, LIMON, POSITIVE));
    }

    /**
     * Test for vigenere decode method.
     */
    @Test
    public void testDecodeVigenereCrypto() {
        String texto = "TXYP XMUNHCRC";
        assertEquals("HOLA JALASOFT", vigenereCrypto.decodeVigenere(texto, LIMON, NEGATIVE));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testDecodeVigenereCryptoEmptytext() {
        String texto = "";
        assertEquals("", vigenereCrypto.encodeVigenere(texto, LIMON, POSITIVE));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testDecodeVigenereCryptoEmptytext2() {
        String texto = "";
        assertEquals("", vigenereCrypto.decodeVigenere(texto, LIMON, NEGATIVE));
    }
}
