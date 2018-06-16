package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Caesar/Vigenere cipher methods.
 */
public class CaesarVigenereCipherTest {

    private static final String KEY = "LIMON";
    private CaesarVigenereCipher cipher;

    /**
     * Initialzes variable cipher.
     */
    @Before
    public void setUp() {
        cipher = new CaesarVigenereCipher();
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
        final int key1 = 3;
        assertEquals(c, cipher.caesarEncode(a, key1));
        final int key2 = 5;
        assertEquals(d, cipher.caesarEncode(b, key2));
        assertEquals(e, cipher.caesarEncode(e, key1));
        assertEquals(f, cipher.caesarEncode(g, key1));
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
        final int key1 = 3;
        assertEquals(a, cipher.caesarDecode(c, key1));
        final int key2 = 5;
        assertEquals(b, cipher.caesarDecode(d, key2));
        assertEquals(e, cipher.caesarDecode(e, key1));
        assertEquals(g, cipher.caesarDecode(f, key1));
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
        assertEquals(message, cipher.vigenereEncode(text, KEY));
        assertEquals(message2, cipher.vigenereEncode(text2, KEY));
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

        assertEquals(text1, cipher.vigenereDecode(message1, KEY));
        assertEquals(text2, cipher.vigenereDecode(message2, KEY));

    }
}
