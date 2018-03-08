package org.fundacionjala.coding.daniel;

import java.util.ArrayList;
import java.util.List;

/**
 * Class kata 8 for BankOCR problem.
 */
public class Kata8 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int NINE = 9;
    private static final int ELEVEN = 11;
    private static final List<String> ACCOUNT = new ArrayList<>();
    private static final String QUESTION_MARK = "?";
    private static final String UNDERSCORE = "_";
    private static final String PIPE = "|";
    private static final String PIPES = PIPE + " |";
    public static final String BLANK_SPACE = " ";

    static {
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE + BLANK_SPACE + PIPES + PIPE + UNDERSCORE + PIPE);
        ACCOUNT.add("   " + "  " + PIPE + "  " + PIPE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE + BLANK_SPACE + BLANK_SPACE
            + UNDERSCORE + PIPE + PIPE + UNDERSCORE + BLANK_SPACE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE + BLANK_SPACE
            + BLANK_SPACE + UNDERSCORE + PIPE + BLANK_SPACE + UNDERSCORE + PIPE);
        ACCOUNT.add("   " + PIPE + UNDERSCORE + PIPE + "  " + PIPE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE + BLANK_SPACE
            + PIPE + UNDERSCORE + BLANK_SPACE + BLANK_SPACE + UNDERSCORE + PIPE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE
            + BLANK_SPACE + PIPE + UNDERSCORE + BLANK_SPACE + PIPE + UNDERSCORE + PIPE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE + BLANK_SPACE + "  " + PIPE + "  " + PIPE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE
            + BLANK_SPACE + PIPE + UNDERSCORE + PIPE + PIPE + UNDERSCORE + PIPE);
        ACCOUNT.add(BLANK_SPACE + UNDERSCORE + BLANK_SPACE
            + PIPE + UNDERSCORE + PIPE + BLANK_SPACE + UNDERSCORE + PIPE);
    }

    /**
     * @param number is formed by pipes and underscores.
     * @return the value of the number, if it's not a number returns "?".
     */
    public String getDigit(String number) {
        for (int i = ZERO; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).equals(number)) {
                return String.valueOf(i);
            }
        }
        return QUESTION_MARK;
    }

    /**
     * @param lines is a list of String pipes and underscores.
     * @return the String representation of the account number.
     */
    public String mapEntryOCRToNumber(List<String> lines) {
        StringBuilder account = new StringBuilder();

        for (int i = ZERO; i < lines.get(ZERO).length(); i += THREE) {
            String number = lines.get(ZERO).substring(i, i + THREE)
                .concat(lines.get(ONE).substring(i, i + THREE))
                .concat(lines.get(TWO).substring(i, i + THREE));
            account.append(getDigit(number));
        }
        return account.toString();
    }

    /**
     * @param accountNumber is formed by 9 numbers.
     * @return if the account number is valid or not.
     */
    public boolean checkSum(String accountNumber) {
        final String[] numberPosition = accountNumber.split("");
        int checksum = ZERO;
        int i = ZERO;
        int j = NINE;
        final int numberPositionLength = numberPosition.length;

        while (i < numberPositionLength && j > ZERO) {
            checksum += Integer.parseInt(numberPosition[i]) * j;
            i++;
            j--;
        }
        return checksum % ELEVEN == ZERO;
    }

    /**
     * @param accountNumber to evaluate.
     * @return whether the account number is valid.
     */
    public String finding(String accountNumber) {
        if (accountNumber.contains(QUESTION_MARK)) {
            return String.format("%s ILL", accountNumber);
        } else {
            return !checkSum(accountNumber) ? String.format("%s ERR", accountNumber) : accountNumber;
        }
    }
}
