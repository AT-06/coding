package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class MovieChildren extends AbstractMovie {

    private static final double NUMBER_1_5 = 1.5;
    private static final int NUMBER_3 = 3;

    /**
     * Constructor for MovieChildren.
     *
     * @param title Title of movie children.
     */
    public MovieChildren(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    double getAmount(int daysRented) {
        double totalAmount = NUMBER_1_5;
        if (daysRented > NUMBER_3) {
            totalAmount += (daysRented - NUMBER_3) * NUMBER_1_5;
        }
        return totalAmount;
    }

    /**
     * @param daysRented This Method returns Frequent Renter Points of Children Movie.
     * @return points.
     */
    int getFrequentRenterPoints(int daysRented) {
        return DEFAULT_FREQUENT_RENTER_POINT;
    }

}
