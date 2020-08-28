package com.saiparesh.emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailBoxCapacity;
	private String companySuffix = "abzcompany.com";
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " +this.lastName);
		
		//call department set method
		this.department = setDepartment();
		System.out.println("Department: " + department);
		
		//Call for password method
		this.password = randomPassword(7);
		System.out.println("Your initial password is: " + password);
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("your email is : " + email);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print("Department Codes\n1 for Sales\n2 for development\n3 for Accounting\n0"
				+ " for none\nEnter Department code\n");
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		if(value == 1) return "sales";
		else if (value == 2) return "dev";
		else if (value == 3) return "accounting";
		else return "";
		
	}	
	
	// generate random password
	private String randomPassword(int lenght) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		char[] password = new char[lenght];
		for (int i = 0; i < password.length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	
	//Set mailbox capacity
	
	//Set alternate email
	
	// Change password
}
