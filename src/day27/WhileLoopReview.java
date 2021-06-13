package day27;

import java.util.Scanner;

public class WhileLoopReview {
	public static final int LUCKY_NUMBER = 7;
	public static final int TRIES = 3;
	
	public static void main(String[] args) {
		// loops needed to repeat block of code
		
		// When do you use while vs for loop?
		// When we don't know exact number of iterations we would use while loop,
		// when we know the exact number, we use for loop
		
		// TODO integrate number of tries that user have to get the correct number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int numberOfTries = 1;
		
		while(number != LUCKY_NUMBER) {
			numberOfTries++;
			
			if (numberOfTries > TRIES) {
				System.out.println("No more tries left.");
				break;
			}
			
			System.out.println("Enter number:");
			number = sc.nextInt();
		}
		
		if (number == LUCKY_NUMBER) {
			System.out.println("Congrats, you made it, in " + numberOfTries + " tries");
		}
				
		sc.close();
	}
}
