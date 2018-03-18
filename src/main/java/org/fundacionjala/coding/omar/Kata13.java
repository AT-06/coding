package org.fundacionjala.coding.omar;

import java.util.stream.IntStream;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */

public class Kata13 {

    private static final int ZERO = 0;
    private static final int DIVIDABLE = 10;

    /**
     * Method validate.
     *
     * @param numberToCheckSum .
     * @return checkSum.
     */
    public boolean validate(String numberToCheckSum) {

        final int number1 = 1;
        final int number2 = 2;


        final int sum = IntStream
                .range(ZERO, numberToCheckSum.length() - 1)
                .reduce(ZERO, (n, i)
                        -> n + Character.getNumericValue(numberToCheckSum.charAt(i))
                        * (number1 + number2 * (i % number2)));

        final int checksum = sum % DIVIDABLE == ZERO ? ZERO : DIVIDABLE - (sum % DIVIDABLE);

        return Character.getNumericValue(numberToCheckSum.charAt(numberToCheckSum.length() - 1)) == checksum;
    }
}
