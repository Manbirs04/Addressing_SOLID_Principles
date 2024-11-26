package com.example.addressing_solid_principles.Violated.OCP;

public class DiscountCalculator {
    public double calculateDiscount(String userType, double price) {
        if (userType.equals("Student")) {
            return price * 0.10;
        } else if (userType.equals("SeniorCitizen")) {
            return price * 0.20;
        } else {
            return 0;
        }
    }
}
