package com.gl.service;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.util.ScannerFactory;

public class DriverClass {
	
	public static void main(String[] args) {
		 
		Employee emp=new Employee("Venunath", "Gondipatla");
		CredentialService cs=new CredentialService();
		String generatedEmail;
		char[] password;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		//Scanner sc = new Scanner(System.in);
		//int option =sc.nextInt();
		
		ScannerFactory sc=new ScannerFactory();
		int option= sc.getScanner();
		
		if(option ==1) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			password=cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, password);			
		}
		
		else if(option ==2) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			password=cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, password);			
		}
		
		else if(option ==3) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
			password=cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, password);			
		}
		
		else if (option ==4) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			password=cs.generatePassword();
			cs.showCredentials(emp,generatedEmail, password);			
		}
		else {
			System.out.println("Not a valid entry");
		}
	}

}
