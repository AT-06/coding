package org.fundacionjala.coding.omar.movies;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class Rental {
    private final int daysRented;
    private final AbstractMovie movie;

    /**
     * Constructor for Rental.
     * @param movie Abstract movie.
     * @param daysRented Days of rented movie.
     */
    public Rental(AbstractMovie movie, int daysRented) {
        this.daysRented = daysRented;
        this.movie = movie;
    }

    /**
     * This method returns total amount.
     *
     * @return totalAmount.
     */
    double getAmount() {
        return movie.getAmount(daysRented);
    }

    /**
     * This method returns frequent renter points.
     *
     * @return points.
     */
    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    /**
     * This method returns movie title.
     *
     * @return title.
     */
    String getMovieTitle() {
        return movie.getTitle();
    }
}
