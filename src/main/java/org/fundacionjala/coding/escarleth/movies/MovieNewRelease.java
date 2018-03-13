package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public class MovieNewRelease extends Movie {
    private static final double AMOUNT = 3.0;

    /**
     * Constructor for MovieNewRelease.
     *
     * @param title of the Movie.
     */
    public MovieNewRelease(String title) {
        super(title);
    }

    /**
     * determineRentalAmount method.
     * {@inheritDoc}
     */
    @Override
    double determineRentalAmount(int daysRented) {
        return daysRented * AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
