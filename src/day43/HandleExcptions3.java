package day43;

import java.util.Scanner;

public class HandleExcptions3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number from 1 to 5:");
		String str = sc.next();
		
		int num = 0;
		try {
			num = Integer.parseInt(str);
		} catch(Exception e) {
			System.out.println("Only numbers accepted");
			// System.exit(0); will stop the program
			return;
		}
		
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Only number from 1 to 5");
		}
		
		// TODO refactor this software to handle when user will provide
		//      non numeric values.
		//      for that print "Only numbers accepted"
		
	}
}
