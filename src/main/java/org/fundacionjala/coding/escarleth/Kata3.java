package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata3 is a class that contains a persistentBugger method
 */
public class Kata3 {
    private static final int SUM = 1;
    private static final int LIMIT = 1;

    /**
     * @param numberToPersist is a number that will find
     *                        a numberPersistence(multiply every digit
     *                        until the number of digits is one).
     * @return result
     */
    public int persistentBugger(int numberToPersist) {
        String[] numbers = String.valueOf(numberToPersist).split("");
        if (numbers.length == LIMIT) {
            return 0;
        }
        int valueMultiplied = 1;
        for (String number : numbers) {
            valueMultiplied *= Integer.parseInt(number);
        }
        return SUM + persistentBugger(valueMultiplied);
    }
}
