package com.bridgelabz.user.registration;

public class UserResgistration {

	public static void main(String[] args) {
		String firstName, lastName, email, password, phoneNumber;

		Pattern pattern = new Pattern();
		pattern.isValidFirstName();
		firstName = pattern.getFirstName();
		System.out.println("First Name : " + firstName);

	}

}
