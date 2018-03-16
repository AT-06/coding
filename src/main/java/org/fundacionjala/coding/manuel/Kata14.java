package org.fundacionjala.coding.manuel;

import java.util.Arrays;

/**
 * Created by Administrator on 3/16/2018.
 */
public class Kata14 {
    //public static final int LENGTH_NUM = 1;
    public static final double DIVISOR = 2.0;

    /**
     * Method to get average of integer array.
     * @param values the integer array.
     * @return array with averages double.
     */
    public double[] averages(int[] values) {
        if (Arrays.equals(values, null) || values.length == 0) {
            return new double[]{};
        }
        double[] returnValues = new double[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            returnValues[i - 1] = (values[i] + values[i - 1]) / DIVISOR;
        }
        return returnValues;
    }
}

