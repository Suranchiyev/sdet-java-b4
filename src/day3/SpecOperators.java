package day3;

public class SpecOperators {
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 5;
		System.out.println(num); // 15
		
		num += 5;
		System.out.println(num); // 20
		
		num = num - 2;
		System.out.println(num); // 18
		
		num -= 2;
		System.out.println(num); // 16
		
		// 16
		num = num * 2; // 32
		// 32
		
		num *= 2; // 64
		
		num = num / 2;
		num /= 2;
		
		//
		int num2 = 10;
		int num3 = 10;
		
		num2 = num2 * 2;
		num3 *= 2;
		
		System.out.println(num2); // 20
		System.out.println(num3); // 20
	}
}
