package org.fundacionjala.coding.maria;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Kata 2.
 * By Maria C.
 */
public class Kata2 {
    private static final int TAM = 4;
    private static final String BLANK_SPACE = " ";

    /**
     * Metodo sortInnerContent.
     *
     * @param sentence string
     * @return sorted string
     */
    public String sortInnerContent(String sentence) {

        StringJoiner stringJoiner = new StringJoiner(BLANK_SPACE);
        for (String word : sentence.split(BLANK_SPACE)) {
            if (word.length() >= TAM) {
                String[] arrString = word.split("");
                Arrays.sort(arrString, 1, arrString.length - 1, Collections.reverseOrder());
                word = String.join("", arrString);
            }
            stringJoiner.add(word);
        }
        return stringJoiner.toString();
    }
}
