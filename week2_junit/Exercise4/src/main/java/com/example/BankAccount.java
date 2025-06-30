package com.example;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
