package org.fundacionjala.coding.daniel;

/**
 * A class which contains validate method.
 */
public class Kata13 {

    private static final int ODD_DIGIT_MULTIPLIER = 3;
    private static final int DIVISIBILITY_FACTOR = 10;
    private int factor = 1;

    /**
     * @param eanCode EAN is a 13-digits barcode consisting of 12-digits data followed by a single-digit checksum.
     * @return Return true if the given EAN-Code is valid, otherwise false.
     */
    public boolean validate(final String eanCode) {
        int sum = eanCode.substring(0, eanCode.length() - 1)
            .chars()
            .map(Character::getNumericValue)
            .map(i -> {
                int result = i * factor;
                factor = factor == 1 ? ODD_DIGIT_MULTIPLIER : 1;
                return result;
            })
            .sum();
        int checksum = sum % DIVISIBILITY_FACTOR == 0 ? 0 : DIVISIBILITY_FACTOR - sum % DIVISIBILITY_FACTOR;
        return Character.getNumericValue(eanCode.charAt(eanCode.length() - 1)) == checksum;
    }
}
