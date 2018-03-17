package org.fundacionjala.coding.omar;

import java.util.stream.IntStream;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */

public class Kata13 {
    
    /**
     * Method validate.
     *
     * @param numberToCheckSum .
     * @return checkSum.
     */
    public boolean validate(String numberToCheckSum) {

        final int multiplied3 = 3;
        final int multiplied1 = 1;
        final int dividable = 10;

        return IntStream.range(0, numberToCheckSum.length())
                .map(i -> numberToCheckSum.charAt(i) * (i % 2 == 0 ? multiplied1 : multiplied3))
                .sum() % dividable == 0;

    }
}
