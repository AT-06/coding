package org.fundacionjala.coding.jimmy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

/**
 * This class is for implementing the highAndLow method.
 */
public class Kata10 {

    public static final String BLANK_SPACE = " ";

    /**
     * This method is developed in order to return the high and low value
     * of a String parameter.
     *
     * @param numberInput is the string entry.
     * @return the highest a lowest value of a string of numbers;
     */
    public String highAndLow(String numberInput) {
        String[] arrayNumber = numberInput.split(BLANK_SPACE);
        List<Integer> numberArray = new ArrayList<>();

        for (String i : arrayNumber) {
            numberArray.add(Integer.parseInt(i));
        }
        StringJoiner stringJoiner = new StringJoiner(BLANK_SPACE);

        stringJoiner.add(Collections.max(numberArray).toString());
        stringJoiner.add(Collections.min(numberArray).toString());

        return String.valueOf(stringJoiner);
    }
}
