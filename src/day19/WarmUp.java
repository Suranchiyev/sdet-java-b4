package day19;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2)); // true
		System.out.println(isPrimeNumber(3)); // true
		System.out.println(isPrimeNumber(4)); // false
		System.out.println(isPrimeNumber(25)); // false		
		System.out.println(isPrimeNumber(31)); // true
	}
	
	/*
	 * number is prime if number divisible only to itself and to 1
	 */
	public static boolean isPrimeNumber(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
