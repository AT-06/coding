package org.fundacionjala.coding.ariel;

/**
 * Ariel Gonzales Vargas.
 */
public class Kata7 {

    /**
     * @param num Any number.
     * @return a text it could be "FizzBuzz, Buzz or Fizz";
     */
    public String fizzBuzz(String num) {
        int number = Integer.parseInt(num);
        final int div15 = 15;
        final int div5 = 5;
        final int div3 = 3;

        if (number % div15 == 0) {
            return "FizzBuzz";
        }

        if (number % div5 == 0 || num.contains("5")) {

            return "Buzz";
        }

        if (number % div3 == 0 || num.contains("3")) {
            return "Fizz";
        }

        return num;
    }
}

