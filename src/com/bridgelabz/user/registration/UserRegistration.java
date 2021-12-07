package com.bridgelabz.user.registration;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserRegistration {

	void UserEntry() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String outPut = "";
		do {
			System.out
					.println("Check for vaild or not \n1.First Name\n2.Last Name\n3.Email\n4.Password\n5.Phone Number");
			i = sc.nextInt();
			System.out.println("Enter value");
			UserData userData = new UserData();
			String input = sc.next();
			switch (i) {
			case 1:
				ValidUserEntry firstName = (String text) -> {
					boolean check = text.matches(UserValidation.NAME_PATTERN);
					if (check == true) {
						userData.setFirstName(input);
						return "valid";
					} else {
						return "invalid";
					}
				};
				outPut = firstName.userEntry(input);
				System.out.println(firstName.userEntry(input));
				break;
			case 2:
				ValidUserEntry lastName = (String text) -> {
					boolean check = input.matches(UserValidation.NAME_PATTERN);
					if (check == true) {
						userData.setLastName(input);
						return "valid";
					}
					return "invalid";
				};
				outPut = lastName.userEntry(input);
				System.out.println(lastName.userEntry(input));
				break;
			case 3:
				ValidUserEntry email = (String text) -> {
					boolean check = input.matches(UserValidation.EMAIL_PATTERN);
					if (check == true) {
						userData.setEmail(input);
						return "valid";
					}
					return "invalid";
				};
				outPut = email.userEntry(input);
				System.out.println(email.userEntry(input));
				break;
			case 4:
				ValidUserEntry password = (String text) -> {
					boolean check = input.matches(UserValidation.PASSWORD_PATTERN);
					if (check == true) {
						userData.setPassword(input);
						return "valid";
					}
					return "invalid";
				};
				outPut = password.userEntry(input);
				System.out.println(outPut);
				break;
			case 5:
				ValidUserEntry phoneNumber = (String text) -> {
					boolean check = input.matches(UserValidation.PHONE_NUMBER_PATTERN);
					if (check == true) {
						userData.setPhoneNumber(input);
						return "valid";
					}
					return "invalid";
				};
				System.out.println(phoneNumber.userEntry(input));
				break;
			default:
				System.out.println("invalid input");
			}
			if (outPut == "invalid") {
				i--;
			}
		} while (i > 0 || i <= 5);
		sc.close();
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.UserEntry();
	}
}
