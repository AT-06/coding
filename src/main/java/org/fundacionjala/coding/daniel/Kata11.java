package org.fundacionjala.coding.daniel;

/**
 * A class which contains evaporator method.
 */
public class Kata11 {

    private static final double ONE_HUNDRED = 100.0;

    /**
     * @param content the content in ml.
     * @param evapPerDay the percentage of foam or gas lost every day.
     * @param threshold the percentage beyond which the evaporator is no longer useful.
     * @return the nth day (as an integer) on which the evaporator will be out of use.
     */
    public int evaporator(double content, double evapPerDay, double threshold) {
        return (int) Math.ceil(Math.log(threshold / ONE_HUNDRED) / Math.log(1.0 - evapPerDay / ONE_HUNDRED));
    }
}
