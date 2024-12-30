package com.rental.management;

import java.util.Objects;

public class Customer {
    private final String name;
    private final String licenseNumber;

    public Customer(String name, String licenseNumber) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.licenseNumber = Objects.requireNonNull(licenseNumber, "License number cannot be null");
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "name='" + name + '\'' +
               ", licenseNumber='" + licenseNumber + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) && licenseNumber.equals(customer.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, licenseNumber);
    }
}
