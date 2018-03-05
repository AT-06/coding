package org.fundacionjala.coding.escarleth;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata2 is a class that contains a method SortInnerContent
 * that reverse words without first letter and the last letter
 */

public class Kata2 {
    private static final int TAM = 3;

    /**
     * @param wordsSort contains words that will be sorted in descending order.
     * @return result
     */

    public String sortInnerContent(String wordsSort) {
        return Arrays.stream(wordsSort.split(" "))
                .map(word -> word.length() > TAM ? reverseWord(word) : word)
                .collect(Collectors.joining(" "));
    }

    /**
     * @param wordToReverse contains letters that will be sorted in descending order without first and last letter.
     * @return result
     */

    private String reverseWord(String wordToReverse) {
        String[] lettersList = wordToReverse.split("");
        Arrays.sort(lettersList, 1, lettersList.length - 1, Collections.reverseOrder());
        return Arrays.stream(lettersList).collect(Collectors.joining());
    }
}
