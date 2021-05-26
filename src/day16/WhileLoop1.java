package day16;

import java.util.Scanner;

public class WhileLoop1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		//   5
		int count = sc.nextInt();
		//  1
		int i = 1;
		//      5    >= 6 -> false
		while (count >= i) {
			//               "5 "
			System.out.print(i + " ");
			Thread.sleep(1000);
			i++;  
		}
		
		System.out.println();
		System.out.println("i = " + i);
	}
}
