package org.fundacionjala.coding.ariel;
/**
 * Made For Ariel.
 */
public class Kata3 {

    /**
     * @param num Any int num
     * @return A int num, but apply the persistentBurgger..
     */
    public int persistentBurgger(int num) {
        int product = 1;
        int i = 0;
        String numText = String.valueOf(num);
        String[] numbers = numText.split("");
        while (numbers.length != 1) {
            for (String n : numbers) {
                product = product * Integer.parseInt(n);
            }
            numText = String.valueOf(product);
            product = 1;
            numbers = numText.split("");
            i++;
        }
        return i;
    }
}
