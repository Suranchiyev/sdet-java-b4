package day6;

import java.util.Scanner;


public class Addition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int numOne = scanner.nextInt();
		
		System.out.println("Enter second number:");
		int numTwo = scanner.nextInt();
		
		int res = numOne + numTwo;
		System.out.println(numOne + "+" + numTwo + "=" + res);
	}
}
