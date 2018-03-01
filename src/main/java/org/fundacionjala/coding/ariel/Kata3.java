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
        int cont = 0;
        String[] numbers = String.valueOf(num).split("");
        while (numbers.length != 1) {
            int product = 1;
            for (String n : numbers) {
                product *= Integer.parseInt(n);
            }
            numbers = String.valueOf(product).split("");
            cont++;
        }
        return cont;
    }
}
