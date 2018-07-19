package org.fundacionjala.coding.christian;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Performed by christian.
 */

public class VigenereCipherTest {

    private CipherVigenere vigenere;

    private static final String VIGENERE_KEY = "LIMON";

    /**
     *
     */
    @Before
    public void setUp() {
        vigenere = new CipherVigenere();
    }


    /**
     *
     */
    @Test
    public void shouldVigenereEncodeDoNothingWithEmptyString() {
        final int key = 3;
        assertEquals("", vigenere.encode("", key));
    }

    /**
     *
     */
    @Test
    public void shouldVigenereDecodeDoNothingWithEmptyString() {
        final int key = 3;
        assertEquals("", vigenere.decode("", key));
    }


    /**
     *
     */
    @Test
    public void shouldVigenereDecodeString() {
        final String key = " ";
        assertEquals("", vigenere.vigenereEncode("", key));
    }



    /**
     * Test to encode with Vigenere Encryption and String key.
     */
    @Test
    public void testEncodeVigenereEncryption() {
        assertEquals("UHXNFZNF", vigenere.vigenereEncode("JALASOFT", VIGENERE_KEY));
    }


    /**
     *
     */
    @Test
    public void testEncodeVigenereEncryptionWithEmptyMessage() {
        assertEquals("", vigenere.vigenereEncode("", VIGENERE_KEY));
    }

    /**
     *
     */
    @Test
    public void testEncodeVigenereEncryptionWithNullMessage() {
        assertEquals("", vigenere.vigenereEncode(null, VIGENERE_KEY));
    }

    /**
     *
     */
    @Test
    public void testDecodeVigenereEncryption() {
        assertEquals("YRZLFDXH", vigenere.vigenereDecode("JALASOFT", VIGENERE_KEY));
    }


    /**
     *
     */
    @Test
    public void testDecodeVigenereEncryptionWithEmptyMessage() {
        assertEquals("", vigenere.vigenereDecode("", VIGENERE_KEY));
    }

    /**
     *
     */
    @Test
    public void testDecodeVigenereEncryptionWithNullMessage() {
        assertEquals("", vigenere.vigenereDecode(null, VIGENERE_KEY));
    }



}
