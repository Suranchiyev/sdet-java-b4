package day27;

public class ArrayReview2 {
	public static void main(String[] args) {
		//              0  1  2  3  4  5  6  7
		int[] arrNum = {5, 3, 2, 6, 7, 8, 3, 9};
		
		// TODO find out and print sum of first and last elements of array arrNum
		//                                                7
		int sumOfFirstAndLast = arrNum[0] + arrNum[arrNum.length - 1];
		System.out.println("Sum of first and last: " + sumOfFirstAndLast);
		
		// TODO find out sum of only even numbers from array arrNum
		
		int sum = 0;
//		for (int i = 0; i < arrNum.length; i++) {
//			if (arrNum[i] % 2 == 0) {
//				sum += arrNum[i];
//			}
//		}
		
		for (int el : arrNum) {
			if (el % 2 == 0) {
				sum += el;
			}
		}
		System.out.println("Sum of even numbers is " + sum);
		
		// TODO can you print each element of arrNum in the new line in reverse order		
		for (int i = arrNum.length - 1; i >= 0; i--) {
			System.out.println(arrNum[i]);
		}
	}
}
