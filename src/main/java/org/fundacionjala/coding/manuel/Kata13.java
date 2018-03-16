package org.fundacionjala.coding.manuel;

/**
 * Created by Administrator on 3/15/2018.
 */
public class Kata13 {
    private static final int INI_INDEX = 0;
    private static final int END_INDEX = 1;
    private static final int MOD_NUMBER = 10;
    private static final int NUM_MULTI = 3;
    private static final int NUM_EVEN = 2;
    /**
     * Method to valid an EAN number.
     * @param number is the number to check.
     * @return returns true or false if the number is EAN.
     */
    public boolean isValidEAN(String number) {
        int lastDigit = Integer.parseInt(number.substring(number.length() - END_INDEX));
        String numberCopy = number.substring(INI_INDEX, number.length() - END_INDEX);
        int sum = 0;

        for (int i = 1; i < number.length(); i++) {
            if (i % NUM_EVEN == 0) {
                sum += Integer.parseInt(numberCopy.substring(INI_INDEX, END_INDEX)) * NUM_MULTI;
            } else {
                sum += Integer.parseInt(numberCopy.substring(INI_INDEX, END_INDEX));
            }
            numberCopy = numberCopy.substring(END_INDEX);
        }
        sum %= MOD_NUMBER;
        int checkSum =  sum == INI_INDEX ? sum : MOD_NUMBER - sum;
        return checkSum == lastDigit;
    }
}
