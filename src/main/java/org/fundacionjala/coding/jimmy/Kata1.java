package org.fundacionjala.coding.jimmy;

/**
 * This class contains a method which is going to spin a string whether is greater than 5 in length.
 */
public class Kata1 {

    public static final int THRESHOLD = 5;

    /**
     * @param wordsToSpin is a method for spin a word greater than 5 in length.
     * @return a word spinned if is greater than 5 in length.
     */
    public String spinWords(String wordsToSpin) {
        String[] arrayWords = wordsToSpin.split(" ");
        String string; String space = " ";
        StringBuffer buffer = new StringBuffer();
        for (String eachWord : arrayWords) {
            if (eachWord.length() >= THRESHOLD) {
                buffer.append(new StringBuilder(eachWord).reverse());
            } else {
                buffer.append(eachWord);
            }
            buffer.append(space);
        }
        string = buffer.toString();
        return string.trim();
    }
}
