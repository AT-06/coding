package org.fundacionjala.coding.ariel;

/**
 * Kata Ariel Gonzales.
 */
public class Kata1 {
    private static final int CONDITION = 5;

    /**
     * @param text Any String Text.
     * @return String.
     */
    public String rotReverseWord(String text) {
        String word = "";
        String[] texts = text.split(" ");
        for (String t : texts) {
            String wordMoreFive = String.join(" ", word, new StringBuilder(t).reverse());
            word = t.length() >= CONDITION ? wordMoreFive : String.join(" ", word, t);
        }
        return word.trim();
    }
}
