package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Performed by christian.
 */
public class CesarCipherTest {

    /**
     *
     */
    private Cipher cesar;

    /**
     *
     */
    @Before
    public void setUp() {
        cesar = new Cipher();
    }

    /**
     *
     */
    @Test
    public void shouldDoNothingWithEmptyString() {
        final int key = 3;
        assertEquals("", cesar.encode("", key));
    }

    /**
     *
     */
    @Test
    public void shouldNotCipherSymbols() {
        final int key = 3;
        assertEquals("-", cesar.encode("-", key));
        String symbols = "1!@#$%^&*(){}/";
        assertEquals(symbols, cesar.encode(symbols, key));
    }


    /**
     *
     */
    @Test
    public void shouldCipherLetter() {
        final int key1 = 0;
        final int key2 = 1;
        final int key3 = 3;
        final int key4 = 5;
        final int key5 = -3;
        final int key6 = -10;
        assertEquals("A", cesar.encode("A", key1));
        assertEquals("B", cesar.encode("A", key2));
        assertEquals("D", cesar.encode("A", key3));
        assertEquals("J", cesar.encode("E", key4));
        assertEquals("A", cesar.encode("Z", key2));
        assertEquals("C", cesar.encode("X", key4));
        assertEquals("Z", cesar.encode("C", key5));
        assertEquals("X", cesar.encode("H", key6));
    }

    /**
     *
     */
    @Test
    public void shouldCipherWholeAlphabet() {
        final int key = -3;
        String allChars = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",
                cesar.encode(allChars, key));
    }


    /**
     *
     */
    @Test
    public void testEncodeWithPositiveKey() {
        final int key1 = 3;
        final int key2 = 5;
        assertEquals("KHUOR", cesar.encode("HElLO", key1));
        assertEquals("GZL", cesar.encode("BUG", key2));
    }


    /**
     *
     */
    @Test
    public void testEncodeWithNegativeKey() {
        final int key = -3;
        assertEquals("HELLO", cesar.encode("KHOOR", key));
    }


    /**
     *
     */
    @Test
    public void testEncodeWithEmptyMessage() {
        final int key = 5;
        assertEquals("", cesar.encode("", key));
        assertEquals("", cesar.encode("", key));

    }


    /**
     *
     */
    @Test
    public void testEncodeWithNullMessage() {
        final int key = 5;
        assertEquals("", cesar.decode(null, key));
        assertEquals("", cesar.decode(null, key));
    }

    /**
     *
     */
    @Test
    public void testEncodeWithSpecialCharactersAndBlankSpace() {
        final int key = 3;
        assertEquals("K_ROD", cesar.encode("H_OLA", key));
        assertEquals("KROD CRUUR", cesar.encode("HOLA ZORRO", key));
    }

    /**
     *
     */
    @Test
    public void testDecodeWithPositiveKey() {
        final int key = 3;
        assertEquals("A", cesar.encode("X", key));
        assertEquals("Z", cesar.encode("W", key));
    }


    /**
     *
     */
    @Test
    public void testDecodeWithNegativeKey() {
        final int key = -3;
        assertEquals("ZEPA", cesar.encode("CHSD", key));
        assertEquals("WWACP PAC", cesar.encode("ZZDFS SDF", key));
    }

    /**
     *
     */
    @Test
    public void testDecodeWithNullMessage() {
        final int key = 3;
        assertEquals("", cesar.decode(null, key));
    }

}
