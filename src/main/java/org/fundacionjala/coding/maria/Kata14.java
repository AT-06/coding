package org.fundacionjala.coding.maria;

/**
 * Kata 14.
 */
public class Kata14 {
    private static final double DIV = 2.0;
    /**
     * @param numberArray array numbers
     * @return averages of the numbers
     */
    public double[] averages(int[] numberArray) {
        if (numberArray != null && numberArray.length > 1) {
                double[] avera = new double[numberArray.length - 1];
                for (int i = 0; i < numberArray.length - 1; i++) {
                    avera[i] = (numberArray[i] + numberArray[i + 1]) / DIV;
                }
                return avera;
        }
        return new double[]{};
    }
}
