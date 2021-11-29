package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {
	
	
	 public char[] generatePassword() {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }

	public String generateEmailAddress(String fName, String lName, String department) {
		// TODO Auto-generated method stub
		return fName+lName+"@"+department+".abc.com";
	}

	public void showCredentials(Employee emp, String email, char[] password) {
		// TODO Auto-generated method stub
		
		System.out.println("Dear "+emp.getFirstName()+" "+emp.getLastName()+" "+"your credentials are as follows: ");
		System.out.println("Email: "+email);
		//System.out.println("");
		System.out.println("Password:" + password.toString());
		
	}

}
