package org.fundacionjala.coding.ariel;

/**
 * Kata 15.
 * By Ariel Gonzales Vargas..
 */
public class Kata15 {
    /**
     * @param serie A integer array.
     * @return the quantity of the most number common inner the array.
     */
    public int mostFrequentItemCount(int[] serie) {
        int mayor = 0;
        for (int i = 0; i < serie.length; i++) {
            int cont = 0;
            for (int j = i; j < serie.length; j++) {
                if (serie[i] == serie[j]) {
                    cont++;
                }
            }
            if (cont > mayor) {
                mayor = cont;
            }
        }
        return mayor;
    }
}
