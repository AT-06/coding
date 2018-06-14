package org.fundacionjala.coding.manuel;
import java.util.StringJoiner;

/**
 * CesarCrypto class.
 */
public final class CesarCrypto {

    private static final int ASCII_LOWER = 64;
    private static final int ASCII_LOWER_UNDER = 65;
    private static final int ASCII_UPPER = 90;
    private static final int ASCII_UPPER_PLUS = 91;

    /**
     * Method to encode a text using Cesar algorithm.
     * @param text to encode.
     * @param key movements to make.
     * @return the text encoded.
     */
    public String encode(String text, int key) {
        return coreCall(text, key);
    }

    /**
     * Method to decode a text using Cesar algorithm.
     * @param text to decode.
     * @param key movements to make.
     * @return the text encoded.
     */
    public String decode(String text, int key) {
        return coreCall(text, -key);
    }

    /**
     * Method to split text and call rotateLetters.
     * @param text to decode or encode.
     * @param key movements to make.
     * @return the text encoded or decoded.
     */
    public String coreCall(String text, int key) {
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
    public String rotateLetters(String word, int key) {
        StringBuilder encriptedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > ASCII_LOWER && word.charAt(i) < ASCII_UPPER_PLUS) {
                encriptedWord.append(String.valueOf(Character.toChars(determineNumberMovements(word.charAt(i), key))));
            } else {
                encriptedWord.append(word.charAt(i));
            }
        }
        return encriptedWord.toString();
    }

    /**
     * Method to determine how many movements for letters.
     * @param letter to move right or left.
     * @param key the number of movements.
     * @return the letter moved.
     */
    public int determineNumberMovements(char letter, int key) {
        if (letter + key > ASCII_UPPER) {
            return (letter + key - ASCII_UPPER) + ASCII_LOWER;
        }
        if (letter + key < ASCII_LOWER_UNDER) {
            return ASCII_UPPER_PLUS - (ASCII_LOWER_UNDER - (letter + key));
        }
        return letter + key;
    }
}
