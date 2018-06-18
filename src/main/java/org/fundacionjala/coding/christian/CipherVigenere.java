package org.fundacionjala.coding.christian;

/**
 * Powered by Christian.
 */
public class CipherVigenere extends CesarCipher {

    /**
     * @param message String.
     * @return String.
     */
    private String cleaning(String message) {
        message = message.replaceAll("\n", "");
        for (int i = 0; i < message.length(); i++) {
            int position = ALPHABET_VIGENERE.indexOf(message.charAt(i));
            if (position == -1) {
                message = message.replace(message.charAt(i), ' ');
            }
        }
        return message;
    }

    /**
     * @param text String.
     * @param key String.
     * @return message encode.
     */
    public String vigenereEncode(String text, String key) {
        if (null == text || text.isEmpty()) {
            return "";
        }
        String cleaned = cleaning(text);
        String encrypted = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < cleaned.length(); i++, j = (j + 1) % key.length()) {
            int position = (ALPHABET_VIGENERE.indexOf(cleaned.charAt(i))
                    + ALPHABET_VIGENERE.indexOf(key.charAt(j))) % ALPHABET_VIGENERE.length();
            result.append(ALPHABET_VIGENERE.charAt(position));
            encrypted = result.toString();
        }
        return encrypted;
    }

    /**
     * @param text String.
     * @param key String.
     * @return message decode.
     */
    public String vigenereDecode(String text, String key) {
        if (null == text || text.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        String cleaned = cleaning(text);
        String decrypted = "";
        for (int i = 0, j = 0; i < cleaned.length(); i++, j = (j + 1) % key .length()) {
            int position = ALPHABET_VIGENERE.indexOf(cleaned.charAt(i)) - ALPHABET_VIGENERE.indexOf(key.charAt(j));
            position = position < 0 ? position + ALPHABET_VIGENERE.length() : position;
            result.append(ALPHABET_VIGENERE.charAt(position));
            decrypted = result.toString();
        }
        return decrypted;
    }

    /**
     * @param message string.
     * @param key     int.
     * @return message.
     */
    @Override
    public String decode(String message, int key) {
        return "";
    }

    /**
     * @param message String.
     * @param key     int.
     * @return message.
     */
    @Override
    public String encode(String message, int key) {
        return "";
    }
}
