package com.springboot.demo.exceptionhandling;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(""));
        System.out.println("First Line: " + reader.readLine());
        reader.close();
    }
}
