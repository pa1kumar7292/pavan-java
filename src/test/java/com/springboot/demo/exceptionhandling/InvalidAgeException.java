package com.springboot.demo.exceptionhandling;

public class InvalidAgeException extends Exception {
    // checked exceptions
    InvalidAgeException(String msg) {
        super(msg);
    }
}
