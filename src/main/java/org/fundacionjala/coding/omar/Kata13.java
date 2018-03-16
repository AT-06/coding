package org.fundacionjala.coding.omar;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */

public class Kata13 {


    private static final int ZERO = 0;


    /**
     * Method validate.
     *
     * @param numberToCheckSum .
     * @return checkSum.
     */
    public boolean validate(String numberToCheckSum) {

        final int number10 = 10;
        final int number3 = 3;
        final int number2 = 2;
        final int number1 = 1;
        int checkSum = ZERO;

        for (int i = ZERO; i < numberToCheckSum.length(); i++) {

            checkSum += (i + number1) % number2 == ZERO
                    ? numberToCheckSum.charAt(i) * number3 : numberToCheckSum.charAt(i);

        }

        return checkSum % number10 == ZERO;

    }
}
