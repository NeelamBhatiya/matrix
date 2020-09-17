package com.psl.contact.exception;

public class EmailNotUniqueException extends Exception {
	public EmailNotUniqueException() {
        super("Wrong email format");
    }

}
