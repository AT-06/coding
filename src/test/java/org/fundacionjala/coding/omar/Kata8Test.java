package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata1.java.
 */
public class Kata8Test {

    private Kata8 entryToNumber;
    @Before
    public void init(){

        entryToNumber = new Kata8();
    }
    /**
     * This method is for test convertEntryToNumber(entry) method.
     * isFizzBuzzNumber( row1, row2, row3 ) => returns "123456789".
     */
    @Test
    public void testConvertValidEntryToNumberHistoryOne() {

        String row1 = "    _  _     _  _  _  _  _ ";
        String row2 = "  | _| _||_||_ |_   ||_||_|";
        String row3 = "  ||_  _|  | _||_|  ||_| _|";


        assertEquals("123456789", entryToNumber.convertEntryToNumber(row1, row2, row3));


    }
    /**
     * This method is for test convertEntryToNumber(entry) method.
     * isFizzBuzzNumber( row1, row2, row3 ) => returns "123456789".
     */
    @Test
    public void testConvertInvalidEntryToNumberHistoryOne() {

        String row1 = "    _  _     _  _  _  _  _ ";
        String row2 = "  | _| _||_||_ |_   ||_||_|";
        String row3 = " _||_  _|  | _||_|  ||_| _|";


        assertEquals("?23456789", entryToNumber.convertEntryToNumber(row1, row2, row3));


    }
    /**
     * This method tests when checksum validation of account number is True.
     */
    @Test
    public void testCheckSumAccountNumberIsTrue() {
        String accountNumber = "345882865";
        final boolean actualResult = this.entryToNumber.checkSum(accountNumber);
        System.out.println(actualResult);
        assertTrue(actualResult);
    }

    /**
     * TThis method tests when checksum validation of account number is False.
     */
    @Test
    public void testCheckSumAccountNumberIsFalse() {
        String accountNumber = "664371495";
        final boolean actualResult = this.entryToNumber.checkSum(accountNumber);
        assertFalse(actualResult);
    }
    /**
     * This method test Finding result of an false checksum account number.
     */
    @Test
    public void testFindingChecksumErrorAccountNumber() {

        String row1 = "    _  _     _  _     _  _ ";
        String row2 = "  | _| _||_||_ |_   ||_||_|";
        String row3 = "  ||_  _|  | _||_|  ||_| _|";


        final String actualResult = entryToNumber.lookingFor(entryToNumber.convertEntryToNumber(row1,row2,row3));
        final String expectedResult = "123456189 ERR";
        assertEquals(expectedResult, actualResult);
    }
    /**
     * This method test Finding result of an Illegible account number.
     */
    @Test
    public void testFindingIllegibleAccountNumber() {

        String row1 = "    _  _     _  _  _  _  _ ";
        String row2 = "  | _| _||_| _  _    |_||_|";
        String row3 = "|_ |_  _|  | _||_|  ||_| _|";

        final String actualResult = entryToNumber.lookingFor(entryToNumber.convertEntryToNumber(row1,row2,row3));
        final String expectedResult = "?234???89 ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method test Finding result of an false checksum account number.
     */
    @Test
    public void testFindingChecksumAccountNumber() {
        String row1 = "    _  _     _  _  _  _  _ ";
        String row2 = "  | _| _||_||_ |_   ||_||_|";
        String row3 = "  ||_  _|  | _||_|  ||_| _|";

        System.out.println(entryToNumber.convertEntryToNumber(row1,row2,row3)+" "+entryToNumber.checkSum(entryToNumber.convertEntryToNumber(row1,row2,row3)));
        final String actualResult = entryToNumber.lookingFor(entryToNumber.convertEntryToNumber(row1,row2,row3));
        final String expectedResult = "123456789";

        assertEquals(expectedResult, actualResult);
    }




}
