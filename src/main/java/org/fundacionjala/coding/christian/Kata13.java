package org.fundacionjala.coding.christian;

/**
 * Performed by Christian.
 */
public class Kata13 {

    /**
     * @param eanCode this is for validate
     * @return tag for 'eanCode'
     */
    public boolean validate(final String eanCode) {
        final int number3 = 3;
        final int number10 = 10;
        int sum = 0;
        for (int i = 0; i < eanCode.length(); i++) {
            int digit = Character.getNumericValue(eanCode.charAt(i));
            sum += ((i + 1) % 2 == 0) ? digit * number3 : digit;
        }
        int verifySum = sum % number10 == 0 ? 0 : number10;
        int finalDigits = Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
        return verifySum == finalDigits;
    }
}
