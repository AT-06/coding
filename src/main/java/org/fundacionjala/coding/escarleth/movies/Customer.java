package org.fundacionjala.coding.escarleth.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Powered by Escarleth L.
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();
    private static final char BACKLASH = '\n';
    private static final int CAPACITY = 80;

    /**
     * This is the constructor of Customer Class.
     *
     * @param name person who rent a movie.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * This method adds a Rental.
     *
     * @param rental is an object of class Rental.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Summary rentals of a customer.
     *
     * @return summary of rentals.
     */
    public String statement() {
        StringBuilder result1 = new StringBuilder(CAPACITY);
        result1.append("Rental Record for ").append(name).append(BACKLASH);
        for (Rental rental : rentals) {
            result1.append(rental.makeMovieLine())
                    .append(BACKLASH);
        }
        result1.append("Amount owed is ").append(calculateTotalAmount()).append(BACKLASH)
                .append("You earned ").append(calculateTotalFrequentPoints())
                .append(" frequent renter points");
        return result1.toString();
    }

    /**
     * This method calculates total amount of a list of rentals.
     *
     * @return the total amount of the movies rented .
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.determineRentalAmount();
        }
        return totalAmount;
    }

    /**
     * This method calculates frequent points of a list of Rentals.
     *
     * @return the total frequent points.
     */
    public int calculateTotalFrequentPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.determinateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

}
