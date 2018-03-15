package org.fundacionjala.coding.daniel;

/**
 * A class which contains validate method.
 */
public class Kata13 {
    private int factor;

    /**
     * @param eanCode EAN is a 13-digits barcode consisting of 12-digits data followed by a single-digit checksum.
     * @return Return true if the given EAN-Code is valid, otherwise false.
     */
    public boolean validate(final String eanCode) {
        factor = 1;
        int checksum = eanCode.substring(0, eanCode.length() - 1)
            .chars()
            .map(i -> Character.getNumericValue((char) i))
            .map(i -> {
                int result = i * factor;
                final int multiplier = 3;
                factor = factor == 1 ? multiplier : 1;
                return result;
            })
            .sum();

        final int i = 10;
        checksum = checksum % i == 0 ? 0 : i - checksum % i;

        return Character.getNumericValue(eanCode.charAt(eanCode.length() - 1)) == checksum;
    }
}
