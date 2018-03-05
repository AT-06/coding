package org.fundacionjala.coding.ariel;

import java.util.StringJoiner;

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
        StringJoiner word = new StringJoiner(" ");
        String[] texts = text.split(" ");
        for (String t : texts) {

            word = t.length() >= CONDITION ? word.add(new StringBuilder(t).reverse()) : word.add(t);
        }
        return word.toString();
    }
}
