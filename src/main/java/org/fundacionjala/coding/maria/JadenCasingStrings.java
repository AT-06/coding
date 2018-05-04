package org.fundacionjala.coding.maria;

import java.util.StringJoiner;
/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
 *
 * Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 *
 * */
public class Jaden_Casing_Strings {
    /**
     * Method to convert a string on jaden case.
     * @param phrase is the phrase
     * @return a converted phrase
     **/

    public String toJadenCase(String phrase) {
        if (phrase != "" && phrase != null) {
            String[] phraseArray = phrase.split(" ");
            StringJoiner jaden = new StringJoiner(" ");
            for (String value : phraseArray) {
                String convert = value.replace(value.charAt(0), Character.toUpperCase(value.charAt(0)));
                jaden.add(convert);
            }
            return jaden.toString();
        }
        return null;
    }
}
