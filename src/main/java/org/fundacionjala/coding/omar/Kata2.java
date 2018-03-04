package org.fundacionjala.coding.omar;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * This class contains method for sort the inner content of every word of a string in descending order.
 * The inner content is the content of a word without first and the last char.
 */
public class Kata2 {

    private static final String BLANK_SPACE = " ";
    private static final String EMPTY_STRING = "";
    private static final int ONE = 1;

    /**
     * @param words contains words for sort the inner content of every word of a string in descending order.
     * @return result
     */
    public String sortInDescendingOrder(String words) {

        String[] wordsForSort = words.split(BLANK_SPACE);
        StringJoiner buffer = new StringJoiner(BLANK_SPACE);

        for (String word : wordsForSort) {

            String[] aux = word.split(EMPTY_STRING);
            if (aux.length != ONE) {
                Arrays.sort(aux, ONE, aux.length - ONE, Collections.reverseOrder());
            }
            buffer.add(String.join(EMPTY_STRING, aux));

        }


        return buffer.toString();
    }
}
