package com.bridgelabz.user.user_testcase;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import com.bridgelabz.user.registration.UserData;
import com.bridgelabz.user.registration.UserValidation;
import com.bridgelabz.user.registration.ValidUserEntry;

public class UserRegistrationTest {

	private static UserData userData;
	@Before
	public void init() {
		System.out.println("Starting task...");
		userData = UserData.getInstance();
		UserValidation.getInstance();
	}

	@Test
	public void testAddedFistNameShouldBeValid() {
		System.out.println("for valid:");
		String input = "Ten";
		ValidUserEntry firstName = (String text) -> {
			boolean check = text.matches(UserValidation.NAME_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(firstName.userEntry(input));
		boolean check = firstName.userEntry(input).equals("valid");
		assertEquals(true, check);
	}

	@Test
	public void testAddedFistNameShouldBeInValid() {
		System.out.println("for invalid:");
		String input = "ten";
		ValidUserEntry firstName = (String text) -> {
			boolean check = text.matches(UserValidation.NAME_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(firstName.userEntry(input));
		boolean check = firstName.userEntry(input).equals("valid");
		assertEquals(false, check);
	}

	@Test
	public void testAddedLastNameShouldBeValid() {
		System.out.println("for valid:");
		String input = "Duk";
		ValidUserEntry lastName = (String text) -> {
			boolean check = text.matches(UserValidation.NAME_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(lastName.userEntry(input));
		boolean check = lastName.userEntry(input).equals("valid");
		assertEquals(true, check);
	}

	@Test
	public void testAddedLastNameShouldBeInValid() {
		System.out.println("for invalid:");
		String input = "duk";
		ValidUserEntry lastName = (String text) -> {
			boolean check = text.matches(UserValidation.NAME_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(lastName.userEntry(input));
		boolean check = lastName.userEntry(input).equals("valid");
		assertEquals(false, check);

	}

	@Test
	public void testAddedEmailShouldBeValid() {
		System.out.println("for valid:");
		String input = "dhugkar@gmail.com";
		ValidUserEntry email = (String text) -> {
			boolean check = text.matches(UserValidation.EMAIL_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(email.userEntry(input));
		boolean check = email.userEntry(input).equals("valid");
		assertEquals(true, check);
	}

	@Test
	public void testAddedEmailShouldBeInValid() {
		System.out.println("for invalid:");
		String input = "dhugkar@";
		ValidUserEntry email = (String text) -> {
			boolean check = text.matches(UserValidation.EMAIL_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(email.userEntry(input));
		boolean check = email.userEntry(input).equals("valid");
		assertEquals(false, check);
	}

	@Test
	public void testAddedPasswordShouldBeValid() {
		System.out.println("for valid:");
		String input = "Qwe@12asd";
		ValidUserEntry password = (String text) -> {
			boolean check = text.matches(UserValidation.PASSWORD_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(password.userEntry(input));
		boolean check = password.userEntry(input).equals("valid");
		assertEquals(true, check);
	}

	@Test
	public void testAddedPasswordShouldBeInValid() {
		System.out.println("for invalid:");
		String input = "Qweerttyy";
		ValidUserEntry password = (String text) -> {
			boolean check = text.matches(UserValidation.PASSWORD_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(password.userEntry(input));
		boolean check = password.userEntry(input).equals("valid");
		assertEquals(false, check);
	}

	@Test
	public void testAddedPhoneNumberShouldBeValid() {
		System.out.println("for valid:");
		String input = "91 7018485591";
		ValidUserEntry phoneNumber = (String text) -> {
			boolean check = text.matches(UserValidation.PHONE_NUMBER_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(phoneNumber.userEntry(input));
		boolean check = phoneNumber.userEntry(input).equals("valid");
		assertEquals(true, check);
		}

	@Test
	public void testAddedPhoneNumberShouldBeInValid() {
		System.out.println("for invalid:");
		System.out.println("for valid:");
		String input = "917018485591";
		ValidUserEntry phoneNumber = (String text) -> {
			boolean check = text.matches(UserValidation.PHONE_NUMBER_PATTERN);
			if (check == true) {
				userData.setFirstName(input);
				return "valid";
			} else {
				return "invalid";
			}
		};
		System.out.println(phoneNumber.userEntry(input));
		boolean check = phoneNumber.userEntry(input).equals("valid");
		assertEquals(false, check);
	}

	@AfterClass
	public static void endTask() {
		System.out.println("Ending task");
	}

}
