package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Constructor.
     * @param movie .
     * @param daysRented .
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * getter Movie.
     * @return movie.
     */
    public Movie getMovie() {
        return this.movie;
    }

    /**
     * Method to calculate Amount of a movie.
     * @return call method in movie.
     */
    public double calculateAmountFromMovie() {
        return this.movie.calculateAmount(this.daysRented);
    }

    /**
     * Method to calculate Frequency of a movie.
     * @return call method in movie.
     */
    public double calculateFrequentRenterPointsForMovie() {
        return this.movie.calculateFrequentRenterPoints(this.daysRented);
    }
}
