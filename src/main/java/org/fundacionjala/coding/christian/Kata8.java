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

    private static final String ONE_STRING = "     |  |";
    private static final String TWO_STRING = " _  _||_ ";
    private static final String THREE_STRING = " _  _| _|";
    private static final String FOUR_STRING = "   |_|  |";
    private static final String FIVE_STRING = " _ |_  _|";
    private static final String SIX_STRING = " _ |_ |_|";
    private static final String SEVEN_STRING = " _   |  |";
    private static final String EIGHT_STRING = " _ |_||_|";
    private static final String NINE_STRING = " _ |_| _|";

    private static final Map<String, String> STRING_STRING_MAP;
    static {
        STRING_STRING_MAP= new HashMap<>();
        STRING_STRING_MAP.put(ONE_STRING, "1");
        STRING_STRING_MAP.put(TWO_STRING, "2");
        STRING_STRING_MAP.put(THREE_STRING, "3");
        STRING_STRING_MAP.put(FOUR_STRING, "4");
        STRING_STRING_MAP.put(FIVE_STRING, "5");
        STRING_STRING_MAP.put(SIX_STRING, "6");
        STRING_STRING_MAP.put(SEVEN_STRING, "7");
        STRING_STRING_MAP.put(EIGHT_STRING, "8");
        STRING_STRING_MAP.put(NINE_STRING, "9");

    }

    /**
     * @param characterToScan .
     * @return String.
     */
    public String parseSingleCharacter(String characterToScan) {
        return STRING_STRING_MAP.getOrDefault(characterToScan, "?");
    }

    /**
     * @param line .
     * @param line2 .
     * @param line3 .
     * @return result.
     */
    public String convertEntryToNumber(String line, String line2, String line3) {
        String[] lines = {line, line2, line3};
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
