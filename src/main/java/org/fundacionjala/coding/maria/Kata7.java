package org.fundacionjala.coding.maria;


/**
 * kata 7.
 */
public class Kata7 {
    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * @param num int
     * @return string fizz/buzz/num
     */
    public String fizzBuzz(int num) {
        String numString =  Integer.toString(num);
        String result = "";
        if (num % THREE == 0 || numString.contains("3")) {
            result = result.concat("Fizz");
        }
        if (num % FIVE == 0 || numString.contains("5")) {
            result = result.concat("Buzz");
        }
        return result.isEmpty() ? numString : result;
    }
}
