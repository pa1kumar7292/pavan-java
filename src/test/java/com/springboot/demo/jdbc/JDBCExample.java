package com.springboot.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/koinbasket_new";
        String username = "koinbasket";
        String password = "koinbasket@321";

        try {
            // 1. Register the Driver
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.postgresql.Driver");


            // 2. Establish a Connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established!");

            // 3. Create a Statement and Execute Query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            // 4. Process the ResultSet
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("first_name");
                String email = resultSet.getString("email");
                System.out.println(id + " | " + name + " | " + email);
            }

            // 5. Use PreparedStatement for Parameterized Query
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setInt(1, 1);
            ResultSet resultSetPrepared = preparedStatement.executeQuery();

            while (resultSetPrepared.next()) {
                System.out.println("User: " + resultSetPrepared.getString("first_name"));
            }

            // 6. Close Resources
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Connection closed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }
