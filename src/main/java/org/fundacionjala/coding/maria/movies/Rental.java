package org.fundacionjala.coding.maria.movies;

/**
 * Class Rental.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This is the constructor of Rental Class.
     *
     * @param movie      is an Movie object type.
     * @param daysRented is the quantityof rented days.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method calculates the amount of the Movie.
     *
     * @return amount based on days rented.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * This method calculates the frequent renter points of the Movie.
     *
     * @return requent renter points based on days rented.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }

    /**
     * This method shows the rental summary.
     *
     * @return statement of rental summary.
     */
    public String rentalStatement() {
        return movie.rentalFigure(daysRented);
    }
}
