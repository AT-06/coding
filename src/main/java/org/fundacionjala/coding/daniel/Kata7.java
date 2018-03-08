package org.fundacionjala.coding.daniel;

public class Kata7 {
    /**
     * @param number a integer.
     * @return a String whether the number is 'Fizz', 'Buzz' or 'FizzBuzz'.
     */
    public static String fizzBuzz(int number) {
        return number % 3 == 0 ? number % 5 == 0
            ? "FizzBuzz" : "Buzz" : number % 5 == 0
            ? "Fizz" : String.valueOf(number);
    }

    public 
}
