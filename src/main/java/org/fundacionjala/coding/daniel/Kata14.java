package org.fundacionjala.coding.daniel;

import java.util.stream.IntStream;

/**
 * A class which contains 'averages´ method.
 */
public class Kata14 {
    /**
     * @param numbers An array of integers.
     * @return an array of the averages of each integer-number and his follower, if there is one.
     * If the array has 0 or 1 values or is null or None, the method returns an empty array.
     */
    public double[] averages(int[] numbers) {
        return numbers == null || numbers.length < 2
            ? new double[0]
            : IntStream.range(0, numbers.length - 1).mapToDouble(i -> (numbers[i] + numbers[i + 1]) / 2d).toArray();
    }
}
