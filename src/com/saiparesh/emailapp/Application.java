package com.saiparesh.emailapp;

public class Application {

	public static void main(String[] args) {
		Email email1 = new Email("Sai", "Paresh");
//		email1.changePassword("devf@34");
//		email1.setMailBoxCapacity(400);
//		email1.setAlternateEmail("sai.p@gmail.com");
//		System.out.println(email1.getAlternateEmail() + " " + email1.getMailBoxCapacity() + " " + email1.getPassword());
		System.out.println(email1.showInfo());
		
	}

	
}
