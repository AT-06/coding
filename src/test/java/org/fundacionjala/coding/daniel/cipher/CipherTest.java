package org.fundacionjala.coding.daniel.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Caesar/Vigenere cipher methods.
 */
public class CipherTest {

    private static final String KEY = "LIMON";
    private CaesarCipher caesarCipher;
    private VigenereCipher vigenereCipher;

    /**
     * Initializes variables.
     */
    @Before
    public void setUp() {
        final int caesarKey = 3;
        caesarCipher = new CaesarCipher(caesarKey);
        vigenereCipher = new VigenereCipher(KEY);
    }

    /**
     * Unit tests for Caesar encoding.
     */
    @Test
    public void caesarEncodeTests() {
        final String a = "HOLA";
        final String b = "Zorro";
        final String c = "KROD";
        final String d = "ETWWT";
        final String e = "";
        final String f = "K?O*";
        final String g = "H?L*";
        assertEquals(c, caesarCipher.encode(a));
        assertEquals(e, caesarCipher.encode(e));
        assertEquals(f, caesarCipher.encode(g));
        final int key2 = 5;
        caesarCipher.setKey(key2);
        assertEquals(d, caesarCipher.encode(b));
    }

    /**
     * Unit tests for Caesar decoding.
     */
    @Test
    public void caesarDecodeTests() {
        final String a = "HOLA";
        final String b = "ZORRO";
        final String c = "KROD";
        final String d = "ETWWT";
        final String e = "";
        final String f = "K?O*";
        final String g = "H?L*";
        assertEquals(a, caesarCipher.decode(c));
        assertEquals(e, caesarCipher.decode(e));
        assertEquals(g, caesarCipher.decode(f));
        final int key2 = 5;
        caesarCipher.setKey(key2);
        assertEquals(b, caesarCipher.decode(d));
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
