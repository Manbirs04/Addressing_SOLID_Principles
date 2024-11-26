package com.example.addressing_solid_principles.Solved.OCP;

public class Main {
    public static void main(String[] args) {
        DiscountPolicy studentDiscount = new StudentDiscount();
        DiscountPolicy seniorCitizenDiscount = new SeniorCitizenDiscount();

        double price = 100.0;
        System.out.println("Student discount: " + studentDiscount.calculateDiscount(price));
        System.out.println("Senior citizen discount: " + seniorCitizenDiscount.calculateDiscount(price));
    }
}
