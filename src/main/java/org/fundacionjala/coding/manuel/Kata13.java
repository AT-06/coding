package org.fundacionjala.coding.manuel;

/**
 * Created by Administrator on 3/15/2018.
 */
public class Kata13 {
    private static final int MOD_NUMBER = 10;
    private static final int NUM_EVEN = 2;
    private static final int MULTI = 3;
    /**
     * Method to valid an EAN number.
     * @param number is the number to check.
     * @return returns true or false if the number is EAN.
     */
    public boolean isValidEAN(String number) {
        String numberCopy = number;
        int sum = 0;

        for (int i = 1; i < number.length(); i++) {
            int mul = i % NUM_EVEN == 0 ? MULTI : 1;
            sum += Integer.parseInt(numberCopy.substring(0, 1)) * mul;
            numberCopy = numberCopy.substring(1);
        }
        int checkSum =  sum % MOD_NUMBER == 0 ? 0 : MOD_NUMBER - sum % MOD_NUMBER;
        return checkSum == Integer.parseInt(numberCopy);
    }
}
