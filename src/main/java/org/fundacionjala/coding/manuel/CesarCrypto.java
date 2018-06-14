package org.fundacionjala.coding.manuel;
import java.util.StringJoiner;

/**
 * CesarCrypto class.
 */
public final class CesarCrypto {

    private static final int ASCII_LOWER = 64;
    private static final int ASCII_UPPER = 90;
    private static final int ASCII_UPPER_PLUS = 91;

    /**
     * Constructor.
     */
    private CesarCrypto() {
    }

    /**
     * Method to encode a text using Cesar algorithm.
     * @param text to encode.
     * @param key movements to make.
     * @return the text encoded.
     */
    public static String encode(String text, int key) {
        if (text == null || text.length() == 0) {
            return "";
        }
        StringJoiner rotateLetters = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            rotateLetters.add(rotateLetters(word, key));
        }
        return rotateLetters.toString();
    }

    /**
     * Method to rotate letters for each word of the text.
     * @param word to rotate its letters.
     * @param key the number of rotations to make.
     * @return the letter rotated.
     */
    public static String rotateLetters(String word, int key) {
        char[] letters = word.toCharArray();
        StringBuilder encriptedWord = new StringBuilder();
        for (char letter : letters) {
            if ((int) letter > ASCII_LOWER && (int) letter < ASCII_UPPER_PLUS) {
                int movements = (int) letter + key;
                int asciiCode = movements > ASCII_UPPER ? (movements - ASCII_UPPER) + ASCII_LOWER  : movements;
                encriptedWord.append((char) asciiCode);
            } else {
                encriptedWord.append(letter);
            }
        }
        return encriptedWord.toString();
    }
}
