package com.rental.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the RentalAgency class to validate rental functionality.
 */
class RentalAgencyTest {

    private RentalAgency agency;
    private Car car;
    private Motorcycle motorcycle;
    private Customer customer;

    /**
     * Setup method to initialize objects before each test.
     * This ensures each test starts with a fresh state.
     */
    @BeforeEach
    void setUp() {
        agency = new RentalAgency();
        car = new Car("CAR123", "Toyota Corolla", 50);
        motorcycle = new Motorcycle("MOT456", "Honda CBR", 40);
        customer = new Customer("John Doe", "DL123456");

        // Add vehicles to the rental agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
    }

    /**
     * Test method to check the renting functionality of a vehicle.
     * Verifies that the car is unavailable after renting.
     */
    @Test
    void testRentVehicle() {
        // Rent the car for 5 days
        agency.rentVehicle(car, customer, 5);
        
        // Assert that the car is no longer available after renting
        assertFalse(car.getIsAvailable(), "Car should not be available after renting");
    }

    /**
     * Test method to check the return vehicle functionality.
     * Verifies that the car is available again after being returned.
     */
    @Test
    void testReturnVehicle() {
        // Rent the car for 5 days
        agency.rentVehicle(car, customer, 5);

        // Return the car
        agency.returnVehicle(car);

        // Assert that the car is available after returning
        assertTrue(car.getIsAvailable(), "Car should be available after returning");
    }

    /**
     * Test method to check the behavior when trying to rent an already rented vehicle.
     * Verifies that the car cannot be rented again while it is already rented.
     */
    @Test
    void testRentUnavailableVehicle() {
        // Rent the car for 5 days
        agency.rentVehicle(car, customer, 5);

        // Try to rent the same car again (should fail)
        agency.rentVehicle(car, customer, 2);

        // Assert that the car is still unavailable for the second rental
        assertFalse(car.getIsAvailable(), "Car should not be available for second rental while already rented");
    }
}
