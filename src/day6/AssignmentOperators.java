package day6;

public class AssignmentOperators {
	public static void main(String[] args) {
		int num = 7;
		System.out.println(num); // 7
		
		// num = num + 2;
		num += 2;
		System.out.println(num); // 9
		
		int num2 = 14;
		// num2 = num2 - 4;
		num2 -= 4;
		System.out.println(num2); // 10
		System.out.println(num2 - 5); // 5 
		System.out.println(num2); // 10
		
		num2 = 17;
		num2 -= 1;
		num2 += 2;
		num2 *= 2;
		
		int num3 = 15;
		System.out.println(num3 % 10); // 5
		
		num3 %= 10;
		System.out.println(num3);
	}
}
