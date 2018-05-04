package org.fundacionjala.coding.ariel;

/**
 * A number is called strong number if the sum of the factorial of its digits is equal to number itself.
 * <p>
 * For example: 145 since: 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * strong_num (1)    return "STRONG!!!!"
 * strong_num (2)    return "STRONG!!!!"
 * strong_num (123)  return "Not Strong !!"
 * strong_num (150)  return "Not Strong !!"
 */
public class StrongNumber {

    /**
     * The constructor.
     */
    public StrongNumber() {
    }

    /**
     * @param num An integer number.
     * @return if the number is STRONG OR Not Strong.
     */
    public String isStrongNumber(int num) {
        String dig = String.valueOf(num);
        String[] digits = dig.split("");
        int sum = 0;
        for (String digt : digits) {
            sum += factorial(Integer.parseInt(digt));
        }
        if (sum == num) {
            return "STRONG!!!!";
        }
        return "Not Strong !!";
    }


    /**
     * @param dig Integer number.
     * @return a facorial of the number.
     */
    private int factorial(int dig) {
        if (dig != 1) {
            return dig * factorial(dig - 1);
        } else {
            return 1;
        }
    }


}
