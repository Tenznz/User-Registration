package com.bridgelabz.user.registration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserValidation {
	public static UserValidation instance;
	private static final String EMAIL_PATTERN = "^[0-9a-zA-Z+-._]+@[0-9a-zA-Z]+.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	private static final String NAME_PATTERN = "^([A-Z]{1}+[a-z]{2,})*$";
	private static final String PHONE_NUMBER_PATTERN = "^([0-9]{1,2})\\s([0-9]{10})$";
	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@|#|$|%|^|&|-|+|=|(|)|])(?=\\S+$).{8,}$";
	Scanner sc = new Scanner(System.in);

	private UserValidation() {

	}

	public static UserValidation getInstance() {
		if (instance == null) {
			instance = new UserValidation();
		}
		return instance;
	}

	public void addFirstName() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter First Name : ");
		userData.setFirstName(sc.nextLine());
		boolean check = userData.getFirstName().matches(NAME_PATTERN);
		if (check == true) {
		} else {
			System.out.println("Invalid Name format \nAdd again (Eg:Tenzing)");
			addFirstName();
		}
	}

	public void addLastName() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Last Name : ");
		userData.setLastName(sc.nextLine());
		boolean check = userData.getLastName().matches(NAME_PATTERN);
		if (check == true) {
		} else {
			System.out.println("Invalid Name format \nAdd again (Eg:Tenzing)");
			addLastName();
		}
	}

	public void addEmail() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Email : ");
		userData.setEmail(sc.nextLine());
		boolean check = userData.getEmail().matches(EMAIL_PATTERN);
		if (check == true) {
		} else {
			System.out.println("Invalid Email format\nAdd again (Eg:abc.xyz@bl.co.in)");
			addEmail();
		}
	}

	public void addPhoneNumber() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Phone Number : ");
		userData.setPhoneNumber(sc.nextLine());
		boolean check = userData.getPhoneNumber().matches(PHONE_NUMBER_PATTERN);
		if (check == true) {
		} else {
			System.out.println("Invalid Phone Number format \nAdd again (Eg:91 9919819801)");
			addPhoneNumber();
		}
	}

	public void addPassword() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Password : ");
		userData.setPassword(sc.nextLine());
		boolean check = userData.getPassword().matches(PASSWORD_PATTERN);// Rule4:Has exactly 1 Special Character
		if (check == true) {
		} else {
			System.out.println("Invalid password format \nAdd again [Atleast 8 Character Eg:A1@aA1ba]");
			addPassword();
		}
	}

	public void readFile() throws FileNotFoundException {
		File file = new File(
				"/home/tsewang/eclipse-workspace/UserRegistration/src/com/bridgelabz/user/registration/e-mail.txt");
		Scanner sf = new Scanner(file);

		String emails = null;
		while (sf.hasNextLine())
			emails = sf.nextLine();
		System.out.println("Total email:-\n" + emails);

		String[] emailArr = emails.split(",");
		List<String> validEmail = new ArrayList<>();
		List<String> invalidEmail = new ArrayList<>();

		for (String a : emailArr) {
			boolean check = a.matches(EMAIL_PATTERN);
			if (check == true) {
				validEmail.add(a);

			} else {
				invalidEmail.add(a);
			}
		}
		System.out.println("\n-Valid Email- :");
		for (String a : validEmail)
			System.out.println(a);

		System.out.println("\n-InValid Email- :");
		for (String a : invalidEmail)
			System.out.println(a);
		sf.close();
	}
}
