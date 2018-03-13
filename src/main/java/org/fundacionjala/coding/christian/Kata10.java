package org.fundacionjala.coding.christian;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Developer by Christian.
 */
public class Kata10 {
    private static final String SPACE = " ";

    /**
     * @param numbers is the string `highAndLow`
     * @return String
     */
    public String highAndLow(String numbers) {
        String[] empySpace = numbers.split(SPACE);
        List<Integer> listValues = new ArrayList<>();
        for (String number : empySpace) {
            listValues.add(Integer.parseInt(number));
        }
        listValues.sort(Comparator.naturalOrder());
        return String.format("%s %s", listValues.get(listValues.size()
                - 1).toString(), listValues.get(0).toString());
    }
}
