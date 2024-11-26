package com.example.addressing_solid_principles.Solved.LSP;

public class ElectricCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("Electric car is driving silently...");
    }
}
