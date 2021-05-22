package day13;

public class MathClass {
	public static void main(String[] args) {
		// Math.abs(); method returns the absolute value of argument
		
		int num = Math.abs(-10);
		System.out.println(num); // 10
		
		int num1 = Math.abs(10);
		System.out.println(num1); // 10	
		
		System.out.println(isDiffMore10(5, 20)); // true
		System.out.println(isDiffMore10(20, 5)); // true
		
		// Math.ceil() method returns a decimal point value up to the nearest integer value
		double dNum = Math.ceil(3.4); // 4.0
		System.out.println(dNum);
		
		double dNum2 = Math.ceil(2.1); // 3.0
		System.out.println(dNum2);
		
		// Math.round() method will round the value
		double dNum3 = Math.round(3.4); // 3.0
		System.out.println(dNum3); // 
		
		double dNum4 = Math.round(9.6); // 10.0
		
		// Math.floor() rounds down 
		double dNum5 = Math.floor(9.9999); 
		System.out.println(dNum5); // 9.0
		
		System.out.println(Math.min(2.9, 0.1)); // 0.1
		System.out.println(Math.max(2.9, 0.1)); // 2.9
	}
	
	public static boolean isDiffMore10(int i, int i2) {
		return Math.abs(i - i2) > 10;
	}
}
