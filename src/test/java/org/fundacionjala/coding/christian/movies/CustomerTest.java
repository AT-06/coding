package org.fundacionjala.coding.christian.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class CustomerTest {

    private static final String TITLE_1 = "Coco";
    private static final String TITLE_2 = "Logan";
    private static final String TITLE_3 = "Aliens";
    private static final int CAPACITY = 141;
    private Customer client;

    /**
     *
     */
    @Before
    public void setUp() {
        client = new Customer("Seto Kaiba");
    }

    /**
     *
     */
    @Test
    public void testCalculateTotalAmount() {
        final int daysRented = 4;
        client.addRental(new Rental(new Children(TITLE_1), daysRented));
        final int daysRented1 = 2;
        client.addRental(new Rental(new NewRelease(TITLE_2), daysRented1));
        final int daysRented2 = 1;
        client.addRental(new Rental(new Regular(TITLE_3), daysRented2));

        final double actualResult = client.calculateTotalAmount();
        final double expectedResult = 9.5;

        assertEquals(expectedResult, actualResult, 0);
    }
    /**
     *
     */
    @Test
    public void testCalculateWhenThereIsNotANewReleaseMovie() {
        final int daysRented = 4;
        client.addRental(new Rental(new Children(TITLE_1), daysRented));
        final int daysRented1 = 1;
        client.addRental(new Rental(new NewRelease(TITLE_2), daysRented1));
        client.addRental(new Rental(new Regular(TITLE_3), daysRented1));

        final double actualResult = client.calculateTotalFrequentPoints();
        final double expectedResult = 3;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     *
     */
    @Test
    public void testCalculateWhenThereIsANewReleaseMovie() {
        final int daysRented = 4;
        client.addRental(new Rental(new Children(TITLE_1), daysRented));
        final int daysRented1 = 2;
        client.addRental(new Rental(new NewRelease(TITLE_2), daysRented1));
        final int daysRented2 = 1;
        client.addRental(new Rental(new Regular(TITLE_3), daysRented2));

        final double actualResult = client.calculateTotalFrequentPoints();
        final double expectedResult = 4;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     *
     */
    @Test
    public void testStatement() {
        final int daysRented = 4;
        client.addRental(new Rental(new Children(TITLE_1), daysRented));
        final int daysRented1 = 1;
        client.addRental(new Rental(new NewRelease(TITLE_2), daysRented1));
        client.addRental(new Rental(new Regular(TITLE_3), daysRented1));

        final String actualResult = client.statement();
        final StringBuilder expectedResult = new StringBuilder(CAPACITY);
        expectedResult.append("Rental Record for Seto Kaiba\nCoco\t1.5"
            + "\nLogan\t3.0\nAliens\t2.0\nAmount owed is 6.5\nYou earned 3 frequent renter points");

        assertEquals(expectedResult.toString(), actualResult);
    }
}
