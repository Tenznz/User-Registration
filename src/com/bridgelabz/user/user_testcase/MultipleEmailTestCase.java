package com.bridgelabz.user.user_testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.user.registration.InvalidUserDetailException;
import com.bridgelabz.user.registration.UserData;
import com.bridgelabz.user.registration.UserValidation;

@RunWith(Parameterized.class)
public class MultipleEmailTestCase {
	private String email;
	private Boolean expectedEmail;
	private static UserData userData;
	private static UserValidation userValidation;

	public MultipleEmailTestCase(String email, Boolean expectedEmail) {
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

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { ".abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc.@gmail.com11", false }, { "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false } });
	}

	@Test
	public void testEmailShouldBeValid() {
		boolean check = userValidation.addEmail(email);
		System.out.println(email + "    actual(" + check + ")\t - \texpected(" + expectedEmail + ")");
		assertEquals(expectedEmail, check);
	}

}
