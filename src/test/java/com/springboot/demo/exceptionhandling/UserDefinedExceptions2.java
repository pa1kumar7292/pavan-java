package com.springboot.demo.exceptionhandling;

public class UserDefinedExceptions2 {
    private double balance = 5000;

    // Method to withdraw amount from account
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        UserDefinedExceptions2 account = new UserDefinedExceptions2();
        try {
            account.withdraw(6000);  // This will throw an InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
