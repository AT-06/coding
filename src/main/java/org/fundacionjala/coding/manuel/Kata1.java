package org.fundacionjala.coding.manuel;

/**
 * Created by Administrator on 2/22/2018.
 */
public class Kata1 {
    private String sentence;
    private static final int MAX_SIZE = 5;

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
        StringBuffer buffer = new StringBuffer();
        for (String singleWord : words) {
            newWord = new StringBuilder(singleWord);

            if (singleWord.length() >= MAX_SIZE) {
                buffer.append(newWord.reverse());
                //newSentece = newSentece + ;
            } else {
                buffer.append(singleWord);
                //newSentece = newSentece + ;
            }
            buffer.append(' ');
            //newSentece = newSentece + " ";
        }
        newSentece = buffer.toString();
        newSentece = newSentece.trim();
        return newSentece;
    }
}
