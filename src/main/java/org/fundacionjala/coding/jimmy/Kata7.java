package org.fundacionjala.coding.jimmy;

/**
 * Class for developing giveFizzBuzzNumbers method.
 */
public class Kata7 {

    private static final int MULTIPLE_OF_THREE = 3;
    private static final int MULTIPLE_OF_FIVE = 5;
    private static final int MULTIPLE_OF_THREE_AND_FIVE = 15;

    /**
     * This method is for knowing whether a number is Fizz, Buzz or FizzBuzz.
     *
     * @param numberFizzBuzz is the number to calculate.
     * @return whether the number is Fizz, Buzz or FizzBuzz.
     */
    public String giveFizzBuzzNumbers(int numberFizzBuzz) {

        String fizzBuzzResult = String.valueOf(numberFizzBuzz);
        String value = String.valueOf(numberFizzBuzz);

        if (numberFizzBuzz % MULTIPLE_OF_THREE == 0 || value.contains("3")) {
            fizzBuzzResult = "Fizz";
        }
        if (numberFizzBuzz % MULTIPLE_OF_FIVE == 0 || value.contains("5")) {
            fizzBuzzResult = "Buzz";
        }
        if (numberFizzBuzz % MULTIPLE_OF_THREE_AND_FIVE == 0) {
            fizzBuzzResult = "FizzBuzz";
        }
        return fizzBuzzResult;
    }
}
