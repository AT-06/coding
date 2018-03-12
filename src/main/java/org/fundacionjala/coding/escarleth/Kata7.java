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
     * @return a number changed to  Fizz or Buzz or FizzBuzz
     */
    public String fizzBuzz(int number) {
        if (number % MULTIPLE15 == 0) {
            return "FizzBuzz";
        }
        String valueNumber = String.valueOf(number);
        if (number % MULTIPLE5 == 0 || valueNumber.contains("5")) {
            return "Buzz";
        }
        if (number % MULTIPLE3 == 0 || valueNumber.contains("3")) {
            return "Fizz";
        }
        return valueNumber;
    }

}
