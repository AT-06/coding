package org.fundacionjala.coding.jimmy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

/**
 * Class for testing Kata8 class.
 */
public class Kata8Test {
    private static final String FIRST_LINE  = "    _  _     _  _  _  _  _ ";
    private static final String SECOND_LINE = "  | _| _||_||_ |_   ||_||_|";
    private static final String THIRD_LINE  = "  ||_  _|  | _||_|  ||_| _|";

    private Kata8 kata8;

    /**
     * This method initializes kata8.
     */
    @Before
    public void initialize() {
        kata8 = new Kata8();
    }

    /**
     * This method is for testing the change to number.
     */
    @Test
    public void testMapOCRToNumber() {
        List<String> linesOfNumber = new ArrayList<>();
        linesOfNumber.add(FIRST_LINE);
        linesOfNumber.add(SECOND_LINE);
        linesOfNumber.add(THIRD_LINE);
        final String actualResult = kata8.mapToNumber(linesOfNumber);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method is for testing the exception after introducing an illegible number.
     */
    @Test
    public void testCheckSumErrorExceptionILL() {
        List<String> lines = new ArrayList<>();
        lines.add(FIRST_LINE);
        lines.add("  | _| _||_| _  _    |_||_|");
        lines.add("|_ |_  _|  | _||_|  ||_| _|");
        final String actualResult = kata8.exceptionsInNumber(kata8.mapToNumber(lines));
        final String expectedResult = "?234???89 ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method is for testing the exceptions after introducing numbers.
     */
    @Test
    public void testChecksumErrorExceptionERR() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _     _  _ ");
        lines.add(SECOND_LINE);
        lines.add(THIRD_LINE);
        final String actualResult = kata8.exceptionsInNumber(kata8.mapToNumber(lines));
        final String expectedResult = "123456189 ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method is for testing the output of a false checksum.
     */
    @Test
    public void testChecksumExceptionAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add(FIRST_LINE);
        lines.add(SECOND_LINE);
        lines.add(THIRD_LINE);
        final String actualResult = kata8.exceptionsInNumber(kata8.mapToNumber(lines));
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method is for testing whether the account number is valid.
     */
    @Test
    public void testCheckSumNumberIsValid() {
        String accountNumber = "490867715";
        final boolean actualResult = this.kata8.checkSum(accountNumber);
        assertTrue(actualResult);
    }

    /**
     * TThis method tests when checksum validation of account number is False.
     */
    @Test
    public void testCheckSumNumberIsInvalid() {
        String accountNumber = "490067715";
        final boolean actualResult = this.kata8.checkSum(accountNumber);
        assertFalse(actualResult);
    }
}
