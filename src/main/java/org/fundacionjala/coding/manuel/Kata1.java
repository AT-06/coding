package org.fundacionjala.coding.manuel;

import java.util.StringJoiner;

/**
 * Created by Administrator on 2/22/2018.
 */
public class Kata1 {
    private String sentence;
    private static final int MAX_SIZE = 5;
    private static final String SPACE =  " ";
    /**
     *@param w Constructor by default.
     */
    public Kata1(String w) {
        this.sentence = w;
    }
    /**
     *@return Method to spin the sentence or word.
     */
    public String spinWord() {
        String[] words = sentence.split(" ");
        String newSentece = "";
        StringBuilder newWord;
        //StringBuffer buffer = new StringBuffer();

        StringJoiner j = new StringJoiner(SPACE);

        for (String singleWord : words) {
            newWord = new StringBuilder(singleWord);

            if (singleWord.length() >= MAX_SIZE) {
                j.add(newWord.reverse());
                //buffer.append(newWord.reverse());
            } else {
                j.add(singleWord);
                //buffer.append(singleWord);
            }
            //buffer.append(' ');
        }
        newSentece = j.toString();
        //newSentece = newSentece.trim();
        return newSentece;
    }
}
