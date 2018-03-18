package org.fundacionjala.coding.omar;

import java.util.stream.IntStream;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata14 {

    private static final int ZERO = 0;
    private static final int ONE = 1;

    /**
     * @param numbers this integer array.
     * @return result .
     */
    public double[] averages(int[] numbers) {

        if (numbers == null || numbers.length == ZERO) {
            return new double[ZERO];
        }

        return IntStream.range(ZERO, numbers.length - ONE)
                .mapToDouble(i -> (numbers[i] + numbers[i + ONE]) / 2.0).toArray();


    }
}
