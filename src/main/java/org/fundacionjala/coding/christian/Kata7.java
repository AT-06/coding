package org.fundacionjala.coding.christian;

/**
 * Performed by Christian.
 */
public class Kata7 {

    private static final int FIZZ = 3;
    private static final int BUZZ = 5;
    private static final int FIZZBUZZ = 15;
/**
 * @param digits this is for fizzBuzz
 * @return tag for 'digits'
 */
    public String fizzBuzz(int digits) {
        if (digits % FIZZBUZZ == 0) {
            return "FizzBuzz";
        }
        final String value = String.valueOf(digits);
        if (digits % FIZZ == 0 || value.contains("3")) {
            return "Fizz";
        }
        if (digits % BUZZ == 0 || value.contains("5")) {
            return "Buzz";
        }
        return value;
    }
}
