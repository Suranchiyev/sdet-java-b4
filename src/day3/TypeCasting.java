package day3;

public class TypeCasting {
	public static void main(String[] args) {
		// byte -> short -> int -> long -> float -> double
		
		// auto casting
		byte bNum = 50;
		int num = bNum;
		
		short shNum = 1532;
		long lNum = shNum;
		num = shNum;
		
		long lNum2 = 10000000;
		float fNum = lNum2;
		double dNum = fNum;
		
		// type casting
		int myNum = 100;
		byte bNum2 = (byte)myNum;
		System.out.println(bNum2);
		
		double dNum2 = 99.99;
		int myNum2 = (int)dNum2;
		System.out.println(myNum2); // 99
		
		char ch = 'I';
		int chNum = ch;
		System.out.println(ch + " : " + chNum);
		
		// ----------------
		
		long l = 500;
		float f = 55.99F;
		short sh = 12;
		
		// short shRes = l + f + sh;
		long lRes = (long) (l + f + sh);
		float fRes = l + f + sh;
	}
}




