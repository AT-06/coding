package org.fundacionjala.coding.christian;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Developer by Christian.
 */
public class Kata8 {
    private static final int NUMBER1 = 1;
    private static final int NUMBER2 = 2;
    private static final int NUMBER3 = 3;
    private static final int NUMBER9 = 9;
    private static final int NUMBER0 = 0;
    private static final int NUMBER11 = 11;

    private static final String ONE = "     |  |";

    private static final String TWO = " _  _||_ ";

    private static final String THREE = " _  _| _|";

    private static final String FOUR = "   |_|  |";

    private static final String FIVE = " _ |_  _|";

    private static final String SIX = " _ |_ |_|";

    private static final String SEVEN = " _   |  |";

    private static final String EIGHT = " _ |_||_|";

    private static final String NINE = " _ |_| _|";

    private static final Map<String, String> NUMBER_MAP;
    static {
        NUMBER_MAP = new HashMap<>();
        NUMBER_MAP.put(ONE, "1");
        NUMBER_MAP.put(TWO, "2");
        NUMBER_MAP.put(THREE, "3");
        NUMBER_MAP.put(FOUR, "4");
        NUMBER_MAP.put(FIVE, "5");
        NUMBER_MAP.put(SIX, "6");
        NUMBER_MAP.put(SEVEN, "7");
        NUMBER_MAP.put(EIGHT, "8");
        NUMBER_MAP.put(NINE, "9");

    }

    /**
     * @param characterToScan .
     * @return String.
     */
    public String parseSingleCharacter(String characterToScan) {
        return NUMBER_MAP.getOrDefault(characterToScan, "?");
    }

    /**
     * @param row1 .
     * @param row2 .
     * @param row3 .
     * @return result.
     */
    public String convertEntryToNumber(String row1, String row2, String row3) {
        String[] lines = {row1, row2, row3};
        StringBuilder scannedCharacters = new StringBuilder();
        for (int i = 0; i < lines[0].length(); i += NUMBER3) {
            String character = lines[0].substring(i, i + NUMBER3)
                    .concat(lines[NUMBER1].substring(i, i + NUMBER3))
                    .concat(lines[NUMBER2].substring(i, i + NUMBER3));
            String parsedCharacter = parseSingleCharacter(character);
            scannedCharacters.append(parsedCharacter);
        }

        return scannedCharacters.toString();
    }

    /**
     * @param accountNumber .
     * @return .
     */
    public boolean checkSum(String accountNumber) {
        return IntStream.range(NUMBER0, NUMBER9)
                .map(i -> Character.getNumericValue(accountNumber.charAt(i)) * (accountNumber.length() - i))
                .sum() % NUMBER11 == NUMBER0;

    }

    /**
     * @param account .
     * @return .
     */
    public String lookingFor(String account) {
        if (account.contains("?")) {
            return String.format("%s ILL", account);
        }
        return !checkSum(account) ? String.format("%s ERR", account) : account;
    }

}
