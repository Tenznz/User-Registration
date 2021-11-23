package com.bridgelabz.user.registration;

public class UserResgistration {

	public static void main(String[] args) {
		String firstName, lastName, email, password, phoneNumber;
		// First Name Adding
		Pattern pattern = new Pattern();
		pattern.isValidFirstName();
		firstName = pattern.getFirstName();
		// Last Name Adding
		pattern.isValidLastName();
		lastName = pattern.getLastName();
		System.out.println("First Name : " + firstName + "\nLast Name : " + lastName);
	}

}
