package day6;

public class MethodArguments {

	public static void main(String[] args) {
		sayHi("John"); // Hi, John!
		
		String str = "Alex";
		sayHi(str); // Hi, Alex!
		
		int myNumber = 100;
		int res = negativeFive(myNumber);
		System.out.println(res); // 95
		
		// res = negativeFive();
		// res = negativeFive("25"); argument type mismatch
		System.out.println("----------------");
		
		printSum(9.9, 1.8);
		printSum(10.2, 7.5);
		
		double dNum = 1.1;
		double dNum2 = 1.2;
		
		printSum(dNum, dNum2);
	}
	
	
	// what you can say about this method?
	// void - does not return value
	// (double num, double num2) - two arguments both of them double
	public static void printSum(double num, double num2) {
		double res = num + num2;
		System.out.println(num + " + " + num2 + " = " + res);
	}
	
	// What you can say about this method so far?
	// void - it will not return any value
	// sayHi - name of the method
	// (String name) - method arguments to provide data into our method
	public static void sayHi(String name) {
		System.out.println("Hi, " + name + "!");
	}
	
	// int - return type. Method will return int number
	// negativeFive - name of the method
	// (int num)    - method arguments. Method accepts one int argument
	public static int negativeFive(int num) {
		return num - 5;
	}

}
