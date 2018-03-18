package org.fundacionjala.coding.ariel;

/**
 * Ean checksum.
 * By Ariel Gonzales.
 */
public class Kata13 {

    private static final int PAR = 3;
    private static final int CHECKSUM1 = 10;

    /**
     * @param number A string number.
     * @return if the checksum is validate.
     */
    public boolean validate(String number) {
        String[] numeros = number.split("");
        int suma = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            int num = Integer.parseInt(numeros[i]);
            suma += (i % 2 == 0) ? num : num * PAR;
        }
        int checksum = (suma % CHECKSUM1 == 0) ? 0 : CHECKSUM1 - (suma % CHECKSUM1);
        return checksum == Integer.parseInt(numeros[numeros.length - 1]);
    }
}

