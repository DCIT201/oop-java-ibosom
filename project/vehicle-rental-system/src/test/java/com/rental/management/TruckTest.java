package com.rental.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Truck class to validate rental functionality.
 */
class TruckTest {

    private Truck truck;
    private Customer customer;

    /**
     * Setup method to initialize objects before each test.
     * This ensures each test starts with a fresh state.
     */
    @BeforeEach
    void setUp() {
        // Initialize the necessary objects before each test
        truck = new Truck("TRK789", "Volvo FH16", 70);
        customer = new Customer("Jane Doe", "DL654321");
    }

    /**
     * Test method to verify the rental cost calculation for the truck.
     * Validates that the rental cost for 3 days is correctly calculated.
     */
    @Test
    void testCalculateRentalCost() {
        // Verify the rental cost for 3 days
        double rentalCost = truck.calculateRentalCost(3);  // Test for 3 days
        assertEquals(315, rentalCost, "Rental cost for 3 days should be 315");
    }

    /**
     * Test method to check if the truck is available for rental.
     * Ensures the truck is available initially.
     */
    @Test
    void testIsAvailableForRental() {
        // Verify that the truck is available initially
        assertTrue(truck.isAvailableForRental(), "Truck should be available initially");
    }

    /**
     * Test method to verify the rent vehicle functionality.
     * Ensures the truck is not available after renting it out.
     */
    @Test
    void testRentVehicle() {
        // Rent the truck and verify its availability
        truck.rent(customer, 3);
        assertFalse(truck.getIsAvailable(), "Truck should not be available after renting");
    }

    /**
     * Test method to verify the return vehicle functionality.
     * Ensures the truck becomes available again after it is returned.
     */
    @Test
    void testReturnVehicle() {
        // Rent the truck, then return it and verify its availability
        truck.rent(customer, 3);
        truck.returnVehicle();
        assertTrue(truck.getIsAvailable(), "Truck should be available after returning");
    }
}
