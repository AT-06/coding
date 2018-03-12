package org.fundacionjala.coding.manuel;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Juan Manuel on 3/11/2018.
 */
public class Kata8 {
    private Map<String, String> mapedValues = new HashMap<>();
    private static final int SUFIX = 3;
    private static final int MOD_NUMBER = 11;
    /**
     * Constructor.
     */
    public Kata8() {
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
            concatedNumber = concatNumber(firstRow, secondRow, thirdRow);
            numberValue.add(mapedValues.containsKey(concatedNumber) ? mapedValues.get(concatedNumber) : "?");
            firstRow = firstRow.substring(SUFIX);
            secondRow = secondRow.substring(SUFIX);
            thirdRow = thirdRow.substring(SUFIX);
        }
        if (numberValue.toString().contains("?")) {
            numberValue.add(" ILL");
            return numberValue.toString();
        }
        boolean validAccount = calculateCheckSum(numberValue.toString());
        if (!validAccount) {
            numberValue.add(" ERR");
            return numberValue.toString();
        }
        return numberValue.toString();
    }

    /**
     * Method concatNumber to concat pipes and underscores.
     * @param firstRow first row of pipes and underscore.
     * @param secondRow second row of pipes and underscore.
     * @param thirdRow third row of pipes and underscore.
     * @return pipes and lines concated for first number.
     */
    public String concatNumber(String firstRow, String secondRow, String thirdRow) {
        StringJoiner join = new StringJoiner("");
        join.add(firstRow.substring(0, SUFIX));
        join.add(secondRow.substring(0, SUFIX));
        join.add(thirdRow.substring(0, SUFIX));
        return join.toString();
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
