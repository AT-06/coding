package org.fundacionjala.coding.christian;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * PErformed by Christian
 */
public class Kata7 {
    /**
     * @param digits
     * @return
     */
    final int div15 = 15;
    final int div5 = 5;
    final int div3 = 3;
    public Integer [] fizzBuzz(String digits) {
        Integer[] fizzBuzz = digits.replace();
        Arrays.sort(fizzBuzz);
        Map<Integer, String> kata = new HashMap<>();
        kata.put(div15, "FizzBuzz");
        kata.put(div5, "Buzz");
        kata.put(div3, "Fizz");

        Integer[] changedNumber = digits.replace(Arrays.sort());

        for (int i = 0; i < 101; i++){
            if (kata.containsKey(changedNumber[i])){
                changedNumber[i] =Integer.valueOf(kata.get(changedNumber[1]));
            }
        }
        return changedNumber;
    }
}
