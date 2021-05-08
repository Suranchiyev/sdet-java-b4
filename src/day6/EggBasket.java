package day6;
import java.util.Scanner;

public class EggBasket {
	public static void main(String[] args) {
		// TODO Get numberOfBaskets and eggsPerBasket from user(Scanner)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of baskets:");
		int numberOfBaskets = sc.nextInt();
		
		System.out.println("Enter number of eggs per basket:");
		int eggsPerBasket = sc.nextInt();
		
		int totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("the total number of eggs is " + totalEggs);
	}
}
