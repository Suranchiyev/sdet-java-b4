package day28;

public class Varargs {
	public static void main(String[] args) {
		int s = sum(4, 5);
		System.out.println("Res 1: " + s);
		
		int s1 = sum(6, 7, 9);
		System.out.println("Res 2: " + s1);
		
		int[] input = {9, 5, 7, 2};
		int s2 = sum(input);
		System.out.println("Res 3: " + s2);
		
		int s3 = sum(4, 3, 5, 6, 2, 1, 4, 56, 7);
		System.out.println("Res 4: " + s3);
	}
	
	public static int sum(int ... iNums) {
		//System.out.println("First element: "+ iNums[0]);
		//System.out.println("Length: " + iNums.length);
		int sum = 0;
		for (int num : iNums) {
			sum += num;
		}
		return sum;
	}
	
//	public static int sum(int[] iArr) {
//		int sum = 0;
//		for (int num : iArr) {
//			sum += num;
//		}
//		return sum;
//	}
	
//	public static int sum(int i, int i2) {
//		return i + i2;
//	}
//	
//	public static int sum(int i, int i2, int i3) {
//		return i + i2 + i3;
//	}
	

	
 }
