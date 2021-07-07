package org.fundacionjala.coding.jimmy;

/**
 * Kata - Detect Pangram
 * <p>
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram.
 * Return True if it is, False if not. Ignore numbers and punctuation.
 * <p>
 * Class developed in order to solve the kata above.
 */
public class Kata16 {
    /**
     * Method developed to know whether a sentences is pangram.
     *
     * @param sentence is the sentence to validate.
     * @return whether the sentence is pangram or not.
     */
    public boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstvwxyz";
        sentence = sentence.toLowerCase();
        char[] alphabetArray = alphabet.toCharArray();
        char[] pangramArray = sentence.toCharArray();
        boolean isMatchfound = false;
        for (char alpha : alphabetArray) {
            for (char pangram : pangramArray) {
                if (alpha == pangram) {
                    isMatchfound = true;
                }
            }
            if (!isMatchfound) {
                return false;
            }
            isMatchfound = false;
        }
        return true;
    }
}
