package org.fundacionjala.coding.escarleth;

import java.util.HashMap;
import java.util.Map;

/**
 * Powered by Escarleth L.
 * This class  contains some methods to find a bank String
 */
public class Kata8 {
    private static Map<String, String> numbers = new HashMap<>();
    private static final int MOD_ELEVEN = 11;
    private static final int INCREMENT = 3;
    private static final int TAM_MAXIM = 27;
    private static final int SUM_THREE = 3;

    /**
     * static numbers initializer.
     */
    static {
        numbers.put(" _ | ||_|", "0");
        numbers.put("     |  |", "1");
        numbers.put(" _  _||_ ", "2");
        numbers.put(" _  _| _|", "3");
        numbers.put("   |_|  |", "4");
        numbers.put(" _ |_  _|", "5");
        numbers.put(" _ |_ |_|", "6");
        numbers.put(" _   |  |", "7");
        numbers.put(" _ |_||_|", "8");
        numbers.put(" _ |_| _|", "9");
    }

    /**
     * @param firstRow  is the first String row.
     * @param secondRow is the second String row.
     * @param thirdRow  is the third String row.
     * @return a transform number.
     */
    public String bank(String firstRow, String secondRow, String thirdRow) {
        StringBuilder evaluatedNumber = new StringBuilder();
        for (int i = 0; i < TAM_MAXIM; i += SUM_THREE) {
            String number = firstRow.substring(i, i + INCREMENT)
                    .concat(secondRow.substring(i, i + INCREMENT))
                    .concat(thirdRow.substring(i, i + INCREMENT));
            evaluatedNumber.append(getNumber(number));
        }
        return evaluatingResult(evaluatedNumber.toString());
    }

    /**
     * @param number is a number or error number.
     * @return result the evaluating of the number + suffix.
     */
    private String evaluatingResult(String number) {
        if (number.contains("?")) {
            return addSuffix(number);
        }
        return verifyModuleEleven(number) ? number : addSuffix(number);
    }

    /**
     * @param number is the symbols of the number.
     * @return result a positive number
     */
    private String getNumber(String number) {
        return numbers.get(number) != null ? numbers.get(number) : "?";
    }

    /**
     * @param number is a number.
     * @return if the number%11=0.
     */
    private boolean verifyModuleEleven(String number) {
        int sum = 0;
        int cont = 0;
        for (int i = number.length() - 1; i > 0; i--) {
            sum += ((int) number.charAt(cont)) * i;
            cont++;
        }
        return sum % MOD_ELEVEN == 0;
    }

    /**
     * @param number is a error number.
     * @return string with a suffix.
     */
    private String addSuffix(String number) {

        return number.contains("?") ? String.format("%s %s", number, "ILL") : String.format("%s %s", number, "ERR");
    }
}
