package org.fundacionjala.coding.daniel;

public class CaesarVigenereCipher {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String SPECIAL_CHARS = "<([{\\^-=$!|]})?*+.>";

    public String caesarEncode(String text, int key) {
        String cipherMessage = "";
        try {
            text = text.toUpperCase();
            if (!text.isEmpty() || !text.equalsIgnoreCase(cipherMessage))
                for (int i = 0; i < text.length(); i++) {
                    char value = text.charAt(i);
                    if (SPECIAL_CHARS.contains(String.valueOf(value))) {
                        cipherMessage = cipherMessage.concat(String.valueOf(value));
                    } else {
                        int position = ALPHABET.indexOf(value);
                        int keyValue = (key + position) % 26;
                        char newValue = ALPHABET.charAt(keyValue);
                        cipherMessage = cipherMessage.concat(String.valueOf(newValue));
                    }
                }
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return cipherMessage;
    }

    public String caesarDecode(String cipherMessage, int key) {
        String text = "";
        try {
            cipherMessage = cipherMessage.toUpperCase();
            if (!cipherMessage.isEmpty() || !cipherMessage.equalsIgnoreCase(text))
                for (int i = 0; i < cipherMessage.length(); i++) {
                    char value = cipherMessage.charAt(i);
                    if (SPECIAL_CHARS.contains(String.valueOf(value))) {
                        text = text.concat(String.valueOf(value));
                    } else {
                        int keyValue = (ALPHABET.indexOf(value) - key) % 26;
                        if (keyValue < 0) {
                            keyValue = ALPHABET.length() + keyValue;
                        }
                        char newValue = ALPHABET.charAt(keyValue);
                        text = text.concat(String.valueOf(newValue));
                    }
                }
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return text;
    }

    public static String vigenereEncode(String text, final String key) {
        String message = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (String.valueOf(c).equalsIgnoreCase(" ")) {
                message = message + c;
            }
            if (c < 'A' || c > 'Z')
                continue;
            message = message.concat(String.valueOf((char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'B')));
            j = ++j % key.length();
        }
        return message;
    }

    public String vigenereDecode(String message, final String key) {
        String text = "";
        message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            text = text.concat(String.valueOf((char) ((c - key.charAt(j) + 26) % 26 + 'A')));
            j = ++j % key.length();
        }
        return text;
    }
}