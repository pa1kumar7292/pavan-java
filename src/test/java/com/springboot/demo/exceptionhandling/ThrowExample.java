package com.springboot.demo.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowExample {
    // Method that can throw two exceptions
    public static void processData(int value) throws IOException, SQLException {
        if (value < 0) {
            throw new IOException("Negative value not allowed");
        } else if (value == 0) {
            throw new SQLException("Value cannot be zero");
        }
    }

    public static void main(String[] args) {
        try {
            processData(0);  // Will throw SQLException
        } catch (IOException | SQLException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
