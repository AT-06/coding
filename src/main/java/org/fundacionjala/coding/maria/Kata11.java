package org.fundacionjala.coding.maria;

/**
 * kata 11.
 */
public class Kata11 {
    private static final int HUNDRED = 100;
    /**
     * @param content contenido ml
     * @param evapPerDay evaporacion por dia
     * @param threshold umbral
     * @return dias
     */
    public int evaporator(double content, double evapPerDay, double threshold) {
        threshold = (threshold * content) / HUNDRED;
        int dias = 0;
        while (content > threshold) {
            content = content - ((evapPerDay * content) / HUNDRED);
            dias++;
        }
        return dias;
    }
}
