package com.example.addressing_solid_principles.Solved.SRP;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.registerUser("John Doe", "john.doe@example.com");

        EmailService emailService = new EmailService();
        emailService.sendEmail("john.doe@example.com", "Welcome to our platform!");
    }
}
