package day24;

public class CodingTask1 {
	public static void main(String[] args) {
		int[] input = {1, 2, 3};
		System.out.println(sum(input)); // 6
		System.out.println("average: " + average(input)); // average: 2
		
		
		input = new int[]{7, 7, 9, 1};
		System.out.println(sum(input)); // 24
		System.out.println("average: " + average(input)); // average: 6
		
		
		input = new int[]{5, 8};
		System.out.println(sum(input)); // 13
		System.out.println("average: " + average(input)); // average: 6
		
		System.out.println("---------");
		input = new int[]{1, 2, 3};
		System.out.println(sumOfFirstAndLast(input)); // 4
		
		input = new int[]{8, 7, 3, 3};
		System.out.println(sumOfFirstAndLast(input)); // 11
	}
	
	/*
	 * return sum of all elements from array
	 * sum([1, 2, 3]);    -> 6
	 * sum([7, 7, 9, 1]); -> 24
	 * sum([5, 8]);       -> 13
	 */
	public static int sum(int[] a) {
		int sum = 0;
		for (int num : a) {
			sum += num;
		}
		return sum;
	}
	
	/*
	 * find out and return average value from array a
	 */
	public static int average(int[] a) {
		int sum = 0;
		int aver = 0;
		
		// responsible to find the sum of all elements
		for (int num : a) {
			sum += num;			
		}
		
		// responsible to find the average 
		aver = sum / a.length;
		
		return aver;
	}
	
	public static int average2(int[] a) {
		// get sum from array
		int sumOfArray = sum(a);
		
		// return average
		return sumOfArray / a.length;
	}
	
	/*
	 * return sum of first and last elements in the array arrNum
	 * sumOfFirstAndLast([1, 2, 3]);    -> 4
	 * sumOfFirstAndLast([8, 7, 3, 3]); -> 11
	 */
	public static int sumOfFirstAndLast(int[] arrNum) {
		return arrNum[0] + arrNum[arrNum.length - 1];
	}
}
