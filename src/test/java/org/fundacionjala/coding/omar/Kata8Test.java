package org.fundacionjala.coding.omar;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata1.java.
 */
public class Kata8Test {
    /**
     * This method is for test convertEntryToNumber(entry) method.
     * isFizzBuzzNumber( row1, row2, row3 ) => returns "123456789".
     */
    @Test
    public void testConvertEntryToNumberHistoryOne() {
        Kata8 entryToNumber = new Kata8();
        String row1 = "    _  _     _  _  _  _  _ ";
        String row2 = "  | _| _||_||_ |_   ||_||_|";
        String row3 = "  ||_  _|  | _||_|  ||_| _|";


        assertEquals("123456789", entryToNumber.convertEntryToNumber(row1, row2, row3));


    }



}
