package org.fundacionjala.coding.omar;


/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata14 {

    private static final int NUMBER_1 = 1;

    /**
     * @param numbers this integer array.
     * @return result .
     */
    public double[] averages(int[] numbers) {

        if (numbers != null && numbers.length > NUMBER_1) {


            double[] results = new double[numbers.length - NUMBER_1];


            for (int i = 0; i < numbers.length - NUMBER_1; i++) {

                results[i] = (numbers[i] + numbers[i + NUMBER_1]) / 2.0;

            }
            return results;
        }

        return new double[0];


    }
}
