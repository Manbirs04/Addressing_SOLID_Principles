package com.example.addressing_solid_principles.Solved.OCP;

public class SeniorCitizenDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
