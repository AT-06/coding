package org.fundacionjala.coding.manuel;
import java.util.StringJoiner;

/**
 * CesarVigenereCrypto class.
 */
public final class CesarVigenereCrypto {

    private static final char ASCII_LOWER = 'A';
    private static final char ASCII_UPPER = 'Z';
    private static final int VALUE = 64;

    /**
     * Method to encodeCesar a text using Cesar algorithm.
     * @param text to encodeCesar.
     * @param key movements to make.
     * @return the text encoded.
     */
    public String encodeCesar(String text, int key) {
        return coreCall(text, key);
    }

    /**
     * Method to decodeCesar a text using Cesar algorithm.
     * @param text to decodeCesar.
     * @param key movements to make.
     * @return the text encoded.
     */
    public String decodeCesar(String text, int key) {
        return coreCall(text, -key);
    }

    /**
     * Method to split text and call rotateLetters.
     * @param text to decodeCesar or encodeCesar.
     * @param key movements to make.
     * @return the text encoded or decoded.
     */
    public String coreCall(String text, int key) {
        if (text == null || text.length() == 0) {
            return "";
        }
        StringJoiner lettersRotated = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            lettersRotated.add(rotateLetters(word, key));
        }
        return lettersRotated.toString();
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
     * Method to encodeVigerene a text using Vigenere algorithm.
     * @param text to encodeVigenere.
     * @param key to encode.
     * @return the text encoded.
     */
    public String encodeVigenere(String text, String key) {
        if (text == null || text.length() == 0) {
            return "";
        }
        return vigenereCoreCall(text, key, 1);
    }

    /**
     * Method to decodeVigenere a text using Vigenere algorithm.
     * @param text to decodeVigenere.
     * @param key to decode.
     * @return the text encoded.
     */
    public String decodeVigenere(String text, String key) {
        if (text == null || text.length() == 0) {
            return "";
        }
        return vigenereCoreCall(text, key, -1);
    }

    /**
     * Method to encode or decode text with Vigenere depending on direction parameter.
     * @param text to encode or decode.
     * @param key to encode or decode.
     * @param direction to move right or left.
     * @return the text encrypted.
     */
    public String vigenereCoreCall(String text, String key, int direction) {
        int j = 0;
        StringJoiner encriptedText = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            StringBuilder encriptedWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++, j++) {
                if (j == key.length()) {
                    j = 0;
                }
                int newValue = determineNumberMovements(word.charAt(i), (key.charAt(j) - VALUE) * direction);
                encriptedWord.append(String.valueOf(Character.toChars(newValue)));
            }
            encriptedText.add(encriptedWord);
        }
        return encriptedText.toString();
    }
}
