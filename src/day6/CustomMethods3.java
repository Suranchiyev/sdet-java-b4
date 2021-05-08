package day6;

public class CustomMethods3 {
	public static void main(String[] args) {
		printExclamation("Bek");
		printExclamation("John");
		System.out.println("------");
		
		double dNum = plus100(97.5);
		System.out.println(dNum); // 197.5
		System.out.println("------");
		
		int result = sum(1, 4, 3); // 8
		System.out.println(result); // 8
		
		System.out.println(sum(2, 2, 2)); // 6
	}
	
	// - method name is sum with return type int
	// - method accepts three int arguments
	// - method will return sum of all its arguments
	// - use it in the main method
	public static int sum(int n, int n2, int n3) {
		int sum = n + n2 + n3;
		return sum;
	}
	
	
	// - plus100 with return type double
	// - method accepts one double argument
	// - method will return its argument plus 100.0
	// - use in the main method
	public static double plus100(double num) {
		return num + 100;
	}
	
	public static void printExclamation(String str) {
		System.out.println(str + "!");
	}
}
