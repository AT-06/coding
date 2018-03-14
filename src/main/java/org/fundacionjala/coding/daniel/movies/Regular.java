package org.fundacionjala.coding.daniel.movies;

/**
 * Created by Administrator on 3/11/2018.
 */
public class Regular extends Movie {

    private static final double AMOUNT_FACTOR = 1.5;

    /**
     * Regular Class constructor.
     *
     * @param title is the Movie title.
     */
    public Regular(String title) {
        super(title);
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
