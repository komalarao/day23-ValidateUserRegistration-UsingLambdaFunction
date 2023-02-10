package com.bridgelabz.userRegistration;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.*;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();
	Function<List<String>, List<Boolean>> firstNameTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.firstNameValidate.userEntries(x);
		} catch (InvalidUserInputException e) {

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> lastNameTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.lastNameValidate.userEntries(x);
		} catch (InvalidUserInputException e) {

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> emailTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.emailValidate.userEntries(x);
		} catch (InvalidUserInputException e) {

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> phoneTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.phoneNumberValidate.userEntries(x);
		} catch (InvalidUserInputException e) {

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> passwordTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.passwordValidate.userEntries(x);
		} catch (InvalidUserInputException e) {

		}
		return false;
	}).collect(Collectors.toList());

	@Test
	public void test_firstName_Cases() {
		List<Boolean> result = firstNameTestCases.apply(Arrays.asList("Komalarao"));
		List<Boolean> expected = Arrays.asList(true);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void test_lastName_Cases() {
		List<Boolean> result = lastNameTestCases.apply(Arrays.asList("Vakamullu"));
		List<Boolean> expected = Arrays.asList(true);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void test_email_Cases() {
		List<Boolean> result = emailTestCases.apply(Arrays.asList("abc.xyz@23.com"));
		List<Boolean> expected = Arrays.asList(true);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void test_phoneNumber_Cases() {
		List<Boolean> result = phoneTestCases.apply(Arrays.asList("91 8826923224"));
		List<Boolean> expected = Arrays.asList(true);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void test_password_Cases() {
		List<Boolean> result = passwordTestCases.apply(Arrays.asList("manoharvakamullu@1999"));
		List<Boolean> expected = Arrays.asList(true);
		Assert.assertEquals(expected, result);
	}
}
