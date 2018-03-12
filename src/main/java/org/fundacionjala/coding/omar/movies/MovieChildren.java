package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class MovieChildren extends AbstractMovie {

    private static final double NUMBER_1_5 = 1.5;
    private static final int NUMBER_0 = 0;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_1 = 1;

    /**
     * Constructor for MovieChildren.
     * @param title Title of movie children.
     */
    public MovieChildren(String title) {
        super(title);
    }

    /**
     * @param daysRented This Method returns Total amount of Children Movie.
     * @return totalAmount.
     */
    double getAmount(int daysRented) {
        double totalAmount = NUMBER_0;
        totalAmount += NUMBER_1_5;
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
        return NUMBER_1;
    }

}
