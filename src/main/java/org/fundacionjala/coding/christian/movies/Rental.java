package org.fundacionjala.coding.christian.movies;

/**
 * Developer by Christian.
 */
public class Rental {
    private Movie movieRented;
    private int Rented;

    /**

     * @param movie      .
     * @param daysRented .
     */
    public Rental(Movie movie, int daysRented) {
        this.movieRented = movie;
        this.Rented = daysRented;
    }

    /**

     * @return double.
     */
    public double calculateAmount() {
        return movieRented.calculateAmount(Rented);
    }

    /**
     * @return int.
     */
    public int calculateFrequentRenterPoints() {
        return movieRented.calculateFrequentRenterPoints(Rented);
    }

    /**

     * @return String.
     */
    public String rentalStatement() {
        return movieRented.rentalFigure(Rented);
    }
}
