package org.fundacionjala.coding.maria;


/**
 * kata 7.
 */
public class Kata7 {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final String BLANK = "";
    /**
     * @param num int
     * @return string fizz/buzz/num
     */
    public String fizzBuzz(int num) {
        String numString =  Integer.toString(num);
        String result = BLANK;
        if (num % THREE == 0 || numString.contains("3")) {
            result = result.concat("Fizz");
        }
        if (num % FIVE == 0 || numString.contains("5")) {
            result = result.concat("Buzz");
        }
        return result.equals(BLANK) ? numString : result;
    }
}
