package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by Juan Manuel on 3/11/2018.
 */
public class Kata8Test {
    private Kata8 kata8;
    private static final String COMMON_LINE1 = " _  _  _  _  _  _  _  _  _ ";
    private static final String COMMON_LINE2 = "|_||_||_||_||_||_||_||_||_|";
    private static final String COMMON_TEST1 = "123456789";
    private static final String COMMON_TEST2 = "345882865";


    /**
     * Method to initialize.
     */
    @Before
    public void initialize() {
        kata8 = new Kata8();
    }

    /**
     * First test.
     */
    @Test
    public void test1BankKata8() {
        String secondRow = "| || || || || || || || || |";
        assertEquals("000000000", kata8.convertEntryToNumber(COMMON_LINE1, secondRow, COMMON_LINE2));
    }

    /**
     * Second test.
     */
    @Test
    public void test2BankKata8() {
        String firstRow =  "    _  _     _  _  _  _  _ ";
        String secondRow = "  | _| _||_||_ |_   ||_||_|";
        String thirdRow =  "  ||_  _|  | _||_|  ||_| _|";
        assertEquals(COMMON_TEST1, kata8.convertEntryToNumber(firstRow, secondRow, thirdRow));
    }

    /**
     * Third test.
     */
    @Test
    public void test3BankKata8() {
        assertFalse(kata8.validCheckSum("111111111"));
    }

    /**
     * Fourth test.
     */
    @Test
    public void test4BankKata8() {
        assertFalse(kata8.validCheckSum("222222222"));
    }

    /**
     * Fifth test.
     */
    @Test
    public void test5BankKata8() {
        assertTrue(kata8.validCheckSum(COMMON_TEST2));
    }

    /**
     * Sixth test.
     */
    @Test
    public void test6BankKata8() {
        assertEquals("12345678? ILL", kata8.addSufixes("12345678?"));
    }

    /**
     * Seventh test.
     */
    @Test
    public void test7BankKata8() {
        assertEquals("12345?789 ILL", kata8.evaluateAccount("12345?789"));
    }

    /**
     * Nineth test.
     */
    @Test
    public void test9BankKata8() {
        assertEquals("222222222 ERR", kata8.evaluateAccount("222222222"));
    }

    /**
     * Tenth test.
     */
    @Test
    public void test10BankKata8() {
        assertEquals("345882865", kata8.evaluateAccount("345882865"));
    }

}
