package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth L.
 * This class  contains isValidEANValidation.
 */
public class Kata13 {
    private static final int TEN = 10;
    private static final int THREE_MULTIPLIER = 3;

    /**
     * @param number is a number to verify if comply with the EAN Validation.
     * @return true or false
     */
    public boolean isValidEANValidation(String number) {
        int sum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            int num = Character.getNumericValue(number.charAt(i));
            sum += (i + 1) % 2 == 0 ? num * THREE_MULTIPLIER : num;
        }
        int checkSum = sum % TEN == 0 ? 0 : TEN - sum % TEN;
        int lastDigit = Character.getNumericValue(number.charAt(number.length() - 1));
        return checkSum == lastDigit;
    }
}

