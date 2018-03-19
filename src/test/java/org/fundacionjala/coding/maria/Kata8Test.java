package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kata 8.
 */
public class Kata8Test {
    private Kata8 kata8;
    private static final String COMMONLINE2 = "    _  _     _  _  _  _  _ ";
    private static final String COMMONLINE3 = "  ||_  _|  | _||_|  ||_| _|";
    private static final String COMMONSTRING = "123456789";
    private static final String COMMONSTRINGINT = "12345678?";

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
        String filaDos =  "  | _| _||_||_ |_   ||_||_|";
        assertEquals(COMMONSTRING, kata8.bankOCR(COMMONLINE2, filaDos, COMMONLINE3));
    }

    /**
     * testBankOCRNormalInt test 1.
     */
    @Test
    public void testBankOCRNormalInt() {
        String filaDos =  "  | _| _||_||_ |_   ||_| _ ";
        assertEquals(COMMONSTRINGINT, kata8.bankOCR(COMMONLINE2, filaDos, COMMONLINE3));
    }


    /**
     * testBankOCRErr test 2.
     */
    @Test
    public void testBankOCRisValidChecksumErr() {


        assertEquals("664371495 ERR", kata8.errIll("664371495"));
    }


    /**
     * testBankOCRErr test 2.
     */
    @Test
    public void testBankOCRNoErr() {
        assertEquals(COMMONSTRING, kata8.errIll(COMMONSTRING));
    }

     /**
     * testBankOCROneNoNumber test 3.
     */
    @Test
    public void testBankOCRisOneNoNumber() {

        assertEquals(COMMONSTRINGINT.concat(" ILL"), kata8.errIll(COMMONSTRINGINT));
    }

    /**
     * testBankOCROneNumber.
     */
    @Test
    public void testBankOCRsumOneNumber() {

        assertEquals(COMMONSTRING, kata8.errIll(COMMONSTRING));
    }

    /**
     * testBankOCRTwoNoNumbers test 5.
     */
    @Test
    public void testBankOCRTwoNoNumbers() {


        assertEquals("1234?678? ILL", kata8.errIll("1234?678?"));
    }
}
