package com.example.models;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount; // Dispense the requested amount
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
