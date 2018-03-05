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

        for (String word : sentence.split(" ")) {
            String[] arrString = word.split("");
            if (word.length() >= TAM) {
                Arrays.sort(arrString, 1, arrString.length - 1, Collections.reverseOrder());
                StringBuilder stringBuilder = new StringBuilder();
                for (String letter : arrString) {
                    stringBuilder.append(letter);
                }
                word = stringBuilder.toString();
            }
            stringJoiner.add(word);
            sentence = stringJoiner.toString();
        }
        return sentence;
    }
}
