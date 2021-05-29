package day17;

import java.util.Scanner;

public class PasswordLogin {
	public static final String PASSWORD = "qwerty!$";
	public static final int TRIES_AVAILABLE = 3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String passwordFromUser;
		int actualTries = 0;
		boolean isLoginSuccess = false;
		
		do {
			actualTries++;
			System.out.println("Try number: " + actualTries);
			System.out.println("Enter password:");
			passwordFromUser = sc.next();
			isLoginSuccess = PASSWORD.equals(passwordFromUser);
	
		} while(!isLoginSuccess && actualTries < TRIES_AVAILABLE);
		
		if (isLoginSuccess) {
			System.out.println("Success login! Number of tries: " + actualTries);
		} else {
			System.out.println("Failed to login, try later on");
		}
		
	}
}
