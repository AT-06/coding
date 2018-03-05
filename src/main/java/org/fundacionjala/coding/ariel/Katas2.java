package org.fundacionjala.coding.ariel;

import java.util.Arrays;
import java.util.StringJoiner;

import static java.util.Collections.reverseOrder;

/**
 * Kata2__Ariel Gonzales Vargas.
 */
public class Katas2 {

    /**
     * @param text Any String.
     * @return A sort String.
     */
    public String changeWord(String text) {
        String[] textos;
        textos = text.split(" ");
        String resultSubstring = "";
        StringJoiner ult = new StringJoiner(" ");
        for (String word : textos) {
            if (word.length() >= 2) {
                String another = word.substring(1, word.length() - 1);
                String[] anothers = another.split("");
                Arrays.sort(anothers, reverseOrder());
                for (String t : anothers) {
                    resultSubstring = String.join("", resultSubstring, t);
                }
                String t1 = String.valueOf(word.charAt(0));
                String t2 = String.valueOf(word.charAt(word.length() - 1));
                String result = String.join("", t1, resultSubstring, t2);
                resultSubstring = "";
                ult.add(result);

            } else {
                ult.add(word);
            }
        }
        return ult.toString();
    }
}
