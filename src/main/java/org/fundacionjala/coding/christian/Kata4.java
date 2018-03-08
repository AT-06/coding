package org.fundacionjala.coding.christian;

/**
 * develop by Christian.
 */
public class Kata4 {
    private  static final  int DIV = 10;
    private  static final  int ZERO = 0;

    /**
     * @param number his is for digitalRoot
     * @return tag for 'number'
     */
    public int digitalRoot(int number) {

        if (number < DIV) {
            return number;
        }

        int su = ZERO;

        while (number > ZERO) {

            su += number % DIV;
            number /= DIV;
        }
        return digitalRoot(su);
    }

}
