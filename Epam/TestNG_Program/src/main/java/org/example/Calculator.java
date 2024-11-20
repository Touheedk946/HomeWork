package org.example;

public class Calculator {

    // Method to add two numbers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to find the square root of a number
    public int sqrt(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root of negative numbers is undefined.");
        }
        return (int) Math.sqrt(number);
    }

    // Method to check if a number is positive
    public boolean isPositive(long number) {
        return number > 0;
    }

    // Method to check if a number is negative
    public boolean isNegative(long number) {
        return number < 0;
    }

    // Method to find the sine of a number (in degrees)
    public double sin(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    // Method to divide two integers (throws exception for division by zero)
    public int div(int a, int b) {
        if (b == 0) {
            throw new NumberFormatException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Method to divide two doubles
    public double div(double a, double b) {
        if (b == 0.0) {
            return Double.POSITIVE_INFINITY; // Return infinity for double division by zero
        }
        return a / b;
    }

    // Method to subtract two long numbers
    public long sub(long a, long b) {
        return a - b;
    }
}
