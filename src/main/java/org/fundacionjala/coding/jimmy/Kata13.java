package org.fundacionjala.coding.jimmy;

/**
 * Class created in order to develop validate method.
 */
public class Kata13 {

    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_TEN = 10;

    /**
     * It validates a number in order to know whether is a EAN number.
     *
     * @param eanNumber is the number to validate.
     * @return the validation
     */
    public boolean validate(String eanNumber) {
        int sum = 0;
        for (int i = 1; i < eanNumber.length(); i++) {
            int number = Integer.parseInt(eanNumber.substring(i - 1, i));
            sum += i % 2 == 0 ? NUMBER_THREE * number : number;
        }
        int checksum = sum % NUMBER_TEN == 0 ? 0 : NUMBER_TEN - (sum % NUMBER_TEN);
        int lastDigit = Integer.parseInt(eanNumber.substring(eanNumber.length() - 1));
        return checksum == lastDigit;
    }
}
