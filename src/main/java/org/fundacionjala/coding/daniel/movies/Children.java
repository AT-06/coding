package org.fundacionjala.coding.daniel.movies;

/**
 * Created by Administrator on 3/11/2018.
 */
public class Children extends Movie {
    private static final int MAX_DAYS = 3;

    private static final double AMOUNT_FACTOR = 1.5;

    /**
     * Children Class constructor.
     *
     * @param title is the Movie title.
     */
    public Children(String title) {
        super(title);
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
