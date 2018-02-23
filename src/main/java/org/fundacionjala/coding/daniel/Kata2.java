package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.Collections;

/**
 * A class which contains a sortInnerContent method.
 */
public class Kata2 {

    private static final int LIST_LENGTH = 3;

    /**
     * @param sentence A string that contains one or more words.
     * @return a string with the inner content sorted.
     */
    public String sortInnerContent(String sentence) {
        String[] wordsList = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordsList.length; i++) {
            String[] mixedLetters = wordsList[i].split("");
            if (mixedLetters.length > LIST_LENGTH) {
                Arrays.sort(mixedLetters, 1, mixedLetters.length - 1, Collections.reverseOrder());
            }
            for (String letter : mixedLetters) {
                stringBuilder.append(letter);
            }
            if (i < wordsList.length - 1) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}
