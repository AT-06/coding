/*
 * @(#)Kata17.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * Address
 * All rights reserved.
 *
 * This software is the confidential and propietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 */
package org.fundacionjala.coding.omar;

/**
 * Write a function, which takes a non-negative integer (seconds) as input
 * and returns the time in a human-readable format (HH:MM:SS).
 * <p>
 * HH = hours, padded to 2 digits, range: 00 - 99.
 * MM = minutes, padded to 2 digits, range: 00 - 59.
 * SS = seconds, padded to 2 digits, range: 00 - 59.
 * The maximum time never exceeds 359999 (99:59:59).
 * You can find some examples in the test fixtures.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class Kata17 {

    private static final int HOURS_TO_SECONDS = 3600;
    private static final int MINUTES_TO_SECONDS = 60;
    private static final int NUMBER_100 = 100;

    /**
     * @param inputSeconds input time in second format.
     * @return String, output time in readable format.
     */
    public String makeReadable(int inputSeconds) {
        int hours = (inputSeconds / HOURS_TO_SECONDS) % NUMBER_100;
        int minutes = (inputSeconds % HOURS_TO_SECONDS) / MINUTES_TO_SECONDS;
        int seconds = inputSeconds % MINUTES_TO_SECONDS;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
