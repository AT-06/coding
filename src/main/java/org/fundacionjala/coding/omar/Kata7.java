package org.fundacionjala.coding.omar;

/**
 * This class contains a method that prints the numbers greater to 0.
 * But for multiples of three print 'Fizz' instead of the number.
 * and for the multiples of five print 'Buzz'.
 * For numbers which are multiples of both three and five print 'FizzBuzz'.
 */
public class Kata7 {


    private static final int NUMBER_15 = 15;
    private static final int ZERO = 0;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_5 = 5;

    /**
     * @param number this is words for Spin Words
     * @return result FizzBuzz.
     */
    public String isFizzBuzzNumber(int number) {

        final String numberToString = String.valueOf(number);

        if (number % NUMBER_15 == ZERO) {
            return "FizzBuzz";
        }
        if (number % NUMBER_5 == ZERO || numberToString.contains("5")) {
            return "Buzz";
        }
        return number % NUMBER_3 == ZERO || numberToString.contains("3") ? "Fizz" : String.valueOf(number);

    }

}
