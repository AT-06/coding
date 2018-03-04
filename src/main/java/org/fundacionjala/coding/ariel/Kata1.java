package org.fundacionjala.coding.ariel;


/**
 * Kata 1.
 * Ariel Gonzales.
 */
public class Kata1 {

    public static final int CONDITION = 5;

    /**
     * @param text Any String Text.
     * @return String.
     */
    public String rotReverseWord(String text) {
        String word = "";
        String[] texts = text.split(" ");
        for (String t : texts) {
            String wordLessFive = String.join(" ", word, new StringBuilder(t).reverse());
            word = t.length() >= CONDITION ? wordLessFive : String.join(" ", word, t);
        }
        return word.trim();
    }
}
