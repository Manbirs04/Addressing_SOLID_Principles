package com.example.addressing_solid_principles.Violated.LSP;

public class Vehicle {
    public void startEngine() {
        System.out.println("Starting engine...");
    }
}

class ElectricCar extends Vehicle {
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Electric cars don't have engines!");
    }
}
