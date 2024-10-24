package com.springboot.demo.exceptionhandling;

public class InsufficientBalanceException extends RuntimeException {
    // runtime exceptions
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
