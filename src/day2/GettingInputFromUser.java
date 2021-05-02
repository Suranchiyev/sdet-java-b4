package day2;

import java.util.Scanner;

public class GettingInputFromUser {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name?");		
		String answer = sc.next();
		System.out.println("My name is " + answer);
		
		System.out.println("----------");
		
		System.out.println("How are you?");
		answer = sc.next();
		System.out.println("I'm doing " + answer);
	}
}
