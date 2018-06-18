package org.fundacionjala.coding.jimmy.encryption;

/**
 * Crypto abstract class.
 */
public abstract class Crypto {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Encode abstract method.
     *
     * @param objects are the parameters.
     * @return the cipher.
     */
    public abstract String encode(Object... objects);

    /**
     * Decode abstract method.
     *
     * @param objects are the parameters.
     * @return the cipher.
     */
    public abstract String decode(Object... objects);

    /**
     * Main method for CesarCrypto.
     *
     * @param texto is the string to decrypt or encrypt.
     * @param clave is the number for doing the decrypt or encrypt.
     * @return the decrypted or encrypted code.
     */
    protected String cipherText(final String texto, final int clave) {
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
     * @param objects is the text.
     * @return null or empty.
     */
    protected boolean isEmptyOrNull(Object... objects) {
        return objects[0] == null || objects[0].toString().isEmpty();
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
    protected String coreVigenere(String texto, String clave, int number) {
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
