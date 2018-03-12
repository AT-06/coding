package org.fundacionjala.coding.manuel;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

/**
 * Created by Administrator on 3/12/2018.
 */
public class Kata10 {
    /**
     * Method to order and concat max and min value.
     * @param value .
     * @return a string .
     */
    public String highAndLow(String value) {
        String[] values = value.split(" ");
        List<Integer> listValues = new ArrayList<>();
        for (String number : values) {
            listValues.add(Integer.parseInt(number));
        }
        listValues.sort(Comparator.naturalOrder());
        return String.format("%s %s", listValues.get(listValues.size() - 1).toString(), listValues.get(0).toString());
    }
}
