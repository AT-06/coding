package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public class MovieNewRelease extends Movie {
    private static final int AMOUNT = 3;

    /**
     * Constructor for MovieNewRelease.
     *
     * @param title of the Movie.
     */
    public MovieNewRelease(String title) {
        super(title);
    }

    /** determineRentalAmount method.
     * {@inheritDoc}
     */
    @Override
    double determineRentalAmount(int daysRented) {
        return daysRented * AMOUNT;
    }

    /**
     * @param daysRented is the quantity of rental days.
     * @return the total frequent renter points .
     */
    int determinateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
