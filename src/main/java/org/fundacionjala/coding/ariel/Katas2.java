package org.fundacionjala.coding.ariel;

import java.util.Arrays;

import static java.util.Collections.reverseOrder;

/**
 * Kata2__Ariel Gonzales Vargas.
 */
public class Katas2 {
    private String text;
    private String[] textos;

    /**
     * @param text The input is a String
     */
    public Katas2(String text) {
        this.text = text;
    }
    /**
     * @return Return a String but the inner content
     * of a word change in descending order.
     */
    public String changeWord() {
        textos = text.split(" ");
        String result;
        String result1 = "";
        String ult = "";
        for (String word : textos) {

            if (word.length() >= 2) {

                String another = word.substring(1, word.length() - 1);
                String[] anothers = another.split("");
                Arrays.sort(anothers, reverseOrder());
                for (String t : anothers) {

                    result1 = String.join("", result1, t);
                }
                result = result1;
                String t1 = String.valueOf(word.charAt(0));
                String t2 = String.valueOf(word.charAt(word.length() - 1));
                result = String.join("", t1, result, t2);
                ult = String.join(" ", ult, result);
                result1 = "";
            } else {
                ult = String.join(" ", ult, word);
            }
        }
        return ult.trim();
    }
}
