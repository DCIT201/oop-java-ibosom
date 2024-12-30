package com.rental.management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Customer class to validate its functionality.
 */
class CustomerTest {

    /**
     * Test that the Customer details are correctly initialized and retrieved.
     */
    @Test
    void testCustomerDetails() {
        // Create a new customer instance
        Customer customer = new Customer("John Doe", "DL123456");

        // Validate that the customer name is as expected
        assertEquals("John Doe", customer.getName(), "Customer name should be John Doe");

        // Validate that the customer license number is as expected
        assertEquals("DL123456", customer.getLicenseNumber(), "Customer license number should be DL123456");
    }
}
