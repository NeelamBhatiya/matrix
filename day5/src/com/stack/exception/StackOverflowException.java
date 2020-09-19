package com.stack.exception;

public class StackOverflowException extends Exception {
    public StackOverflowException() {
        super("The stack is full.");
    }
}
