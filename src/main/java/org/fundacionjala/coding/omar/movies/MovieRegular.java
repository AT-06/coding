package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class MovieRegular extends AbstractMovie {

    private static final int NUMBER_0 = 0;
    private static final int NUMBER_2 = 2;
    private static final double NUMBER_1_5 = 1.5;
    private static final int NUMBER_1 = 1;

    /**
     * Constructor for MovieRegular.
     * @param title Title of regular movie
     */
    public MovieRegular(String title) {
        super(title);
    }

    /**
     * @param daysRented This Method returns Total Amount of Regular Movie.
     * @return totalAmount Total amount of regular movie.
     */
    double getAmount(int daysRented) {
        double totalAmount = NUMBER_0;
        totalAmount += NUMBER_2;
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
        return NUMBER_1;
    }

}
