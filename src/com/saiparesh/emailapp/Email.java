package com.saiparesh.emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailBoxCapacity;

	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " +this.lastName);
		
		//call department set method
		this.department = setDepartment();
		System.out.println("Department: " + department);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print("Department Codes\n1 for Sales\n2 for development\n3 for Accounting\n0"
				+ " for none\nEnter Department code\n");
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		if(value == 1) return "Sales";
		else if (value == 2) return "Development";
		else if (value == 3) return "Accounting";
		else return "";
		
	}	
	
	// generate random password
	
	//Set mailbox capacity
	
	//Set alternate email
	
	// Change password
}
