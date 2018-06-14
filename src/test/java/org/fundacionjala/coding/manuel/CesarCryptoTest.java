package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test CesarCrypto.
 */
public class CesarCryptoTest {

    /**
     * Object of the class to test.
     */
    private CesarCrypto cesarCrypto;

    /**
     * Method to init object.
     */
    @Before
    public void init() {
        cesarCrypto = new CesarCrypto();
    }

    /**
     * Test encode method.
     */
    @Test
    public void testEncode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("KROD", cesarCrypto.encode("HOLA", firstKey));
        assertEquals("ETWWT", cesarCrypto.encode("ZORRO", secondKey));
    }


    /**
     * Test encode methods for null and empty values.
     */
    @Test
    public void testEncodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarCrypto.encode(null, key));
        assertEquals("", cesarCrypto.encode("", key));
    }

    /**
     * Test encode method for special characters.
     */
    @Test
    public void testEncodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("KR_OD", cesarCrypto.encode("HO_LA", key));
        assertEquals("ETW;WT", cesarCrypto.encode("ZOR;RO", secondKey));
    }
}
