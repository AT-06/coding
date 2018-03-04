package org.fundacionjala.coding.jimmy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class contains a method which is going to spin a string whether is greater than 5 in length.
 */
public class Kata1 {

      private static final int THRESHOLD = 5;

    /**
     * @param wordsToSpin is a method for spin a word greater than 5 in length.
     * @return a word spinned if is greater than 5 in length.
     */
    public String spinWords(String wordsToSpin) {
        return Arrays.stream(wordsToSpin.split(" "))
                .map(i -> i.length() >= THRESHOLD ? new StringBuilder(i).reverse() : i)
                .collect(Collectors.joining(" "));
    }
}
