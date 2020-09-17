package com.psl.contact.exception;

public class InvalidInformationException extends Exception{

	 public InvalidInformationException() {
		super("Invalid Information Provided!");
	}
	 public InvalidInformationException(String str) {
			super(str);
		}

}
