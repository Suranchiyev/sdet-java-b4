package day15;

public class PrimitivesInJava {
	public static void main(String[] args) {
		// BREAK TILL 10:13 AM EST
		
		// byte, short, int, long => whole numbers
		// float, double          => floating numbers
 		// boolean                => true or false
		// char                   => single char (ACII Table)
		
		// byte -> short -> int -> long -> float -> double
		
		// auto boxing and unboxing
		byte bNum = 45;
		int iNum = bNum; // auto boxing
		
		long lNum = 89;
		short shNum = (short)lNum;
			
		// output from expressions
		
		int num = (int) (bNum + iNum + shNum + lNum);
		// output long
		
		
		char ch = 'A';
		int num2 = ch;
		System.out.println(num2);
		
		
		boolean isTrue = true;
	}
}
