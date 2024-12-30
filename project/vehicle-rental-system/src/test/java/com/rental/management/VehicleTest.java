package com.rental.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for testing Vehicle functionality.
 * Since Vehicle is abstract, tests are conducted on a concrete subclass (Car).
 */
class VehicleTest {

    private Vehicle vehicle;

    /**
     * Sets up the test environment by initializing a concrete Vehicle subclass (Car).
     */
    @BeforeEach
    void setUp() {
        // Using a concrete subclass (Car) to test Vehicle methods
        vehicle = new Car("CAR123", "Toyota Corolla", 50);
    }

    /**
     * Test method to check if the Vehicle ID is correctly retrieved.
     * Verifies that the Vehicle ID returned matches the expected value.
     */
    @Test
    void testGetVehicleId() {
        assertEquals("CAR123", vehicle.getVehicleId(), "Vehicle ID should be CAR123");
    }

    /**
     * Test method to check if the model is correctly retrieved.
     * Verifies that the model returned matches the expected value.
     */
    @Test
    void testGetModel() {
        assertEquals("Toyota Corolla", vehicle.getModel(), "Vehicle model should be Toyota Corolla");
    }

    /**
     * Test method to check if the base rental rate is correctly retrieved.
     * Verifies that the base rental rate returned matches the expected value.
     */
    @Test
    void testGetBaseRentalRate() {
        assertEquals(50, vehicle.getBaseRentalRate(), "Base rental rate should be 50");
    }

    /**
     * Test method to check if the vehicle's availability status is correctly retrieved.
     * Verifies that the vehicle is initially available.
     */
    @Test
    void testIsAvailable() {
        assertTrue(vehicle.getIsAvailable(), "Vehicle should be available initially");
    }

    /**
     * Test method to check if the vehicle's availability can be set correctly.
     * Verifies that the availability status changes when set to false.
     */
    @Test
    void testSetIsAvailable() {
        vehicle.setIsAvailable(false);
        assertFalse(vehicle.getIsAvailable(), "Vehicle should not be available after setting false");
    }
}
