package org.fundacionjala.coding.ariel;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Kata 8.
 * By Ariel Gonzales Vargas.
 */
public class Kata8 {

    public static final int CHECKSUM = 11;
    public static final int THREE = 3;
    private static final Map<String, String> LIST = new HashMap<>();
    public static final int NUMBER = 9;
    public static final int LONG = 27;

    static {
        LIST.put(" _ | ||_|", "0");
        LIST.put("     |  |", "1");
        LIST.put(" _  _||_ ", "2");
        LIST.put(" _  _| _|", "3");
        LIST.put("   |_|  |", "4");
        LIST.put(" _ |_  _|", "5");
        LIST.put(" _ |_ |_|", "6");
        LIST.put(" _   |  |", "7");
        LIST.put(" _ |_||_|", "8");
        LIST.put(" _ |_| _|", "9");
    }

    /**
     * @param file1 A part of the digit.
     * @param file2 A part of the digit.
     * @param file3 A part of the digit.
     * @return A checksum serie or serie ERR or ILL.
     */
    public String story1(String file1, String file2, String file3) {
        StringJoiner digitSum = new StringJoiner("");

        for (int i = 0; i < LONG; i += THREE) {
            String digit = file1.substring(i, i + THREE)
                    .concat(file2.substring(i, i + THREE))
                    .concat(file3.substring(i, i + THREE));
            digitSum.add(LIST.containsKey(digit) ? LIST.get(digit) : "?");
        }

        return digitSum.toString();
    }

    /**
     * @param serie A  string serie.
     * @return a serie ILL or ERR.
     */
    public String valid(String serie) {
        if (serie.contains("?")) {
            return String.format("%s %s", serie, "ILL");
        }
        return checkSumCheck(serie) ? serie : String.format("%s %s", serie, "ERR");
    }

    /**
     * @param serie A  string serie.
     * @return a checksum serie or not.
     */
    public boolean checkSumCheck(String serie) {
        int number = NUMBER;
        int sum = 0;
        for (int i = 0; i < serie.length(); i++) {
            int checks = Character.getNumericValue(serie.charAt(i)) * number;
            sum += checks;
            number--;
        }
        return sum % CHECKSUM == 0;
    }
}
