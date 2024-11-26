package com.example.addressing_solid_principles.Solved.LSP;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle electricCar = new ElectricCar();

        car.move();
        electricCar.move();
    }
}
