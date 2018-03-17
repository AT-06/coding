package org.fundacionjala.coding.omar.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * This class contains UnitTests for Movies App.
 */
public class CustomerTest {

    private static final int CAPACITY = 100;
    private static final String BLACK_PANTHER = "Black Panther";
    private Customer customer;

    /**
     * This method is for test overViewNoRentedMovies().
     */
    @Before
    public void customerTestInit() {
        customer = new Customer("Pepito Perez");

    }

    /**
     * This method is for test overViewNoRentedMovies().
     */
    @Test
    public void testGetRentalOverviewNoRentedMovies() {
        StringBuilder expectedOverviewBuilder = new StringBuilder(CAPACITY);

        expectedOverviewBuilder.append("Customer: Pepito Perez"
                + "\n====================================="
                + "\nTotal 0.0\nYou earned 0 frequent renter point(s)");

        assertEquals(expectedOverviewBuilder.toString(), customer.getRentalOverview());
    }

    /**
     * This method is for test to add Children movie for 2 days.
     */
    @Test
    public void testAddRentalChildrenChildrenForTwoDays() {

        final int number2 = 2;
        final int number1 = 1;
        final double number1point5 = 1.5;

        MovieChildren childrensMovie = new MovieChildren("The Minions");
        Rental rental = new Rental(childrensMovie, number2);

        customer.addRental(rental);

        assertRentalOverview(childrensMovie, number1point5, number1);
    }

    /**
     * This method is for test to add New Movie for 10 days.
     */
    @Test
    public void testAddRentalMovieNewForTenDays() {

        final int number10 = 10;
        final int number2 = 2;
        final int number30 = 30;

        MovieNew newReleaseMovie = new MovieNew(BLACK_PANTHER);
        Rental rental = new Rental(newReleaseMovie, number10);

        customer.addRental(rental);

        assertRentalOverview(newReleaseMovie, number30, number2);
    }

    /**
     * This method is for test to add Regular Movie for 5 days.
     */
    @Test
    public void testAddRentalMovieRegultarForFiveDays() {

        final int number5 = 5;
        final double number6point5 = 6.5;
        final int number1 = 1;

        MovieRegular regularMovie = new MovieRegular("Captain America: Civil War");
        Rental rental = new Rental(regularMovie, number5);

        customer.addRental(rental);

        assertRentalOverview(regularMovie, number6point5, number1);
    }

    /**
     * This method is for test to add New Movie, Children Movie and Regular Movie.
     */
    @Test
    public void testAddRentalMixMovies() {

        final int number7 = 7;
        final int number5 = 5;
        final int number10 = 10;
        final int number2 = 2;
        final int number1 = 1;


        MovieChildren childrensMovie1 = new MovieChildren("The Minions");
        customer.addRental(new Rental(childrensMovie1, number2));

        MovieNew newReleaseMovie1 = new MovieNew(BLACK_PANTHER);
        customer.addRental(new Rental(newReleaseMovie1, number10));

        MovieNew newReleaseMovie2 = new MovieNew("Avengers: Infinity War");
        customer.addRental(new Rental(newReleaseMovie2, number1));

        MovieRegular regularMovie1 = new MovieRegular("The Avengers");
        customer.addRental(new Rental(regularMovie1, number7));

        MovieRegular regularMovie2 = new MovieRegular("Avengers: Age of Ultron");
        customer.addRental(new Rental(regularMovie2, number10));

        MovieRegular regularMovie3 = new MovieRegular("Captain America: Civil War");
        customer.addRental(new Rental(regularMovie3, number1));

        MovieRegular regularMovie4 = new MovieRegular(BLACK_PANTHER);
        customer.addRental(new Rental(regularMovie4, number7));

        MovieChildren childrensMovie2 = new MovieChildren("The Minions");
        customer.addRental(new Rental(childrensMovie2, number5));


        StringBuilder expectedOverviewBuilder = new StringBuilder(CAPACITY);
        expectedOverviewBuilder.append("Customer: Pepito Perez"
                + "\nThe Minions 1.5\nBlack Panther 30.0"
                + "\nAvengers: Infinity War 3.0\nThe Avengers 9.5"
                + "\nAvengers: Age of Ultron 14.0\nCaptain America: Civil War 2.0\nBlack Panther 9.5"
                + "\nThe Minions 4.5"
                + "\n====================================="
                + "\nTotal 74.0\nYou earned 9 frequent renter point(s)");


        assertEquals(expectedOverviewBuilder.toString(), customer.getRentalOverview());
    }

    /**
     * This method is for test one Abstract Movie.
     *
     * @param movie                This is a Abstract Movie.
     * @param totalAmount          This is total amount.
     * @param frequentRenterPoints This is total points.
     */
    private void assertRentalOverview(AbstractMovie movie, double totalAmount, int frequentRenterPoints) {
        StringBuilder expectedOverviewBuilder = new StringBuilder(CAPACITY);
        expectedOverviewBuilder.append("Customer: Pepito Perez\n")
                .append(String.format("%s %s", movie.getTitle(), totalAmount))
                .append("\n=====================================\n")
                .append(String.format("%s %s", "Total", totalAmount))
                .append("\nYou earned " + frequentRenterPoints + " frequent renter point(s)");

        assertEquals(expectedOverviewBuilder.toString(), customer.getRentalOverview());
    }
}
