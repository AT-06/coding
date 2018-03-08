package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth L.
 * This class  contains a method FizzBuzz
 */

public class Kata7 {
    public static final int MULTIPLE15 = 15;
    public static final int MULTIPLE5 = 5;
    public static final int MULTIPLE3 = 3;

    /**
     * @param number is any number
     * @return a number change to  Fizz or Buzz or FizzBuzz
     */
    public String fizzBuzz(int number) {
        if (number % MULTIPLE15 == 0) {
            return "FizzBuzz";
        } else if (number % MULTIPLE5 == 0 || String.valueOf(number).contains("5")) {
            return "Buzz";
        } else if (number % MULTIPLE3 == 0 || String.valueOf(number).contains("3")) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
