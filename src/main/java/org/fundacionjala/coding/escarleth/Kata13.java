package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth L.
 * This class  contains isValidEANValidation.
 */
public class Kata13 {
    private static final int TEN = 10;
    private static final int TAM_NUMBER = 12;
    private static final int THREE_MULTIPLY = 3;

    /**
     * @param number is a number to verify if comply with the EAN Validation.
     * @return true or false
     */
    public boolean isValidEANValidation(String number) {
        int sum = 0;
        for (int i = 0; i < TAM_NUMBER; i++) {
            int num = Character.getNumericValue(number.charAt(i));
            if (i + 1 % 2 == 0) {
                sum += num * THREE_MULTIPLY;
            }
            sum += num;
        }
        sum = sum % TEN;
        int checksum = Character.getNumericValue(number.charAt(TAM_NUMBER));
        return (sum == 0) ? 0 == checksum : TEN - sum == checksum;
    }
}

