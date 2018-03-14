package org.fundacionjala.coding.escarleth;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This class contains UnitTests for Kata8.
 */

public class Kata8Test {
    private Kata8 kata8;
    private static final String COMMON_LINE1 = " _  _     _  _        _  _ ";
    private static final String COMMON_LINE2 = "    _  _     _  _  _  _  _ ";
    private static final String COMMON_LINE3 = "  |  |  |  |  |  |  |  |  |";
    private static final String COMMON_LINE4 = "  ||_  _|  | _||_|  ||_| _|";

    /**
     * initialize kata8.
     */
    @Before
    public void initialize() {
        kata8 = new Kata8();
    }

    /**
     * BankKata test1 expected 123456789.
     */
    @Test
    public void test1BankKata8() {
        String secondRow = "  | _| _||_||_ |_   ||_||_|";
        assertEquals("123456789", kata8.bank(COMMON_LINE2, secondRow, COMMON_LINE4));
    }

    /**
     * BankKata test expected 12345678? ILL.
     */
    @Test
    public void test2BankKata8() {
        String secondRow = "  | _| _||_||_ |_   ||_||  ";
        assertEquals("12345678? ILL", kata8.bank(COMMON_LINE2, secondRow, COMMON_LINE4));
    }

    /**
     * BankKata test expected 664371495 ERR.
     */
    @Test
    public void tes3BankKata8() {

        String secondRow = "|_ |_ |_| _|  |  ||_||_||_ ";
        String thirdRow = "|_||_|  | _|  |  |  | _| _|";

        assertEquals("664371495 ERR", kata8.bank(COMMON_LINE1, secondRow, thirdRow));
    }

    /**
     * BankKata test 1234?678? ILL.
     */
    @Test
    public void test4BankKata8() {
        String secondRow = "  | _| _||_| _ |_   ||_||_|";
        String thirdRow = "  ||_  _|  | _||_|  ||_| _ ";

        assertEquals("1234?678? ILL", kata8.bank(COMMON_LINE2, secondRow, thirdRow));
    }

    /**
     * BankKata test 111111111 ERR.
     */
    @Test
    public void test5BankKata8() {
        String firstRow = "                           ";
        assertEquals("111111111 ERR", kata8.bank(firstRow, COMMON_LINE3, COMMON_LINE3));
    }
}


