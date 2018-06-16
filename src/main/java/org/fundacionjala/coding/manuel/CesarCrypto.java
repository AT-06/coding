package org.fundacionjala.coding.manuel;
import java.util.StringJoiner;

/**
 * CesarCrypto class.
 */
public final class CesarCrypto {

    private static final char ASCII_LOWER = 'A';
    private static final char ASCII_UPPER = 'Z';
    private static final int VALUE = 64;

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
            if (word.charAt(i) > ASCII_LOWER - 1 && word.charAt(i) < ASCII_UPPER + 1) {
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
            return (letter + key - ASCII_UPPER) + (ASCII_LOWER - 1);
        }
        if (letter + key < ASCII_LOWER) {
            return ASCII_UPPER + 1 - (ASCII_LOWER - (letter + key));
        }
        return letter + key;
    }

    /**
     * Method to encode text with Vigenere.
     * @param text to encode.
     * @param key to encode.
     * @return the text encrypted.
     */
    public String encodeVigenere(String text, String key) {
        if (text == null || text.length() == 0) {
            return "";
        }
        int j = 0;
        StringJoiner encriptedText = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            StringBuilder encriptedWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++, j++) {
                if (j == key.length()) {
                    j = 0;
                }
                int newValue = determineNumberMovements(word.charAt(i), key.charAt(j) - VALUE);
                encriptedWord.append(String.valueOf(Character.toChars(newValue)));
            }
            encriptedText.add(encriptedWord);
        }
        return encriptedText.toString();
    }
}
