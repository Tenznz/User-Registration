package com.bridgelabz.user.registration;

import java.io.FileNotFoundException;

public class UserRegistration {

	private String firstName, lastName, email, password, phoneNumber;

	public static void main(String[] args) throws FileNotFoundException {
		UserRegistration user = new UserRegistration();
		UserData userData = UserData.getInstance();
		UserValidation userValidation = UserValidation.getInstance();
//		userValidation.addFirstName(); // First Name Adding
//		user.firstName = userData.getFirstName();

//		userValidation.addLastName(); // Last Name Adding
//		user.lastName = userData.getLastName();
//
//		userValidation.addEmail(); // Email Adding
//		user.email = userData.getEmail();
//
//		userValidation.addPhoneNumber(); // Phone Number Adding
//		user.phoneNumber = userData.getPhoneNumber();
//
//		userValidation.addPassword(); // Password Adding
//		user.password = userData.getPassword();
//		user.display();
//		userValidation.readFile();
	}

	private void display() {
		System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + "\n\tEmail : "
				+ email + "\n\tPhone Number : " + phoneNumber + "\n\tPassword : " + password);
	}
}
