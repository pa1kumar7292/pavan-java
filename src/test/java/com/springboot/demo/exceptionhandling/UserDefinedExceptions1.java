package com.springboot.demo.exceptionhandling;

public class UserDefinedExceptions1 {
    public static void main(String[] args) {
        try {
            validateAge(16);  // This will throw an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Method to check if age is valid
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }


}


