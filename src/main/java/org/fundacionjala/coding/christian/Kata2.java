package org.fundacionjala.coding.christian;
/**
 * Development by Christian
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 *
 */
public class Kata2 {
    private static final int LIST_LENGTH = 3;
    /**
     * @param words this is for Word
     * @return tag for 'words'
     */
    public String word(String words) {
        String[] wordsList = words.split(" ");
        StringJoiner joiner = new StringJoiner(" ");
        for (String aWordsList : wordsList) {
            if (aWordsList.length() > LIST_LENGTH) {
                String[] changedPosition = aWordsList.split("");
                Arrays.sort(changedPosition, 1, changedPosition.length - 1, Collections.reverseOrder());
                joiner.add(String.join("", changedPosition));
            } else {
                joiner.add(aWordsList);
            }
        }
        return joiner.toString();
    }
}
