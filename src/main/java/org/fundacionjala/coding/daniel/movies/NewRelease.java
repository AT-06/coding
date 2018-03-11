package org.fundacionjala.coding.daniel.movies;

/**
 * Created by Administrator on 3/11/2018.
 */
public class NewRelease extends Movie {

    private static final int AMOUNT_FACTOR = 3;

    /**
     * NewRelease Class constructor.
     *
     * @param title is the Movie title.
     */
    public NewRelease(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented * AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
