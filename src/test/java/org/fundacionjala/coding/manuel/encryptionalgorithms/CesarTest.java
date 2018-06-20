package org.fundacionjala.coding.manuel.encryptionalgorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test Cesar class.
 */
public class CesarTest {

    /**
     * Object of the class Cesar.
     */
    private Crypto cesarCrypto;

    private static final String TEST_WORD = "ZORRO";

    /**
     * Method to init object.
     */
    @Before
    public void init() {
        cesarCrypto = new Cesar();
    }

    /**
     * Test encodeCesar method.
     */
    @Test
    public void testEncode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("KROD", cesarCrypto.encode("HOLA", firstKey));
        assertEquals("ETWWT", cesarCrypto.encode(TEST_WORD, secondKey));
    }


    /**
     * Test encodeCesar methods for null and empty values.
     */
    @Test
    public void testEncodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarCrypto.encode(null, key));
        assertEquals("", cesarCrypto.encode("", key));
    }

    /**
     * Test encodeCesar method for special characters.
     */
    @Test
    public void testEncodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("KR_OD", cesarCrypto.encode("HO_LA", key));
        assertEquals("ETW;WT", cesarCrypto.encode("ZOR;RO", secondKey));
    }

    /**
     * Test decodeCesar method.
     */
    @Test
    public void testDecode() {
        final int firstKey = 3;
        final int secondKey = 5;
        assertEquals("HOLA", cesarCrypto.decode("KROD", firstKey));
        assertEquals(TEST_WORD, cesarCrypto.decode("ETWWT", secondKey));
    }

    /**
     * Test decodeCesar methods for null and empty values.
     */
    @Test
    public void testDecodeNullAndEmpty() {
        final int key = 0;
        assertEquals("", cesarCrypto.decode(null, key));
        assertEquals("", cesarCrypto.decode("", key));
    }

    /**
     * Test decodeCesar method for special characters.
     */
    @Test
    public void testDecodeSpecialCharacters() {
        final int key = 3;
        final int secondKey = 5;
        assertEquals("HO_LA", cesarCrypto.decode("KR_OD", key));
        assertEquals("ZOR;RO", cesarCrypto.decode("ETW;WT", secondKey));
    }
}
