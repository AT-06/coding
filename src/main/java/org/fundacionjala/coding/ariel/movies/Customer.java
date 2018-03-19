package org.fundacionjala.coding.ariel.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * KATA9.
 * Class Customer
 */
public class Customer {
    private static final int QUANTITY = 50;
    private final String customername;
    private List<Rental> rentals;
    private static final char SLASH = '\n';


    /**
     * @param customer Init the class.
     */
    public Customer(String customer) {
        this.customername = customer;
        rentals = new ArrayList<>();
    }

    /**
     * This method add a rental on the List.
     *
     * @param rental is an object of class Rental.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * This method calculates total of rentals movies.
     *
     * @return the total of the movies.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;

        for (Rental rental : rentals) {
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * This method calculates frequent points.
     *
     * @return the total frequent points.
     */
    public int calculateTotalFrequentPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    /**
     * This method shows the summary of the rentals.
     *
     * @return a summary of rentals.
     */
    public String statement() {
        StringBuilder result = new StringBuilder(QUANTITY);
        result.append("Rental Record for ").append(customername).append(SLASH);
        for (Rental rental : rentals) {
            result.append(rental.rentalStatement())
                    .append(SLASH);
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append(SLASH)
                .append("You earned ").append(calculateTotalFrequentPoints())
                .append(" frequent renter points");
        return result.toString();
    }
}
