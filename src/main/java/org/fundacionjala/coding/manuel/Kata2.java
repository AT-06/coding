package org.fundacionjala.coding.manuel;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;


/**
 * Created by Administrator on 2/23/2018.
 */
public class Kata2 {

    private static final int MAX_LENGHT = 3;

    /**
     * @return string que es la oracion ordenada.
     * @param sentence .
     */
    public String sortInnerContent(String sentence) {
        String[] words = sentence.split(" ");
        StringJoiner joinWord = new StringJoiner(" ");
        for (String singleWord : words) {
            if (singleWord.length() > MAX_LENGHT) {
                String[] letters = singleWord.split("");
                Arrays.sort(letters, 1, singleWord.length() - 1, Collections.reverseOrder());
                singleWord  = String.join("", letters);
            }
            joinWord.add(singleWord);
        }
        return  joinWord.toString();
    }
}

