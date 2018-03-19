package org.fundacionjala.coding.escarleth.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for Customer.
 */
public class CustomerTest {

    private static final String TITLE_1 = "Hulk";
    private static final String TITLE_2 = "Black Panter";
    private static final String TITLE_3 = "Infinity War";
    private static final int CAPACITY = 150;
    private Customer customer;

    /**
     * This method tests instancing of Customer Class.
     */
    @Before
    public void setUp() {
        customer = new Customer("Escarleth Ledezma");
    }

    /**
     * This method tests calculus of total amount of rentals of a customer.
     */
    @Test
    public void calculateTotalAmount() {
        final int daysRented = 4;
        customer.addRental(new Rental(new MovieChildrens(TITLE_1), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new MovieNewRelease(TITLE_2), daysRented1));
        final int daysRented2 = 1;
        customer.addRental(new Rental(new MovieRegular(TITLE_3), daysRented2));

        final double actualResult = customer.calculateTotalAmount();
        final double expectedResult = 9.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsWhenThereIsANewReleaseMovie() {
        final int daysRented = 4;
        customer.addRental(new Rental(new MovieChildrens(TITLE_1), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new MovieNewRelease(TITLE_2), daysRented1));
        final int daysRented2 = 1;
        customer.addRental(new Rental(new MovieRegular(TITLE_3), daysRented2));

        final double actualResult = customer.calculateTotalFrequentPoints();
        final double expectedResult = 4;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsWhenThereIsNotANewReleaseMovie() {
        final int daysRented = 4;
        customer.addRental(new Rental(new MovieChildrens(TITLE_1), daysRented));
        final int daysRented1 = 1;
        customer.addRental(new Rental(new MovieNewRelease(TITLE_2), daysRented1));
        customer.addRental(new Rental(new MovieRegular(TITLE_3), daysRented1));

        final double actualResult = customer.calculateTotalFrequentPoints();
        final double expectedResult = 3;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests output of Customer general rental report.
     */
    @Test
    public void statement() {
        final int daysRented = 4;
        customer.addRental(new Rental(new MovieChildrens(TITLE_1), daysRented));
        final int daysRented1 = 1;
        customer.addRental(new Rental(new MovieNewRelease(TITLE_2), daysRented1));
        customer.addRental(new Rental(new MovieRegular(TITLE_3), daysRented1));

        final String actualResult = customer.statement();
        final StringBuilder expectedResult = new StringBuilder(CAPACITY);
        expectedResult.append("Rental Record for Escarleth Ledezma\nHulk\t1.5"
                + "\nBlack Panter\t3.0\nInfinity War\t2.0\nAmount owed is 6.5\nYou earned 3 frequent renter points");

        assertEquals(expectedResult.toString(), actualResult);
    }
}
