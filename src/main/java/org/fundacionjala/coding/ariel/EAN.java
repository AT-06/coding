package org.fundacionjala.coding.ariel;

/**
 * Ean checksum.
 * By Ariel Gonzales..
 */
public class EAN {

    public static final int LASTDIGIT = 12;
    public static final int PAR = 3;
    public static final int CHECKSUM1 = 10;

    /**
     * @param number A string number.
     * @return if the checksum is validate.
     */
    public boolean validate(String number) {
        String[] numeros = number.split("");
        int condition = Integer.parseInt(numeros[LASTDIGIT]);
        int suma = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            suma = (i % 2 == 0) ? suma + Integer.parseInt(numeros[i]) * 1 : suma + Integer.parseInt(numeros[i]) * PAR;
        }
        int checksum = CHECKSUM1 - (suma % CHECKSUM1);
        return checksum == condition;
    }
}

