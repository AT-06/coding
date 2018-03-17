package org.fundacionjala.coding.omar;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * This class contains a method that prints the numbers greater to 0.
 */
public class Kata8 {


    private static final String ONE = "     |  |";

    private static final String TWO = " _  _||_ ";

    private static final String THREE = " _  _| _|";

    private static final String FOUR = "   |_|  |";

    private static final String FIVE = " _ |_  _|";

    private static final String SIX = " _ |_ |_|";

    private static final String SEVEN = " _   |  |";

    private static final String EIGHT = " _ |_||_|";

    private static final String NINE = " _ |_| _|";

    private static final Map<String, Integer> NUMBERS_MAP;

    private static final int NUMBER_1 = 1;

    private static final int NUMBER_2 = 2;

    private static final int NUMBER_3 = 3;

    private static final int NUMBER_4 = 4;

    private static final int NUMBER_5 = 5;

    private static final int NUMBER_6 = 6;

    private static final int NUMBER_7 = 7;

    private static final int NUMBER_8 = 8;

    private static final int NUMBER_9 = 9;

    private static final int NUMBER_0 = 0;

    private static final int NUMBER_11 = 11;


    static {
        NUMBERS_MAP = new HashMap<>();
        NUMBERS_MAP.put(ONE, NUMBER_1);
        NUMBERS_MAP.put(TWO, NUMBER_2);
        NUMBERS_MAP.put(THREE, NUMBER_3);
        NUMBERS_MAP.put(FOUR, NUMBER_4);
        NUMBERS_MAP.put(FIVE, NUMBER_5);
        NUMBERS_MAP.put(SIX, NUMBER_6);
        NUMBERS_MAP.put(SEVEN, NUMBER_7);
        NUMBERS_MAP.put(EIGHT, NUMBER_8);
        NUMBERS_MAP.put(NINE, NUMBER_9);
    }

    /**
     * @param characterToScan This is character will be scan.
     * @return result
     */
    public String parseSingleCharacter(String characterToScan) {

        Integer result = NUMBERS_MAP.get(characterToScan);

        return result == null ? "?" : result.toString();
    }

    /**
     * @param row1 this is the 1st row to scan.
     * @param row2 this is the 2nd row to scan.
     * @param row3 this is the 3rd row to scan.
     * @return result
     */
    public String convertEntryToNumber(String row1, String row2, String row3) {

        String[] lines = {row1, row2, row3};

        StringBuilder scannedCharacters = new StringBuilder();
        for (int i = 0; i < lines[0].length(); i += NUMBER_3) {
            String character = lines[0].substring(i, i + NUMBER_3)
                    .concat(lines[NUMBER_1].substring(i, i + NUMBER_3))
                    .concat(lines[NUMBER_2].substring(i, i + NUMBER_3));

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


        return IntStream.range(NUMBER_0, NUMBER_9)
                .map(i -> Character.getNumericValue(accountNumber.charAt(i)) * (accountNumber.length() - i))
                .sum() % NUMBER_11 == NUMBER_0;


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
