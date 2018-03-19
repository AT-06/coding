package org.fundacionjala.coding.maria.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 */
public class CustomerTest {

    private static final String MOVIE1 = "Frida";
    private static final String MOVIE2 = "Fragmentado";
    private static final String MOVIE3 = "Cementerio de elefantes";
    private Customer customer;

    /**
     * initialize customer.
     */
    @Before
    public void setUp() {
        customer = new Customer("Rene");
    }

    /**
     * Test calculateTotalAmount.
     */
    @Test
    public void calculateTotalAmount() {
        final int daysRented = 4;
        final int daysRented1 = 2;
        final int daysRented2 = 1;

        customer.addRental(new Rental(new Children(MOVIE1), daysRented));
        customer.addRental(new Rental(new ReleaseMovie(MOVIE2), daysRented1));
        customer.addRental(new Rental(new Regular(MOVIE3), daysRented2));

        final double actualResult = customer.calculateTotalAmount();
        final double expectedResult = 9.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsNewReleaseMovie() {
        final int daysRented = 4;
        final int daysRented1 = 2;
        final int daysRented2 = 1;

        customer.addRental(new Rental(new Children(MOVIE1), daysRented));
        customer.addRental(new Rental(new ReleaseMovie(MOVIE2), daysRented1));
        customer.addRental(new Rental(new Regular(MOVIE3), daysRented2));

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
        final int daysRented1 = 1;

        customer.addRental(new Rental(new Children(MOVIE1), daysRented));
        customer.addRental(new Rental(new ReleaseMovie(MOVIE2), daysRented1));
        customer.addRental(new Rental(new Regular(MOVIE3), daysRented1));

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
        final int daysRented1 = 1;

        String result = "Rental For Rene\nFrida\t1.5"
                + "\nFragmentado\t3.0\nCementerio de elefantes\t";
        result = result.concat("2.0\nAmount owed is 6.5\nYou earned 3 frequent renter points");

        customer.addRental(new Rental(new Children(MOVIE1), daysRented));
        customer.addRental(new Rental(new ReleaseMovie(MOVIE2), daysRented1));
        customer.addRental(new Rental(new Regular(MOVIE3), daysRented1));

        final String actualResult = customer.statement();
        assertEquals(result, actualResult);
    }
}
