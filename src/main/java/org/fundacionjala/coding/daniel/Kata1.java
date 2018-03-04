package org.fundacionjala.coding.daniel;

/**
 * A class that contains a method spinWords below.
 */
public class Kata1 {
    private static final int WORD_SIZE = 5;
    private static final String BLANK_SPACE = " ";

    /**
     * @param sentence A string with one or more words.
     * @return The reverse String of a sentence if it has words with length more than 5 characters.
     */

    public String spinWords(String sentence) {
        String[] words = sentence.split(BLANK_SPACE);
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= WORD_SIZE) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(BLANK_SPACE, words);
    }
}
