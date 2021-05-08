package day3;

public class ConvertStrToNum {
	public static void main(String[] args) {
		// String to numeric:
		String strNum = "123";
		
		int num = Integer.parseInt(strNum);
		System.out.println(num);
		
		num = num * 9;
		System.out.println(num);
		
		long lNum = Long.parseLong(strNum);
		byte bNum = Byte.parseByte(strNum);
		
		String strNum2 = "9";
		int num2 = Integer.parseInt(strNum2);
		
		// Numeric to String
		int num3 = 99;
		// 1. Concatenate with String
		String str = num3 + ""; // "99"
		
		// 2. valueOf method of String
		str = String.valueOf(num3);
	}
}
