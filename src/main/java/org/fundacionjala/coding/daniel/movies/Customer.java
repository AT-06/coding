package org.fundacionjala.coding.daniel.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 3/11/2018.
 */
public class Customer {
    private static final int CAPACITY = 73;
    private final String customerName;
    private List<Rental> rentals;
    private static final char BACKSLASH_N = '\n';

    /**
     * This is the constructor of Customer Class.
     *
     * @param customerName that is the one who is doing the movie rental.
     */
    public Customer(String customerName) {
        this.customerName = customerName;
        rentals = new ArrayList<>();
    }

    /**
     * This method adds a Rental object to the rentals List.
     *
     * @param newRental is an object of class Rental.
     */
    public void addRental(Rental newRental) {
        rentals.add(newRental);
    }

    /**
     * This method calculates total amount of a list of rentals.
     *
     * @return the total amount of the movies rented treating each
     * one depending on their type.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;

        for (Rental rental : rentals) {
            //determine amounts for each line
            //show figures for this rental
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * This method calculates frequent points of a list of Rentals.
     *
     * @return the total frequent points earned for the
     * total of rentals.
     */
    public int calculateTotalFrequentPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    /**
     * This method shows the summary of the rentals of a customer.
     *
     * @return a statement with the summary of rentals.
     */
    public String statement() {
        StringBuilder result = new StringBuilder(CAPACITY);
        result.append("Rental Record for ").append(customerName).append(BACKSLASH_N);
        for (Rental rental : rentals) {
            result.append(rental.rentalStatement())
                .append(BACKSLASH_N);
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append(BACKSLASH_N)
            .append("You earned ").append(calculateTotalFrequentPoints())
            .append(" frequent renter points");
        return result.toString();
    }
}
