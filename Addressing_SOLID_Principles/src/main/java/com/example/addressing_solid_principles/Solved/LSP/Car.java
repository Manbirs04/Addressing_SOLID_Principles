package com.example.addressing_solid_principles.Solved.LSP;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving...");
    }
}
