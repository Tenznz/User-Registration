package com.bridgelabz.user.registration;

public class InvalidUserDetailException extends Exception {
	Invalid invalid;

	enum Invalid {
		FirstName, LastName, Email, Password, PhoneNumber
	}

	Invalid exception;

	InvalidUserDetailException(Invalid exception, String message) {
		super(message);
		this.exception = exception;
	}
}
