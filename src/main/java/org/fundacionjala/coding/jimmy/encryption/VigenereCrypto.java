package org.fundacionjala.coding.jimmy.encryption;

/**
 * Class for overriding the methods.
 */
public class VigenereCrypto extends Crypto {

    /**
     * Vigenere encode override.
     *
     * @param objects are the parameters.
     * @return the code cipher.
     */
    @Override
    public String encode(Object... objects) {
        if (isEmptyOrNull(objects[0])) {
            return "";
        }
        return coreVigenere(objects[0].toString(), objects[1].toString(), Integer.parseInt(objects[1].toString()));
    }

    /**
     * Vigenere decode override.
     *
     * @param objects are the parameters.
     * @return the code cipher.
     */
    @Override
    public String decode(Object... objects) {
        if (isEmptyOrNull(objects[0])) {
            return "";
        }
        return coreVigenere(objects[0].toString(), objects[1].toString(), Integer.parseInt(objects[1].toString()));
    }
}
