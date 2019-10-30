package org.fundacionjala.coding.maria.cifrado;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test for vigenere.
 */
public class CifradoVigenereTest {
    private Cifrado vigenere;
    private static final String CASE1 = "HOLA JALASOFT";
    private static final String LIMON = "LIMON";
    private static final Object CASE2 = null;
    /**
     * initialize cifrado cesar.
     */
    @Before
    public void initialize() {
        vigenere = new CifradoVigenere();
    }

    /**
     * test to vigenere method.
     */
    @Test
    public void vigenereOneWord() {
        String sentence = "TXYP XMUNHCRC";
        assertEquals(sentence, vigenere.encode(LIMON, CASE1));
    }

    /**
     * test to vigenere method.
     */
    @Test
    public void vigenereDecode() {
        assertEquals(CASE1, vigenere.decode(LIMON, "TXYP XMUNHCRC"));
    }
    /**
     * test to vigenere method.
     */
    @Test
    public void vigenereDecodeSpecialCharacters() {
        assertEquals("_HOLA_JALASOFT*", vigenere.decode(LIMON, "_TXYP_XMUNHCRC*"));
    }

    /**
     * test to vigenere method with null messaje.
     */
    @Test
    public void vigenereDecodeNull() {
        assertEquals("", vigenere.decode(LIMON, ""));
    }
    /**
     * test to vigenere method with null messaje.
     */
    @Test
    public void vigenereEncodeNull() {
        assertEquals("", vigenere.encode(LIMON, CASE2));
    }
    /**
     * test to vigenere method with empty message.
     */
    @Test
    public void vigenereDecodeEmpty() {

        assertEquals("", vigenere.decode(LIMON, CASE2));
    }
    /**
     * test to vigenere method with empty message.
     */
    @Test
    public void vigenereEncodeEmpty() {

        assertEquals("", vigenere.encode(LIMON, ""));
    }
}
