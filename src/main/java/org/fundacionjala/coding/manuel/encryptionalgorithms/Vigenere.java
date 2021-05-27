package org.fundacionjala.coding.manuel.encryptionalgorithms;

import java.util.StringJoiner;

/**
 * Class for Vigenere algorithm.
 */
public class Vigenere extends Crypto {
    private static final int VALUE = 64;

    /**
     * Method to encode text using Vigenere algorithm.
     * @param objects to encode, can be a String and a int or two Strings.
     * @return the text encrypted.
     */
    @Override
    public String encode(Object... objects) {
        if (objects[0] == null || objects[0].toString().length() == 0) {
            return "";
        }
        return vigenereCoreCall(objects[0].toString(), objects[1].toString(), 1);
    }

    /**
     * Method to decode text using Vigenere algorithm.
     * @param objects to decode, can be a String and a int or two Strings.
     * @return the text decoded.
     */
    @Override
    public String decode(Object... objects) {
        if (objects[0] == null || objects[0].toString().length() == 0) {
            return "";
        }
        return vigenereCoreCall(objects[0].toString(), objects[1].toString(), -1);
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
