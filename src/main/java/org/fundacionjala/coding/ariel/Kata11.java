package org.fundacionjala.coding.ariel;

/**
 * Kata 11.
 * By Ariel Gonzales Vargas.
 */
public class Kata11 {

    private static final int FULL = 100;
    public static final int PORCENTAJE = 100;

    /**
     * @param content      it content the 100% of the evaporator.
     * @param evapPerDay It contains the porcentaje the it loss every day.
     * @param threshold    It contains the limit where the evaporator don't work.
     * @return a works days.
     */
    public int evaporator(double content, double evapPerDay, double threshold) {
        int days = 0;
        double full = FULL;
        while (full > threshold) {
            full -= full * (evapPerDay / PORCENTAJE);
            days++;
        }
        return days;
    }
}

