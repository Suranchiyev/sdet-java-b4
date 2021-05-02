package day2;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// + - * /
		// byte, short, int, long -> whole numbers
		// float, double -> floating numbers
		
		int num = 9;
		int num2 = 2;
		
		int result = num + num2; 
		System.out.println(result); // 11
		
		result = num - num2;
		System.out.println(result); // 7
		
		result = num * num2;
		System.out.println(result); // 18
		
		result = num / num2;
		System.out.println(result); // 4
		
		double dNum = 7.0;
		int iNum = 2;
		// byte -> short -> int -> long -> float -> double
		
		//          double / int -> double
		double res = dNum / iNum; // 3.5
		System.out.println(res);
		
		res = 7 / 2;
		System.out.println(res); // 3.0
		
		int myNum = 299;
		int myNum2 = 1;
		System.out.println(myNum + myNum2); // 300
		
		// everything you concatenate with string will be string
		System.out.println("Result: " + (myNum + myNum2)); // Result: 300
		System.out.println(myNum + myNum2 + " is result");
	}
}
