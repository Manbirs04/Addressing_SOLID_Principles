package com.example.addressing_solid_principles.Solved.SRP;

public class EmailService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
