package org.fundacionjala.coding.manuel;

/**
 * Created by Juan Manuel on 3/11/2018.
 */
public class Kata7 {

    private static final int FIZZ = 3;
    private static final int BUZZ = 5;
    private static final int FIZZ_BUZZ = 15;
    /**
     * Method to change 3 divisors to Fizz, 5 divisors to Buzz and 15 divisors to FizzBuzz.
     * @param value is the number to change.
     * @return value, returns the value changed or the same.
     */
    public String fizzBuzz(String value) {
        int valueValue = Integer.parseInt(value);
        if (valueValue % FIZZ_BUZZ == 0) {
            return "FizzBuzz";
        }
        if (valueValue % BUZZ == 0 || value.contains("5")) {
            return "Buzz";
        }
        if (valueValue % FIZZ == 0 || value.contains("3")) {
            return "Fizz";
        }
        return value;
    }
}
