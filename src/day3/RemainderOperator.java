package day3;

public class RemainderOperator {
	public static void main(String[] args) {
		// %
		
		int num = 10;
		int num2 = 3;
		// 10 / 3 = 3 remainder is 1
		System.out.println(num / num2); // 3
		
		//                  10 % 3 = 1
		System.out.println(num % num2); // 1
		
		//                 12 % 10 = 2 
		System.out.println(12 % 10); // 2
		System.out.println(27 % 10); // 7
		System.out.println(10 % 5); // 0
		System.out.println(21 % 5); // 1
		System.out.println(89 % 80); // 9
		
		System.out.println(45 % 5);  // 0
		System.out.println(7 % 5);   // 2
		System.out.println(15 % 7);  // 1
		System.out.println(100 % 2); // 0
		
		System.out.println(26 % 5);  // 1
		System.out.println(12 % 2);  // 0
		System.out.println(99 % 3);  // 0
		System.out.println(6 % 5);   // 1
	}
}
