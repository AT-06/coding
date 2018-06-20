package org.fundacionjala.coding.manuel.encryptionalgorithms;

import java.util.StringJoiner;

/**
 * Class for Cesar algorithm.
 */
public class Cesar extends Crypto {
    private static final char ASCII_LOWER = 'A';
    private static final char ASCII_UPPER = 'Z';

    /**
     * Method to encode text using Cesar algorithm.
     * @param objects to encode, can be a String and a int or two Strings.
     * @return the text encrypted.
     */
    @Override
    public String encode(Object... objects) {
        if (objects[0] == null || objects[0].toString().length() == 0) {
            return "";
        }
        return coreCall(objects[0].toString(), Integer.parseInt(objects[1].toString()));
    }

    /**
     * Method to decode text using Cesar algorithm.
     * @param objects to decode, can be a String and a int or two Strings.
     * @return the text decoded.
     */
    @Override
    public String decode(Object... objects) {
        if (objects[0] == null || objects[0].toString().length() == 0) {
            return "";
        }
        return coreCall(objects[0].toString(), -Integer.parseInt(objects[1].toString()));
    }

    /**
     * Method to split text and call rotateLetters.
     * @param text to decodeCesar or encodeCesar.
     * @param key movements to make.
     * @return the text encoded or decoded.
     */
    public String coreCall(String text, int key) {
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
}
