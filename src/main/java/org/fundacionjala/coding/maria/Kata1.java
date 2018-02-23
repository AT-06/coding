package org.fundacionjala.coding.maria;

/**
 * kata 1 Spin Words.
 * Inverted String that have more of 5 letters
 * Author: Maria Canqui
 */
public class Kata1 {
    private static final int TAM = 5;

    /**
     * @param words This is the sentence
     * @return words A new inverted sentence
     */
    public String spinWords(String words) {
        String auxString = words;
        String[] wordsList;
        wordsList = auxString.split(" ");
        auxString = "";
        StringBuffer buf = new StringBuffer();
        for (String word : wordsList) {
            if (word.length() >= TAM) {
                StringBuilder rev = new StringBuilder(word);
                word = rev.reverse().toString();
            }
            buf.append(word);
            buf.append(' ');
            auxString = buf.toString();
        }
        words = auxString.substring(0, auxString.length() - 1);
        return words;
    }
}
