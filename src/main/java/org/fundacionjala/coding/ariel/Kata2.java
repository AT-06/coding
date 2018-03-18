package org.fundacionjala.coding.ariel;

import java.util.Arrays;

import java.util.StringJoiner;

import static java.util.Collections.reverseOrder;

/**
 * Kata2__Ariel Gonzales Vargas.
 */
public class Kata2 {

    /**
     * @param text Any String.
     * @return A sort String.
     */
    public String changeWord(String text) {
        String[] words = text.split(" ");
        StringJoiner ult = new StringJoiner(" ");

        for (String w : words) {
            String[] subw = w.split("");
            if (w.length() >= 2) {
                Arrays.sort(subw, 1, w.length() - 1, reverseOrder());
                ult.add(String.join("", subw));
            } else {
                ult.add(w);
            }
        }

        return ult.toString();
    }
}
