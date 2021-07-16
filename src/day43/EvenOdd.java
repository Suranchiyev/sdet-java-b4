package day43;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		String str = sc.next();
		System.out.println(str);
		
		try {
			int num = Integer.parseInt(str.trim());
			
			if (num % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("We accept only numbers");
		}
		
		System.out.println("Thank you!");
	}
}
