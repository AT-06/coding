package org.fundacionjala.coding.maria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Complete the method/function so that it converts dash/underscore delimited words.
 * into camel casing. The first word within the output should be capitalized only.
 * if the original word was capitalized.
 * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
 */
public class ConvertStringToCamelCase {
    /**
     * Method to resolve the kata.
     * @param s is the String.
     * @return the new String.
     */
    public String toCamelCase(String s) {
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer buffer = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(buffer, m.group(1).toUpperCase());
        }
        return m.appendTail(buffer).toString();
    }
}
