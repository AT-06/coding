package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata14 is a class that contains a averages method
 */
public class Kata14 {
    private static final double DIV_TWO = 2.0;

    /**
     * @param numbers This is a array of numbers.
     * @return double[] averages
     */
    public double[] averages(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[]{};
        }
        int i = 0;
        double[] result = new double[numbers.length - 1];
        while (i < numbers.length - 1) {
            result[i] = (numbers[i] + numbers[i + 1]) / DIV_TWO;
            i++;
        }
        return result;
    }
}

