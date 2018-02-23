package org.fundacionjala.coding.omar;

import java.util.Arrays;
import java.util.Collections;

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
        StringBuffer buffer = new StringBuffer();
        String space = " ";

        for (String word : wordsForSort) {

            String[] aux = word.split("");
            if (aux.length != 1) {
                Arrays.sort(aux, 1, aux.length - 1, Collections.reverseOrder());
            }
            for (String c : aux) {
                buffer.append(c);
            }
            buffer.append(space);
        }
        System.out.println(buffer);


        return buffer.toString().trim();
    }
}
