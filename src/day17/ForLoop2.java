package day17;

public class ForLoop2 {
	public static void main(String[] args) {
		// Write a program that will print numbers from 0 to 100
		// in the same line by using for loop
		
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Write a program that will print
		// 10 times "Hello World!" in the new lines
		// by using for loop		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World!");
		}
		
		// Write a program that will print numbers from
		// 100 to 0 in the same line.
		
		//    init part; condition; update 
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Write a program that will print only even numbers
		// from 1 to 100
		// 2 4 6 8 10 12 14 16...
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
