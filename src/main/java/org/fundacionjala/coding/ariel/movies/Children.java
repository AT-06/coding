package org.fundacionjala.coding.ariel.movies;

/**
 * Class Children.
 */
public class Children extends Movie {
    private static final int MAX_DAYS = 3;
    private static final double AMOUNT_FACTOR = 1.5;

    /**
     * Init.
     *
     * @param titleMovie is the Movie title.
     */
    public Children(String titleMovie) {
        super(titleMovie);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > MAX_DAYS ? (daysRented - MAX_DAYS) * AMOUNT_FACTOR : AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
