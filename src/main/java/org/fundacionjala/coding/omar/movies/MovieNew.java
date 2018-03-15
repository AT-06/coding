package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class MovieNew extends AbstractMovie {

    private static final int NUMBER_3 = 3;
    private static final int NUMBER_1 = 1;
    private static final int NUMBER_2 = 2;

    /**
     * Constructor for MovieNew.
     * @param title Title of new movie.
     */
    public MovieNew(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    double getAmount(int daysRented) {
        return daysRented * NUMBER_3;
    }

    /**
     * @param daysRented This Method returns Frequent Renter Points of New Movie.
     * @return points.
     */
    int getFrequentRenterPoints(int daysRented) {
        return daysRented > NUMBER_1 ? NUMBER_2 : NUMBER_1;

    }

}
