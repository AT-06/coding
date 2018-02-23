package org.fundacionjala.coding.escarleth;

/**
 * @param
 * @return This is a function that reverse words that contains five or more letters
 */
public class Kata1 {

    private static final int TAM = 5;

    /**
     * @param words This is a String that contains some words
     * @return a word with reverse words
     */
    public String spinWords(String words) {
        StringBuffer reverseWord = new StringBuffer();
        String[] partsString = words.split(" ");
        for (String word : partsString) {
            if (word.length() >= TAM) {
                StringBuilder stringBuilder = new StringBuilder(word);
                reverseWord.append(stringBuilder.reverse());
                reverseWord.append(' ');
            } else {
                reverseWord.append(word);
                reverseWord.append(' ');
            }
        }
        return reverseWord.toString().trim();
    }

}
