package com.bridgelabz.user.user_testcase;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import com.bridgelabz.user.registration.UserData;
import com.bridgelabz.user.registration.UserValidation;

public class UserRegistrationTest {

	private static UserData userData;
	private static UserValidation userValidation;

	@Before
	public void init() {
		System.out.println("Starting task...");
		userData = UserData.getInstance();
		userValidation = UserValidation.getInstance();
	}

	@Test
	public void testAddedFistNameShouldBeValid() {
//		System.out.println("for valid:");
		userValidation.addFirstName();
		boolean check = userData.getFirstName().matches(userValidation.NAME_PATTERN);
		assertEquals(true, check);
	}

//	@Test
//	public void testAddedFistNameShouldBeInValid() {
//		System.out.println("for invalid:");
//		userValidation.addFirstName();
//		boolean check = userData.getFirstName().matches(userValidation.NAME_PATTERN);
//		System.out.println(check);
//		assertEquals(false, check);
//	}

	@Test
	public void testAddedLastNameShouldBeValid() {
//		System.out.println("for valid:");
		userValidation.addLastName();
		assertEquals(true, userData.getLastName().matches(userValidation.NAME_PATTERN));
	}

//	@Test
//	public void testAddedLastNameShouldBeInValid() {
//		System.out.println("for invalid:");
//		userValidation.addLastName();
//		assertEquals(false, userData.getLastName().matches(userValidation.NAME_PATTERN));
//	}

	@Test
	public void testAddedEmailShouldBeValid() {
//		System.out.println("for valid:");
		userValidation.addEmail();
		assertEquals(true, userData.getEmail().matches(userValidation.EMAIL_PATTERN));
	}

//	@Test
//	public void testAddedEmailShouldBeInValid() {
//		System.out.println("for invalid:");
//		userValidation.addEmail();
//		assertEquals(false, userData.getEmail().matches(userValidation.EMAIL_PATTERN));
//	}

	@Test
	public void testAddedPasswordShouldBeValid() {
//		System.out.println("for valid:");
		userValidation.addPassword();
		assertEquals(true, userData.getPassword().matches(userValidation.PASSWORD_PATTERN));
	}

//	@Test
//	public void testAddedPasswordShouldBeInValid() {
//		System.out.println("for invalid:");
//		userValidation.addPassword();
//		assertEquals(false, userData.getPassword().matches(userValidation.PASSWORD_PATTERN));
//	}

	@Test
	public void testAddedPhoneNumberShouldBeValid() {
//		System.out.println("for valid:");
		userValidation.addPhoneNumber();
		assertEquals(true, userData.getPhoneNumber().matches(userValidation.PHONE_NUMBER_PATTERN));
	}

//	@Test
//	public void testAddedPhoneNumberShouldBeInValid() {
//		System.out.println("for invalid:");
//		userValidation.addPhoneNumber();
//		assertEquals(false, userData.getPhoneNumber().matches(userValidation.PHONE_NUMBER_PATTERN));
//	}

	@AfterClass
	public static void endTask() {
		System.out.println("Ending task");
	}

}
