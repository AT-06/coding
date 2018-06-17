package org.fundacionjala.coding.jimmy;


/**
 * Class for developing the methods.
 */
public class CesarCrypto {

    /**
     * Encode method for CesarCrypto.
     *
     * @param texto is the string to encryption.
     * @param clave is the number for doing the encryption.
     * @return the encrypted code.
     */
    public String encode(String texto, int clave) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (texto == null || texto.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (alphabet.indexOf(texto.charAt(i)) != -1) {
                builder.append(alphabet.charAt((alphabet.indexOf(texto.charAt(i)) + clave) % alphabet.length()));
            } else {
                builder.append(texto.charAt(i));
            }
        }
        return builder.toString();
    }
}
