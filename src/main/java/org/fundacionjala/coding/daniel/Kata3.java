package org.fundacionjala.coding.daniel;

/**
 *
 */
class Kata3 {

    public static final int LIMIT = 10;

    /**
     * @param number A integer.
     * @return the number of times you must multiply the digits in number until you reach a single digit.
     */
    public int persistence(int number) {
        if (number < LIMIT) {
            return 0;
        }
        int newNumber = 1;
        while (number != 0) {
            newNumber *= number % LIMIT;
            number /= LIMIT;
        }
        return persistence(newNumber) + 1;
    }
}
