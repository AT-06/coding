package org.fundacionjala.coding.daniel.cipher;

/**
 * Class for encode/decode messages in Caesar cipher.
 */
public class CaesarCipher extends Cipher {

    private int key;

    /**
     * Class constructor.
     *
     * @param key an integer required for encode/decode the message.
     */
    public CaesarCipher(int key) {
        this.key = key;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String encode(String text) {
        return caesarEncode(text, key);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String decode(String message) {
        return caesarDecode(message, key);
    }

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
                if (Cipher.SPECIAL_CHARS.contains(String.valueOf(value))) {
                    cipherMessage = cipherMessage.concat(String.valueOf(value));
                } else {
                    int position = Cipher.ALPHABET.indexOf(value);
                    int keyValue = (key + position) % Cipher.NUMBER_LETTERS;
                    char newValue = Cipher.ALPHABET.charAt(keyValue);
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
                if (Cipher.SPECIAL_CHARS.contains(String.valueOf(value))) {
                    text = text.concat(String.valueOf(value));
                } else {
                    int keyValue = (Cipher.ALPHABET.indexOf(value) - key) % Cipher.NUMBER_LETTERS;
                    if (keyValue < 0) {
                        keyValue = Cipher.ALPHABET.length() + keyValue;
                    }
                    char newValue = Cipher.ALPHABET.charAt(keyValue);
                    text = text.concat(String.valueOf(newValue));
                }
            }
        }
        return text;
    }

    /**
     * Getter for key.
     *
     * @param key a new key.
     */
    public void setKey(int key) {
        this.key = key;
    }
}
