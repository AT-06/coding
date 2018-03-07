package org.fundacionjala.coding.ariel;

/**
 * Ariel Gonzales Vargas..
 */
public class Kata7 {

    /**
     * @param num Any number.
     * @return a text it could be "FizzBuzz, Buzz or Fizz";
     */
    public String fizzBuzz(String num) {
        int number = Integer.parseInt(num);
        final int cond1 = 15;
        final int cond3 = 3;
        final int cond2 = 5;

        if (number % cond1 == 0) {
            return "FizzBuzz";
        }

        if (number % cond2 == 0) {
            return "Buzz";
        }

        if (number % cond3 == 0) {
            return "Fizz";
        }

        return num;
    }
}

