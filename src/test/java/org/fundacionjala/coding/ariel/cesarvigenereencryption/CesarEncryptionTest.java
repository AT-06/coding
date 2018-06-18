package org.fundacionjala.coding.ariel.cesarvigenereencryption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * CesarEncryptionTest class.
 */
public class CesarEncryptionTest {
    private CesarEncryption cesarEncryption;

    /**
     * Init the class cesarvigenereencryption.
     */
    @Before
    public void init() {
        cesarEncryption = new CesarEncryption();

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
}
