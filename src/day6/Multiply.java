package day6;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int fNum = sc.nextInt();
		
		System.out.println("Enter second number:");
		int sNum = sc.nextInt();
		
		System.out.println(fNum + "*" + sNum + "=" + (fNum * sNum));
	}
}
