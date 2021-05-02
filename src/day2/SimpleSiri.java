package day2;

import java.util.Scanner;

public class SimpleSiri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi there, what's your name?");
		String str = scanner.nextLine();
		System.out.println("Nice to meet you " + str + "!");
		
		System.out.println("What are you studying now?");
		str = scanner.nextLine();
		System.out.println("Oh, " + str + " is great subject to study!");
		
		System.out.println("What's your favorite movie?");
		str = scanner.nextLine();
		System.out.println("I heard about it. " + str + " is a great movie");
	}
}
