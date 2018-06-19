package org.fundacionjala.coding.ariel.cesarvigenereencryption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * VigenereEncryptionTest class.
 */
public class VigenereEncryptionTest {
    private VigenereEncryption vigenereEncryption;


    /**
     * Init the class cesarvigenereencryption.
     */
    @Before
    public void init() {
        vigenereEncryption = new VigenereEncryption();

    }

    /**
     * Test that check the Vigenere encode with special.
     */
    @Test
    public void encodeVigenereMessage() {
        assertEquals("TXYP XMUNHCRC", vigenereEncryption.encodeMessage("HOLA JALASOFT", "LIMON"));
        assertEquals("UTXP AHSPD", vigenereEncryption.encodeMessage("HOLA MUNDO", "MELON"));
        assertEquals("NTFU NT WWRDE ACVROYWY", vigenereEncryption.encodeMessage("TEST TO CHECK VIGENERE", "TOMATE"));

    }

    /**
     * Test that check the Vigenere decode with special.
     */
    @Test
    public void decodeVigenereMessage() {
        assertEquals("HOLA JALASOFT", vigenereEncryption.decodeMessage("TXYP XMUNHCRC", "LIMON"));
        assertEquals("HOLA MUNDO", vigenereEncryption.decodeMessage("UTXP AHSPD", "MELON"));
        assertEquals("TEST TO CHECK VIGENERE", vigenereEncryption.decodeMessage("NTFU NT WWRDE ACVROYWY", "TOMATE"));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyTextEncodeVigenere() {
        assertEquals("", vigenereEncryption.encodeMessage("", "HOLA"));
        assertEquals("", vigenereEncryption.encodeMessage(null, "MUNDO"));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyTextDecodeVIgenere() {
        assertEquals("", vigenereEncryption.decodeMessage("", "UTXP"));
        assertEquals("", vigenereEncryption.decodeMessage(null, "WWRDE"));
    }
}
