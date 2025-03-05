package org.example.CustomException;

// Step 1: Define the custom exception
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
// Step 2: Use the custom exception in the application
public class Demo {
    public static void checkNumber(int number) {
        if (number <= 0) {
            throw new InvalidInputException("Number must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (InvalidInputException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

