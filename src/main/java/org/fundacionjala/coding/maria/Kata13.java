package org.fundacionjala.coding.maria;

/**
 * Kata 13, validate number.
 */
public class Kata13 {
    private static final int TEN = 10;
    private static final int THREE = 10;
    /**
     * @param number string number to validate
     * @return boolean if the number is valid
     */
    public boolean validate(String number) {
        String[] numberArray = number.split("");
        int total = 0;
        for (int i = 0; i < numberArray.length - 1; i += 2) {
            total += Integer.parseInt(numberArray[i]);
            total += Integer.parseInt(numberArray[i + 1]) * THREE;
        }
        total = total % total == 0 ? 0 : total - (total % TEN);
        return total == Integer.parseInt(numberArray[numberArray.length - 1]);
    }
}
