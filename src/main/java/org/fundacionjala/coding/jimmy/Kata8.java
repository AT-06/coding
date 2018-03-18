package org.fundacionjala.coding.jimmy;

import java.util.Arrays;
import java.util.List;

/**
 * Class created for doing the methods to OCR bank.
 */
public class Kata8 {
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_NINE = 9;
    private static final int NUMBER_ELEVEN = 11;
    private static final List<String> ACCOUNT;

    static {
        ACCOUNT = Arrays.asList(
                " _ | ||_|",
                "     |  |",
                " _  _||_ ",
                " _  _| _|",
                "   |_|  |",
                " _ |_  _|",
                " _ |_ |_|",
                " _   |  |",
                " _ |_||_|",
                " _ |_| _|",
                " _ | ||_|",
                "     |  |",
                " _  _||_ ",
                " _  _| _|",
                "   |_|  |",
                " _ |_  _|",
                " _ |_ |_|",
                " _   |  |",
                " _ |_||_|",
                " _ |_| _|");
    }

    private static final String ILL_EXCEPTION = "?";

    /**
     * @param lines the list of numbers made by pipes and underscores.
     * @return the value of the account as String.
     */
    String mapToNumber(List<String> lines) {
        StringBuilder account = new StringBuilder();
        for (int i = NUMBER_ZERO; i < lines.get(NUMBER_ZERO).length(); i += NUMBER_THREE) {
            String number = lines.get(NUMBER_ZERO).substring(i, i + NUMBER_THREE)
                    .concat(lines.get(NUMBER_ONE).substring(i, i + NUMBER_THREE))
                    .concat(lines.get(NUMBER_TWO).substring(i, i + NUMBER_THREE));
            account.append(getDigit(number));
        }
        return account.toString();
    }

    /**
     * @param number is made for pipes and underscores.
     * @return the digit of the number, if there is not returns the exception.
     */
    private String getDigit(String number) {
        for (int i = NUMBER_ZERO; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).equals(number)) {
                return String.valueOf(i);
            }
        }
        return ILL_EXCEPTION;
    }

    /**
     * @param accountNumber is the number to validate.
     * @return whether the account number is valid.
     */
    String exceptionsInNumber(String accountNumber) {
        if (accountNumber.contains(ILL_EXCEPTION)) {
            return String.format("%s ILL", accountNumber);
        }
        return !checkSum(accountNumber) ? String.format("%s ERR", accountNumber) : accountNumber;
    }

    /**
     * @param accountNumber is the number made by 9 characters.
     * @return whether the number is valid or not.
     */
    boolean checkSum(String accountNumber) {
        final String[] numberPosition = accountNumber.split("");
        int checksum = NUMBER_ZERO;
        int i = NUMBER_ZERO;
        int j = NUMBER_NINE;

        while (i < numberPosition.length) {
            checksum += Integer.parseInt(numberPosition[i]) * j;
            i++;
            j--;
        }
        return checksum % NUMBER_ELEVEN == NUMBER_ZERO;
    }
}
