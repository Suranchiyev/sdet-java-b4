package day28;

public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * byte    -> Byte
		 * short   -> Short
		 * int     -> Integer
		 * long    -> Long
		 * float   -> Float
		 * double  -> Double
		 * char    -> Character
		 * boolean -> Boolean
		 */
		
		byte bNum = 5;
		Byte bNum2 = 15;
		
		Short shNum = 200;
		
		Integer num = 1000;
		Integer num2 = 5;
		Integer res = num * num2;
		System.out.println(res);
		
		String str = "78";
		Integer num3 = Integer.parseInt(str);
		System.out.println(num3);
		
		System.out.println("Max value for Integer/int: " + Integer.MAX_VALUE);
		System.out.println("Min value for Integer/int: " + Integer.MIN_VALUE);
		
		Integer num4 = new Integer(99);
		
	}
}
