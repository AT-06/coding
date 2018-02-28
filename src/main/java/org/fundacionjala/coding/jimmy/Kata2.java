package org.fundacionjala.coding.jimmy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This kata was performed by Jimmy Romero.
 */
public final class Kata2 {

    /**
     * Constructor method.
     */
    private Kata2() {
    }

    private static final int MINIMUN_LENGTH_OF_WORD = 2;

    /**
     * @param stringWords is the complete string which is going to change its inner.
     * @return the inner of the word sorted.
     */
    public static String sortInnerContent(String stringWords) {
        return Arrays.stream(stringWords.split(" ")).map(w -> sortWord(w)).collect(Collectors.joining(" "));
    }

    /**
     * @param word is the independent word which is going to change its inner.
     * @return a word with its inner changed.
     */
    private static String sortWord(String word) {
        if (word.length() < MINIMUN_LENGTH_OF_WORD) {
            return word;
        } else {
            char[] innerWord = word.substring(1, word.length() - 1).toCharArray();
            Arrays.sort(innerWord);
            String reverseInnerWord = new StringBuilder(String.valueOf(innerWord)).reverse().toString();
            return word.charAt(0) + reverseInnerWord + word.charAt(word.length() - 1);
        }
    }
}
