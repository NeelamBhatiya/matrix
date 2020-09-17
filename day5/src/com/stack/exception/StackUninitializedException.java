package com.stack.exception;

public class StackUninitializedException extends Exception {
    public StackUninitializedException() {
        super("The stack is uninitialized");
    }
}
