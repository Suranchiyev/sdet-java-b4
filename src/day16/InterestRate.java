package day16;
import java.util.Scanner;

public class InterestRate {
	// annual percentage rate
	public static final double APR = 0.10;
	public static final double MONTHLY_INTEREST_RATE = APR / 12;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the balance: ");
		double balance = sc.nextDouble();
		double intialBalance = balance;
		
		System.out.println("Please enter number of months:");
		int months = sc.nextInt();
		int count = 0;
		
		while (months > count) {
			balance = balance + ((MONTHLY_INTEREST_RATE / 100) * balance);
			count++;
		}
		
		balance = Math.round(balance);
		
		System.out.println("Total balance: " + balance);
		System.out.println("Initial balance: " + intialBalance);
		System.out.println("Interest earned: " + (balance - intialBalance));
		System.out.println("Period(month): " + months);
	}
}
