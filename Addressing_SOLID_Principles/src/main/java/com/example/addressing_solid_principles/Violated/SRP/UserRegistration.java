package com.example.addressing_solid_principles.Violated.SRP;

public class UserRegistration {
    public void registerUser(String name, String email) {
        System.out.println("Registering user: " + name);
        System.out.println("Saving to database...");
        sendEmail(email, "Welcome to our platform!");
    }

    private void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
