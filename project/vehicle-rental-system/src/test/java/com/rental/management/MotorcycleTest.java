package com.rental.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Motorcycle class to validate its functionality.
 */
class MotorcycleTest {

    private Motorcycle motorcycle;
    private Customer customer;

    /**
     * Setup method to initialize objects before each test.
     * This ensures each test starts with a fresh state.
     */
    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("MOT456", "Honda CBR", 40);
        customer = new Customer("Jane Smith", "DL654321");
    }

    /**
     * Test method to calculate rental cost for 3 days.
     */
    @Test
    void testCalculateRentalCost() {
        // Calculate rental cost for 3 days
        double rentalCost = motorcycle.calculateRentalCost(3);

        // Assert that the rental cost is correct
        assertEquals(96, rentalCost, "Rental cost for 3 days should be 96");
    }

    /**
     * Test method to check if the motorcycle is available for rental initially.
     */
    @Test
    void testIsAvailableForRental() {
        // Assert that the motorcycle is available for rental initially
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should be available for rental initially");
    }

    /**
     * Test method to check the rent functionality of the motorcycle.
     */
    @Test
    void testRentVehicle() {
        // Rent the motorcycle to the customer for 3 days
        motorcycle.rent(customer, 3);

        // Assert that the motorcycle is not available after renting
        assertFalse(motorcycle.getIsAvailable(), "Motorcycle should not be available after renting");
    }

    /**
     * Test method to check the return functionality of the motorcycle.
     */
    @Test
    void testReturnVehicle() {
        // Rent the motorcycle to the customer for 3 days
        motorcycle.rent(customer, 3);

        // Return the motorcycle
        motorcycle.returnVehicle();

        // Assert that the motorcycle is available after returning
        assertTrue(motorcycle.getIsAvailable(), "Motorcycle should be available after returning");
    }
}
