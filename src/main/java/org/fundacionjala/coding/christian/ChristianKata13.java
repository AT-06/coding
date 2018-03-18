package org.fundacionjala.coding.christian;

/**
 * Performed by Christian.
 */
public class ChristianKata13 {
    private static final int NUMBER_12 = 12;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_10 = 10;


    /**
     * @param eanCode this is for validate
     * @return tag for 'eanCode'
     */
    public boolean validate(final String eanCode) {
        int expected = Character.getNumericValue(eanCode.charAt(NUMBER_12));
        int sum = 0;

        for (int i = 0; i < NUMBER_12; i++) {
            int digit = Character.getNumericValue(eanCode.charAt(i));
            sum += ((i + 1) % 2 == 0) ? digit * NUMBER_3 : digit;
        }
        sum = sum % NUMBER_10;

        return (sum == 0) ? 0 == expected : NUMBER_10 - sum == expected;
    }
}
