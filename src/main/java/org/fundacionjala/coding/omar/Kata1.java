package org.fundacionjala.coding.omar;

import java.util.StringJoiner;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains a method that takes in a string of one or more words,
 * and returns the same string, but with all five or more letter words reversed.
 */
public class Kata1 {

    private static final int LIMIT = 5;
    private static final String BLANK_SPACE = " ";

    /**
     * @param words this is words for Spin Words
     * @return result
     */
    public String spinWords(String words) {
        StringJoiner result = new StringJoiner(BLANK_SPACE);
        String[] splitWords = words.split(BLANK_SPACE);

        for (String word : splitWords) {
            result.add(word.length() >= LIMIT ? new StringBuilder(word).reverse() : word);
        }

        return result.toString();
    }
}
