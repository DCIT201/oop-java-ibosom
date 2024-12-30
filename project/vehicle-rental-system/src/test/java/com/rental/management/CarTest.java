package com.rental.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Car class to validate its functionality.
 */
class CarTest {

    private Car car;
    private Customer customer;

    /**
     * Set up test environment before each test method.
     */
    @BeforeEach
    void setUp() {
        // Initialize objects for each test case
        car = new Car("CAR123", "Toyota Corolla", 50);
        customer = new Customer("John Doe", "DL123456");
    }

    /**
     * Test the rental cost calculation.
     */
    @Test
    void testCalculateRentalCost() {
        // Test rental cost calculation for 5 days
        double rentalCost = car.calculateRentalCost(5);
        assertEquals(300, rentalCost, "Rental cost for 5 days should be 300");
    }

    /**
     * Test if the car is available for rental initially.
     */
    @Test
    void testIsAvailableForRental() {
        // Check if the car is available before renting
        assertTrue(car.isAvailableForRental(), "Car should be available for rental initially");
    }

    /**
     * Test the rent functionality of the vehicle.
     */
    @Test
    void testRentVehicle() {
        // Rent the car and check availability after renting
        car.rent(customer, 5);
        assertFalse(car.getIsAvailable(), "Car should not be available after renting");
    }

    /**
     * Test the return functionality of the vehicle.
     */
    @Test
    void testReturnVehicle() {
        // Rent the car and then return it
        car.rent(customer, 5);
        car.returnVehicle();
        assertTrue(car.getIsAvailable(), "Car should be available after returning");
    }
}
