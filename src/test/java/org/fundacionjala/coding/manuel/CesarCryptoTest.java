package org.fundacionjala.coding.manuel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test CesarCrypto.
 */
public class CesarCryptoTest {

    /**
     * Test encode method.
     */
    @Test
    public void testEncode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("KROD", CesarCrypto.encode("HOLA", firstKey));
        assertEquals("ETWWT", CesarCrypto.encode("ZORRO", secondKey));
    }


    /**
     * Test encode methods for null and empty values.
     */
    @Test
    public void testEncodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", CesarCrypto.encode(null, key));
        assertEquals("", CesarCrypto.encode("", key));
    }

    /**
     * Test encode method for special characters.
     */
    @Test
    public void testEncodeSpecialCharacters() {
        final int key = 3;
        assertEquals("KR_OD", CesarCrypto.encode("HO_LA", key));
    }
}
