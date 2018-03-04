package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * A class which contains a sortInnerContent method.
 */
class Kata2 {

    private static final String BLANK_SPACE = " ";
    private static final String EMPTY = "";
    private static final int WORD_LENGTH = 3;

    /**
     * Constructor for class Kata2.
     */
    Kata2() {
    }

    /**
     * @param sentence A string that contains one or more words.
     * @return a string with the inner content sorted.
     */
    public String sortInnerContent(String sentence) {
        return Arrays.asList(sentence.split(BLANK_SPACE)).stream()
            .map(word -> word.length() < WORD_LENGTH ? word
                : word.charAt(0) + sortChars(word) + word.charAt(word.length() - 1))
            .collect(Collectors.joining(BLANK_SPACE));
    }

    /**
     * @param word A String.
     * @return The word in reverse order.
     */
    public String sortChars(String word) {
        String[] chars = word.substring(1, word.length() - 1).split(EMPTY);
        Arrays.sort(chars, Collections.reverseOrder());
        return String.join(EMPTY, chars);
    }
}
