package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * class cifrado cesar test.
 */
public class CifradoCesarTest {
    private CifradoCesar cesar;
    private static final int THREE = 3;
    private static final int NEGONE = -1;
    private static final int ONE = 1;
    private static final String CASE1 = "HOLA JALASOFT";

    /**
     * initialize cifrado cesar.
     */
    @Before
    public void initialize() {
        cesar = new CifradoCesar();
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
        assertEquals(sentence, cesar.vigenereEncode("LIMON", CASE1));
    }

    /**
     * test to vigenere method.
     */
    @Test
    public void vigenereDecode() {
        assertEquals(CASE1, cesar.vigenereDecode("LIMON", "TXYP XMUNHCRC"));
    }
}
