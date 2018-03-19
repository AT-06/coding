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
        final int number12 = 12;
        final int number3 = 3;
        final int number10 = 10;
        int expected = Character.getNumericValue(eanCode.charAt(number12));
        int sum = 0;

        for (int i = 0; i < number12; i++) {
            int digit = Character.getNumericValue(eanCode.charAt(i));
            sum += ((i + 1) % 2 == 0) ? digit * number3 : digit;
        }
        sum = sum % number10;

        return (sum == 0) ? 0 == expected : number10 - sum == expected;
    }
}
