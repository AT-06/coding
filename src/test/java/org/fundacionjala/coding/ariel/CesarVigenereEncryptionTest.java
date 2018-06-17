package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * CesarCrypto class tests.
 */
public class CesarVigenereEncryptionTest {
    private static final int KEY_3 = 3;
    private static final int KEY_5 = 5;
    private static final int KEY_7 = 7;
    private static final int KEY_15 = 15;
    private static final int KEY_NEGATIVE_1 = -3;
    private static final int KEY_NEGATIVE_5 = -5;
    private static final int KEY_NEGATIVE_7 = -7;
    private static final int KEY_NEGATIVE_15 = -15;
    private CesarVigenereEncryption encryption;

    /**
     * Init the class CesarVigenereEncryption.
     */
    @Before
    public void init() {
        encryption = new CesarVigenereEncryption();
    }

    /**
     * Test that check the encode.
     */
    @Test
    public void onlyWords() {
        assertEquals("KROD", encryption.encodeAndDecodeMessage("HOLA", KEY_3));
        assertEquals("ETWWT", encryption.encodeAndDecodeMessage("ZORRO", KEY_5));
        assertEquals("RHAH", encryption.encodeAndDecodeMessage("KATA", KEY_7));
        assertEquals("EPIPIP", encryption.encodeAndDecodeMessage("PATATA", KEY_15));
    }

    /**
     * Test that check the encode with special characters.
     */
    @Test
    public void wordsWithEspecialCharacters() {
        assertEquals("K*ROD", encryption.encodeAndDecodeMessage("H*OLA", KEY_3));
        assertEquals("ET+WWT", encryption.encodeAndDecodeMessage("ZO+RRO", KEY_5));
        assertEquals("RHA?H", encryption.encodeAndDecodeMessage("KAT?A", KEY_7));
        assertEquals("E@PIP IP", encryption.encodeAndDecodeMessage("P@ATA TA", KEY_15));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyText() {
        assertEquals("", encryption.encodeAndDecodeMessage("", KEY_5));
        assertEquals("", encryption.encodeAndDecodeMessage(null, KEY_15));
    }

    /**
     * Test that check the decode.
     */
    @Test
    public void decodeMessage() {
        assertEquals("HOLA", encryption.encodeAndDecodeMessage("KROD", KEY_NEGATIVE_1));
        assertEquals("ZORRO", encryption.encodeAndDecodeMessage("ETWWT", KEY_NEGATIVE_5));
        assertEquals("KATA", encryption.encodeAndDecodeMessage("RHAH", KEY_NEGATIVE_7));
        assertEquals("PATATA", encryption.encodeAndDecodeMessage("EPIPIP", KEY_NEGATIVE_15));
    }

    /**
     * Test that check the decode with special characters.
     */
    @Test
    public void decodeWordsWithEspecialCharacters() {
        assertEquals("H*OLA", encryption.encodeAndDecodeMessage("K*ROD", KEY_NEGATIVE_1));
        assertEquals("ZO+RRO", encryption.encodeAndDecodeMessage("ET+WWT", KEY_NEGATIVE_5));
        assertEquals("KAT?A", encryption.encodeAndDecodeMessage("RHA?H", KEY_NEGATIVE_7));
        assertEquals("P@ATA TA", encryption.encodeAndDecodeMessage("E@PIP IP", KEY_NEGATIVE_15));
    }

    /**
     * Test that check the Vigenere encode with special.
     */
    @Test
    public void encodeVigenereMessage() {
        assertEquals("TXYP XMUNHCRC", encryption.encodeVigenere("LIMON", "HOLA JALASOFT"));
        assertEquals("UTXP AHSPD", encryption.encodeVigenere("MELON", "HOLA MUNDO"));
        assertEquals("NTFU NT WWRDE ACVROYWY", encryption.encodeVigenere("TOMATE", "TEST TO CHECK VIGENERE"));

    }

    /**
     * Test that check the Vigenere decode with special.
     */
    @Test
    public void decodeVigenereMessage() {
        assertEquals("HOLA JALASOFT", encryption.decodeVigenere("LIMON", "TXYP XMUNHCRC"));
        assertEquals("HOLA MUNDO", encryption.decodeVigenere("MELON", "UTXP AHSPD"));
        assertEquals("TEST TO CHECK VIGENERE", encryption.decodeVigenere("TOMATE", "NTFU NT WWRDE ACVROYWY"));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyTextEncodeVigenere() {
        assertEquals("", encryption.encodeVigenere("HOLA", ""));
        assertEquals("", encryption.encodeVigenere("MUNDO", null));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyTextDecodeVIgenere() {
        assertEquals("", encryption.decodeVigenere("UTXP", ""));
        assertEquals("", encryption.decodeVigenere("WWRDE", null));
    }


}
