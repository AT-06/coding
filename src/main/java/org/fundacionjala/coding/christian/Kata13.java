package org.fundacionjala.coding.christian;

/**
 * Performed by Christian.
 */
public class Kata13 {
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_10 = 10;

    /**
     * @param eanCode this is for validate
     * @return tag for 'eanCode'
     */
    public boolean validate(final String eanCode) {
        int sum = 0;
        for (int i = 0; i < eanCode.length(); i++) {
            int digit = Character.getNumericValue(eanCode.charAt(i));
            sum += ((i + 1) % 2 == 0) ? digit * NUMBER_3 : digit;
        }
        int verifySum = sum % NUMBER_10 == 0 ? 0 : NUMBER_10;
        int finalDigits = Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
        return verifySum == finalDigits;
    }
}
