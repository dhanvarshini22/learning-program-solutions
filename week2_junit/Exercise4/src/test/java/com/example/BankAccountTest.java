package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        // Arrange: Setup common for all tests
        account = new BankAccount(100);
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        // Cleanup logic if needed
        System.out.println("After each test");
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(50);

        // Assert
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(30);

        // Assert
        assertEquals(70, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        // Act
        account.withdraw(200);

        // Assert
        assertEquals(100, account.getBalance()); // No withdrawal if insufficient
    }
}
