package org.fundacionjala.coding.daniel;

/**
 * A class which contains 'fizzBuzz' method.
 */
public class Kata7 {

    private static final int FIZZ = 3;
    private static final int BUZZ = 5;

    /**
     * @param number a integer.
     * @return a String whether the number is 'Fizz', 'Buzz' or 'FizzBuzz'.
     */
    public String fizzBuzz(int number) {
        final String value = String.valueOf(number);
        if (number % FIZZ == 0 && number % BUZZ == 0) {
            return "FizzBuzz";
        }
        if (number % FIZZ == 0 || value.contains("3")) {
            return "Fizz";
        }
        if (number % BUZZ == 0 || value.contains("5")) {
            return "Buzz";
        }
        return value;
    }
}



