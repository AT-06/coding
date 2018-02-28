package org.fundacionjala.coding.omar;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains method for sort the inner content of every word of a string in descending order.
 * The inner content is the content of a word without first and the last char.
 */
public class Kata2 {

    /**
     * @param words contains words for sort the inner content of every word of a string in descending order.
     * @return result
     */
    public String sortInDescendingOrder(String words) {

        String[] wordsForSort = words.split(" ");
        StringJoiner buffer = new StringJoiner(" ");

        for (String word : wordsForSort) {

            String[] aux = word.split("");
            if (aux.length != 1) {
                Arrays.sort(aux, 1, aux.length - 1, Collections.reverseOrder());
            }
            buffer.add(String.join("", aux));

        }


        return buffer.toString();
    }
}
