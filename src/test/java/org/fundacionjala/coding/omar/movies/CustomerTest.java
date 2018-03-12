package org.fundacionjala.coding.omar.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * This class contains UnitTests for Movies App.
 */
public class CustomerTest {
    private static final int NUMBER_7 = 7;
    private static final int NUMBER_5 = 5;
    private static final int NUMBER_10 = 10;
    private static final int NUMBER_2 = 2;
    private static final double NUMBER_6_5 = 6.5;
    private static final int NUMBER_1 = 1;
    private static final int NUMBER_30 = 30;
    private static final double NUMBER_1_5 = 1.5;
    private static final int CAPACITY = 100;
    private Customer customer = new Customer("Pepito Perez");


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
        MovieChildren childrensMovie = new MovieChildren("The Minions");
        Rental rental = new Rental(childrensMovie, NUMBER_2);

        customer.addRental(rental);

        assertRentalOverview(childrensMovie, NUMBER_1_5, NUMBER_1);
    }

    /**
     * This method is for test to add New Movie for 10 days.
     */
    @Test
    public void testAddRentalMovieNewForTenDays() {
        MovieNew newReleaseMovie = new MovieNew("Black Panther");
        Rental rental = new Rental(newReleaseMovie, NUMBER_10);

        customer.addRental(rental);

        assertRentalOverview(newReleaseMovie, NUMBER_30, NUMBER_2);
    }

    /**
     * This method is for test to add Regular Movie for 5 days.
     */
    @Test
    public void testAddRentalMovieRegultarForFiveDays() {
        MovieRegular regularMovie = new MovieRegular("Captain America: Civil War");
        Rental rental = new Rental(regularMovie, NUMBER_5);

        customer.addRental(rental);

        assertRentalOverview(regularMovie, NUMBER_6_5, NUMBER_1);
    }

    /**
     * This method is for test to add New Movie, Children Movie and Regular Movie.
     */
    @Test
    public void testAddRentalMixMovies() {

        Customer customer = new Customer("Pepito Perez");
        MovieChildren childrensMovie = new MovieChildren("The Minions");
        customer.addRental(new Rental(childrensMovie, NUMBER_2));

        MovieNew newReleaseMovie1 = new MovieNew("Black Panther");
        customer.addRental(new Rental(newReleaseMovie1, NUMBER_10));

        MovieNew newReleaseMovie2 = new MovieNew("Avengers: Infinity War");
        customer.addRental(new Rental(newReleaseMovie2, NUMBER_10));

        MovieRegular regularMovie1 = new MovieRegular("The Avengers");
        customer.addRental(new Rental(regularMovie1, NUMBER_7));

        MovieRegular regularMovie2 = new MovieRegular("Avengers: Age of Ultron");
        customer.addRental(new Rental(regularMovie2, NUMBER_10));

        MovieRegular regularMovie3 = new MovieRegular("Captain America: Civil War");
        customer.addRental(new Rental(regularMovie3, NUMBER_5));

        MovieRegular regularMovie4 = new MovieRegular("Black Panther");
        customer.addRental(new Rental(regularMovie4, NUMBER_7));


        StringBuilder expectedOverviewBuilder = new StringBuilder(CAPACITY);
        expectedOverviewBuilder.append("Customer: Pepito Perez"
                + "\nThe Minions 1.5\nBlack Panther 30.0"
                + "\nAvengers: Infinity War 30.0\nThe Avengers 9.5"
                + "\nAvengers: Age of Ultron 14.0\nCaptain America: Civil War 6.5\nBlack Panther 9.5\n"
                + "====================================="
                + "\nTotal 101.0\nYou earned 9 frequent renter point(s)");


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
