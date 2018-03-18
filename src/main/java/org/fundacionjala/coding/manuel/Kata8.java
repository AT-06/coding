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
    public String convertEntryToNumber(String firstRow, String secondRow, String thirdRow) {
        StringJoiner numberValue = new StringJoiner("");
        while (!firstRow.isEmpty()) {
            String concatenatedNumber = firstRow.substring(0, SUFIX)
                    .concat(secondRow.substring(0, SUFIX))
                    .concat(thirdRow.substring(0, SUFIX));
            numberValue.add(mapedValues.getOrDefault(concatenatedNumber, "?"));
            firstRow = firstRow.substring(SUFIX);
            secondRow = secondRow.substring(SUFIX);
            thirdRow = thirdRow.substring(SUFIX);
        }
        return numberValue.toString();
    }

    /**
     * Method addSufixes to add ILL in case ?.
     * @param numberValue number converted.
     * @return string value account if ? then ILL.
     */
    public String addSufixes(String numberValue) {
        return numberValue.contains("?") ? numberValue.concat(" ILL") : numberValue;
    }

    /**
     * Method calculateCheckSum to check if it is a valid account.
     * @param number number converted.
     * @return string value account if not real then concat ERR.
     */
    public String calculateCheckSum(String number) {
        int sum = 0;
        String numberCopy = number;
        for (int i = numberCopy.length(); i > 0; i--) {
            sum += Integer.parseInt(numberCopy.substring(0, 1)) * i;
            numberCopy = numberCopy.substring(1);
        }
        return (sum % MOD_NUMBER) == 0 ? number : number.concat(" ERR");
    }
}
