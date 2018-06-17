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

    /**
     * Test for returning empty String.
     */
    @Test
    public void testEncodeCesarCrypto3() {
        String texto = "";
        final int clave = 4;
        assertEquals("", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for returning empty String.
     */
    @Test
    public void testEncodeCesarCrypto4() {
        String texto = null;
        final int clave = 4;
        assertEquals("", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for special character.
     */
    @Test
    public void testEncodeCesarCrypto5() {
        String texto = "Z?ORR|O";
        final int clave = 5;
        assertEquals("E?TWW|T", cesarCrypto.encode(texto, clave));
    }

    /**
     * Test for decode method.
     */
    @Test
    public void testDecodeCesarCrypto1() {
        String texto = "ETWWT";
        final int clave = 5;
        assertEquals("ZORRO", cesarCrypto.decode(texto, clave));
    }

    /**
     * Test for decode method.
     */
    @Test
    public void testDecodeCesarCrypto2() {
        String texto = "KROD";
        final int clave = 3;
        assertEquals("HOLA", cesarCrypto.decode(texto, clave));
    }
}
