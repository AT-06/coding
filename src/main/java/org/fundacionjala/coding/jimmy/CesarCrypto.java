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
        if (isEmptyOrNull(texto)) {
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
     * Method wheter is empty or null.
     *
     * @param texto is the text.
     * @return null or empty.
     */
    private boolean isEmptyOrNull(String texto) {
        return texto == null || texto.isEmpty();
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

    /**
     * Core code for vigenere encrypt.
     *
     * @param texto  is the text.
     * @param clave  is the key.
     * @param number is a number wheter positive to encrypt, negative to decrypt.
     * @return the code.
     */
    private String coreVigenere(String texto, String clave, int number) {
        if (isEmptyOrNull(texto)) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        String[] textoSplitted = texto.split("");
        return buildVigenere(clave, builder, counter, textoSplitted, number);
    }

    /**
     * Builds the vigenere code.
     *
     * @param clave         is the key.
     * @param builder       is the builder.
     * @param counter       is a counter.
     * @param textoSplitted is an array.
     * @param number        is a number.
     * @return code built.
     */
    private String buildVigenere(String clave, StringBuilder builder, int counter, String[] textoSplitted, int number) {
        for (String chain : textoSplitted) {
            if (ALPHABET.contains(chain)) {
                builder.append(cipherText(chain, number * ALPHABET.indexOf(clave.charAt(counter) + 1)));
                counter++;
            } else {
                builder.append(chain);
            }
            if (counter >= clave.length()) {
                counter = 0;
            }
        }
        return builder.toString();
    }

    /**
     * Vigenere encode method.
     *
     * @param texto  is the text.
     * @param clave  is the key.
     * @param number is a positive number.
     * @return the vigenere code encrypted.
     */
    public String encodeVigenere(String texto, String clave, int number) {
        return coreVigenere(texto, clave, number);
    }

    /**
     * Vigenere decode method.
     *
     * @param texto  is the text.
     * @param clave  is the key.
     * @param number is a negative number.
     * @return the vigenere code decrypted.
     */
    public String decodeVigenere(String texto, String clave, int number) {
        return coreVigenere(texto, clave, number);
    }
}
