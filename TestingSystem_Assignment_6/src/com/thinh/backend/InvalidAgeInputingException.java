package com.thinh.backend;

public class InvalidAgeInputingException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAgeInputingException(String mes) {
		super(mes);
	}
}
