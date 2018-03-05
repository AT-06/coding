package org.fundacionjala.coding.christian;
/**
 * Development by Christian
 */
import java.util.Arrays;
import  java.util.Collections;
import java.util.StringJoiner;

/**
 *
 */
public class Kata2 {
    private static final int LIST_LENGTH = 3;

    /**
     * @param words this is for Word
     * @return tag for 'words'
     * */
    public String word(String words) {
        String[] wordsList = words.split(" ");
        StringJoiner joiner = new StringJoiner("");
        for (int i = 0; i < wordsList.length; i++) {
            String[] changedPosition = wordsList[i].split("");
            if (changedPosition.length > LIST_LENGTH) {
                Arrays.sort(changedPosition, 1, changedPosition.length - 1, Collections.reverseOrder());
            }
            for (String letter : changedPosition) {
                joiner.add(letter);
            }
            if (i < wordsList.length - 1) {
                joiner.add(" ");
            }
        }
        return joiner.toString();
    }
}
