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
        return number % FIZZ == 0 || value.contains("3")
            ? number % BUZZ == 0
            ? "FizzBuzz" : "Buzz" : number % BUZZ == 0 || value.contains("5")
            ? "Fizz" : value;
    }
}
