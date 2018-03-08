package org.fundacionjala.coding.jimmy;

/**
 * Class for developing giveFizzBuzzNumbers method.
 */
public class Kata7 {

    public static final int MULTIPLEOFTHREE = 3;
    public static final int MULTIPLEOFFIVE = 5;
    public static final int MULTIPLEOFTHREEANDFIVE = 15;

    /**
     * This method is for knowing whether a number is Fizz, Buzz or FizzBuzz.
     *
     * @param numberFizzBuzz is the number to calculate.
     * @return whether the number is Fizz, Buzz or FizzBuzz.
     */
    public String giveFizzBuzzNumbers(int numberFizzBuzz) {

        String fizzBuzzResult = String.valueOf(numberFizzBuzz);
        String value = String.valueOf(numberFizzBuzz);

        if (numberFizzBuzz % MULTIPLEOFTHREE == 0 || value.contains("3")) {
            fizzBuzzResult = "Fizz";
        }
        if (numberFizzBuzz % MULTIPLEOFFIVE == 0 || value.contains("5")) {
            fizzBuzzResult = "Buzz";
        }
        if (numberFizzBuzz % MULTIPLEOFTHREEANDFIVE == 0) {
            fizzBuzzResult = "FizzBuzz";
        }
        return fizzBuzzResult;
    }
}
