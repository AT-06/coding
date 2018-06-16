package org.fundacionjala.coding.daniel;

/**
 * Class for encode/decode messages in Caesar/Vigenere cipher.
 */
public class CaesarVigenereCipher {
    public static final int NUMBER_LETTERS = 26;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SPECIAL_CHARS = " <([{\\^-=$!|]})?*+.>";

    /**
     * Method that encodes a text using Caesar encryption.
     *
     * @param text the message for encode.
     * @param key  a integer.
     * @return the message encoded.
     */
    public String caesarEncode(String text, int key) {
        String cipherMessage = "";
        text = text.toUpperCase();
        if (!text.equalsIgnoreCase(cipherMessage)) {
            for (int i = 0; i < text.length(); i++) {
                char value = text.charAt(i);
                if (SPECIAL_CHARS.contains(String.valueOf(value))) {
                    cipherMessage = cipherMessage.concat(String.valueOf(value));
                } else {
                    int position = ALPHABET.indexOf(value);
                    int keyValue = (key + position) % NUMBER_LETTERS;
                    char newValue = ALPHABET.charAt(keyValue);
                    cipherMessage = cipherMessage.concat(String.valueOf(newValue));
                }
            }
        }
        return cipherMessage;
    }

    /**
     * Method that decodes a text using Caesar encryption.
     *
     * @param cipherMessage the message for decode.
     * @param key           a integer.
     * @return the message decoded.
     */
    public String caesarDecode(String cipherMessage, int key) {
        String text = "";
        cipherMessage = cipherMessage.toUpperCase();
        if (!cipherMessage.equalsIgnoreCase(text)) {
            for (int i = 0; i < cipherMessage.length(); i++) {
                char value = cipherMessage.charAt(i);
                if (SPECIAL_CHARS.contains(String.valueOf(value))) {
                    text = text.concat(String.valueOf(value));
                } else {
                    int keyValue = (ALPHABET.indexOf(value) - key) % NUMBER_LETTERS;
                    if (keyValue < 0) {
                        keyValue = ALPHABET.length() + keyValue;
                    }
                    char newValue = ALPHABET.charAt(keyValue);
                    text = text.concat(String.valueOf(newValue));
                }
            }
        }
        return text;
    }

    /**
     * Method that encodes a text using Vigenere encryption.
     *
     * @param text the message for encode.
     * @param key  a string for the encryption.
     * @return the message encoded.
     */
    public String vigenereEncode(String text, final String key) {
        String message = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (SPECIAL_CHARS.contains(String.valueOf(currentChar))) {
                message = message.concat(String.valueOf(currentChar));
            }
            if (currentChar < 'A' || currentChar > 'Z') {
                continue;
            }
            message = message.concat(
                    String.valueOf((char) ((currentChar + key.charAt(j) - 2 * 'A') % NUMBER_LETTERS + 'B')));
            j = ++j % key.length();
        }
        return message;
    }

    /**
     * Method that decodes a text using Vigenere decryption.
     *
     * @param message the message for decode.
     * @param key     a string for the decryption.
     * @return the message decoded.
     */
    public String vigenereDecode(String message, final String key) {
        String text = "";
        message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (SPECIAL_CHARS.contains(String.valueOf(currentChar))) {
                text = text.concat(String.valueOf(currentChar));
            }
            if (currentChar < 'A' || currentChar > 'Z') {
                continue;
            }
            text = text.concat(
                    String.valueOf((char) ((currentChar - key.charAt(j) + NUMBER_LETTERS) % NUMBER_LETTERS + '@')));
            j = ++j % key.length();
        }
        return text;
    }
}
