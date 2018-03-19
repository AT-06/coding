package org.fundacionjala.coding.manuel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class CustomerTest {
    private static final double DELTA = 0;

    /**
     * First test.
     */
    @Test
    public void testTetTotalAmount() {
        final int daysRented1 = 5;
        final int daysRented2 = 10;
        final double expectedResult = 20.5;
        Customer customer = new Customer("Manuel");
        customer.addRental(new Rental(new RegularMovie("Titanic", 0), daysRented1));
        customer.addRental(new Rental(new RegularMovie("The silent of the lambs", 0), daysRented2));
        assertEquals(expectedResult, customer.getTotalAmount(), DELTA);
    }

    /**
     * Second test.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        final int priceCode = 1;
        final int daysRented1 = 2;
        final int daysRented2 = 3;
        final int expectedResult = 4;
        Customer customer = new Customer("Andres");
        customer.addRental(new Rental(new NewReleaseMovie("Lord of the rings", priceCode), daysRented1));
        customer.addRental(new Rental(new NewReleaseMovie("The Hobbit", priceCode), daysRented2));

        assertEquals(expectedResult, customer.getFrequentRenterPoints(), DELTA);
    }

    /**
     * Third test.
     */
    @Test
    public void testStatement() {
        final int priceCode = 1;
        final int daysRented1 = 2;
        final int daysRented2 = 3;
        final String line1 = "Rental Record for Pablo\n";
        final String line2 = "\tLord of the rings\t6.0\n";
        final String line3 = "\tThe Hobbit\t9.0\n";
        final String line4 = "Amount owed is 15.0\n";
        final String line5 = "You earned 4 frequent renter points";
        Customer customer = new Customer("Pablo");
        customer.addRental(new Rental(new NewReleaseMovie("Lord of the rings", priceCode), daysRented1));
        customer.addRental(new Rental(new NewReleaseMovie("The Hobbit", priceCode), daysRented2));

        assertEquals(String.format("%s%s%s%s%s", line1, line2, line3, line4, line5), customer.statement());
    }
}
