package org.fundacionjala.coding.jimmy.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for statement{@link Statement}.
 */
public class StatementTest {

    private Statement statement;
    private static final double DELTA = 0.0;

    /**
     * Method to set up the name of the customer, the new release movie, regular movie name and rental.
     */
    @Before
    public void setUp() {
        final String customerName = "Jin";
        final int rentalDays = 2;
        statement = new Statement(new Customer(customerName));
        statement.addRental(new Rental(new NewReleaseMovie("Power Rangers"), rentalDays));
        statement.addRental(new Rental(new RegularMovie("Bangkok revenge"), rentalDays));
    }

    /**
     * Test to calculate the total amount of all movies added by a customer.
     */
    @Test
    public void testCalculateTheTotalAmountOfAllMoviesAddedByACustomer() {
        final double expectedResult = 8;
        assertEquals(expectedResult, statement.calculateTotalAmount(), DELTA);
    }

    /**
     * Test to calculate the total frequent rental points of all movies added by a customer.
     */
    @Test
    public void testCalculateTheTotalFrequentRentalPointsOfAllMoviesAddedByACustomer() {
        final double expectedResult = 3;
        assertEquals(expectedResult, statement.calculateTotalFrequentRenterPoints(), DELTA);
    }

    /**
     * Test to obtain the voucher of a customer.
     */
    @Test
    public void testVoucherObtainedInString() {
        final String expectedResult = "Rental Record for Jin\n"
                + "\tPower Rangers\t6.0\n"
                + "\tBangkok revenge\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";
        assertEquals(expectedResult, statement.obtainVoucher());
    }
}
