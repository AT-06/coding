package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kata 8.
 */
public class Kata8Test {
    private Kata8 kata8;
    private static final String COMMONLINE1 =  " _  _     _  _        _  _ ";

    /**
     * initialize kata8.
     */
    @Before
    public void initialize() {
        kata8 = new Kata8();
    }

    /**
     * testBankOCRNormal test 1.
     */
    @Test
    public void testBankOCRNormal() {

        String filaUno =  "    _  _     _  _  _  _  _ ";
        String filaDos =  "  | _| _||_||_ |_   ||_||_|";
        String filaTres = "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789", kata8.bankOCR(filaUno, filaDos, filaTres));
    }

    /**
     * testBankOCRErr test 2.
     */
    @Test
    public void testBankOCRErr() {

        String filaDos =  "|_ |_ |_| _|  |  ||_||_||_ ";
        String filaTres = "|_||_|  | _|  |  |  | _| _|";

        assertEquals("664371495 ERR", kata8.bankOCR(COMMONLINE1, filaDos, filaTres));
    }

    /**
     * testBankOCROneNoNumber test 3.
     */
    @Test
    public void testBankOCROneNoNumber() {
        String filaUno = "    _  _     _  _  _  _  _ ";
        String filaDos = "  | _| _||_||_ |_   ||_||  ";
        String filaTres = "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("12345678? ILL", kata8.bankOCR(filaUno, filaDos, filaTres));
    }

    /**
     * testBankOCRTwoNoNumbers test 5.
     */
    @Test
    public void testBankOCRTwoNoNumbers() {
        String filaUno = "    _  _     _  _  _  _  _ ";
        String filaDos = "  | _| _||_| _ |_   ||_||_|";
        String filaTres = "  ||_  _|  | _||_|  ||_| _ ";

        assertEquals("1234?678? ILL", kata8.bankOCR(filaUno, filaDos, filaTres));
    }
}
