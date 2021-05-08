package day5;

public class Primitives {
	public static void main(String[] args) {
		// 1. We need to declare them before using it
		//    DataType nameOfVariable = value;
		
		String str = "kiwi";
		System.out.println(str); // kiwi
		
		str = "apple";
		
		// primitives
		// byte, short, int, long - whole numbers
		// float, double - floating numbers
		// char - single char
		// boolean - for logical values(true or false)
		
		int num = 19;
		double dNum = 9.99;
		char ch = 'A';
		boolean isGood = true;
		
		char ch2 = 'H';
		System.out.println(ch2 + 0); // 72
	}
}
