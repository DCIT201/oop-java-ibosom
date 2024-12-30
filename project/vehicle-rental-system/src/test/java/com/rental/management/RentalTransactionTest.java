package com.rental.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the RentalTransaction class to validate transaction details.
 */
class RentalTransactionTest {

    private Customer customer;
    private Vehicle car;
    private RentalTransaction transaction;

    /**
     * Setup method to initialize objects before each test.
     * This ensures each test starts with a fresh state.
     */
    @BeforeEach
    void setUp() {
        // Initialize the necessary objects before each test
        customer = new Customer("John Doe", "DL123456");
        car = new Car("CAR123", "Toyota Corolla", 50);
        transaction = new RentalTransaction(customer, car, 5); // 5 days rental
    }

    /**
     * Test method to verify the customer details in the rental transaction.
     * Ensures the customer retrieved from the transaction is correct.
     */
    @Test
    void testGetCustomer() {
        // Verify that the customer in the transaction is John Doe
        assertEquals(customer, transaction.getCustomer(), "The customer should be John Doe");
    }

    /**
     * Test method to verify the vehicle details in the rental transaction.
     * Ensures the vehicle retrieved from the transaction is the Toyota Corolla.
     */
    @Test
    void testGetVehicle() {
        // Verify that the vehicle in the transaction is the Toyota Corolla
        assertEquals(car, transaction.getVehicle(), "The vehicle should be the Toyota Corolla");
    }

    /**
     * Test method to verify the rental days in the transaction.
     * Ensures the rental duration in the transaction is 5 days.
     */
    @Test
    void testGetDays() {
        // Verify that the rental duration in the transaction is 5 days
        assertEquals(5, transaction.getDays(), "The rental duration should be 5 days");
    }
}
