package com.stack.exception;

import java.rmi.MarshalException;

public class StackEmptyException extends Exception {
    public StackEmptyException() {
        super("The stack is empty. Push a value before popping it.");
    }
}
