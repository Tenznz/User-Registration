package com.bridgelabz.user.registration;

public class UserResgistration {

	
		private String firstName, lastName, email, password, phoneNumber;

		public static void main(String[] args) {
			UserResgistration user = new UserResgistration();
			Pattern pattern = new Pattern();
			
			pattern.addFirstName(); // First Name Adding
			user.firstName = pattern.getFirstName();

			pattern.addLastName(); // Last Name Adding
			user.lastName = pattern.getLastName();

			pattern.addEmail(); // Email Adding
			user.email = pattern.getEmail();

			pattern.addPhoneNumber(); // Phone Number Adding
			user.phoneNumber = pattern.getPhoneNumber();
			
			pattern.addPassword(); // Password Adding
			user.password = pattern.getPassword();
			user.display();
		}

		private void display() {
			System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + "\n\tEmail : "
					+ email + "\n\tPhone Number : " + phoneNumber+ "\n\tPassword : " + password);
		}
}
