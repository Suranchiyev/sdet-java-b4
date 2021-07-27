package day49;

public class Swap {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 15;
		
		System.out.println("i: " + i); // i: 10
		System.out.println("j: " + j); // j: 15
		
		// Swap the values of i and j without creating tmp variable?
		
		i = j - i; // i = 15 - 10 // 5
		j = j - i; // j = 15 - 5 // 10
		i = j + i; // i = 10 + 5 // 15
		
		System.out.println("i: " + i); // i: 15
		System.out.println("j: " + j); // j: 10
	}
}
