package org.fundacionjala.coding.maria.movies;

/**
 * Class NewRelease.
 */
public class ReleaseMovie extends Movie {

    private static final int AMOUNT_FACTOR = 3;

    /**
     * Init.
     *
     * @param titleMovie the Movie title.
     */
    public ReleaseMovie(String titleMovie) {
        super(titleMovie);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return (double) daysRented * AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
