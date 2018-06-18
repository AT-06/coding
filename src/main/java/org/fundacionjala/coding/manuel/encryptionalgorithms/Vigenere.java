package org.fundacionjala.coding.manuel.encryptionalgorithms;

/**
 * Class for Vigenere algorithm.
 */
public class Vigenere extends Crypto {

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
}
