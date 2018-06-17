package org.fundacionjala.coding.jimmy;


/**
 * Class for developing the methods.
 */
public class CesarCrypto {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Encode method for CesarCrypto.
     *
     * @param texto is the string to encryption.
     * @param clave is the number for doing the encryption.
     * @return the encrypted code.
     */
    public String encode(final String texto, final int clave) {
        return cipherText(texto, clave);
    }

    /**
     * Decode method for CesarCrypto.
     *
     * @param texto is the string to decrypt.
     * @param clave is the number for doing the decrypt.
     * @return the decrypt code.
     */
    public String decode(final String texto, final int clave) {
        return cipherText(texto, -clave);
    }

    /**
     * Main method for CesarCrypto.
     *
     * @param texto is the string to decrypt or encrypt.
     * @param clave is the number for doing the decrypt or encrypt.
     * @return the decrypted or encrypted code.
     */
    private String cipherText(final String texto, final int clave) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char replaceVal = texto.charAt(i);
            int charPosition = ALPHABET.indexOf(replaceVal);
            replaceVal = getReplaceVal(clave, replaceVal, charPosition);
            builder.append(replaceVal);
        }
        return builder.toString();
    }

    /**
     * Get the value to replace.
     *
     * @param clave        is the clave.
     * @param replaceVal   is the replace value.
     * @param charPosition is the position.
     * @return the value.
     */
    private char getReplaceVal(int clave, char replaceVal, int charPosition) {
        if (charPosition != -1) {
            int keyVal = (charPosition + clave) % ALPHABET.length();
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            replaceVal = ALPHABET.charAt(keyVal);
        }
        return replaceVal;
    }
}
