package com.bridgelabz.user.registration;

import java.util.Scanner;

public class Pattern {
	private String firstName, lastName, email, password, phoneNumber;

	Scanner sc = new Scanner(System.in);

	public void isValidFirstName() {

		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		boolean check = firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Add again");
			isValidFirstName();
		}
	}

	public void isValidLastName() {

		System.out.print("Enter First Name : ");
		lastName = sc.nextLine();
		boolean check = lastName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Add again");
			isValidLastName();
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
