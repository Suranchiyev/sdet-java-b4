package day28;

public class VarargsTask {
	public static void main(String[] args) {
		int num = max(4, 5);
		System.out.println(num); // 5
		
		int num2 = max(7, 100, 4);
		System.out.println(num2); // 100
		
		int num3 = max(7, 100, 4, 88, 3, 783);
		System.out.println(num3); // 783
		
		int[] arrInput = {1, 2, 3, 4, 5};
		int num4 = max(arrInput);
		System.out.println(num4); // 5
	}
	
	// TODO create a method max by using varargs that will make main method compile
	//      method should return max number out of its arguments/elements
	public static int max(int ... nums) {
		int max = nums[0];
		
		for (int num : nums) {
			if (num > max) {
				max = num;
			}
		}
		
		return max;
	}
}
