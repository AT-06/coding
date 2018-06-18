package org.fundacionjala.coding.maria;

import org.fundacionjala.coding.maria.cifrado.CifradoCesar;
import org.fundacionjala.coding.maria.cifrado.CifradoVigenere;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * class cifrado cesar test.
 */
public class CifradoCesarTest {
    private CifradoCesar cesar;
    private CifradoVigenere vigenere;
    private static final Object THREE = 3;
    private static final Object NEGONE = -1;
    private static final Object ONE = 1;
    private static final String CASE1 = "HOLA JALASOFT";
    private static final String LIMON = "LIMON";
    private static final Object CASE2 = null;
    /**
     * initialize cifrado cesar.
     */
    @Before
    public void initialize() {
        cesar = new CifradoCesar();
        vigenere = new CifradoVigenere();
    }

    /**
     * test to encode with positive key.
     */
    @Test
    public void encodeWithPositive() {
        String sentence = "KROD DEF C";
        assertEquals(sentence, cesar.encode("HOLA ABC Z", THREE));
        assertEquals("CRPELH", cesar.encode("ZOMBIE", THREE));
    }

    /**
     * test to encode with special character .
     */
    @Test
    public void encodeWithSpecialCharacter() {
        assertEquals("K_ROD", cesar.encode("H_OLA", THREE));
    }

    /**
     * test to encode with negative key.
     */
    @Test
    public void encodeWithNegative() {
        String sentence = "ZAB Y";
        assertEquals(sentence, cesar.encode("ABC Z", NEGONE));
        assertEquals("X", cesar.encode("Y", NEGONE));
    }

    /**
     * test to encode with negative key and special character.
     */
    @Test
    public void encodeWithNegativeSpecialCharacter() {
        assertEquals("ZAB_", cesar.encode("ABC_", NEGONE));
        assertEquals("X_", cesar.encode("Y_", NEGONE));
    }

    /**
     * test to encode with null string.
     */
    @Test
    public void encodeWithNull() {
        assertEquals("", cesar.encode(null, ONE));
    }

    /**
     * test to encode with empty string.
     */
    @Test
    public void encodeWithEmpty() {
        assertEquals("", cesar.encode("", ONE));
    }

    /**
     * test to decode with a positive key.
     */
    @Test
    public void decodeWithPositive() {
        String sentence = "HOLA ABC";
        assertEquals(sentence, cesar.decode("KROD DEF", THREE));
    }

    /**
     * test to decode with a negative key.
     */
    @Test
    public void decodeWithNegative() {
        String sentence = "BCD";
        assertEquals(sentence, cesar.decode("ABC", NEGONE));
    }

    /**
     * test to test decode with null.
     */
    @Test
    public void decodeWithNull() {
        assertEquals("", cesar.decode(null, ONE));
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
