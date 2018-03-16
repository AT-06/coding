package org.fundacionjala.coding.omar;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * <p>
 * This program tests the life of an evaporator containing a gas.
 * We know the content of the evaporator (content in ml),
 * the percentage of foam or gas lost every day (evap_per_day) and the threshold
 * (threshold) in percentage beyond which the evaporator is no longer useful.
 * All numbers are strictly positive. The program reports the nth day (as an integer)
 * on which the evaporator will be out of use.
 * Note : Content is in fact not necessary in the body of the function "evaporator",
 * you can use it or not use it, as you wish. Some people might prefer
 * to reason with content, some other with percentages only.
 * It's up to you but you must keep it as a parameter because
 * the tests have it as an argument.
 */
public class Kata11 {

    private static final int ZERO = 0;
    private static final int PERCENT = 100;

    /**
     * This method is for test evaporator.
     * @param content This is content.
     * @param evapPerDay  Evaporation per day.
     * @param thresHold .
     *
     * @return days
     */
    public int evaporator(double content, double evapPerDay, double thresHold) {

        int day = ZERO;
        double thresholdValue = thresHold * content / PERCENT;
        while (content > thresholdValue) {
            content -= evapPerDay * content / PERCENT;
            day++;
        }
        return day;

    }


}
