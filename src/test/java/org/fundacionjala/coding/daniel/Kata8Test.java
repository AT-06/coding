package org.fundacionjala.coding.daniel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class for Testing Kata8 class.
 */
public class Kata8Test {
    private Kata8 kata;

    /**
     * This method initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata8();
    }

    /**
     * This method tests mapping of an account number given
     * in pipes and underscores to string of digits.
     */
    @Test
    public void testMapEntryOCRToNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");
        final String actualResult = kata.mapEntryOCRToNumber(lines);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests when checksum validation of account number is True.
     */
    @Test
    public void testCheckSumAccountNumberIsTrue() {
        String accountNumber = "345882865";
        final boolean actualResult = this.kata.checkSum(accountNumber);
        assertTrue(actualResult);
    }

    /**
     * TThis method tests when checksum validation of account number is False.
     */
    @Test
    public void testCheckSumAccountNumberIsFalse() {
        String accountNumber = "686381269";
        final boolean actualResult = this.kata.checkSum(accountNumber);
        assertFalse(actualResult);
    }

    /**
     * This method test Finding result of a Legible account number.
     */
    @Test
    public void testFindingLegibleAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult = kata.mapEntryOCRToNumber(lines);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method test Finding result of an false checksum account number.
     */
    @Test
    public void testFindingChecksumErrorAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _     _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");
        final String actualResult = kata.finding(kata.mapEntryOCRToNumber(lines));
        final String expectedResult = "123456189 ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method test Finding result of an Illegible account number.
     */
    @Test
    public void testFindingIllegibleAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_| _  _    |_||_|");
        lines.add("|_ |_  _|  | _||_|  ||_| _|");
        final String actualResult = kata.finding(kata.mapEntryOCRToNumber(lines));
        final String expectedResult = "?234???89 ILL";
        assertEquals(expectedResult, actualResult);
    }
}
