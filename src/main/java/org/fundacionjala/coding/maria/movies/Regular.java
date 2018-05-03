package org.fundacionjala.coding.maria.movies;

/**
 * Class Regular.
 */
public class Regular extends Movie {

    private static final double AMOUNT_FACTOR = 1.5;

    /**
     * Init.
     *
     * @param titleMovie is the Movie title.
     */
    public Regular(String titleMovie) {
        super(titleMovie);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > 2 ? (daysRented - 2) * AMOUNT_FACTOR : 2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
