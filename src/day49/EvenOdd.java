package day49;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println(isEven(4)); // true
		System.out.println(isEven(5)); // false
		System.out.println(isEven(3)); // false
		System.out.println(isEven(6)); // true
		
		int i = 25;
		int x = 5;
		
		if (i % x == 0) {
			System.out.println(i + " is divisible by " + x + " evenly");
		}
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
