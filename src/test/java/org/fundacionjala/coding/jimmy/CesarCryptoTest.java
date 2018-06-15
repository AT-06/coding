package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for testing the methods.
 */
public class CesarCryptoTest {

    private CesarCrypto cesarCrypto;

    /**
     * Initializes the class.
     */
    @Before
    public void initialize() {
        cesarCrypto = new CesarCrypto();
    }

    /**
     * First test for encode method.
     */
    @Test
    public void testEncodeCesarCrypto() {
        String texto = "HOLA";
        final int clave = 3;
        assertEquals("KROD", cesarCrypto.encode(texto, clave));
    }

    /**
     * Second test for encode method.
     */
    @Test
    public void testEncodeCesarCrypto2() {
        String texto = "ZORRO";
        final int clave = 5;
        assertEquals("ETWWT", cesarCrypto.encode(texto, clave));
    }
}
