package org.example.Exception;

// with throw keyword

public class Demo1 {
    // Method that checks if a number is positive
    public static void checkPositive(int number) {
        if (number <= 0) {
            // Throwing an exception if the number is not positive
            throw new IllegalArgumentException("Number must be positive");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {
        try {
            checkPositive(-5); // This will throw the exception
        } catch (IllegalArgumentException e) {
            // Handling the thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
