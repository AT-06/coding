package org.fundacionjala.coding.jimmy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * Class to test the numbers and digits of OCR Bank.
 */
public class Kata8Test {

    public static final String BLANK_LINE = "                           ";
    private Map<String, String> useCase = new HashMap<>();

    /**
     * Method to assign the data for perform the test.
     */
    @Before
    public void assignDataForTesting() {

        useCase.put("000000000",
                " _  _  _  _  _  _  _  _  _ "
                        + "| || || || || || || || || |"
                        + "|_||_||_||_||_||_||_||_||_|"
                        + BLANK_LINE);

        useCase.put("111111111",
                BLANK_LINE
                        + "  |  |  |  |  |  |  |  |  |"
                        + "  |  |  |  |  |  |  |  |  |"
                        + BLANK_LINE);

        useCase.put("123456789",
                "    _  _     _  _  _  _  _ "
                        + "  | _| _||_||_ |_   ||_||_|"
                        + "  ||_  _|  | _||_|  ||_| _|"
                        + BLANK_LINE);

        useCase.put("000000051",
                " _  _  _  _  _  _  _  _    "
                        + "| || || || || || || ||_   |"
                        + "|_||_||_||_||_||_||_| _|  |"
                        + BLANK_LINE);
    }

    /**
     * Test to check if the account number is array of nine digits.
     */
    @Test
    public void testAccountNumberIsArrayOfNineDigits() {
        List<String> arrayToCheck = Kata8.divideOcrAccountNumberIntoOcrDigits(useCase.get("000000000"));
        final int expected = 9;
        assertEquals(expected, arrayToCheck.size());
    }

    /**
     * Test to check the account number is valid.
     */
    @Test
    public void testCheckSumShowsValidAccountNumberIsValid() {
        final String numberToCheck = "123456789";
        Kata8 accountNumber = new Kata8(useCase.get(numberToCheck));
        assertTrue(accountNumber.isValidCheckSum());
    }

    /**
     * Test to check the account number is invalid.
     */
    @Test
    public void testCheckSumShowsInvalidAccountNumberIsInvalid() {
        final String numberToCheck = "111111111";
        Kata8 accountNumber = new Kata8(useCase.get(numberToCheck));
        assertFalse(accountNumber.isValidCheckSum());
    }

    /**
     * Test to verify if the stick is recognized.
     */
    @Test
    public void testStick1234567879IsRecognized() {
        String numberToCheck = "123456789";
        Kata8 accountNumber = new Kata8(useCase.get(numberToCheck));
        assertEquals(numberToCheck, accountNumber.convertOCRCodeToNumber());
    }
}
