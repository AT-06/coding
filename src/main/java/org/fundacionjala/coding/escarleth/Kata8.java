package org.fundacionjala.coding.escarleth;


import java.util.HashMap;
import java.util.Map;

/**
 * Powered by Escarleth L.
 * This class  contains some methods to convertNumberOCRtoNumber.
 */
public class Kata8 {
    private static final Map<String, String> NUMBERS = new HashMap<>();
    private static final int MOD_ELEVEN = 11;
    private static final int INCREMENT = 3;
    private static final int TAM_MAXIM = 27;
    private static final int SUM_THREE = 3;

    /**
     * static numbers initializer.
     */
    static {
        NUMBERS.put(" _ | ||_|", "0");
        NUMBERS.put("     |  |", "1");
        NUMBERS.put(" _  _||_ ", "2");
        NUMBERS.put(" _  _| _|", "3");
        NUMBERS.put("   |_|  |", "4");
        NUMBERS.put(" _ |_  _|", "5");
        NUMBERS.put(" _ |_ |_|", "6");
        NUMBERS.put(" _   |  |", "7");
        NUMBERS.put(" _ |_||_|", "8");
        NUMBERS.put(" _ |_| _|", "9");
    }

    /**
     * @param firstRow  is the first String row.
     * @param secondRow is the second String row.
     * @param thirdRow  is the third String row.
     * @return a transform number.
     */
    public String convertNumberOCRtoNumber(String firstRow, String secondRow, String thirdRow) {
        StringBuilder evaluatedNumber = new StringBuilder();
        for (int i = 0; i < TAM_MAXIM; i += SUM_THREE) {
            String number = firstRow.substring(i, i + INCREMENT)
                    .concat(secondRow.substring(i, i + INCREMENT))
                    .concat(thirdRow.substring(i, i + INCREMENT));
            evaluatedNumber.append(NUMBERS.getOrDefault(number, "?"));
        }
        return evaluatedNumber.toString();
    }

    /**
     * @param number is a number or error number.
     * @return result the evaluating of the number + suffix.
     */
    public String evaluatingResult(String number) {
        if (number.contains("?")) {
            return addSuffix(number);
        }
        return isValidCheckSum(number) ? number : addSuffix(number);
    }

    /**
     * @param number is a number.
     * @return if the sum%11=0.
     */
    public boolean isValidCheckSum(String number) {
        int sum = 0;
        int cont = 0;
        for (int i = number.length(); i > 0; i--) {
            sum += Character.getNumericValue(number.charAt(cont)) * i;
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

