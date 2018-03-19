package org.fundacionjala.coding.christian.movies;

/**
 * Developer by Christian.
 */
public class Rental {
    private Movie movieRented;
    private int rented;

    /**

     * @param movie      .
     * @param daysRented .
     */
    public Rental(Movie movie, int daysRented) {
        this.movieRented = movie;
        this.rented = daysRented;
    }

    /**

     * @return double.
     */
    public double calculateAmount() {
        return movieRented.calculateAmount(rented);
    }

    /**
     * @return int.
     */
    public int calculateFrequentRenterPoints() {
        return movieRented.calculateFrequentRenterPoints(rented);
    }

    /**

     * @return String.
     */
    public String rentalStatement() {
        return movieRented.rentalFigure(rented);
    }
}
