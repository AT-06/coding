package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public abstract class AbstractMovie {
    protected static final int DEFAULT_FREQUENT_RENTER_POINT = 1;
    private String title;

    /**
     * @param title contains title of AbstractMovie.
     */
    public AbstractMovie(String title) {
        this.title = title;
    }

    /**
     * This Method returns Title of AbstractMovie.
     *
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param dayRented This Method returns Frequent Renter Points of AbstractMovie.
     * @return totalAmount
     */
    abstract double getAmount(int dayRented);

    /**
     * @param daysRented This Method returns Frequent Renter Points of AbstractMovie.
     * @return points
     */
    abstract int getFrequentRenterPoints(int daysRented);


}
