package org.fundacionjala.coding.escarleth;

import java.util.StringJoiner;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata1 is a class that contains a spinWord method
 */
public class Kata1 {

    private static final int TAM = 5;

    /**
     * @param words This is a String that contains some words.
     * @return a word with reverse words if word.length is >= 5
     */
    public String spinWords(String words) {
        StringJoiner reverseWord = new StringJoiner(" ");
        String[] partsString = words.split(" ");
        for (String word : partsString) {
            reverseWord.add(word.length() >= TAM ? new StringBuilder(word).reverse() : word);
        }
        return reverseWord.toString();
    }
}
