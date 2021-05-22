package day13;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {			
		// ask user for new password
		// if length of the password is less than 5 -> weak password 
		// if password does not contain spec chars(%, $, !) -> weak password
		// otherwise password is created
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type new password:");
		
		String password = scanner.next();
		
		if (password.length() < 5) {
			System.out.println("Weak Password - length should be 5 or more");
			
		} else if (!(password.contains("%") || 
				password.contains("$") ||
				password.contains("!"))) {
			
			System.out.println("Weak Password - spec chars is missing");
		} else {
			System.out.println("Password is accepted");
		}
		
		System.out.println(password);
	}
}
