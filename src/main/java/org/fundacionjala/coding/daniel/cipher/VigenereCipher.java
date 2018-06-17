package org.fundacionjala.coding.daniel.cipher;

/**
 * Class for encode/decode messages in Vigenere cipher.
 */
public class VigenereCipher extends Cipher {
    private String key;

    /**
     * Class constructor.
     *
     * @param key a string required for encode/decode the message.
     */
    VigenereCipher(String key) {
        this.key = key;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String encode(String text) {
        return vigenereEncode(text, getKey());
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String decode(String message) {
        return vigenereDecode(message, getKey());
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
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (CaesarCipher.SPECIAL_CHARS.contains(String.valueOf(currentChar))) {
                message = message.concat(String.valueOf(currentChar));
            }
            if (currentChar < 'A' || currentChar > 'Z') {
                continue;
            }
            message = message.concat(
                    String.valueOf((char) ((currentChar + key.charAt(j) - 2 * 'A') % Cipher.NUMBER_LETTERS + 'B')));
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
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (CaesarCipher.SPECIAL_CHARS.contains(String.valueOf(currentChar))) {
                text = text.concat(String.valueOf(currentChar));
            }
            if (currentChar < 'A' || currentChar > 'Z') {
                continue;
            }
            text = text.concat(
                    String.valueOf(
                            (char) ((currentChar - key.charAt(j)
                                    + Cipher.NUMBER_LETTERS) % Cipher.NUMBER_LETTERS + '@')));
            j = ++j % key.length();
        }
        return text;
    }

    /**
     * Getter for key.
     *
     * @return the current key.
     */
    public String getKey() {
        return key;
    }
}
