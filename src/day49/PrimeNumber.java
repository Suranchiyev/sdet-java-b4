package day49;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrime(97)); // true
		System.out.println(isPrime(4)); // false
		System.out.println(isPrime(5)); // true
		System.out.println(isPrime(7)); // true
 		System.out.println(isPrime(100)); // false
 		
	}
	
	/*
	 * A prime number is a number that divisible evenly by only numbers: 1 and itself.
	 * 
	 * isPrime(4) -> false
	 * isPrime(5) -> true
	 * isPrime(7) -> true
	 * isPrime(100) -> false
	 * 
 	 */
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}	
		}
		
		return true;
	}
}
