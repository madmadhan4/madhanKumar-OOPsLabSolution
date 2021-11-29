package com.greatlearning.service;
import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService{
//Method to generate Email
	public String generateEmailAddress(String firstname, String lastname, String department) {
		return firstname.toLowerCase() + lastname.toLowerCase() + "@"+ department.toLowerCase() +".greatlearning.com";
	}
//Method to generate Password
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters   = "abcdefghijklmnopqrstuvwxyz";
		String numbers        = "0123456789";
		String specialChars   = "!@#$%^&*_+=/.?<>";
		String values         = capitalLetters+smallLetters+numbers+specialChars;
		
		Random random = new Random();
		char[] password = new char[8];
		
//Since we need One Lower case, One Upper Case, a Number and Special Characters to be present
//in Password everytime, we are going to add them to our array first
		password[0] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		password[1] = smallLetters.charAt(random.nextInt(smallLetters.length()));
		password[2] = numbers.charAt(random.nextInt(numbers.length()));
		password[3] = specialChars.charAt(random.nextInt(specialChars.length()));
		
//The rest of the Password can be generated randomly with any of the above strings
		for(int i=4; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
	}
//Method to Show the Employee Credentials
	public void showCredentials(Employee emp) {
		System.out.println("Dear " + emp.getFirstname() + " your generated credentials are as follows ");
		System.out.println("Email ---> " + generateEmailAddress(emp.getFirstname(), emp.getLastname(), emp.getDepartmentName()));
		System.out.println("Password ---> " + generatePassword());
	}
}
