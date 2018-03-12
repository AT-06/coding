package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Juan Manuel on 3/11/2018.
 */
public class Kata8Test {
    private Kata8 kata8;
    private static final String COMMON_LINE1 = " _  _  _  _  _  _  _  _  _ ";
    private static final String COMMON_LINE2 = "|_||_||_||_||_||_||_||_||_|";
    private static final String COMMON_LINE3 = "  |  |  |  |  |  |  |  |  |";
    private static final String COMMON_LINE4 = " _| _| _| _| _| _| _| _| _|";
    private static final String COMMON_LINE5 = "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
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
        assertEquals("000000000", kata8.bank(COMMON_LINE1, secondRow, COMMON_LINE2));
    }

    /**
     * Second test.
     */
    @Test
    public void test2BankKata8() {
        String firstRow =  "                           ";
        assertEquals("111111111 ERR", kata8.bank(firstRow, COMMON_LINE3, COMMON_LINE3));
    }

    /**
     * Third test.
     */
    @Test
    public void test3BankKata8() {
        assertEquals("222222222 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE4, COMMON_LINE5));
    }

    /**
     * Fourth test.
     */
    @Test
    public void test4BankKata8() {
        assertEquals("333333333 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE4, COMMON_LINE4));
    }

    /**
     * Fifth test.
     */
    @Test
    public void test5BankKata8() {
        String firstRow =  "                           ";
        assertEquals("444444444 ERR", kata8.bank(firstRow, COMMON_LINE2, COMMON_LINE3));
    }

    /**
     * Sixth test.
     */
    @Test
    public void test6BankKata8() {
        assertEquals("555555555 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE5, COMMON_LINE4));
    }

    /**
     * Seventh test.
     */
    @Test
    public void test7BankKata8() {
        assertEquals("666666666 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE5, COMMON_LINE2));
    }

    /**
     * Eighth test.
     */
    @Test
    public void test8BankKata8() {
        assertEquals("777777777 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE3, COMMON_LINE3));
    }

    /**
     * Nineth test.
     */
    @Test
    public void test9BankKata8() {
        assertEquals("888888888 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE2, COMMON_LINE2));
    }

    /**
     * Tenth test.
     */
    @Test
    public void test10BankKata8() {
        assertEquals("999999999 ERR", kata8.bank(COMMON_LINE1, COMMON_LINE2, COMMON_LINE4));
    }

    /**
     * Eleventh test.
     */
    @Test
    public void test11BankKata8() {
        String firstRow =  "    _  _     _  _  _  _  _ ";
        String secondRow = "  | _| _||_||_ |_   ||_||_|";
        String thirdRow =  "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("123456789", kata8.bank(firstRow, secondRow, thirdRow));
    }

    /**
     * Twelfth test.
     */
    @Test
    public void test12BankKata8() {
        String firstRow =  "    _  _     _  _  _  _  _ ";
        String secondRow = "  | _| _||_||_ |_   ||_||  ";
        String thirdRow =  "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("12345678? ILL", kata8.bank(firstRow, secondRow, thirdRow));
    }
}
