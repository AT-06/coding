package org.fundacionjala.coding.maria;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Kata 8 bank number.
 */
public class Kata8 {
    private static final int THREE = 3;
    private static final int ELEVEN = 11;
    private static final int NINE = 9;
    private static Map<String, String> numberEqui = new HashMap<>();
    static {
        numberEqui.put(" _ | ||_|", "0");
        numberEqui.put("     |  |", "1");
        numberEqui.put(" _  _||_ ", "2");
        numberEqui.put(" _  _| _|", "3");
        numberEqui.put("   |_|  |", "4");
        numberEqui.put(" _ |_  _|", "5");
        numberEqui.put(" _ |_ |_|", "6");
        numberEqui.put(" _   |  |", "7");
        numberEqui.put(" _ |_||_|", "8");
        numberEqui.put(" _ |_| _|", "9");
    }

    /**
     * @param filaUno fila uno string
     * @param filaDos fila dos string
     * @param filaTres fila tres string
     * @return numero
     */
    public String bankOCR(String filaUno, String filaDos, String filaTres) {

        StringJoiner onlyNumber = new StringJoiner("");
        for (int i = NINE; i >= 1; i--) {
            StringJoiner number = new StringJoiner("");
            number.add(filaUno.substring(0, THREE))
                    .add(filaDos.substring(0, THREE))
                    .add(filaTres.substring(0, THREE));

            String numberContent = numberEqui.get(number.toString());
            if (numberContent == null) {
                onlyNumber.add("?");
            } else {
                onlyNumber.add(numberContent);
            }

            filaUno = filaUno.substring(THREE);
            filaDos = filaDos.substring(THREE);
            filaTres = filaTres.substring(THREE);
        }
        return onlyNumber.toString();
    }


    /**
     * @param number string
     * @return ill if the string contains ?
     */
    public String ill(String number) {
        if (number.contains("?")) {
            number = number.concat(" ILL");
        }
        return number;
    }

    /**
     * @param number string
     * @return if the fsum of fields is mod 11
     */
    public String err(String number) {
        int modEleven = 0;
        String[] arrayNumbers = number.split("");
        int count = NINE;
        for (int i = 0; i < NINE; i++) {
            if (!arrayNumbers[i].equals("?")) {
                modEleven += Integer.parseInt(arrayNumbers[i]) * count;
            }
            count--;
        }
        number = modEleven % ELEVEN != 0 ? number.concat(" ERR") : number;
        return number;
    }
}
