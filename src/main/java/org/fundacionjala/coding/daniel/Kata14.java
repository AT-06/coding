package org.fundacionjala.coding.daniel;

import java.util.stream.IntStream;

public class Kata14 {
    public double[] averages(int[] numbers)
    {
        return numbers == null || numbers.length<2
            ? new double[0]
            : IntStream.range(0, numbers.length-1).mapToDouble(i -> (numbers[i] + numbers[i+1])/2d).toArray();
    }
}
