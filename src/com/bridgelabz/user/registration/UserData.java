package com.bridgelabz.user.registration;

import java.util.ArrayList;
import java.util.List;

public class UserData {
	public static UserData instance;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	 static List<String> validEmail;
	 static List<String> invalidEmail;

	UserData() {
		validEmail=new ArrayList<>();
		invalidEmail=new ArrayList<>();
	}

	public static List<String> getValidEmail() {
		return validEmail;
	}

	public static void setValidEmail(List<String> validEmail) {
		UserData.validEmail = validEmail;
	}

	public static List<String> getInvalidEmail() {
		return invalidEmail;
	}

	public static void setInvalidEmail(List<String> invalidEmail) {
		UserData.invalidEmail = invalidEmail;
	}

	public static UserData getInstance() {
		if (instance == null) {
			instance = new UserData();
		}
		return instance;
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
