package com.bridgelabz.user.registration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserValidation {
	public static UserValidation instance;
	public static final String EMAIL_PATTERN = "^[0-9a-zA-Z+-._]+@[0-9a-zA-Z]+.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	public static final String NAME_PATTERN = "^([A-Z]{1}+[a-z]{2,})*$";
	public static final String PHONE_NUMBER_PATTERN = "^([0-9]{1,2})\\s([0-9]{10})$";
	public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]+)(?=\\S+$).{8,}$";
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
		String fName = sc.nextLine();
		userData.setFirstName(fName);
		boolean check = fName.matches(NAME_PATTERN);
//		
//		if (check == true) {
//			userData.setFirstName(fName);
//			System.out.println("Valid");
//		} else {
//			System.out.println("InValid");
//			System.out.println("Invalid Name format \nAdd again (Eg:Tenzing)");
//			addFirstName();
//		}

	}

	public void addLastName() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Last Name : ");
		String lName = sc.nextLine();
		userData.setLastName(lName);
		boolean check = lName.matches(NAME_PATTERN);
//		if (check == true) {
//			userData.setLastName(lName);
//			System.out.println("Valid");
//		} else {
//			System.out.println("InValid");
//			System.out.println("Invalid Name format \nAdd again (Eg:Tenzing)");
//			addLastName();
//		}
	}

	public void addEmail() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		userData.setEmail(email);
		boolean check = email.matches(EMAIL_PATTERN);
//		if (check == true) {
//			userData.setEmail(email);
//			System.out.println("Valid");
//		} else {
//			System.out.println("InValid");
//			System.out.println("Invalid Email format\nAdd again (Eg:abc.xyz@bl.co.in)");
//			addEmail();
//		}
	}

	public void addPhoneNumber() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Phone Number : ");
		String phoneNo = sc.nextLine();
		userData.setPhoneNumber(phoneNo);
		boolean check = phoneNo.matches(PHONE_NUMBER_PATTERN);
//		if (check == true) {
//			userData.setPhoneNumber(phoneNo);
//			System.out.println("Valid");
//		} else {
//			System.out.println("InValid");
//			System.out.println("Invalid Phone Number format \nAdd again (Eg:91 9919819801)");
//			addPhoneNumber();
//		}
	}

	public void addPassword() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Password : ");
		String password = sc.nextLine();
		userData.setPassword(password);
		boolean check = password.matches(PASSWORD_PATTERN);// Rule4:Has exactly 1 Special Character
//		if (check == true) {
//			userData.setPassword(password);
//			System.out.println("Valid");
//		} else {
//			System.out.println("InValid");
//			System.out.println("Invalid password format \nAdd again [Atleast 8 Character Eg:A1@aA1ba]");
//			addPassword();
//		}
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
//		for (int i=0;i<emailArr.length;i++) {
//			boolean check = emailArr[i].matches(EMAIL_PATTERN);
//			if (check == true) {
//				validEmail.add(emailArr[i]);
//
//			} else {
//				invalidEmail.add(emailArr[i]);
//			}
//		}

		System.out.println("\n-Valid Email- :");
		for (String a : validEmail)
			System.out.println(a);

		System.out.println("\n-InValid Email- :");
		for (String a : invalidEmail)
			System.out.println(a);
		sf.close();
	}
}
