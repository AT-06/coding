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
        return detResult(onlyNumber.toString());
    }

    /**
     * @param onlyNumber string final
     * @return string con errores
     */
    private String detResult(String onlyNumber) {
        int modEleven = 0;
        String[] arrayNumbers = onlyNumber.split("");
        int count = NINE;
        for (int i = 0; i < NINE; i++) {
            if (!arrayNumbers[i].equals("?")) {
                modEleven += Integer.parseInt(arrayNumbers[i]) * count;
            }
            count--;
        }
        String result = onlyNumber;
        if (onlyNumber.toString().contains("?")) {
            result = onlyNumber.toString().concat(" ILL");
        } else if (modEleven % ELEVEN != 0) {
            result = onlyNumber.toString().concat(" ERR");
        }
        return result;
    }
}
