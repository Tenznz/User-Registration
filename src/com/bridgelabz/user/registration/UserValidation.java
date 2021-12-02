package com.bridgelabz.user.registration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.user.registration.InvalidUserDetailException.Invalid;

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
		String fName = null;
		fName = sc.nextLine();
		userData.setFirstName(fName);
		boolean check = fName.matches(NAME_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserDetailException(Invalid.FirstName, "Invalid First Name format");
			}
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		}

	}

	public void addLastName() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Last Name : ");
		String lName = sc.nextLine();
		userData.setLastName(lName);
		boolean check = lName.matches(NAME_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserDetailException(Invalid.LastName, "Invalid Last Name format");
			}
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		}
	}

	public void addEmail() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		userData.setEmail(email);
		boolean check = email.matches(EMAIL_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserDetailException(Invalid.Email, "Invalid Email Format");
			}
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("finally")
	public Boolean addEmail(String emailID) {
		String email = emailID;
		boolean check = email.matches(EMAIL_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserDetailException(Invalid.Email, "Invalid Email Format");
			}
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		} finally {
			return check;
		}
	}

	public void addPhoneNumber() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Phone Number : ");
		String phoneNo = sc.nextLine();
		userData.setPhoneNumber(phoneNo);
		boolean check = phoneNo.matches(PHONE_NUMBER_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserDetailException(Invalid.PhoneNumber, "Invalid Phone number Format");
			}
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		}
	}

	public void addPassword() {
		UserData userData = UserData.getInstance();
		System.out.print("Enter Password : ");
		String password = sc.nextLine();
		userData.setPassword(password);
		boolean check = password.matches(PASSWORD_PATTERN);// Rule4:Has exactly 1 Special Character
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserDetailException(Invalid.Password, "Invalid ");
			}
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
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
		UserData userData = UserData.getInstance();
		for (String a : emailArr) {

			boolean check = a.matches(EMAIL_PATTERN);

			if (check == true) {
				UserData.validEmail.add(a);

			} else {
				UserData.invalidEmail.add(a);
			}
		}

		System.out.println("\n-Valid Email- :");
		for (String a : userData.validEmail)
			System.out.println(a);

		System.out.println("\n-InValid Email- :");
		for (String a : userData.invalidEmail)
			System.out.println(a);
		sf.close();
	}

//	public boolean addEmail(String email) throws FileNotFoundException {
//		File file = new File(
//				"/home/tsewang/eclipse-workspace/UserRegistration/src/com/bridgelabz/user/registration/e-mail.txt");
//		Scanner sf = new Scanner(file);
//		boolean check = false;
//		String emails = null;
//		while (sf.hasNextLine())
//			emails = sf.nextLine();
//		System.out.println("Total email:-\n" + emails);
//
//		String[] emailArr = emails.split(",");
//		UserData userData = UserData.getInstance();
//
//		check = email.matches(EMAIL_PATTERN);
//		return check;
//	}

}
