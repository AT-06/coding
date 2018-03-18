package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Developer by Christian.
 */
public class Kata8Test {
    private static final String ROW1 = "    _  _     _  _  _  _  _ ";
    private static final String ROW2 = "  | _| _||_||_ |_   ||_||_|";
    private static final String ROW3 = "  ||_  _|  | _||_|  ||_| _|";
    private Kata8 putNumber;

    /**
     *
     */
    @Before
    public void init() {
        putNumber = new Kata8();
    }

    /**
     *
     */
    @Test
    public void testConvertValidEntryToNumberHistoryOne() {
        assertEquals("123456789", putNumber.convertEntryToNumber(ROW1, ROW2, ROW3));
    }

    /**
     *
     */
    @Test
    public void testConvertInvalidEntryToNumberHistoryOne() {
        final String row3 = " _||_  _|  | _||_|  ||_| _|";
        assertEquals("?23456789", putNumber.convertEntryToNumber(ROW1, ROW2, row3));
    }

    /**
     *
     */
    @Test
    public void testCheckSumAccountNumberIsTrue() {
        String accountNumber = "345882865";
        final boolean actualResult = this.putNumber.checkSum(accountNumber);
        assertTrue(actualResult);
    }

    /**
     *
     */
    @Test
    public void testCheckSumAccountNumberIsFalse() {
        String accountNumber = "664371495";
        final boolean actualResult = this.putNumber.checkSum(accountNumber);
        assertFalse(actualResult);
    }

    /**
     *
     */
    @Test
    public void testFindingChecksumErrorAccountNumber() {
        final String row1 = "    _  _     _  _     _  _ ";
        final String actualResult = putNumber.lookingFor(putNumber.convertEntryToNumber(row1, ROW2, ROW3));
        final String expectedResult = "123456189 ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     *
     */
    @Test
    public void testFindingChecksumAccountNumber() {
        final String actualResult = putNumber.lookingFor(putNumber.convertEntryToNumber(ROW1, ROW2, ROW3));
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     *
     */
    @Test
    public void testFindingIllegibleAccountNumber() {
        final String row2 = "  | _| _||_| _  _    |_||_|";
        final String row3 = "|_ |_  _|  | _||_|  ||_| _|";
        final String actualResult = putNumber.lookingFor(putNumber.convertEntryToNumber(ROW1, row2, row3));
        final String expectedResult = "?234???89 ILL";
        assertEquals(expectedResult, actualResult);
    }

}
