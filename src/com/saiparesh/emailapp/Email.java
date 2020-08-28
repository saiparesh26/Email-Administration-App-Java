package com.saiparesh.emailapp;

import java.util.Scanner;

public class Email {
	private static final int DEFAULT_PASSWORD_LENGTH = 7;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailBoxCapacity = 500;
	private String companySuffix = "abzcompany.com";
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call department set method
		this.department = setDepartment();
		
		//Call for password method
		this.password = randomPassword(DEFAULT_PASSWORD_LENGTH);
		System.out.println("Your initial password is: " + password);
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department + "." + companySuffix;

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
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change password
	public void changePassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String showInfo() {
		return "Display name: " + firstName + " " + lastName
				+ ", Email: " + email
				+ ", Mailbox Capacity: " + mailBoxCapacity;
	}
}
