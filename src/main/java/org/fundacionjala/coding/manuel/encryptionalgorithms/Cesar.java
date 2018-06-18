package org.fundacionjala.coding.manuel.encryptionalgorithms;

/**
 * Class for Cesar algorithm.
 */
public class Cesar extends Crypto {

    /**
     * Method to encode text using Cesar algorithm.
     * @param objects to encode, can be a String and a int or two Strings.
     * @return the text encrypted.
     */
    @Override
    public String encode(Object... objects) {
        if (objects[0] == null || objects[0].toString().length() == 0) {
            return "";
        }
        return coreCall(objects[0].toString(), Integer.parseInt(objects[1].toString()));
    }

    /**
     * Method to decode text using Cesar algorithm.
     * @param objects to decode, can be a String and a int or two Strings.
     * @return the text decoded.
     */
    @Override
    public String decode(Object... objects) {
        if (objects[0] == null || objects[0].toString().length() == 0) {
            return "";
        }
        return coreCall(objects[0].toString(), -Integer.parseInt(objects[1].toString()));
    }
}
