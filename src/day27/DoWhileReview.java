package day27;

import java.util.Scanner;

// Diff between 'while' and 'do while' loops is that while loop will have condition first
// and body after. 'do while' will have body first and then condition
	
// Can 'do while' loop have a zero iterations?
// No, it will have at least one

public class DoWhileReview {
	public static final int LUCKY_NUMBER = 9;
	public static final int TRIES = 5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = 0;
		int numberOfTries = 0;
		
		do {
			if (numberOfTries == TRIES) {
				System.out.println("No more tries");
				break;
			}
			
			System.out.println("Enter number:");
			
			String strNum = sc.next();	
			if (!isOnlyNumeric(strNum)) {
				System.out.println("Only numbers allowed");
				continue;
			}
			
			inputNum = Integer.parseInt(strNum);
			
			//inputNum = sc.nextInt();
			
			numberOfTries++;

		} while (inputNum != LUCKY_NUMBER);
		
		if (inputNum == LUCKY_NUMBER) {
			System.out.println("Congrats! Good job!");
		}
	}
	
	/*
	 * isOnlyNumeric("345");     -> true
	 * isOnlyNumeric("123sd45"); -> false
	 */
	public static boolean isOnlyNumeric(String str) {
		for (char letter : str.toCharArray()) {
			int aciiNum = (int)letter;
			if (!(aciiNum >= 48 && aciiNum <= 57)) {
				return false;
			}
		}
		
		return true;
	}
}
