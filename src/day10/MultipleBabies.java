package day10;

import java.util.Scanner;

public class MultipleBabies {
	public static void main(String[] args) {
		// Scanner. How many babies?
		// 1 - Congratulations!
		// 2 - Wow, twins!
		// 3 - Wow, triplets!
		// 4 or 5 - Unbelievable <numberOfBabies> babies!
		// otherwise - I don't believe you!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many babies?");
		
		int numberOfBabies = sc.nextInt();
		//System.out.println(numberOfBabies);
		
		switch(numberOfBabies) {		
		case 1:
			System.out.println("Congratulations!");
			break;
		case 2:
			System.out.println("Wow, twins!");
			break;
		case 3: 
			System.out.println("Wow, triplets!");
			break;
		case 4:
		case 5:
			System.out.println("Unbelievable, " + numberOfBabies + " babies!");
			break;
		default:
			System.out.println("I don't believe you!");
			break;
		}
	}
}
