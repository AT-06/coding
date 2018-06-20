package org.fundacionjala.coding.daniel.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Caesar cipher methods.
 */
public class CaesarCipherTest {


    private CaesarCipher caesarCipher;


    /**
     * Initializes variables.
     */
    @Before
    public void setUp() {
        final int caesarKey = 3;
        caesarCipher = new CaesarCipher(caesarKey);
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
}
