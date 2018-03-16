package org.fundacionjala.coding.jimmy;

/**
 * Class created in order to develop averages method.
 */
public class Kata14 {

    public static final double DOUBLE_AVERAGE = 2.0;

    /**
     * Method that returns the average numbers of elements from an array .
     *
     * @param averageNumbers the array to calculate average of its elements.
     * @return an array with the average of its elements.
     */
    public double[] averages(int[] averageNumbers) {

        if (averageNumbers == null || averageNumbers.length < 2) {
            return new double[0];
        }

        double[] resultantArray = new double[averageNumbers.length - 1];
        for (int i = 0; i < resultantArray.length; i++) {
            resultantArray[i] = (averageNumbers[i] + averageNumbers[i + 1]) / DOUBLE_AVERAGE;
        }
        return resultantArray;
    }
}
