package org.fundacionjala.coding.manuel;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Juan Manuel on 3/11/2018.
 */
public class Kata8 {

    private static final int SUFIX = 3;
    private static final int MOD_NUMBER = 11;
    private static Map<String, String> mapedValues = new HashMap<>();
    /**
     * static initializer.
     */
    static {
        mapedValues.put(" _ | ||_|", "0");
        mapedValues.put("     |  |", "1");
        mapedValues.put(" _  _||_ ", "2");
        mapedValues.put(" _  _| _|", "3");
        mapedValues.put("   |_|  |", "4");
        mapedValues.put(" _ |_  _|", "5");
        mapedValues.put(" _ |_ |_|", "6");
        mapedValues.put(" _   |  |", "7");
        mapedValues.put(" _ |_||_|", "8");
        mapedValues.put(" _ |_| _|", "9");
    }

    /**
     * Method bank to convert number.
     * @param firstRow first row of pipes and underscore.
     * @param secondRow second row of pipes and underscore.
     * @param thirdRow third row of pipes and underscore.
     * @return numberValue converted.
     */
    public String bank(String firstRow, String secondRow, String thirdRow) {
        StringJoiner numberValue = new StringJoiner("");
        String concatedNumber;
        while (!firstRow.isEmpty()) {
            concatedNumber = firstRow.substring(0, SUFIX).concat(secondRow.substring(0, SUFIX));
            concatedNumber = concatedNumber.concat(thirdRow.substring(0, SUFIX));
            numberValue.add(mapedValues.containsKey(concatedNumber) ? mapedValues.get(concatedNumber) : "?");
            firstRow = firstRow.substring(SUFIX);
            secondRow = secondRow.substring(SUFIX);
            thirdRow = thirdRow.substring(SUFIX);
        }
        return addSufixes(numberValue.toString());
    }

    /**
     * Method defineSufixes to concat sufixes or not to account.
     * @param numberValue value with the account and ?.
     * @return account with ILL or ERR or valid account.
     */
    public String addSufixes(String numberValue) {
        if (numberValue.contains("?")) {
            return numberValue.concat(" ILL");
        }
        if (!calculateCheckSum(numberValue)) {
            return numberValue.concat(" ERR");
        }
        return numberValue;
    }

    /**
     * Method calculateCheckSum to check if it is a valid account.
     * @param number number converted.
     * @return boolean value if the account is real.
     */
    public boolean calculateCheckSum(String number) {
        int sum = 0;
        for (int i = number.length(); i > 0; i--) {
            sum += Integer.parseInt(number.substring(0, 1)) * i;
            number = number.substring(1);
        }
        return sum % MOD_NUMBER == 0;
    }
}
