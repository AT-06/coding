package org.fundacionjala.coding.maria;
import java.util.StringJoiner;

/**
 * Write simple .camelCase method for strings.
 * All words must have their first letter capitalized without spaces.
 */
public class CamelCase {
    /**
     * Method camelcase to convert string.
     * @param str words.
     * @return converted string.
     */
    public String camelCase(String str) {
        String[] splitWord = str.split(" ");
        StringJoiner result = new StringJoiner("");
        for (String word : splitWord) {
            if (!word.isEmpty()) {
                result.add(Character.toUpperCase(word.charAt(0)) + word.substring(1));
            }
        }
        return result.toString();
    }
}
