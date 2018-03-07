package org.fundacionjala.coding.omar;

/**
 * This class contains a method that prints the numbers greater to 0.
 * But for multiples of three print “Fizz” instead of the number
 * and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz “.
 */
public class Kata7 {


    private static final int NUMBER_15 = 15;
    private static final int ZERO = 0;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_5 = 5;

    /**
     * @param number this is words for Spin Words
     * @return result
     */
    public String isFizzBuzzNumer(int number) {

        if (number % NUMBER_15 == ZERO) {
            return "FizzBuzz";
        }
        if (number % NUMBER_3 == ZERO) {
            return "Fizz";
        }
        return number % NUMBER_5 == ZERO ? "Buzz" : String.valueOf(number);



    }

}
