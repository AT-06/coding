package org.fundacionjala.coding.maria;

import java.util.Arrays;
import java.util.Collections;

/**
 * Kata 2.
 * By Maria C.
 */
public class Kata2 {
    private static final int TAM = 4;

    /**
     * Metodo sortInnerContent.
     *
     * @param sentence string
     * @return sorted string
     */
    public String sortInnerContent(String sentence) {
        String[] wordsList;
        wordsList = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : wordsList) {
            String[] arrString = word.split("");
            if (word.length() >= TAM) {
                Arrays.sort(arrString, 1, arrString.length - 1, Collections.reverseOrder());
                for (String letter : arrString) {
                    stringBuilder.append(letter);
                }
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(' ');
        }
        sentence = stringBuilder.toString();
        return sentence.substring(0, sentence.length() - 1);
    }
}
