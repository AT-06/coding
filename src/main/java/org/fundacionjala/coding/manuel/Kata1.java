package org.fundacionjala.coding.manuel;

import java.util.StringJoiner;

/**
 * Created by Administrator on 2/22/2018.
 */
public class Kata1 {

    private static final int MAX_SIZE = 5;
    private static final String SPACE =  " ";

    /**
     *@return Method to spin the sentence or word.
     * @param sentence .
     */
    public String spinWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder newWord;
        StringJoiner join = new StringJoiner(SPACE);

        for (String singleWord : words) {
            newWord = new StringBuilder(singleWord);
            join.add(singleWord.length() >= MAX_SIZE ? newWord.reverse() : singleWord);
        }
        return join.toString();
    }
}
