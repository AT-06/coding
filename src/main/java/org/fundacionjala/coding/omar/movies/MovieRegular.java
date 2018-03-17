package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class MovieRegular extends AbstractMovie {

    private static final int NUMBER_2 = 2;
    private static final double NUMBER_1_5 = 1.5;

    /**
     * Constructor for MovieRegular.
     *
     * @param title Title of regular movie
     */
    public MovieRegular(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    double getAmount(int daysRented) {
        double totalAmount = 2;
        if (daysRented > NUMBER_2) {
            totalAmount += (daysRented - NUMBER_2) * NUMBER_1_5;
        }
        return totalAmount;
    }

    /**
     * @param daysRented This Method returns Frequent Renter Points of Regular Movie.
     * @return points Total points of regular movie.
     */
    int getFrequentRenterPoints(int daysRented) {
        return DEFAULT_FREQUENT_RENTER_POINT;
    }

}
