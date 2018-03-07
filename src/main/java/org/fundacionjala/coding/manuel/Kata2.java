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
        StringJoiner join;
        StringJoiner joinWord = new StringJoiner(" ");

        for (String singleWord : words) {
            String[] letters = singleWord.split("");
            if (singleWord.length() > MAX_LENGHT) {
                join = new StringJoiner("");
                Arrays.sort(letters, 1, singleWord.length() - 1, Collections.reverseOrder());
                for (String let : letters) {
                    join.add(let);
                }
                singleWord = join.toString();
            }
            joinWord.add(singleWord);
        }
        return  joinWord.toString();
    }
}

