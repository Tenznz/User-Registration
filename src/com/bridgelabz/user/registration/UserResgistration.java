package com.bridgelabz.user.registration;

public class UserResgistration {

	public static void main(String[] args) {
		String firstName, lastName, email, password, phoneNumber;
		// First Name Adding
		Pattern pattern = new Pattern();
		pattern.addFirstName();
		firstName = pattern.getFirstName();
		// Last Name Adding
		pattern.addLastName();
		lastName = pattern.getLastName();
		// Email Adding
		pattern.addEmail();
		email = pattern.getEmail();
		// Email Adding
		pattern.addPhoneNumber();
		phoneNumber = pattern.getPhoneNumber();
		System.out.println(
				"\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + "\n\tEmail : " + email+ "\n\tPhone Number : " + phoneNumber);
	}

}
