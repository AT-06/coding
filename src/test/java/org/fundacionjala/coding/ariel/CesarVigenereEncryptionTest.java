package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * CesarCrypto class tests.
 */
public class CesarVigenereEncryptionTest {
    private static final int POS3 = 3;
    private static final int POS5 = 5;
    private static final int POS7 = 7;
    private static final int POS15 = 15;
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
        assertEquals("KROD", encryption.codeMessage("HOLA", POS3));
        assertEquals("ETWWT", encryption.codeMessage("ZORRO", POS5));
        assertEquals("RHAH", encryption.codeMessage("KATA", POS7));
        assertEquals("EPIPIP", encryption.codeMessage("PATATA", POS15));
    }

    /**
     * Test that check the encode with special characters.
     */
    @Test
    public void wordsWithEspecialCharacters() {
        assertEquals("K*ROD", encryption.codeMessage("H*OLA", POS3));
        assertEquals("ET+WWT", encryption.codeMessage("ZO+RRO", POS5));
        assertEquals("RHA?H", encryption.codeMessage("KAT?A", POS7));
        assertEquals("E@PIP IP", encryption.codeMessage("P@ATA TA", POS15));
    }

    /**
     * Test that check a null and empty input.
     */
    @Test
    public void emptyText() {
        assertEquals("", encryption.codeMessage("", POS5));
        assertEquals("", encryption.codeMessage(null, POS15));
    }
}
