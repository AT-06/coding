package org.fundacionjala.coding.jimmy.encryption;

/**
 * Class for overriding the methods.
 */
public class CesarCrypto extends Crypto {

    /**
     * Cesar encode override.
     *
     * @param objects are the parameters.
     * @return the code cipher.
     */
    @Override
    public String encode(Object... objects) {
        if (isEmptyOrNull(objects[0])) {
            return "";
        }
        return cipherText(objects[0].toString(), Integer.parseInt(objects[1].toString()));
    }

    /**
     * Cesar decode override.
     *
     * @param objects are the parameters.
     * @return the code cipher.
     */
    @Override
    public String decode(Object... objects) {
        if (isEmptyOrNull(objects[0])) {
            return "";
        }
        return cipherText(objects[0].toString(), -Integer.parseInt(objects[1].toString()));
    }
}
