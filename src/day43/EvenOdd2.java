package day43;

import java.util.Scanner;

public class EvenOdd2 {
	public static void main(String[] args) {
		// TODO
		// Ask from the user to provide a number 
		// determine if number is odd or even
		// if user will provide invalid number (ex: sadf, 12a)
		// keep asking until user will provide numeric value
		// by using try catch
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		// 1. do while
		// 2. try catch
		
		do {
			try {
				String str = sc.next();
				int num = Integer.parseInt(str);
				
				if (num % 2 == 0) {
					System.out.println("Even number");
				} else {
					System.out.println("Odd number");
				}
				
				break;
				
			} catch (Exception e) {
				System.out.println("Enter number:");
			}
			
		} while(true);
		
	}
}
