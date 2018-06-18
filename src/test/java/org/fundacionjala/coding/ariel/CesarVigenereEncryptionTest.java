package org.fundacionjala.coding.ariel;

import org.fundacionjala.coding.ariel.cesarvigenereencryption.CesarEncryption;
import org.fundacionjala.coding.ariel.cesarvigenereencryption.VigenereEncryption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * CesarCrypto class tests.
 */
public class CesarVigenereEncryptionTest {
    private CesarEncryption cesarEncryption;
    private VigenereEncryption vigenereEncryption;


    /**
     * Init the class cesarvigenereencryption.
     */
    @Before
    public void init() {
        cesarEncryption = new CesarEncryption();
        vigenereEncryption = new VigenereEncryption();

    }

    /**
     * Test that check the encode.
     */
    @Test
    public void onlyWords() {
        assertEquals("KROD", cesarEncryption.encodeMessage("HOLA", "3"));
        assertEquals("ETWWT", cesarEncryption.encodeMessage("ZORRO", "5"));
        assertEquals("RHAH", cesarEncryption.encodeMessage("KATA", "7"));
        assertEquals("EPIPIP", cesarEncryption.encodeMessage("PATATA", "15"));
    }

    /**
     * Test that check the encode with special characters.
     */
    @Test
    public void wordsWithEspecialCharacters() {
        assertEquals("K*ROD", cesarEncryption.encodeMessage("H*OLA", "3"));
        assertEquals("ET+WWT", cesarEncryption.encodeMessage("ZO+RRO", "5"));
        assertEquals("RHA?H", cesarEncryption.encodeMessage("KAT?A", "7"));
        assertEquals("E@PIP IP", cesarEncryption.encodeMessage("P@ATA TA", "15"));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyText() {
        assertEquals("", cesarEncryption.encodeMessage("", "5"));
        assertEquals("", cesarEncryption.encodeMessage(null, "3"));
    }

    /**
     * Test that check the decode.
     */
    @Test
    public void decodeMessage() {
        assertEquals("HOLA", cesarEncryption.decodeMessage("KROD", "-3"));
        assertEquals("ZORRO", cesarEncryption.decodeMessage("ETWWT", "-5"));
        assertEquals("KATA", cesarEncryption.decodeMessage("RHAH", "-7"));
        assertEquals("PATATA", cesarEncryption.decodeMessage("EPIPIP", "-15"));
    }

    /**
     * Test that check the decode with special characters.
     */
    @Test
    public void decodeWordsWithEspecialCharacters() {
        assertEquals("H*OLA", cesarEncryption.decodeMessage("K*ROD", "-3"));
        assertEquals("ZO+RRO", cesarEncryption.decodeMessage("ET+WWT", "-5"));
        assertEquals("KAT?A", cesarEncryption.decodeMessage("RHA?H", "-7"));
        assertEquals("P@ATA TA", cesarEncryption.decodeMessage("E@PIP IP", "-15"));
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
