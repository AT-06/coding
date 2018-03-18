package org.fundacionjala.coding.ariel;

/**
 * Kata14.
 * By Ariel Gonzales Vargas.
 */
public class Kata14 {
    /**
     * @param series An array Type int.
     * @return An array Type double with averages results.
     */
    public double[] averages(int[] series) {
        if (series == null || series.length == 0) {
            return new double[]{};
        }
        double[] resp = new double[series.length - 1];
        for (int i = 0; i < series.length - 1; i++) {
            resp[i] = (series[i] + series[i + 1]) / 2.0;
        }
        return resp;
    }
}
