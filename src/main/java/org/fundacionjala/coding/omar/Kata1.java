package org.fundacionjala.coding.omar;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains a method that takes in a string of one or more words,
 * and returns the same string, but with all five or more letter words reversed.
 */
public class Kata1 {

    private static final int LIMIT = 5;

    /**
     * @param words this is words for Spin Words
     * @return result
     */
    public String spinWords(String words) {
        String result = "";
        String[] splitWords = words.split(" ");

        for (String word : splitWords) {
            result += word.length() >= LIMIT ? new StringBuilder(word).reverse() + " " : word + " ";
        }

        System.out.println(words + " : " + result);
        return result.trim();
    }
}
