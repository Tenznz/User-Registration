package com.bridgelabz.user.user_testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.user.registration.UserData;
import com.bridgelabz.user.registration.UserValidation;

@RunWith(Parameterized.class)
public class UserRegistrationTest {

	private static UserData userData;
	private static UserValidation userValidation;
	private String email;
	private Boolean expectedEmail;

	public UserRegistrationTest(String email, Boolean expectedEmail) {
		super();
		this.email = email;
		this.expectedEmail = expectedEmail;
	}

	@BeforeClass
	public static void init() {
		System.out.println("Starting task...");
		userData = UserData.getInstance();
		userValidation = UserValidation.getInstance();
	}

	@Test
	public void testAddedFistNameShouldBeValid() {
		System.out.println("for valid:");
		userValidation.addFirstName();
		boolean check = userData.getFirstName().matches(userValidation.NAME_PATTERN);
		assertEquals(true, check);
	}

	@Test
	public void testAddedFistNameShouldBeInValid() {
		System.out.println("for invalid:");
		userValidation.addFirstName();
		boolean check = userData.getFirstName().matches(userValidation.NAME_PATTERN);
		System.out.println(check);
		assertEquals(false, check);
	}

	@Test
	public void testAddedLastNameShouldBeValid() {
		System.out.println("for valid:");
		userValidation.addLastName();
		assertEquals(true, userData.getLastName().matches(userValidation.NAME_PATTERN));
	}

	@Test
	public void testAddedLastNameShouldBeInValid() {
		System.out.println("for invalid:");
		userValidation.addLastName();
		assertEquals(false, userData.getLastName().matches(userValidation.NAME_PATTERN));
	}

	@Test
	public void testAddedEmailShouldBeValid() {
		System.out.println("for valid:");
		userValidation.addEmail();
		assertEquals(true, userData.getEmail().matches(userValidation.EMAIL_PATTERN));
	}

	@Test
	public void testAddedEmailShouldBeInValid() {
		System.out.println("for invalid:");
		userValidation.addEmail();
		assertEquals(false, userData.getEmail().matches(userValidation.EMAIL_PATTERN));
	}

	@Test
	public void testAddedPasswordShouldBeValid() {
		System.out.println("for valid:");
		userValidation.addPassword();
		assertEquals(true, userData.getPassword().matches(userValidation.PASSWORD_PATTERN));
	}

	@Test
	public void testAddedPasswordShouldBeInValid() {
		System.out.println("for invalid:");
		userValidation.addPassword();
		assertEquals(false, userData.getPassword().matches(userValidation.PASSWORD_PATTERN));
	}

	@Test
	public void testAddedPhoneNumberShouldBeValid() {
		System.out.println("for valid:");
		userValidation.addPhoneNumber();
		assertEquals(true, userData.getPhoneNumber().matches(userValidation.PHONE_NUMBER_PATTERN));
	}

	@Test
	public void testAddedPhoneNumberShouldBeInValid() {
		System.out.println("for invalid:");
		userValidation.addPhoneNumber();
		assertEquals(false, userData.getPhoneNumber().matches(userValidation.PHONE_NUMBER_PATTERN));
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { ".abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc.@gmail.com11", false }, { "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false } });
	}

//	@Parameterized.Parameters
//	public static List<List<String>> input() throws FileNotFoundException {
//
//		return Arrays.asList(UserData.getValidEmail());
//	}

	@AfterClass
	public static void endTask() {
		System.out.println("Ending task");
	}

	@Test
	public void testEmailShouldBeValid() {
		boolean check = userValidation.addEmail(email);
		System.out.println(email + " " + check + " -" + expectedEmail);
		assertEquals(expectedEmail, check);
	}

}
