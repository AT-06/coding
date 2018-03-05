package org.fundacionjala.coding.maria;

import java.util.StringJoiner;

/**
 * kata 1 Spin Words.
 * Inverted String that have more of 5 letters
 * Author: Maria Canqui
 */
public class Kata1 {
    private static final int TAM = 5;
    private static final String BLANK_SPACE = " ";

    /**
     * @param words This is the sentence
     * @return words A new inverted sentence
     */
    public String spinWords(String words) {
        StringJoiner buf = new StringJoiner(BLANK_SPACE);
        for (String word : words.split(" ")) {
            if (word.length() >= TAM) {
                StringBuilder rev = new StringBuilder(word);
                word = rev.reverse().toString();
            }
            buf.add(word);
        }
        return buf.toString();

    }
}
