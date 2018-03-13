package org.fundacionjala.coding.christian.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Developer by Christian.
 */
public class Customer {
    private final String clientName;
    private static final int CINEMA_CAPACITY = 73;
    private List<Rental> rentals;
    private static final char NEW_LINE = '\n';

    /**
     * @param newRental .
     */
    public void addRental(Rental newRental) {
        rentals.add(newRental);
    }

    /**
     * @param clientName .
     */
    public Customer(String clientName) {
        this.clientName = clientName;
        rentals = new ArrayList<>();
    }

    /**
     * @return int.
     */
    public int calculateTotalFrequentPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    /**
     * @return double.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * @return String.
     */
    public String statement() {
        StringBuilder result = new StringBuilder(CINEMA_CAPACITY);
        result.append("Rental Record for ").append(clientName).append(NEW_LINE);
        for (Rental rental : rentals) {
            result.append(rental.rentalStatement())
                .append(NEW_LINE);
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append(NEW_LINE)
            .append("You earned ").append(calculateTotalFrequentPoints())
            .append(" frequent renter points");
        return result.toString();
    }
}
