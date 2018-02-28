package org.fundacionjala.coding.manuel;

import java.util.Arrays;
import java.util.Collections;


/**
 * Created by Administrator on 2/23/2018.
 */
public class Kata2 {
    private String sentence;
    private static final int MAX_LENGHT = 3;

    /**
     * Created by Administrator on 2/23/2018.
     * @param sentence es la oracion original.
     */
    public Kata2(String sentence) {
        this.sentence = sentence;
    }

    /**
     * @return string que es la oracion ordenada.
     */
    public String sortInnerContent() {
        String[] words = sentence.split(" ");
        StringBuffer newSentece = new StringBuffer();

        for (String singleWord : words) {
            String[] letters = singleWord.split("");
            if (singleWord.length() > MAX_LENGHT) {
                Arrays.sort(letters, 1, singleWord.length() - 1, Collections.reverseOrder());
                for (String let : letters) {
                    newSentece.append(let);
                }
            } else {
                newSentece.append(singleWord);
            }
            newSentece.append(' ');
        }
        String returnSentence = newSentece.toString();
        returnSentence = returnSentence.trim();
        return  returnSentence;
    }
}

