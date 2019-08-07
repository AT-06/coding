package org.fundacionjala.coding.jimmy.encryption;

/**
 * Class for overriding the methods.
 */
public class VigenereCrypto extends Crypto {

    /**
     * @param objects are the parameters.
     * @return null.
     */
    @Override
    public String encode(Object... objects) {
        return null;
    }

    /**
     * @param objects are the parameters.
     * @return null.
     */
    @Override
    public String decode(Object... objects) {
        return null;
    }

    /**
     * Vigenere enconde and decode override.
     *
     * @param objects are the parameters.
     * @return the code cipher.
     */
    @Override
    public String encodeDecode(Object... objects) {
        if (isEmptyOrNull(objects[0])) {
            return "";
        }
        return coreVigenere(objects[0].toString(), objects[1].toString(), Integer.parseInt(objects[2].toString()));
    }
}
