package org.fundacionjala.coding.christian;

/**
 * Performed by Christian.
 */
public class ChristianKata13 {

    /**
     * @param eanCode this is for validate
     * @return tag for 'eanCode'
     */
    public boolean validate(final String eanCode) {
        int expected = Character.getNumericValue(eanCode.charAt(12));
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(eanCode.charAt(i));
            sum += ((i + 1) % 2 == 0) ? digit * 3 : digit;
        }
        sum = sum % 10;

        return (sum == 0) ? 0 == expected : 10 - sum == expected;
    }
}
